package com.sample.ui.activity.util;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.sample.R;
import com.sample.ui.activity.BaseActivity;
import com.siberiadante.lib.util.SDNetWorkUtil;

public class NetworkActivity extends BaseActivity {

    private static final String TAG = NetworkActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_test);
        initView();
        initData();
    }

    public void initView() {

        Button mBtnOpenSetting = (Button) findViewById(R.id.btn_network_open_setting);
        mBtnOpenSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SDNetWorkUtil.openNetworkSettings();
            }
        });
    }

    public void initData() {
        Log.d(TAG, "testNetworkUtil:isNetWorkConnected? " + SDNetWorkUtil.isNetWorkConnected());
        Log.d(TAG, "testNetworkUtil: isWifiConnected?" + SDNetWorkUtil.isWifiConnected());
        Log.d(TAG, "testNetworkUtil:getNetworkState= " + SDNetWorkUtil.getNetWorkType());
    }
}
