package kz.yakovlev.test.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Dmitriy.Yakovlev
 * Created: 28.03.18 9:19
 */
public class Expand {

    @SerializedName("expand")
    @Expose
    private String expand;

    @SerializedName("transitions")
    @Expose
    private List<Transition> transitions = null;


    private Transition transition;


    public Expand() {
    }

    public Expand(Transition transition) {
        this.transition = transition;
    }

    public Expand(String expand, List<Transition> transitions) {
        this.expand = expand;
        this.transitions = transitions;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }


    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }


    public List<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

}
