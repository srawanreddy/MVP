package com.example.sravanreddy.mvpassignment.login.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sravanreddy.mvpassignment.R;
import com.example.sravanreddy.mvpassignment.login.ui.presenter.IPresenter;
import com.example.sravanreddy.mvpassignment.login.ui.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IView {
private EditText userName, password;
private Button login, signUp;
IPresenter iPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenter=new Presenter(this);
        userName = findViewById(R.id.userName_et);
        password = findViewById(R.id.password_et);
        login = findViewById(R.id.login_button);
        signUp = findViewById(R.id.signup_button);

    }


    @Override
    public void onClickHadler(View view) {
        iPresenter.onClickhandler();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
    }


}
