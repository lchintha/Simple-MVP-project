package com.example.chint.mvp;

/**
 * Created by chint on 7/24/2017.
 */

public class modelcode implements model {
    @Override
    public boolean validate(String email, String pass) {
        return (email.equals("new@mail.com") && pass.equals("Password"));
    }
}
