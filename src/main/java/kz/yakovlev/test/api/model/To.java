package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 8:37
 */
public class To {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("statusCategory")
    @Expose
    private StatusCategory statusCategory;


    public To() {
    }

    public To(String self, String description, String iconUrl, String name, String id, StatusCategory statusCategory) {
        super();
        this.self = self;
        this.description = description;
        this.iconUrl = iconUrl;
        this.name = name;
        this.id = id;
        this.statusCategory = statusCategory;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public To withSelf(String self) {
        this.self = self;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public To withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public To withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public To withName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public To withId(String id) {
        this.id = id;
        return this;
    }

    public StatusCategory getStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
    }

    public To withStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
        return this;
    }
}
