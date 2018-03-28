package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 8:38
 */
public class Transition {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("to")
    @Expose
    private To to;


    public Transition() {
    }

    public Transition(String id) {
        this.id = id;
    }

    public Transition(String id, String name, To to) {
        this.id = id;
        this.name = name;
        this.to = to;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

}
