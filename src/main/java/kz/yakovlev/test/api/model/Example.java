package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Example {

    @SerializedName("expand")
    @Expose
    private String expand;

    @SerializedName("projects")
    @Expose
    private List<Project> projects = new ArrayList<Project>();


//    public Example() {
//    }


    public Example(String expand, List<Project> projects) {
        super();
        this.expand = expand;
        this.projects = projects;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Example{" +
                "expand='" + expand + '\'' +
                ", projects=" + projects +
                '}';
    }
}
