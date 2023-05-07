package Gremmers.Flutter.FloutingAction;

import Gremmers.AST;
import Gremmers.Flutter.TextStatement.TextClasses;
import Gremmers.NameN;

public class fLOATING_name extends AST {


    private String FLOATINGACTIONBUTTON ;
    private String ONPRESSED;
    private NameN nameN;
    private String CHILD;
    private TextClasses attr_TextClasses ;

    public TextClasses getAttr_TextClasses() {
        return attr_TextClasses;
    }

    public void setAttr_TextClasses(TextClasses attr_TextClasses) {
        this.attr_TextClasses = attr_TextClasses;
    }

    public String getFLOATINGACTIONBUTTON() {
        return FLOATINGACTIONBUTTON;
    }

    public void setFLOATINGACTIONBUTTON(String FLOATINGACTIONBUTTON) {
        this.FLOATINGACTIONBUTTON = FLOATINGACTIONBUTTON;
    }

    public String getONPRESSED() {
        return ONPRESSED;
    }

    public void setONPRESSED(String ONPRESSED) {
        this.ONPRESSED = ONPRESSED;
    }

    public NameN getNameN() {
        return nameN;
    }

    public void setNameN(NameN nameN) {
        this.nameN = nameN;
    }

    public String getCHILD() {
        return CHILD;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    @Override
    public String toString() {
        return "fLOATING_name{" +
                "FLOATINGACTIONBUTTON='" + FLOATINGACTIONBUTTON + '\'' +
                ", ONPRESSED='" + ONPRESSED + '\'' +
                ", nameN=" + nameN +
                ", CHILD='" + CHILD + '\'' +
                ", attr_TextClasses=" + attr_TextClasses +
                '}';
    }
}
