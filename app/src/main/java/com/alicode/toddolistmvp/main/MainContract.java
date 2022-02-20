package com.alicode.toddolistmvp.main;

import com.alicode.toddolistmvp.BasePresenter;
import com.alicode.toddolistmvp.BaseView;
import com.alicode.toddolistmvp.model.Task;

import java.util.List;

public interface MainContract {

    interface View extends BaseView {
        void showTasks(List<Task> tasks);

        void clearTasks();

        void updateTask(Task task);

        void addTask(Task task);

        void deleteTask(Task task);

        void setEmptyStateVisibility(boolean visible);


    }

    interface Presenter extends BasePresenter<View> {
        void onDeleteAllBtnClick();

        void onSearch(String q);

        void onTaskItemClick(Task task);

    }
}
