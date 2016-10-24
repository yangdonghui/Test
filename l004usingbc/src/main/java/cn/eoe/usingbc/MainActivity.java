package cn.eoe.usingbc;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.eoe.usingbc.R;

public class MainActivity extends AppCompatActivity {

    private Button btnSendBroadcast;

    private Button btnRegBCR, btnUnRegBCR;

    private final MyBC myBC = new MyBC();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendBroadcast = (Button) findViewById(R.id.btnSendBroadcast);

        btnSendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, MyBC.class);
                Intent i = new Intent(MyBC.ACTION);
                i.putExtra("txt", "Hello eoe!");
                sendBroadcast(i);
            }
        });

        btnRegBCR = (Button) findViewById(R.id.btnRegBCR);
        btnRegBCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerReceiver(myBC, new IntentFilter(MyBC.ACTION));
            }
        });

        btnUnRegBCR = (Button) findViewById(R.id.btnUnRegBCR);
        btnUnRegBCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unregisterReceiver(myBC);
            }
        });

    }
}
