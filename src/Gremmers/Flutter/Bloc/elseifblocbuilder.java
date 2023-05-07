package Gremmers.Flutter.Bloc;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;

import java.util.ArrayList;
import java.util.List;

public class elseifblocbuilder extends AST {
    private String ELSEIF;
    private String STATE;
    private NameN id ;
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
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();

    public void setELSEIF(String ELSEIF) {
        this.ELSEIF = ELSEIF;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public void setId(NameN id) {
        this.id = id;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public String getELSEIF() {
        return ELSEIF;
    }

    public String getSTATE() {
        return STATE;
    }

    public NameN getId() {
        return id;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    @Override
    public String toString() {
        return "elseifblocbuilder{" +
                "ELSEIF='" + ELSEIF + '\'' +
                ", STATE='" + STATE + '\'' +
                ", id=" + id +
                ", flutterWidget=" + flutterWidget +

                "line:"+linenum+"children:"+childrennum
                +

                "} \n";
    }
}
