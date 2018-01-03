package com.codyapa.bucketlist.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.codyapa.bucketlist.extras.Util;

/**
 * Created by akshay on 21/10/17.
 */

public class BootReceiver extends BroadcastReceiver {
    public static final String TAG="Codyapa";
    public BootReceiver() {
        Log.d(TAG, "BootReceiver: ");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");
        Util.scheduleAlarm(context);
    }
}
