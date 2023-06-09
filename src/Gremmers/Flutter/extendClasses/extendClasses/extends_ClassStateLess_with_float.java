package Gremmers.Flutter.extendClasses.extendClasses;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class extends_ClassStateLess_with_float  extends AST {
    private NameN ID ;
    private String EXTENDS;
    private String type;
    private String OVERRIDE;
    private String BUILD_WIDGET;
    private String RETURN;
    private String SCAFFOLD;
    private String BODY;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private int numline;
    private int ChildrenCount ;
    private String parent;
    private String FLOATINGACTIONBUTTON;
    private NameN n;

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
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOVERRIDE() {
        return OVERRIDE;
    }

    public void setOVERRIDE(String OVERRIDE) {
        this.OVERRIDE = OVERRIDE;
    }

    public String getBUILD_WIDGET() {
        return BUILD_WIDGET;
    }

    public void setBUILD_WIDGET(String BUILD_WIDGET) {
        this.BUILD_WIDGET = BUILD_WIDGET;
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public String getSCAFFOLD() {
        return SCAFFOLD;
    }

    public void setSCAFFOLD(String SCAFFOLD) {
        this.SCAFFOLD = SCAFFOLD;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getFLOATINGACTIONBUTTON() {
        return FLOATINGACTIONBUTTON;
    }

    public void setFLOATINGACTIONBUTTON(String FLOATINGACTIONBUTTON) {
        this.FLOATINGACTIONBUTTON = FLOATINGACTIONBUTTON;
    }

    public NameN getN() {
        return n;
    }

    public void setN(NameN n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "extends_ClassStateLess_with_float{" +
                "ID=" + ID +
                ", EXTENDS='" + EXTENDS + '\'' +
                ", type='" + type + '\'' +
                ", OVERRIDE='" + OVERRIDE + '\'' +
                ", BUILD_WIDGET='" + BUILD_WIDGET + '\'' +
                ", RETURN='" + RETURN + '\'' +
                ", SCAFFOLD='" + SCAFFOLD + '\'' +
                ", BODY='" + BODY + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", numline=" + numline +
                ", ChildrenCount=" + ChildrenCount +
                ", parent='" + parent + '\'' +
                ", FLOATINGACTIONBUTTON='" + FLOATINGACTIONBUTTON + '\'' +
                ", n=" + n +
                '}';
    }
}
