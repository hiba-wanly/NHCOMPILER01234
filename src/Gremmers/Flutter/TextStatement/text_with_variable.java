package Gremmers.Flutter.TextStatement;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class text_with_variable extends AST {

    private String TEXT;
    private List<Rule> rules = new ArrayList<Rule>();
    private String Dollar ;
    private NameN id ;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public String getDollar() {
        return Dollar;
    }

    public void setDollar(String dollar) {
        Dollar = dollar;
    }

    public NameN getId() {
        return id;
    }

    public void setId(NameN id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "text_with_variable{" +
                "TEXT='" + TEXT + '\'' +
                ", rules=" + rules +
                ", Dollar='" + Dollar + '\'' +
                ", id=" + id +
                '}' ;
    }
}
