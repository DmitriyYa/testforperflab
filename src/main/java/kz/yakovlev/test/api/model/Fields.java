package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 7:29
 */
public class Fields {
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("issuetype")
    @Expose
    private Issuetype issuetype;

    public Fields() {
    }

    public Fields(Project project, String summary, String description, Issuetype issuetype) {
        super();
        this.project = project;
        this.summary = summary;
        this.description = description;
        this.issuetype = issuetype;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Fields withProject(Project project) {
        this.project = project;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Fields withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fields withDescription(String description) {
        this.description = description;
        return this;
    }

    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    public Fields withIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
        return this;
    }

}
