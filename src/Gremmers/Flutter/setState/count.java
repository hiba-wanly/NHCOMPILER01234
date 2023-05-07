package Gremmers.Flutter.setState;

import Gremmers.AST;
import Gremmers.NameN;

public class count extends AST {

    private NameN n;
    private String PLUSORMINUS;

    public NameN getN() {
        return n;
    }

    public void setN(NameN n) {
        this.n = n;
    }

    public String getPLUSORMINUS() {
        return PLUSORMINUS;
    }

    public void setPLUSORMINUS(String PLUSORMINUS) {
        this.PLUSORMINUS = PLUSORMINUS;
    }

    @Override
    public String toString() {
        return "count{" +
                "n=" + n +
                ", PLUSORMINUS='" + PLUSORMINUS + '\'' +
                '}';
    }
}
