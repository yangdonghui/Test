package cn.eoe.intents;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnStartAty1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent();
//                i.setComponent(new ComponentName("cn.eoe.intents", "cn.eoe.intents.Aty1"));

                //有操作系统进行匹配启动intent，称为隐式Intent
                Intent i = new Intent("cn.eoe.intents.intent.action.Aty1");
                startActivity(i);

                //打电话
                /*Intent telI = new Intent(Intent.ACTION_VIEW);
                telI.setData(Uri.parse("tel:10086"));
                startActivity(telI);*/
            }
        });
    }
}
