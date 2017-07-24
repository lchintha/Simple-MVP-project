package com.example.chint.mvp;

/**
 * Created by chint on 7/24/2017.
 */

public class LoginPresenter {

    LoginView loginView;
    modelcode model;

    public LoginPresenter(LoginView loginView){
        this.loginView = loginView;
        this.model = new modelcode();
    }

    public void attemptLogin(String email, String pass){
        boolean isValid = model.validate(email, pass);
        if(isValid)
            loginView.NavigatetoanotherActivity();
        else
            loginView.loginFailed();
    }
}
