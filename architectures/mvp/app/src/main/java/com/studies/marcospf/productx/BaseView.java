package com.studies.marcospf.productx;

import android.support.annotation.NonNull;

import com.studies.marcospf.productx.main.MainContract;

public interface BaseView {

    void setPresenter(@NonNull MainContract.Presenter presenter);

}
