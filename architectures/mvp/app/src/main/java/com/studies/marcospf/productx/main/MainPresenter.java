package com.studies.marcospf.productx.main;

import com.studies.marcospf.productx.R;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    public MainPresenter(MainContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void onResume() {
        mView.setTitle(R.string.app_name);
    }
}
