package Gremmers.classes;

import Gremmers.AST;
import Gremmers.Flutter.Bloc.returnBlocProvider;
import Gremmers.NameN;

public class classblocmain extends AST {
    private String clas ;
    private NameN id ;
    private String EXTENDS;
    private String  STATELESSWIDGET;
    private Gremmers.Flutter.Bloc.returnBlocProvider returnBlocProvider ;
    private String OVERRIDE;
    private String BUILD_WIDGET;
    private int numline;
    private int ChildrenCount ;
    private String parent;

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setId(NameN id) {
        this.id = id;
    }

    public void setEXTENDS(String EXTENDS) {
        this.EXTENDS = EXTENDS;
    }

    public void setSTATELESSWIDGET(String STATELESSWIDGET) {
        this.STATELESSWIDGET = STATELESSWIDGET;
    }

    public void setReturnBlocProvider(returnBlocProvider returnBlocProvider) {
        this.returnBlocProvider = returnBlocProvider;
    }

    public void setOVERRIDE(String OVERRIDE) {
        this.OVERRIDE = OVERRIDE;
    }

    public void setBUILD_WIDGET(String BUILD_WIDGET) {
        this.BUILD_WIDGET = BUILD_WIDGET;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }

    public void setParent(String parent) {
        this.parent = parent;
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

    public String getSTATELESSWIDGET() {
        return STATELESSWIDGET;
    }

    public returnBlocProvider getReturnBlocProvider() {
        return returnBlocProvider;
    }

    public String getOVERRIDE() {
        return OVERRIDE;
    }

    public String getBUILD_WIDGET() {
        return BUILD_WIDGET;
    }

    public int getNumline() {
        return numline;
    }

    public int getChildrenCount() {
        return ChildrenCount;
    }

    public String getParent() {
        return parent;
    }
}
