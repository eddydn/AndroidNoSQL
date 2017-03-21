package dev.edmt.mongodbcloud.Class;

import com.google.gson.annotations.SerializedName;

/**
 * Created by reale on 28/09/2016.
 */

public class Id {
    @SerializedName("$oid")
    private String oid;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
}
