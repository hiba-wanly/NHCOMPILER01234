package Gremmers.Flutter.TextFormField;

import Gremmers.AST;
import Gremmers.NameN;

public class textFormField extends AST {
    private String TextFormField;
    private String Controller;
    private NameN nameN;

    public String getTextFormField() {
        return TextFormField;
    }

    public void setTextFormField(String textFormField) {
        TextFormField = textFormField;
    }

    public String getController() {
        return Controller;
    }

    public void setController(String controller) {
        Controller = controller;
    }

    public NameN getNameN() {
        return nameN;
    }

    public void setNameN(NameN nameN) {
        this.nameN = nameN;
    }

    @Override
    public String toString() {
        return "textFormField{" +
                "TextFormField='" + TextFormField + '\'' +
                ", Controller='" + Controller + '\'' +
                ", nameN=" + nameN +
                '}' ;
    }
}
