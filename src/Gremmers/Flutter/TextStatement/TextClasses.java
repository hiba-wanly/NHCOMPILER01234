package Gremmers.Flutter.TextStatement;

import Gremmers.AST;

public class TextClasses extends AST {

    private  text_INPUT_D_Q_I attr_text_INPUT_D_Q_I;
    private  text_INPUT_D_Q_N attr_text_INPUT_D_Q_N;
    private  text_rule attr_text_rule;
    private text_with_variable text_with_variable;
    private int numline;
    private int ChildrenCount ;
    private String left;

    public text_with_variable getText_with_variable() {
        return text_with_variable;
    }

    public void setText_with_variable( text_with_variable text_with_variable) {
        this.text_with_variable = text_with_variable;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }
    public int getChildrenCount() {
        return ChildrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        ChildrenCount = childrenCount;
    }
    public int getNumline() {
        return numline;
    }

    public void setNumline(int numline) {
        this.numline = numline;
    }
    public text_INPUT_D_Q_I gettext_INPUT_D_Q_I() {
        return attr_text_INPUT_D_Q_I;
    }

    public void settext_INPUT_D_Q_I(text_INPUT_D_Q_I attr_text_INPUT_D_Q_I) {
        this.attr_text_INPUT_D_Q_I = attr_text_INPUT_D_Q_I;
    }

    public text_INPUT_D_Q_N gettext_INPUT_D_Q_N() {
        return attr_text_INPUT_D_Q_N;
    }

    public void settext_INPUT_D_Q_N(text_INPUT_D_Q_N attr_text_INPUT_D_Q_N) {
        this.attr_text_INPUT_D_Q_N = attr_text_INPUT_D_Q_N;
    }

    public text_rule gettext_rule() {
        return attr_text_rule;
    }

    public void settext_rule(text_rule attr_text_rule) {
        this.attr_text_rule = attr_text_rule;
    }

    @Override
    public String toString() {
        if(this.attr_text_INPUT_D_Q_I != null){
            return "TextClasses{" +
                    "attr_text_INPUT_D_Q_I=" + attr_text_INPUT_D_Q_I +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+"\n"+ "left child"+left+ "}\n";
        }
        if(this.attr_text_INPUT_D_Q_N != null){
            return "TextClasses{" +
                    "attr_text_INPUT_D_Q_N=" + attr_text_INPUT_D_Q_N +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+ "\n"+ "left child"+left+"}\n";
        }
        if(this.text_with_variable != null){
            return "TextClasses{" +
            "text_with_variable=" + text_with_variable +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+ "\n"+ "left child"+left+"}\n";

        }
        return "TextClasses{" +
                " attr_text_rule=" + attr_text_rule +"\n"+ "Line number " + numline+"\n"+ "children count = " + ChildrenCount+"\n"+ "left child"+left+
                "} \n";
    }
}
