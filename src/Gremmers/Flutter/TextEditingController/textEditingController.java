package Gremmers.Flutter.TextEditingController;

import Gremmers.AST;
import Gremmers.NameN;

public class textEditingController extends AST {
    private String TEXTEDITINGCONTROLLER;
    private NameN nameN;

    public String getTEXTEDITINGCONTROLLER() {
        return TEXTEDITINGCONTROLLER;
    }

    public void setTEXTEDITINGCONTROLLER(String TEXTEDITINGCONTROLLER) {
        this.TEXTEDITINGCONTROLLER = TEXTEDITINGCONTROLLER;
    }

    public NameN getNameN() {
        return nameN;
    }

    public void setNameN(NameN nameN) {
        this.nameN = nameN;
    }

    @Override
    public String toString() {
        return "textEditingController{" +
                "TEXTEDITINGCONTROLLER='" + TEXTEDITINGCONTROLLER + '\'' +
                ", nameN=" + nameN +
                '}' ;
    }
}
