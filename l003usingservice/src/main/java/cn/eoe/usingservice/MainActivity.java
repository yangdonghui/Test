package cn.eoe.usingservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity implements View.OnClickListener, ServiceConnection{

    private Button btnStartService, btnStopService;
    private Button btnBindService, btnUnBindService;
    private Button btnGetCurrentNumber;

    private Intent serviceIntent;

    private EchoService echoService = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceIntent = new Intent(this, EchoService.class);

        btnStartService = (Button) findViewById(R.id.btnStartService);
        btnStopService = (Button) findViewById(R.id.btnStopService);
        btnBindService = (Button) findViewById(R.id.btnBindService);
        btnUnBindService = (Button) findViewById(R.id.btnUnBindService);
        btnGetCurrentNumber = (Button) findViewById(R.id.btnGetCurrentNumber);

        btnStartService.setOnClickListener(this);
        btnStopService.setOnClickListener(this);

        btnBindService.setOnClickListener(this);
        btnUnBindService.setOnClickListener(this);

        btnGetCurrentNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStartService:
                startService(serviceIntent);
                break;
            case R.id.btnStopService:
                stopService(serviceIntent);
                break;
            case R.id.btnBindService:
                bindService(serviceIntent, this, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btnUnBindService:
                unbindService(this);
                echoService = null;
                break;

            case R.id.btnGetCurrentNumber:
                if (echoService != null){
                    echoService.getCurrentUn();
                    System.out.println("当前服务中的数字是：" + echoService.getCurrentUn());
                }
                break;
        }
    }

    @Override
    public void onServiceConnected(ComponentName componentName, IBinder binder) {
        System.out.println("onServiceConnected");

        echoService = ((EchoService.EchoServiceBinder) binder).getService();
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {

    }
}
