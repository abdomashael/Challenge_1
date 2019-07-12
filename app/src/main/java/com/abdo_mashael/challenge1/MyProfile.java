package com.abdo_mashael.challenge1;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyProfile extends AppCompatActivity {

    @BindView(R.id.back_btn)
    ImageButton backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.back_btn)
    public void onViewClicked() {
        onBackPressed();
    }
}
