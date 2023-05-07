package Gremmers.Flutter.Bloc;

import Gremmers.AST;
import Gremmers.NameN;

public class pressedbutton extends AST {
    private String BLOCPROVIDER;
    private NameN ID;
    private int numline;
    private int ChildrenCount ;

    public void setBLOCPROVIDER(String BLOCPROVIDER) {
        this.BLOCPROVIDER = BLOCPROVIDER;
    }

    public void setID(NameN ID) {
        this.ID = ID;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }

    public String getBLOCPROVIDER() {
        return BLOCPROVIDER;
    }

    public NameN getID() {
        return ID;
    }

    public int getNumline() {
        return numline;
    }

    public int getChildrenCount() {
        return ChildrenCount;
    }

    @Override
    public String toString() {
        return "textButton{" +
                "BLOCPROVIDER='" + BLOCPROVIDER + '\'' +
                ", Line number " + numline+
                ", children count = " + ChildrenCount +
                "} \n";
    }

}
