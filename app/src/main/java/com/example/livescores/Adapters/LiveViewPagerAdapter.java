package com.example.livescores.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.livescores.View.Fragments.LiveAllFragment;
import com.example.livescores.View.Fragments.LiveTopFragment;

public class LiveViewPagerAdapter extends FragmentStateAdapter {
    public LiveViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0){
            return new LiveTopFragment();
        }
        return new LiveAllFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
