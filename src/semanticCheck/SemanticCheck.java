package semanticCheck;

import Gremmers.functions.ArgumentFunctionType;
import Gremmers.visitor.AntlrToAST;
import symbol.SymbolTable;
import mainm.Main;

import java.util.List;

public class SemanticCheck {
    private SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }



    public static boolean CheckFirstName(SymbolTable symbolTable){
        for(int i=0; i< symbolTable.getSymbolRows().size(); i++)
        {
            if(symbolTable.getSymbolRows().get(i)!=null)
            {
                if(!symbolTable.getSymbolRows().get(0).getType().equals("class"))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean CheckForReduplication(SymbolTable symbolTable){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                for(int j=0 ; j<symbolTable.getSymbolRows().size() ; j++)
                {
                    if(symbolTable.getSymbolRows().get(j).getName().equals(symbolTable.getSymbolRows().get(i).getName()))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckForInt(SymbolTable symbolTable,String symbol){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                if(symbolTable.getSymbolRows().get(i).getType().equals("int")){
                    System.out.println(symbolTable.getSymbolRows().get(i).getName()+"LLLLLLLLLPPPPPPPPP5");
                    System.out.println(symbol+"KKKKKKKKKKK5");
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol)){
                        System.out.println(symbol+"KKKKKKKKKKKMMMMMMMMMMOOO");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckForConst(SymbolTable symbolTable,String symbol){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                if(symbolTable.getSymbolRows().get(i).getType().equals("const")){
                    System.out.println(symbolTable.getSymbolRows().get(i).getName()+"LLLLLLLLLPPPPPPPPP5");
                    System.out.println(symbol+"KKKKKKKKKKK5");
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol)){
                        System.out.println(symbol+"KKKKKKKKKKKMMMMMMMMMMOOO");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckDivisionZero(String symbol){
        if(symbol.equals("0")){
            return true;
        }
        return false;
    }

    public static boolean CheckForVar(SymbolTable symbolTable,String symbol){
//        System.out.println("LLLLLLLLLPPPPPPPPP");
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
//            System.out.println("LLLLLLLLLPPPPPPPPP2");
            if(symbolTable.getSymbolRows().get(i) != null)
            {
//                System.out.println("LLLLLLLLLPPPPPPPPP3");
//                if(symbolTable.getSymbolRows().get(i).getName().equals("Variable")){
//                    System.out.println("LLLLLLLLLPPPPPPPPP4");
                if(symbolTable.getSymbolRows().get(i).getType().equals("var")){
                    System.out.println(symbolTable.getSymbolRows().get(i).getName()+"LLLLLLLLLPPPPPPPPP5");
                    System.out.println(symbol+"KKKKKKKKKKK5");
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol)){
//                            System.out.println(symbolTable.getSymbolRows().get(i).getValue()+"PPPPPPPPPPP");
                        System.out.println(symbol+"KKKKKKKKKKKMMMMMMMMMMOOO");
                        return true;
                    }
//                   }
                }
            }
        }
        return false;
    }

    public static boolean CheckForClass(SymbolTable symbolTable,String symbol){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                if(symbolTable.getSymbolRows().get(i).getType().equals("class")){
                    System.out.println(symbolTable.getSymbolRows().get(i).getName()+"LLLLLLLLLPPPPPPPPP5");
                    System.out.println(symbol+"KKKKKKKKKKK5");
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol)){
                        System.out.println(symbol+"KKKKKKKKKKKMMMMMMMMMMOOO");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckForFunVoid(SymbolTable symbolTable,String symbol){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                if(symbolTable.getSymbolRows().get(i).getType().equals("void")){
                    System.out.println(symbolTable.getSymbolRows().get(i).getName()+"LLLLLLLLLPPPPPPPPP5");
                    System.out.println(symbol+"KKKKKKKKKKK5");
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol) && symbolTable.getSymbolRows().get(i).getValue().equals("-") ){
                        System.out.println(symbol+"KKKKKKKKKKKMMMMMMMMMMOOO");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckForFunVoidArg(SymbolTable symbolTable,String symbol, List<ArgumentFunctionType> symbol2){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                if(symbolTable.getSymbolRows().get(i).getType().equals("void")){
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol)){
                        List<ArgumentFunctionType> arg22 = symbolTable.getSymbolRows().get(i).getArgumentFunctionTypes();
                        System.out.println(symbol+"KKKKKKKKKKKMMMMMMMMMMOOO");
                        int aa = symbolTable.getSymbolRows().get(i).getArgumentFunctionTypes().size();
                        System.out.println("aa"+aa);
                        int bb = symbol2.size();
                        System.out.println("bb"+bb);
                        if(aa == bb){
                            System.out.println("aaaabbbbbb");
                            for(int k =0;k < aa; k++){
                                System.out.println("aaaabbbbbb22");
                                String nn = arg22.get(k).getTypee();
                                System.out.println("aaaabbbbbb233"+nn);
                                String mm = symbol2.get(k).getTypee();
                                System.out.println("aaaabbbbbb444"+mm);
                                if(nn.equals(mm)){
                                    System.out.println("trRRRRRUUUUUUUUUEEEEEEEEEE");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean CheckForTextEdCont(SymbolTable symbolTable,String symbol){
        for(int i = 0 ; i <symbolTable.getSymbolRows().size() ; i++)
        {
            if(symbolTable.getSymbolRows().get(i) != null)
            {
                if(symbolTable.getSymbolRows().get(i).getType().equals("TextEditingController")){
                    if(symbolTable.getSymbolRows().get(i).getName().equals(symbol)){
                        return true;
                    }
                }
            }
        }
        return false;
    }



}
