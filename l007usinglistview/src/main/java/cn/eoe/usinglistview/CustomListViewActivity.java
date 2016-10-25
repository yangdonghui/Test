package cn.eoe.usinglistview;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * Created by donghui on 16/10/25.
 */
public class CustomListViewActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new CustomListViewAdapter(this));
    }
}
