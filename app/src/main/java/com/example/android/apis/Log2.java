package com.example.android.apis;

import android.util.Log;

public class Log2 {

    private static final String TAG = "apis";

    private static final boolean ENABLE = true;

    public static void v(String className, String format, Object... args) {
        if (ENABLE) {
            String msg = className + ", " + String.format(format, args);
            Log.v(TAG, msg);
        }
    }

    public static void i(String className, String format, Object... args) {
        if (ENABLE) {
            String msg = className + ", " + String.format(format, args);
            Log.i(TAG, msg);
        }
    }

    public static void d(String className, String format, Object... args) {
        if (ENABLE) {
            String msg = className + ", " + String.format(format, args);
            Log.d(TAG, msg);
        }
    }

    public static void w(String className, String format, Object... args) {
        if (ENABLE) {
            String msg = className + ", " + String.format(format, args);
            Log.w(TAG, msg);
        }
    }

    public static void e(Throwable tr) {
        e("", tr);
    }

    public static void e(String msg) {
        e("", msg);
    }

    public static void e(String className, String msg) {
        e(className, msg, null);
    }

    public static void e(String className, Throwable tr) {
        e(className, "", tr);
    }

    public static void e(String className, String msg, Throwable tr) {
        if (ENABLE) {
            String ret;
            if (tr != null) {
                String s = Log.getStackTraceString(tr);
                if (s.isEmpty()) s = tr.getMessage();
                ret = className + ", " + msg + System.lineSeparator() + s;
            } else {
                ret = className + ", " + msg;
            }
            Log.e(TAG, ret);
        }
    }
}
