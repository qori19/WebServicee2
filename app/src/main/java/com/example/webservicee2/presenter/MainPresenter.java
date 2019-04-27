package com.example.webservicee2.presenter;

import com.example.webservicee2.model.post.PostResponse;
import com.example.webservicee2.remote.BaseApp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private  MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void createItems(String name, String description) {
        BaseApp.service.createItems(name, description).enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {
                if (response.isSuccessful())
                    mainView.setToast(response.message());
                else
                    mainView.onError(response.message());
            }

            @Override
            public void onFailure(Call<PostResponse> call, Throwable t) {
                mainView.onFailure(t.getMessage());
            }
        });
    }

}
