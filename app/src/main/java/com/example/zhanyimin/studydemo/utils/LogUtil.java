package com.example.zhanyimin.studydemo.utils;

import android.util.Log;

public class LogUtil {
    public  static  String sTAG = "LogUtil";

    //控制是否要输出log
    public  static boolean sIsRelease = false;

    /**
     * 如果要发布了，可以在Application 中切换下release 就会没有日志输出了
     */
    public static void init(String baseTag, boolean isRelease){
        sTAG = baseTag;
        sIsRelease = isRelease;
    }

    public static void  d(String TAG, String conetnt){
        if (!sIsRelease){
            Log.d("[" + sTAG +"]" +TAG, conetnt);
        }
    }


    public static void v(String TAG, String content) {
        if (!sIsRelease) {
            Log.d("[" + sTAG + "]" + TAG, content);
        }
    }

    public static void i(String TAG, String content) {
        if (!sIsRelease) {
            Log.d("[" + sTAG + "]" + TAG, content);
        }
    }

    public static void w(String TAG, String content) {
        if (!sIsRelease) {
            Log.d("[" + sTAG + "]" + TAG, content);
        }
    }

    public static void e(String TAG, String content) {
        if (!sIsRelease) {
            Log.d("[" + sTAG + "]" + TAG, content);
        }
    }


}


