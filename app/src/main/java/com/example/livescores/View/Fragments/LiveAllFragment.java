package com.example.livescores.View.Fragments;

import static android.content.ContentValues.TAG;

import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.livescores.MatchesAllRecyclerViewAdapter;
import com.example.livescores.MatchesRecyclerViewAdapter;
import com.example.livescores.R;
import com.example.livescores.Response;
import com.example.livescores.ViewModel.HomeViewModel;
import com.example.livescores.ViewModel.LiveAllViewModel;
import com.example.livescores.databinding.LiveAllFragmentBinding;
import com.example.livescores.databinding.LiveTopFragmentBinding;

import java.util.List;

public class LiveAllFragment extends Fragment {

    private HomeViewModel mViewModel;
    MatchesAllRecyclerViewAdapter matchesRecyclerViewAdapter;
    LiveAllFragmentBinding binding;
    List<Response> matchList;

    public static LiveTopFragment newInstance() {
        return new LiveTopFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.live_all_fragment, container, false);
        return binding.getRoot();
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);


        //  mViewModel.setMatchesAll();
        observeMatches();
        initRecycler();


    }

    private void initRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        matchesRecyclerViewAdapter = new MatchesAllRecyclerViewAdapter(matchList);
        binding.liveGamesRv.setAdapter(matchesRecyclerViewAdapter);
        binding.liveGamesRv.setLayoutManager(linearLayoutManager);
    }

    private void observeMatches() {
        mViewModel.getMatchesAll().observe(getViewLifecycleOwner(), matches -> {
            matchesRecyclerViewAdapter.setMatchesList(matches.getResponse());
            Log.d(TAG, "onChanged: EVERYTHING IS GOOD");

        });
    }
}