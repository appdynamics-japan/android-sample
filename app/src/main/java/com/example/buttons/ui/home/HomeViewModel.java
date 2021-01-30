package com.example.buttons.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("built with AppDynamics Android SDK 20.12.1");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
