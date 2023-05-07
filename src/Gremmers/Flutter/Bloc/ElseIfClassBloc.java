package Gremmers.Flutter.Bloc;

import Gremmers.AST;
import Gremmers.NameN;

public class ElseIfClassBloc extends AST {
    private String elseif;
    private String event;
    private NameN nameN;

    public void setElseif(String elseif){
        this.elseif=elseif;
    }
    public String getElseif(){
        return elseif;
    }

    public void setEvent(String event){
        this.event=event;
    }
    public String getEvent(){
        return event;
    }

    public void setNameN(NameN nameN){
        this.nameN=nameN;
    }
    public NameN getNameN(){
        return nameN;
    }
    public String toString() {
        return "ElseIf{" +
                "else if='" + elseif + '\'' +
                "events=" + event +'\'' +
                "name=" + nameN +'\'' +
                '}' ;
    }
}
