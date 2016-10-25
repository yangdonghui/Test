package cn.eoe.uicontrols;

import android.content.Context;
import android.content.Intent;

/**
 * Created by donghui on 16/10/25.
 */
public class ListCellData {


    public ListCellData(Context context, String controlName, Intent relatedIntent) {
        this.context = context;
        this.controlName = controlName;
    }

    private String controlName = "";

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    private Context context = null;

    public Context getContext() {
        return context;
    }

    private Intent relatedIntent = null;

    public Intent getRelatedIntent() {
        return relatedIntent;
    }

    public void startActivity(){
        getContext().startActivity(getRelatedIntent());
    }
}
