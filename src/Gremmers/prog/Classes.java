package Gremmers.prog;
import Gremmers.AST;
import Gremmers.classes.AbstractStatment;
import Gremmers.classes.ClassStatement;
import Gremmers.classes.ExtendsClass;
import Gremmers.classes.classbloc;
import Gremmers.classes.classblocmain;

public class Classes extends AST{

    private ExtendsClass extendsClass;

    private AbstractStatment abstractStatment;

    private ClassStatement classStatement;
    private classbloc classbloc;
    private classblocmain classblocmain;
    private int linenum;
    private int childrennum;

    public Gremmers.classes.classbloc getClassbloc() {
        return classbloc;
    }

    public void setClassbloc(Gremmers.classes.classbloc classbloc) {
        this.classbloc = classbloc;
    }

    public Gremmers.classes.classblocmain getClassblocmain() {
        return classblocmain;
    }

    public void setClassblocmain(Gremmers.classes.classblocmain classblocmain) {
        this.classblocmain = classblocmain;
    }

    public void setExtendsClass(ExtendsClass extendsClass){
        this.extendsClass = extendsClass;
    }

    public ExtendsClass getExtendsClass(){
        return extendsClass;
    }

    public void setAbstractStatment(AbstractStatment abstractStatment){
        this.abstractStatment = abstractStatment;
    }

    public AbstractStatment getAbstractStatment(){
        return abstractStatment;
    }

    public void setClassStatement(ClassStatement classStatement){
//        System.out.println("addBodysss");
        this.classStatement = classStatement;
    }

    public ClassStatement getClassStatement(){
        return classStatement;
    }

    public int getLinenum() {
        return linenum;
    }

    public void setLinenum(int linenum) {
        this.linenum = linenum;
    }

    public int getChildrennum() {
        return childrennum;
    }

    public void setChildrennum(int childrennum) {
        this.childrennum = childrennum;
    }
    @Override
    public String toString() {
        if(this.extendsClass != null)
            return "\n Body Classes {"+ extendsClass
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";
        else if (this.abstractStatment != null)
            return "\n Body Classes {"+ abstractStatment
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";
       else if (this.classStatement != null)
            return "\n Body Classes {"+ classStatement
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";
        else if (this.classbloc != null)
            return "\n Body Classes {"+ classbloc
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";

        else
            return "\n Body Classes {"+ classblocmain
                    + "line:"+linenum+"children:"+childrennum
                    +"}\n";

//        return "Classes{" +
//                "extendsClass=" + extendsClass +
//                ", abstractStatment=" + abstractStatment +
//                ", classStatement=" + classStatement +
//                '}';
    }
}

