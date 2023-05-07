package Gremmers.Flutter.Bloc;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;

import java.util.ArrayList;
import java.util.List;

public class floatactionbutton extends AST {
    private String FLOATINGACTIONBUTTON;

    private String ONPRESSED;

    private List<pressedbutton> pressedbutton = new ArrayList<pressedbutton>();

    private String CHILD ;

    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();

    private int numline;

    private int ChildrenCount ;

    public void setFLOATINGACTIONBUTTON(String FLOATINGACTIONBUTTON) {
        this.FLOATINGACTIONBUTTON = FLOATINGACTIONBUTTON;
    }

    public void setONPRESSED(String ONPRESSED) {
        this.ONPRESSED = ONPRESSED;
    }

    public void setPressedbutton(List<pressedbutton> pressedbutton) {
        this.pressedbutton = pressedbutton;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }

    public String getFLOATINGACTIONBUTTON() {
        return FLOATINGACTIONBUTTON;
    }

    public String getONPRESSED() {
        return ONPRESSED;
    }

    public List<pressedbutton> getPressedbutton() {
        return pressedbutton;
    }

    public String getCHILD() {
        return CHILD;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public int getNumline() {
        return numline;
    }

    public int getChildrenCount() {
        return ChildrenCount;
    }
    public String toString() {
        return "floatactionbutton{" +
                "pressedbutton='" + pressedbutton + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", ONPRESSED='" + ONPRESSED + '\'' +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                '}' ;
    }

}
