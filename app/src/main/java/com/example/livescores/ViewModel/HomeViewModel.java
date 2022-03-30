package com.example.livescores.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.example.livescores.Models.Fixtures.FullFixtures;
import com.example.livescores.Repository.HomeFragmentRepo;

public class HomeViewModel extends ViewModel {
HomeFragmentRepo homeFragmentRepo;

    public HomeViewModel() {
        homeFragmentRepo  = HomeFragmentRepo.getInstance();
    }

    public void setMatches(){
        homeFragmentRepo.setMatches();
    }

    public LiveData<FullFixtures> getMatches(){
        return homeFragmentRepo.getMatches();
    }
}