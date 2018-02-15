package com.studies.marcospf.productx.main;

import com.studies.marcospf.productx.BasePresenter;
import com.studies.marcospf.productx.BaseView;

public interface MainContract {

    interface View extends BaseView {
        void setTitle(int titleId);
    }

    interface Presenter extends BasePresenter {

    }

}
