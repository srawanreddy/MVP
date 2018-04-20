package com.example.sravanreddy.mvpassignment.login.ui.presenter;

import com.example.sravanreddy.mvpassignment.login.ui.IView;

public class Presenter implements IPresenter {
    IView iView;

    public Presenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void onClickhandler() {
        iView.showToast();
    }

    @Override
    public void onDestroy() {

    }
}
