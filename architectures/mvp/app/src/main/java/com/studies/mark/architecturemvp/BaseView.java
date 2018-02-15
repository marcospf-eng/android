package com.studies.mark.architecturemvp;

import android.support.annotation.NonNull;

import com.studies.mark.architecturemvp.main.MainContract;

public interface BaseView {

    void setPresenter(@NonNull MainContract.Presenter presenter);

}
