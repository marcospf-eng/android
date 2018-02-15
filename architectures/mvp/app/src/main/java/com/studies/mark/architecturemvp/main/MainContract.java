package com.studies.mark.architecturemvp.main;

import com.studies.mark.architecturemvp.BasePresenter;
import com.studies.mark.architecturemvp.BaseView;

public interface MainContract {

    interface View extends BaseView {
        void setTitle(int titleId);
    }

    interface Presenter extends BasePresenter {

    }

}
