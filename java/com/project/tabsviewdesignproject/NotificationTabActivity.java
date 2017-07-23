package com.project.tabsviewdesignproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Infinal on 6/17/2017.
 */

public class NotificationTabActivity extends Fragment {
    View v;
    @SuppressLint("SimpleDateFormat")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        v = inflater.inflate(R.layout.notificationtab,container,false);
        return  v;
    }
}
