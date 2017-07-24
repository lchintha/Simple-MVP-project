package com.example.chint.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements LoginView{


    @BindView(R.id.email) EditText mail;
    @BindView(R.id.password) EditText pass;
    LoginPresenter presenter;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mail = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);

        presenter = new LoginPresenter(this);
    }

    public void onLoginClicked(View v){
        email = mail.getText().toString();
        password = pass.getText().toString();
        presenter.attemptLogin(email, password);
    }

    @Override
    public void NavigatetoanotherActivity() {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show();
    }
}
