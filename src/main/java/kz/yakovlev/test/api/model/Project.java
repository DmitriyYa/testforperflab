package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Project {

    @SerializedName("self")
    @Expose
    private String self;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("key")
    @Expose
    private String key;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("issuetypes")
    @Expose
    private List<Issuetype> issuetypes = new ArrayList<Issuetype>();

    public Project(String self, String id, String key, String name, List<Issuetype> issuetypes) {
        super();
        this.self = self;
        this.id = id;
        this.key = key;
        this.name = name;
        this.issuetypes = issuetypes;
    }

    public Project(String key) {
        this.key = key;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Issuetype> getIssuetypes() {
        return issuetypes;
    }

    public void setIssuetypes(List<Issuetype> issuetypes) {
        this.issuetypes = issuetypes;
    }

}
