package com.example.webservicee2.presenter;

import com.example.webservicee2.model.get.GetResponse;

public interface MainView {
    void getSuccess (GetResponse List);
    void setToast (String message);
    void onError (String errorMessage);
    void onFailure (String failurMessage);
}
