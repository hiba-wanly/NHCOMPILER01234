package Gremmers.Flutter.Bloc;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class blocbuilderWidget extends AST {
    private String BLOCBUILDER;
    private NameN id ;
    private String BUILDERCS;
    private String IF;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private List<elseifblocbuilder> elseifblocbuilder = new ArrayList<elseifblocbuilder>();
    private int linenum;

    public void setLinenum(int linenum) {
        this.linenum = linenum;
    }

    public void setChildrennum(int childrennum) {
        this.childrennum = childrennum;
    }

    public int getLinenum() {
        return linenum;
    }

    public int getChildrennum() {
        return childrennum;
    }

    private int childrennum;

    private String ELSE;

    public void setBLOCBUILDER(String BLOCBUILDER) {
        this.BLOCBUILDER = BLOCBUILDER;
    }

    public void setId(NameN id) {
        this.id = id;
    }

    public void setBUILDERCS(String BUILDERCS) {
        this.BUILDERCS = BUILDERCS;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public void setElseifblocbuilder(List<elseifblocbuilder> elseifblocbuilder) {
        this.elseifblocbuilder = elseifblocbuilder;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
    }

    public String getBLOCBUILDER() {
        return BLOCBUILDER;
    }

    public NameN getId() {
        return id;
    }

    public String getBUILDERCS() {
        return BUILDERCS;
    }

    public String getIF() {
        return IF;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public List<elseifblocbuilder> getElseifblocbuilder() {
        return elseifblocbuilder;
    }

    public String getELSE() {
        return ELSE;
    }

    @Override
    public String toString() {
        return "blocbuilderWidget{" +
                "BLOCBUILDER='" + BLOCBUILDER + '\'' +
                ", id=" + id +
                ", BUILDERCS='" + BUILDERCS + '\'' +
                ", IF='" + IF + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", elseifblocbuilder=" + elseifblocbuilder +
                ", linenum=" + linenum +
                ", childrennum=" + childrennum +
                ", ELSE='" + ELSE + '\'' +
                '}';

}
}
