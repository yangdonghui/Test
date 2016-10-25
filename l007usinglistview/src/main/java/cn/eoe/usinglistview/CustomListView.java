package cn.eoe.usinglistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by donghui on 16/10/25.
 */
public class CustomListView extends Activity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview);

        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new CustomListViewAdapter(this));
    }

    private BaseAdapter adapter = new BaseAdapter() {
        private String[] datas = new String[]{"eoe1", "eoe2", "eoe3", "eoe4", "eoe5", "eoe6", "eoe7", "eoe8"};

        @Override
        public int getCount() {
            return datas.length;
        }

        @Override
        public String getItem(int i) {
            return datas[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertview, ViewGroup viewGroup) {
            System.out.println("<<<<<<<<<<<<");

            TextView tv = null;
            if (convertview == null){
                tv = new TextView(CustomListView.this);
            }else{
                tv = (TextView) convertview;
            }

            tv.setTextSize(30);
            tv.setText(getItem(i));
            return tv;
        }

    };

}
