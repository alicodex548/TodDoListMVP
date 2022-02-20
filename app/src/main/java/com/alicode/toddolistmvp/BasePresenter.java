package com.alicode.toddolistmvp;

import com.alicode.toddolistmvp.main.MainContract;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T view);

    void onDetach();
}
