package Gremmers.Flutter.ButtonwithPressedNavigate;

import Gremmers.AST;
import Gremmers.Flutter.FlutterWidget.FlutterWidget;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.List;

public class buttonwithPressedNavigate extends AST {

    private String TEXTBUTTON;
    private String CHILD;
    private List<FlutterWidget> flutterWidget = new ArrayList<FlutterWidget>();
    private String ONPRESSED ;
    private String NvigatorPushNamed;
    private List<Rule> rules = new ArrayList<Rule>();

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

    public String getNvigatorPushNamed() {
        return NvigatorPushNamed;
    }

    public void setNvigatorPushNamed(String nvigatorPushNamed) {
        NvigatorPushNamed = nvigatorPushNamed;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "buttonwithPressedNavigate{" +
                "TEXTBUTTON='" + TEXTBUTTON + '\'' +
                ", CHILD='" + CHILD + '\'' +
                ", flutterWidget=" + flutterWidget +
                ", ONPRESSED='" + ONPRESSED + '\'' +
                ", NvigatorPushNamed='" + NvigatorPushNamed + '\'' +
                ", rules=" + rules +
                '}' ;
    }
}
