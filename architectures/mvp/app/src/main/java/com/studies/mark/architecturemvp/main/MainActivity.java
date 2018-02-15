package com.studies.mark.architecturemvp.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.studies.mark.architecturemvp.R;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.main_activity_content);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.main_activity_content, mainFragment);
            fragmentTransaction.commit();
        }

        mMainPresenter = new MainPresenter(mainFragment);
    }
}
