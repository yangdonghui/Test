package cn.eoe.usinglistview;

/**
 * Created by donghui on 16/10/25.
 */
public class CustomListCellData {
    public CustomListCellData(String name, String dec, int iconId) {
        this.name = name;
        this.dec = dec;
        this.iconId = iconId;
    }

    private String name = "";
    private String dec = "";
    private int iconId = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }
}
