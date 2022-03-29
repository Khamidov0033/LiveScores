package com.example.livescores.API;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
   static Retrofit retrofit;

   public static Retrofit getRetrofit(){
       if (retrofit==null){
           HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
           OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
           interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

           retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .client(client).build();
       }
       return retrofit;
   }
}
