package com.example.livescores.Repository;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.livescores.API.Apiinterface;
import com.example.livescores.API.RetrofitClient;
import com.example.livescores.Models.Fixtures.FullFixtures;
import com.example.livescores.Models.Fixtures.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;



public class HomeFragmentRepo {
    MutableLiveData<List<Response>> listMutableLiveData;
    MutableLiveData<FullFixtures> matchesMutableLiveData;
    private static HomeFragmentRepo homeFragmentRepo;

    public static HomeFragmentRepo getInstance() {
        if (homeFragmentRepo == null) {
            homeFragmentRepo = new HomeFragmentRepo();
        }
        return homeFragmentRepo;
    }

    public HomeFragmentRepo() {
        matchesMutableLiveData = new MutableLiveData<>();
        listMutableLiveData = new MutableLiveData<>();
    }

    public void setMatches() {
        Apiinterface apiinterface = RetrofitClient.getRetrofit().create(Apiinterface.class);
        Call<FullFixtures> call = apiinterface.getFixtures("all");
        call.enqueue(new Callback<FullFixtures>() {
            @Override
            public void onResponse(Call<FullFixtures> call, retrofit2.Response<FullFixtures> response) {
                if (response.isSuccessful()){
                    Log.d(TAG, "onResponse: Request was successfull");
                    FullFixtures fullFixtures = new FullFixtures();
                    List<Response> responseList = new ArrayList<>(response.body().getResponse());
                    fullFixtures.setResponse(responseList);

                    matchesMutableLiveData.setValue(fullFixtures);
                    listMutableLiveData.setValue(responseList);
                }
            }

            @Override
            public void onFailure(Call<FullFixtures> call, Throwable t) {

            }
        });
    }
//    public void setTeam1(){
//        Apiinterface apiinterface = RetrofitClient.getRetrofit().create(Apiinterface.class);
//        Call<>
//    }

    public LiveData<FullFixtures> getMatches(){
        return matchesMutableLiveData;
    }
}
