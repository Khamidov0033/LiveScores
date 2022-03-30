package com.example.livescores.Repository;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.livescores.API.Apiinterface;
import com.example.livescores.API.RetrofitClient;
import com.example.livescores.Models.Fixtures.FullFixtures;
import com.example.livescores.Response;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class HomeFragmentRepo {
    MutableLiveData<FullFixtures> matchesMutableLiveData;
    private static HomeFragmentRepo homeFragmentRepo;
    FullFixtures fullFixtures;

    public static HomeFragmentRepo getInstance() {
        if (homeFragmentRepo == null) {
            homeFragmentRepo = new HomeFragmentRepo();
        }
        return homeFragmentRepo;
    }

    public HomeFragmentRepo() {
        matchesMutableLiveData = new MutableLiveData<>();
        fullFixtures = new FullFixtures();
    }

    public void setMatches() {
        Apiinterface apiinterface = RetrofitClient.getRetrofit().create(Apiinterface.class);
        Call<FullFixtures> call = apiinterface.getFixtures(null,null,"2022-03-20","39","2021",null,null,null);
        call.enqueue(new Callback<FullFixtures>() {
            @Override
            public void onResponse(Call<FullFixtures> call, retrofit2.Response<FullFixtures> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: Request was successfull");
                    fullFixtures = response.body();
                    matchesMutableLiveData.setValue(fullFixtures);
                }
            }

            @Override
            public void onFailure(Call<FullFixtures> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

    public LiveData<FullFixtures> getMatches() {
        return matchesMutableLiveData;
    }
}
