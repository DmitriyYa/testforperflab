package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Issuetype {

    @SerializedName("self")
    @Expose
    private String self;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("subtask")
    @Expose
    private Boolean subtask;


//    public Issuetype() {
//    }

    public Issuetype(String self, String id, String description, String iconUrl, String name, Boolean subtask) {
        super();
        this.self = self;
        this.id = id;
        this.description = description;
        this.iconUrl = iconUrl;
        this.name = name;
        this.subtask = subtask;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSubtask() {
        return subtask;
    }

    public void setSubtask(Boolean subtask) {
        this.subtask = subtask;
    }

}
