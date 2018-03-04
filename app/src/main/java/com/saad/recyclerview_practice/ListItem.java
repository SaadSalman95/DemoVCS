package com.saad.recyclerview_practice;

/**
 * Created by saad_ on 2/24/2018.
 */

public class ListItem {
    private String heading;
    private String desc;
    private String imgaeUrl;

    public ListItem(String heading, String desc, String imgaeUrl) {
        this.heading = heading;
        this.desc = desc;
        this.imgaeUrl = imgaeUrl;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgaeUrl() {
        return imgaeUrl;
    }
}
