package cn.eoe.usingbc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by donghui on 16/10/24.
 */
public class MyBC extends BroadcastReceiver{

    public static final String ACTION = "cn.eoe.l004usingbc.intent.action.MyBC";

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("onReceive, data=" + intent.getStringExtra("txt"));
    }
}
