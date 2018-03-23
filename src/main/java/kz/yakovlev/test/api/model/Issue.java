package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Issue {

    @SerializedName("project")
    @Expose
    private Project project;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("description")
    @Expose
    private String description;


    public Issue(Project project, String summary, String description, Issuetype issuetype) {
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    private Issuetype issuetype;
}
