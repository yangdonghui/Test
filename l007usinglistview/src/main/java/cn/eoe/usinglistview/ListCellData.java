package cn.eoe.usinglistview;

/**
 * Created by donghui on 16/10/25.
 */
public class ListCellData {
    public ListCellData(String username, String sex, int age){
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

    private String username = "小丽";
    private String sex = "女";
    private int age = 20;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getUsername();
    }
}
