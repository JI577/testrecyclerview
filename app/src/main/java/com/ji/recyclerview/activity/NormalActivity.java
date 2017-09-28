package com.ji.recyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ji.recyclerview.R;
import com.ji.recyclerview.adapter.NormalAadater;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NormalActivity extends AppCompatActivity {


    @Bind(R.id.tv_linear)
    TextView tvLinear;
    @Bind(R.id.tv_grid)
    TextView tvGrid;
    @Bind(R.id.tv_taggeredgrid)
    TextView tvTaggeredgrid;
    @Bind(R.id.listview)
    RecyclerView listview;
    @Bind(R.id.activity_normal)
    LinearLayout activityNormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        ButterKnife.bind(this);
        setData();
    }

    private List<String> list = new ArrayList<>();

    private void setData() {
        list.add("https://www.zhuangbi.info/uploads/i/2016-12-09-b2b78f2272e9e70dacabb1cd5492e4fb.png");
        list.add("https://www.zhuangbi.info/uploads/i/2015-07-31-4c92424a38c5db9c01abd63203584e1d.png");
        list.add("https://www.zhuangbi.info/uploads/i/2016-01-26-ecbb0a587442f5bdbeadfc4a65a56a30.gif");
        list.add("https://www.zhuangbi.info/uploads/i/2017-06-04-0cb80c7fb883e8f439aae69e2657ea4a.jpg");
        list.add("https://www.zhuangbi.info/uploads/i/2016-01-27-bd6f1e1e31fea64f7f2f33ba31b0b1a2.gif");
        list.add("https://www.zhuangbi.info/uploads/i/2016-02-25-7314327af53f74917ba1d68d581487d7.gif");
        list.add("https://www.zhuangbi.info/uploads/i/2016-11-16-6327547770d386c98dcdd9405d595083.jpg");
        list.add("https://www.zhuangbi.info/uploads/i/2017-02-01-d3845f0993eb1956c7ee8f709024da3e.gif");
        list.add("https://www.zhuangbi.info/uploads/i/2016-03-20-6a1ee56687e7f5c8c63f804164c83bb4.jpg");
        list.add("https://www.zhuangbi.info/uploads/i/2016-06-02-b6b3fc91157e013cc00c64b3d42d7a5b.gif");
        list.add("https://www.zhuangbi.info/uploads/i/2015-06-28-170924ea19a25d1118cccd2c23a64cc1.jpg");
        list.add("https://www.zhuangbi.info/uploads/i/2015-08-26-d92251126e1c482ae46fbbac5467dd25.gif");
    }

    @OnClick({R.id.tv_linear, R.id.tv_grid, R.id.tv_taggeredgrid})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_linear:
                setLinear();
                break;
            case R.id.tv_grid:
                setGrid();
                break;
            case R.id.tv_taggeredgrid:
                setTaggeredGrid();
                break;
        }
    }

    private void setTaggeredGrid() {
        listview.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));
        listview.setAdapter(new NormalAadater(this, list));
    }

    private void setGrid() {
        GridLayoutManager grid = new GridLayoutManager(this, 2);
        grid.setOrientation(OrientationHelper.VERTICAL);
        listview.setLayoutManager(grid);
        listview.setAdapter(new NormalAadater(this, list));
    }

    private void setLinear() {
        LinearLayoutManager linearManager = new LinearLayoutManager(this);
        linearManager.setOrientation(OrientationHelper.VERTICAL);
        listview.setLayoutManager(linearManager);
        listview.setAdapter(new NormalAadater(this, list));
    }


}
