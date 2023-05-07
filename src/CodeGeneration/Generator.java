package CodeGeneration;

import symbol.SymbolTable;

import java.io.*;

public class Generator {

    SymbolTable symbolTable;
    String FileName ="";
    String Footer ="comp";

    PrintWriter writer;

    public File file;
    private byte[] buffer ;

//    public void CodeGeneration (String code){
//
//        // writer=new PrintWriter(this.FileName+".php");
//        file= new File("C:\\xampp\\htdocs\\"+"newwww"+"."+"php");
//        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
//        try {
//            if (file.exists())
//                file.delete();
//
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        file = new File("C:\\xampp\\htdocs\\"+"comp"+"."+"php");
////        try {
////            if (file.exists())
////                file.delete();
////
////            file.createNewFile();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }

    public void html_code_generation(String type ,String name  ){
        try {
            String content;
            content=html_element(type,name);

            FileWriter fWriter = new FileWriter(
                    "C:\\xampp\\htdocs\\test.txt");

            // fWriter.write(content);
            System.out.println(content);
            //  fWriter.close();

//            System.out.println(
//                    "File is created successfully with the content.................................................................");
//
        }

        catch (IOException e) {

            // Print the exception
            System.out.print(e.getMessage());
        }
    }


    public String html_element(String type , String obj  ){
        switch (type) {
            case "class":
                type = "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "    <body>";
                break;

            case "AppBar":
                type = "<header>\n\" " +
                        "<h1 style=\"color: white\" > "+ obj + "</h1>\n "+
                        "</header>"
                ;
                break;
            case "backgroundColor":
                type = "    <style>\n" +
                        "        header {\n" +
                        "    background-color: "+ obj +"\n" +
                        "     }\n" +
                        "        .Form{\n" +
                        "            text-align: center;\n" +
                        "        }\n" +
                        "        \n" +
                        "    </style>"
                ;
                break;

            case "Padding":
                type = "  <div class = "+obj+">\n" +
                        "  <form action= \"page2.php\" method=\"post\">"
                +"</div>"
                ;
                break;

            case "const":
                type = "  <div class = "+obj+">\n" +
                        "  <form action = \"page2.php\" method=\"post\">"
                        +"</div>"
                ;
                break;

            case "Expanded":
                type = "  <div class = "+obj+">\n" +
                        "  <form action = \"page3.php\" method=\"post\">"
                        +"</div>"
                ;
                break;
            case "Text(":

                if (obj.equals("$name"))
                { type = "      Hello <?php echo $_POST[\"name\"];?> ! <br/>\n" +
                         "      Name : <?php echo $_POST[\"name\"];?> ! <br/> ";
                    break;}

                if (obj.equals("$email"))
                { type = "      Your Email : <?php echo $_POST[\"email\"];?> <br/> " ; break;}

                if (obj.equals("$age"))
                { type = "      Age : <?php echo $_POST[\"age\"];?> <br/> " ; break; }

                if (obj.equals("$phone"))
                { type = "      Phone number : <?php echo $_POST[\"phone\"];?> <br/> "; break;}

                break;

//            case "Text(\"Enter":
//                if(obj.equals("Enter name")){
//                    type = "    <p>   name:  </p> </br>\n"  ;
//                    break;
//                  }
//                if(obj.equals("Enter email")){
//                    type = "    <p>   email: <input type=\"text\" name=\"email\">  </p> </br>\n";
//                    break;
//                }
//                if(obj.equals("Enter age")){
//                    type = "    <p>   age: <input type=\"number\" name=\"age\">  </p> </br>\n";
//                    break;
//                }
//                if(obj.equals("Enter phone")){
//                    type = "    <p>   phone: <input type=\"number\" name=\"phone\">  </p> </br>\n";
//                    break;
//                }
//                else {
//                    type = "end";
//                    break;
//                }
            case "TextFormField":
                if(obj.equals("name")){
                    type = "    <p>   name: <input type=\"text\" name=\"name\">  </p> </br>\n";
                    break;

                }
                if(obj.equals("email")){
                    type = "    <p>   email: <input type=\"text\" name=\"email\">  </p> </br>\n";
                    break;

                }
                if(obj.equals("age")){
                    type = "    <p>   age: <input type=\"number\" name=\"age\">  </p> </br>\n";
                    break;

                }
                if(obj.equals("phone")){
                    type = "    <p>   phone: <input type=\"number\" name=\"phone\">  </p> </br>\n";
                    break;

                }
                break;

            case "pushNamed":
                type = " <input type=\"submit\" value=\"submit\" name = \"It's True .. Get Started\"> ";
                break;


//            case "TextEditingController":
//                type = "" +
//                        "        <?php\n" +
//                        "\n" +
//                        "\n" +
//                        "        ?>"
//                ;
//                break;

            case "MaterialPageRoute":
                type = " <?php"+
                        " if(isset ($_POST['submit'])){\n" +

                        "            $name=$_POST['name'];\n" +
                        "            $email=$_POST['email'];\n" +
                        "            $age= $_POST['age'];\n" +
                        "            $phone_number = $_POST['phone'];\n" +
                        "\n" +
                        "        }"+
                        "?>"
                ;
                break;

            case " } }":
                type = "    </body>\n" +
                        "</html>";
                break;

            case "SizedBox":
                type =  "<br>";
                break;

            case "BlocBuilder":
                type = "<div class = \"BlocBuilder\" >" ;
                break;

            case "ButtonsWidget":
                type ="<div class = \"floating\">" ;
                break;

            case "ResetEvent":
                type = "  <span class =\"minus\"> - </span>\n" +
                       "  <span class =\"num\"> 01 </span>";
                break;

            case "IncreamentEvent":
                type = "       <span class =\"plus\"> + </span>\n" +
                        "\n" +
                        "      </div>\n" +
                        "</div>\n";
                break;

            case "BlocBuilder<CounterBloc, CounterState>":
                type = "<script>\n" +
                        "\n" +
                        "const plus =document.querySelector(\".plus\"),\n" +
                        "minus = document.querySelector(\".minus\"),\n" +
                        "num = document.querySelector(\".num\");\n" +
                        "\n" +
                        "\n" +
                        "let a= 1 ;"
                ;
                break;

            case "builder" :
                type = "plus.addEventListener(\"click\" , ()=> {\n" +
                        "    a++;\n" +
                        "\n" +
                        "    num.innerText = a;\n" +
                        "    console.log(a);\n" +
                        "});\n" +
                        "\n" +
                        "minus.addEventListener(\"click\" , ()=> {\n" +
                        "    a--;\n" +
                        "\n" +
                        "    num.innerText = a;\n" +
                        "    console.log(a);\n" +
                        "})\n" +
                        "\n" +
                        "      </script>\n"
                        ;
                break;

            case "incrementcount":
                type = "     <script>\n" +
                        "\n" +
                        "const plus =document.querySelector(\".plus\"),\n" +
                        "minus = document.querySelector(\".minus\"),\n" +
                        "num = document.querySelector(\".num\");\n" +
                        "\n" +
                        "\n" +
                        "let a= 1 ;\n" +
                        "\n" +
                        "plus.addEventListener(\"click\" , ()=> {\n" +
                        "    a++;\n" +
                        "\n" +
                        "    num.innerText = a;\n" +
                        "    console.log(a);\n" +
                        "});\n"
                ;
                break;

            case "decrementcount":
                type = "minus.addEventListener(\"click\" , ()=> {\n" +
                        "    a--;\n" +
                        "\n" +
                        "    num.innerText = a;\n" +
                        "    console.log(a);\n" +
                        "})\n" +
                        "\n" +
                        "      </script>"
                        ;
                break;


//            case "Text":
//                type =  name ;
//                break;
//            case "start sign_in":
//                type =  "\t<form ";
//                break;
//            case "end sign_in":
//                type = space + "action = \"" + name + ".php\" method=\"POST\">\n" +
//                        "\t\t<h1>Sign In</h1>\n" +
//                        "\t\tUsername<br>\n" +
//                        "\t\t<input type=\"text\" name=\"username\"><br><br>\n" +
//                        "\t\tPassword<br>\n" +
//                        "\t\t<input type=\"password\" name=\"Password\"><br><br>\n" +
//                        "\t\t<input type=\"submit\" value=\"Login\">\n" +
//                        "\t</form>\n";
//                break;
//            case "start string":
//                type = space + "<p";
//                break;
//            case "end string":
//                type = space + ">" + name.substring(1, name.length() - 1) + "</p>";
//                break;
//            default:
//                type = space + "></input>";
//                break;
        }
        return type;
    }



//    public void generate(SymbolTable symbolTable){
//
//        PrintWriter printWriter;
//        this.Footer = footerCode();
//    }
//
//    public SymbolTable getSymbolTable() {
//        return symbolTable;
//    }
//
//    public void setSymbolTable(SymbolTable symbolTable) {
//        this.symbolTable = symbolTable;
//    }
//
//    public String footerCode(){
//       return this.Footer = "<footer>\n" + "" +
//               "        \n" +
//               "<h3> The End Compile project </h3>" +
//               "        \n" +
//               "           </footer>";
//
//    }
}




//                if(obj.equals("Enter name")) {
//                        type = " <p>   name: <input type=\"text\" name=\"name\">  </p> </br>";
//                        }
//                        if(obj.equals("Enter email")){
//                        type = " <p>   email:<input type=\"text\" name=\"email\"> </p> </br>\n";
//
//                        }
//                        if (obj.equals("Enter age")){
//                        type = " <p>   age : <input type=\"number\" name=\"age\"> </p> </br>\n";
//                        }
//                        if(obj.equals("Enter phone")){
//                        type = " <p>   phone number : <input type=\"number\" name=\"phone\"> </p> </br>\n";
//                        }
//                        break;