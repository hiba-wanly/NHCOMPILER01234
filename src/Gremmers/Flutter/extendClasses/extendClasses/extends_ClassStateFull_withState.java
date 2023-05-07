package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.NameN;

public class extends_ClassStateFull_withState extends AST {

    private String CLASS ;
    private NameN ID ;
    private String EXTENDS;
    private String typee;
    private String OVERRIDE;
    private NameN n1;
    private String CREAT_STATE;
    private NameN n2 ;

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getEXTENDS() {
        return EXTENDS;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public String getType() {
        return typee;
    }

    public void setType(String typee) {
        this.typee = typee;
    }

    public String getOVERRIDE() {
        return OVERRIDE;
    }

    public void setOVERRIDE(String OVERRIDE) {
        this.OVERRIDE = OVERRIDE;
    }

    public NameN getN1() {
        return n1;
    }

    public void setN1(NameN n1) {
        this.n1 = n1;
    }

    public String getCREAT_STATE() {
        return CREAT_STATE;
    }

    public void setCREAT_STATE(String CREAT_STATE) {
        this.CREAT_STATE = CREAT_STATE;
    }

    public NameN getN2() {
        return n2;
    }

    public void setN2(NameN n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "extends_ClassStateFull_withState{" +
                "CLASS='" + CLASS + '\'' +
                ", ID=" + ID +
                ", EXTENDS='" + EXTENDS + '\'' +
                ", type='" + typee + '\'' +
                ", OVERRIDE='" + OVERRIDE + '\'' +
                ", n1=" + n1 +
                ", CREAT_STATE='" + CREAT_STATE + '\'' +
                ", n2=" + n2 +
                '}';
    }
}
