package com.example;

import android.app.Activity;

/**
 * Created by Administrator on 2017/3/1 0001.
 */

public class InjectView {

    public static void bindView(Activity activity){

        String className = activity.getClass().getName();
        try{
            Class<?> clazz = Class.forName(className+"$$ViewBinder");
            ViewBinder binder = (ViewBinder)clazz.newInstance();
            binder.bind(activity);
        }catch (Exception e){

        }
    }

}
