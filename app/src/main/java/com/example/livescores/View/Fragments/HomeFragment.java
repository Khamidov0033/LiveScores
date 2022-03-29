package com.example.livescores.View.Fragments;

import static android.content.ContentValues.TAG;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
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
import android.widget.Toast;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.livescores.MatchesRecyclerViewAdapter;
import com.example.livescores.Models.Fixtures.FullFixtures;
import com.example.livescores.Models.Fixtures.Response;
import com.example.livescores.R;
import com.example.livescores.ViewModel.HomeViewModel;
import com.example.livescores.databinding.HomeFragmentBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    HomeViewModel mViewModel;
    HomeFragmentBinding binding;
    MatchesRecyclerViewAdapter matchesRecyclerViewAdapter;
    List<Response> matchList;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        mViewModel.setMatches();
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setImageSlider();
        observeMatches();
        initRecycler();
    }

    private void initRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        matchesRecyclerViewAdapter = new MatchesRecyclerViewAdapter(matchList);
        binding.liveGamesRv.setAdapter(matchesRecyclerViewAdapter);
        binding.liveGamesRv.setLayoutManager(linearLayoutManager);
    }

    private void observeMatches() {
        mViewModel.getMatches().observe(getViewLifecycleOwner(), new Observer<FullFixtures>() {
            @Override
            public void onChanged(FullFixtures matches) {
                matchesRecyclerViewAdapter.setMatchesList(matches.getResponse());
                Log.d(TAG, "onChanged: EVERYTHING IS GOOD");
            }
        });
    }

    private void setImageSlider() {
        List<SlideModel> imageList = new ArrayList<SlideModel>();

        imageList.add(new SlideModel("http://goo.gl/gEgYUd", ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.mipmap.image2, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.mipmap.image3, ScaleTypes.FIT));
        binding.imageSlider.setImageList(imageList);
        binding.imageSlider.startSliding(3000);
    }
}