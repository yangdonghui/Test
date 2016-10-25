package cn.eoe.usinglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by donghui on 16/10/25.
 */
public class CustomListViewAdapter extends BaseAdapter {
    private CustomListCellData[] customListCellDatas = new CustomListCellData[]{
            new CustomListCellData("img1", "dec aa",R.mipmap.img1),
            new CustomListCellData("img2", "dec bb",R.mipmap.img2),
            new CustomListCellData("img3", "dec cc",R.mipmap.img3),
    };

    private Context context = null;

    public CustomListViewAdapter(Context context){
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public int getCount() {
        return customListCellDatas.length;
    }

    @Override
    public CustomListCellData getItem(int i) {
        return customListCellDatas[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {

        LinearLayout ll = null;
        if (convertview != null){
            ll = (LinearLayout) convertview;
        }else{
            ll = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.custom_listcell, null);
        }

        CustomListCellData customListCellData = getItem(i);

        ImageView icon = (ImageView) ll.findViewById(R.id.icon);
        TextView name = (TextView) ll.findViewById(R.id.name);
        TextView dec = (TextView) ll.findViewById(R.id.description);

        icon.setImageResource(customListCellData.getIconId());
        name.setText(customListCellData.getName());
        dec.setText(customListCellData.getDec());

        return ll;
    }
}
