package com.alicode.toddolistmvp.detail;

import com.alicode.toddolistmvp.BasePresenter;
import com.alicode.toddolistmvp.BaseView;
import com.alicode.toddolistmvp.main.MainContract;
import com.alicode.toddolistmvp.model.Task;

public interface TaskDetailContract {

    interface View extends BaseView {
        void showTask(Task task);

        void setDeleteButtonVisibility(boolean visible);

        void showError(String error);

        void returnResult(int resultCode, Task task);
    }

    interface Presenter extends BasePresenter<View> {
        void deleteTask();

        void saveChanges(int importance, String title);

    }
}
