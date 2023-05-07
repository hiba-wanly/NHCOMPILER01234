package Gremmers.Flutter.ButtonWithPressed;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.NameN;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class ButtonwithPressed extends AST {

    private String TEXTBUTTON;
    private String CHILD;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private String ONPRESSED ;
    private String NAVIGATE;
    private NameN ID;
    private String MATIRIAL_PAGE_ROUTE;
    private String BULDER;
//    private List<Rule> rules = new ArrayList<Rule>();



    public String getTEXTBUTTON() {
        return TEXTBUTTON;
    }

    public void setTEXTBUTTON(String TEXTBUTTON) {
        this.TEXTBUTTON = TEXTBUTTON;
    }

    public String getCHILD() {
        return CHILD;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public List<FlutterWidget> getFlutterWidget() {
        return flutterWidget;
    }

    public void setFlutterWidget(List<FlutterWidget> flutterWidget) {
        this.flutterWidget = flutterWidget;
    }

    public String getONPRESSED() {
        return ONPRESSED;
    }

    public void setONPRESSED(String ONPRESSED) {
        this.ONPRESSED = ONPRESSED;
    }

    public String getNAVIGATE() {
        return NAVIGATE;
    }

    public void setNAVIGATE(String nvigatorPushNamed) {
        NAVIGATE = nvigatorPushNamed;
    }

    public NameN getID() {
        return ID;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public String getMATIRIAL_PAGE_ROUTE() {
        return MATIRIAL_PAGE_ROUTE;
    }

    public void setMATIRIAL_PAGE_ROUTE(String MATIRIAL_PAGE_ROUTE) {
        this.MATIRIAL_PAGE_ROUTE = MATIRIAL_PAGE_ROUTE;
    }

    public String getBULDER() {
        return BULDER;
    }

    public void setBULDER(String BULDER) {
        this.BULDER = BULDER;
    }
//    public List<Rule> getRules() {
//        return rules;
//    }
//
//    public void setRules(List<Rule> rules) {
//        this.rules = rules;
//    }


    @Override
    public String toString() {
        return "ButtonwithPressed{" +
                "TEXTBUTTON='" + TEXTBUTTON + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", ONPRESSED='" + ONPRESSED + '\'' +
                ", NAVIGATE='" + NAVIGATE + '\'' +
                ", ID=" + ID +
                ", MATIRIAL_PAGE_ROUTE='" + MATIRIAL_PAGE_ROUTE + '\'' +
                ", BULDER='" + BULDER + '\'' +
                '}';
    }
}
