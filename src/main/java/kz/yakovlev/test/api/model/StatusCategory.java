package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 8:36
 */
public class StatusCategory {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("colorName")
    @Expose
    private String colorName;
    @SerializedName("name")
    @Expose
    private String name;

    public StatusCategory() {
    }

    public StatusCategory(String self, int id, String key, String colorName, String name) {
        super();
        this.self = self;
        this.id = id;
        this.key = key;
        this.colorName = colorName;
        this.name = name;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public StatusCategory withSelf(String self) {
        this.self = self;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusCategory withId(int id) {
        this.id = id;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public StatusCategory withKey(String key) {
        this.key = key;
        return this;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public StatusCategory withColorName(String colorName) {
        this.colorName = colorName;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusCategory withName(String name) {
        this.name = name;
        return this;
    }
}
