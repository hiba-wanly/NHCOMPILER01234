package Gremmers.Flutter.Bloc;

import Gremmers.AST;
import Gremmers.NameN;

public class returnBlocProvider extends AST {
    private String RETURN;
    private String BLOCPROVIDER;
    private String CREATE;
    private NameN id ;
    private String MATERIALAPP;
    private String CHILD ;

    private String HOME ;
    private int linenum;
    private int childrennum;


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



    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public void setBLOCPROVIDER(String BLOCPROVIDER) {
        this.BLOCPROVIDER = BLOCPROVIDER;
    }

    public void setCREATE(String CREATE) {
        this.CREATE = CREATE;
    }

    public void setId(NameN id) {
        this.id = id;
    }

    public void setMATERIALAPP(String MATERIALAPP) {
        this.MATERIALAPP = MATERIALAPP;
    }

    public void setCHILD(String CHILD) {
        this.CHILD = CHILD;
    }

    public void setHOME(String HOME) {
        this.HOME = HOME;
    }

    public String getRETURN() {
        return RETURN;
    }

    public String getBLOCPROVIDER() {
        return BLOCPROVIDER;
    }

    public String getCREATE() {
        return CREATE;
    }

    public NameN getId() {
        return id;
    }

    public String getMATERIALAPP() {
        return MATERIALAPP;
    }

    public String getCHILD() {
        return CHILD;
    }

    public String getHOME() {
        return HOME;
    }

    @Override
    public String toString() {
        return "returnBlocProvider{" +
                "RETURN='" + RETURN + '\'' +
                ", id='" + id + '\'' +
                ", HOME=" + HOME +
                "BLOCPROVIDER :" +BLOCPROVIDER+
                "CREATE:"+CREATE+
                "MATERIALAPP :" +MATERIALAPP+
                "CHILD:"+CHILD+
                "line:"+linenum+"children:"+childrennum
                +

                "} \n";
    }
}
