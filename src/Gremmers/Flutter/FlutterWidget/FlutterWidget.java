package Gremmers.Flutter.FlutterWidget;

import Gremmers.AST;
import Gremmers.Flutter.Bloc.blocbuilderWidget;
import Gremmers.Flutter.Bloc.floatactionbutton;
import Gremmers.Flutter.ButtonWithPressed.ButtonwithPressed;
import Gremmers.Flutter.ButtonwithPressedNavigate.buttonwithPressedNavigate;
import Gremmers.Flutter.Column.Column;
import Gremmers.Flutter.Container.Container;
import Gremmers.Flutter.FloutingAction.fLOATING_name;
import Gremmers.Flutter.Image.imageClasses;
import Gremmers.Flutter.Padding.paddingClasses;
import Gremmers.Flutter.Row.Row;
import Gremmers.Flutter.SizedBox.SizedBoxClasses;
import Gremmers.Flutter.TextButton.textButton;
import Gremmers.Flutter.TextFormField.textFormField;
import Gremmers.Flutter.TextStatement.TextClasses;
import Gremmers.Flutter.expandedClasses.expandedClasses;
import Gremmers.Flutter.Bloc.floatactionbutton;
import java.util.ArrayList;
import java.util.List;
import Gremmers.Flutter.Bloc.blocbuilderWidget;

public class FlutterWidget extends AST {

    private Container attr_Container;
    private Column attr_Column ;
    private Row attr_Row;
    private TextClasses  attr_TextClasses ;
    private SizedBoxClasses attr_SizedBoxClasses ;
    private textButton attr_textButton;
    private imageClasses attr_imageClasses ;

    private expandedClasses exclass ;

    private paddingClasses attr_paddingClasses ;

    private textFormField textformfi;

    private ButtonwithPressed butwithpr;

    private buttonwithPressedNavigate butwithprnav;

    private blocbuilderWidget blocbuilderWidget;

    private floatactionbutton floatactionbutton;

    public floatactionbutton getFloatactionbutton() {
        return floatactionbutton;
    }

    public void setFloatactionbutton(floatactionbutton floatactionbutton) {
        this.floatactionbutton = floatactionbutton;
    }

    public blocbuilderWidget getBlocbuilderWidget() {
        return blocbuilderWidget;
    }

    public void setBlocbuilderWidget(blocbuilderWidget blocbuilderWidget) {
        this.blocbuilderWidget = blocbuilderWidget;
    }

    private fLOATING_name fLOATINGName;

    public fLOATING_name getfLOATINGName() {
        return fLOATINGName;
    }

    public void setfLOATINGName(fLOATING_name fLOATINGName) {
        this.fLOATINGName = fLOATINGName;
    }

    private int numline;
    private int ChildrenCount ;

    public void setexpandedClasses(expandedClasses exclass) {
        this.exclass = exclass;
    }
    public expandedClasses getexpandedClasses() {
        return exclass;
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

    public void setContainer(Container attr_Container){
        this.attr_Container=attr_Container;
    }
    public Container getContainer(){
        return  attr_Container;
    }

    public void setColumn(Column attr_Column){
        this.attr_Column=attr_Column;
    }
    public Column getColumn(){
        return attr_Column;
    }
    public void setRow(Row attr_Row ){
        this.attr_Row =attr_Row;
    }

    public Row getRow(){
        return attr_Row;
    }

    public void setTextClasses( TextClasses attr_TextClasses){
        this.attr_TextClasses=attr_TextClasses;
    }

    public TextClasses getTextClasses(){
        return attr_TextClasses;
    }

    public void setSizedBoxClasses ( SizedBoxClasses attr_SizedBoxClasses ){
        this.attr_SizedBoxClasses= attr_SizedBoxClasses;

    }

    public SizedBoxClasses getSizedBoxClasses (){
        return attr_SizedBoxClasses;
    }

    public void settextButton( textButton attr_textButton ){
        this.attr_textButton=attr_textButton;
    }

    public textButton gettextButton(){
        return attr_textButton;
    }

    public void setimageClasses( imageClasses attr_imageClasses ){
        this.attr_imageClasses= attr_imageClasses;
    }

    public imageClasses getimageClasses (){
        return attr_imageClasses;
    }

    public void setpaddingClasses( paddingClasses attr_paddingClasses ){
        this.attr_paddingClasses= attr_paddingClasses;
    }

    public paddingClasses getpaddingClasses(){
        return attr_paddingClasses;
    }

    public textFormField gettextFormField() {
        return textformfi;
    }

    public void settextFormField(textFormField textformfi) {
        this.textformfi = textformfi;
    }

    public ButtonwithPressed getButtonwithPressed() {
        return butwithpr;
    }

    public void setButtonwithPressed(ButtonwithPressed butwithpr) {
        this.butwithpr = butwithpr;
    }

    public buttonwithPressedNavigate getbuttonwithPressedNavigate() {
        return butwithprnav;
    }

    public void setbuttonwithPressedNavigate(buttonwithPressedNavigate butwithprnav) {
        this.butwithprnav = butwithprnav;
    }

    @Override
    public String toString() {
        if(this.attr_imageClasses != null){
            return "FlutterWidget{" + "attr_imageClasses=" + attr_imageClasses + "Line number " + numline+ "children count = " + ChildrenCount+"}\n";
        }
        if(this.attr_paddingClasses != null){
            return "FlutterWidget{" +" attr_paddingClasses=" + attr_paddingClasses + "Line number " + numline+"children count = " + ChildrenCount+ "}\n";
        }
        if(this.attr_textButton != null){
            return "FlutterWidget{" + " attr_textButton=" + attr_textButton + "Line number " + numline+ "children count = " + ChildrenCount+ "}\n";
        }
        if(this.attr_TextClasses != null){
            return "FlutterWidget{" + " attr_TextClasses=" + attr_TextClasses + "Line number " + numline+ "children count = " + ChildrenCount+"}\n";
        }
        if(this.attr_Column != null){
            return "FlutterWidget{" + "attr_Column=" + attr_Column + "Line number " + numline+"children count = " + ChildrenCount+ "}\n";
        }
        if(this.attr_Row != null){
            return "FlutterWidget{" + " attr_Row=" + attr_Row + "Line number " + numline+"children count = " + ChildrenCount+ "} \n";
        }
        if(this.attr_Container != null){
            return "FlutterWidget{" +  "attr_Container=" + attr_Container + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }
        if(this.textformfi != null){
            return "FlutterWidget{" +  "attr_Container=" + textformfi + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }if(this.butwithpr != null){
            return "FlutterWidget{" +  "attr_Container=" + butwithpr + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }
        if(this.butwithprnav != null){
            return "FlutterWidget{" +  "attr_Container=" + butwithprnav + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }
        if(this.fLOATINGName != null){
            return "FlutterWidget{" +  "attr_Container=" + fLOATINGName + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }
        if(this.blocbuilderWidget != null){
            return "FlutterWidget{" +  "attr_Container=" + blocbuilderWidget + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }
        if(this.floatactionbutton != null){
            return "FlutterWidget{" +  "attr_Container=" + floatactionbutton + "Line number " + numline+ "children count = " + ChildrenCount+"} \n";
        }


        return "FlutterWidget{" +
                "attr_SizedBoxClasses=" + attr_SizedBoxClasses + "Line number " + numline+ "children count = " + ChildrenCount +
                "} \n";
    }
}
