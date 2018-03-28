package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Issue {

    @SerializedName("fields")
    @Expose
    private Fields fields;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("key")
    @Expose
    private String key;

    @SerializedName("expand")
    @Expose
    private String expand;

    @SerializedName("transitions")
    @Expose
    private List<Transition> transitions = null;

    @SerializedName("self")
    @Expose
    private String self;


    public Issue() {
    }

    public Issue(Fields fields) {
        super();
        this.fields = fields;
    }

    public Issue(String expand, List<Transition> transitions) {
        super();
        this.expand = expand;
        this.transitions = transitions;
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

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Issue withFields(Fields fields) {
        this.fields = fields;
        return this;
    }

    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public Issue withExpand(String expand) {
        this.expand = expand;
        return this;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

    public Issue withTransitions(List<Transition> transitions) {
        this.transitions = transitions;
        return this;
    }

}
