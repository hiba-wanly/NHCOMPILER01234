package Gremmers.Flutter.Constructer;

import Gremmers.AST;
import Gremmers.NameN;
import Gremmers.var.Initial.Rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class constructer extends AST {

    private String ID;

    private HashMap<String , NameN> coninpt = new HashMap<String , NameN>();


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public HashMap<String , NameN> getconstructerInput() {
        return coninpt;
    }

    public void setconstructerInput(HashMap<String , NameN> coninpt) {
        this.coninpt = coninpt;
    }

    @Override
    public String toString() {
        return "constructer{" +
                "ID='" + ID + '\'' +
                coninpt +
//                ", REQUIRED='" + REQUIRED + '\'' +
//                ", nameN=" + nameN +
                '}' ;
    }
}
