package com.trungdunghoang125.moviesinfoapp.request;

import com.trungdunghoang125.moviesinfoapp.utils.Credentials;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by trungdunghoang125 on 12/09/2022
 */
public class RetrofitService {
    private static final Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(Credentials.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static final Retrofit retrofit = retrofitBuilder.build();

    private static final MovieApi movieApi = retrofit.create(MovieApi.class);

    public static MovieApi getMovieApi() {
        return movieApi;
    }
}
