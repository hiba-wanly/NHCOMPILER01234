package symbol;

import Gremmers.functions.ArgumentFunctionType;

import java.util.ArrayList;
import java.util.List;

public class SymbolRow {

    private String type;
    private String name;
    private String value;
    private int numline;

    private List<ArgumentFunctionType> argumentFunctionTypes = new ArrayList<ArgumentFunctionType>();
//    public SymbolRow(String name) {
//        this.name = name;
//    }


    public List<ArgumentFunctionType> getArgumentFunctionTypes() {
        return argumentFunctionTypes;
    }

    public void setArgumentFunctionTypes(List<ArgumentFunctionType> argumentFunctionTypes) {
        this.argumentFunctionTypes=argumentFunctionTypes;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }






}
