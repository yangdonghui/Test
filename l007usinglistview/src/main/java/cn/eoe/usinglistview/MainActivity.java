package cn.eoe.usinglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView lv;
    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
//        adapter = new ArrayAdapter<String>(this,R.layout.list_cell);

        lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(adapter);

        adapter.add(new ListCellData("小明", "男", 16));
        adapter.add(new ListCellData("小强", "男", 20));

        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ListCellData cellData = adapter.getItem(i);
        Toast.makeText(this, String.format("名字: %s, 性别：％s，年龄：％d", cellData.getUsername(),cellData.getSex(), cellData.getAge()),Toast.LENGTH_SHORT).show();
    }
}
