package com.example.ebookapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.ebookapp.auth.FirebaseLogin;
import com.google.firebase.auth.FirebaseUser;

public class RegisterViewModel extends AndroidViewModel {
    private FirebaseLogin fRegister;
    private MutableLiveData<FirebaseUser> userLiveData;

    public RegisterViewModel(@NonNull Application application) {
        super(application);
        fRegister = new FirebaseLogin(application);
        userLiveData = fRegister.getUserLiveData();
    }


    public void register(String email, String password) {
        fRegister.register(email, password);
    }

}