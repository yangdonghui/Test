package cn.eoe.usingservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by donghui on 16/10/24.
 */
public class EchoService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("onBind");
        return echoServiceBinder;
    }

    @Override
    public void onCreate() {
        System.out.println("onCreate()");

        startTimer();

        super.onCreate();
    }

    @Override
    public void onDestroy() {
        System.out.println("onDestroy()");

        stopTimer();

        super.onDestroy();
    }

    private int i = 0;

    public void startTimer(){
        if (timer == null){
            timer = new Timer();
            taskTimer = new TimerTask() {
                @Override
                public void run() {
                    i++;

                    System.out.println(i);
                }
            };
            timer.schedule(taskTimer, 1000, 1000);
        }
    }

    public void stopTimer(){
        if (timer != null){
            taskTimer.cancel();
            timer.cancel();

            timer = null;
            taskTimer = null;
        }
    }

    public int getCurrentUn(){
        return i;
    }

    private final EchoServiceBinder echoServiceBinder = new EchoServiceBinder();

    public class EchoServiceBinder extends Binder{
        public EchoService getService(){
            return EchoService.this;
        }
    }

    private Timer timer = null;
    private TimerTask taskTimer = null;
}
