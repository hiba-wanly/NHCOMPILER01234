package Gremmers.classes;

import Gremmers.AST;
import Gremmers.Flutter.Bloc.ElseIfClassBloc;
import Gremmers.NameN;
import Gremmers.var.InputClasses;

import java.util.ArrayList;
import java.util.List;

public class classbloc extends AST {

    private String clas ;
    private NameN id ;
    private String EXTENDS;
    private String BLOC;
    private String IF;
    private String EVENT;
    private String EMIT;

    private String ELSE;

    private int linenum;

    public void setLinenum(int linenum) {
        this.linenum = linenum;
    }

    public void setChildrennum(int childrennum) {
        this.childrennum = childrennum;
    }

    private int childrennum;

    public int getLinenum() {
        return linenum;
    }

    public int getChildrennum() {
        return childrennum;
    }

    private List<ElseIfClassBloc> elseIfClassBlocs = new ArrayList<ElseIfClassBloc>();


    private List<InputClasses> inputclasses = new ArrayList<InputClasses>();

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setId(NameN id) {
        this.id = id;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public void setBLOC(String BLOC) {
        this.BLOC = BLOC;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public void setEVENT(String EVENT) {
        this.EVENT = EVENT;
    }

    public void setEMIT(String EMIT) {
        this.EMIT = EMIT;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
    }

    public void setElseIfClassBlocs(List<ElseIfClassBloc> elseIfClassBlocs) {
        this.elseIfClassBlocs = elseIfClassBlocs;
    }

    public void setInputclasses(List<InputClasses> inputclasses) {
        this.inputclasses = inputclasses;
    }

    public String getClas() {
        return clas;
    }

    public NameN getId() {
        return id;
    }

    public String getEXTENDS() {
        return EXTENDS;
    }

    public String getBLOC() {
        return BLOC;
    }

    public String getIF() {
        return IF;
    }

    public String getEVENT() {
        return EVENT;
    }

    public String getEMIT() {
        return EMIT;
    }

    public String getELSE() {
        return ELSE;
    }

    public List<ElseIfClassBloc> getElseIfClassBlocs() {
        return elseIfClassBlocs;
    }

    public List<InputClasses> getInputclasses() {
        return inputclasses;
    }
    @Override
    public String toString() {
        return "classbloc{" +
                "clas='" + clas + '\'' +
                ", id='" + id + '\'' +
                ", EXTENDS='" + EXTENDS + '\'' +
                ", BLOC='" + BLOC + '\'' +
                ", IF='" + IF + '\'' +
                ", EVENT='" + EVENT + '\'' +
                ", EMIT='" + EMIT + '\'' +
                ", ELSE='" + ELSE + '\'' +
                ", elseIfClassBlocs=" + elseIfClassBlocs +

                ", inputclasses=" + inputclasses +
                "line:"+linenum+"children:"+childrennum
                +

                "} \n";
    }
}
