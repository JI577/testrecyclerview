package com.ji.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ji.recyclerview.activity.NormalActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_normal)
    TextView tvNormal;
    @Bind(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_normal, R.id.activity_main})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_normal:
                startActivity(new Intent(this, NormalActivity.class));
                break;
            case R.id.activity_main:
                break;
        }
    }
}
