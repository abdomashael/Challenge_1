package com.abdo_mashael.challenge1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.about_btn)
    Button aboutBtn;
    @BindView(R.id.profile_btn)
    Button profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.about_btn)
    public void onAboutBtnClicked() {
        startActivity(new
                Intent(this, AboutALC.class));
    }

    @OnClick(R.id.profile_btn)
    public void onProfileBtnClicked() {
        startActivity(new
                Intent(this, MyProfile.class));
    }
}
