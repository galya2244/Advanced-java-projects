
package tarkib;
import java.util.regex.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tarkib {

    public static void main(String[] args) {
       Scanner();
    }
    
 //RegularExperssion 
    static String identifer = "[_][0-9][_a-zA-Z]+";
    static String digit = "[0-9]+";
    static String comment = "[/][*][_a-zA-Z]+";
    static String Letter= "[A-Z]+";
    static String token;
    static Scanner inputCode;
    static String Filename = "correct code.txt";
  
    static List keywords = new ArrayList();
    static List symbols = new ArrayList();
    static List Operation = new ArrayList();
    static List logialOP = new ArrayList();
    static List OpenParnt = new ArrayList();
    static List CloseParnt = new ArrayList();
    static List Open__Bracket = new ArrayList();
    static List Close_Bracket = new ArrayList();
    static List Modifier = new ArrayList();
     static List SemiColon = new ArrayList();
    public static void Scanner() {
     
        
        keywords.add("elseif"); keywords.add("for");keywords.add("while");
        keywords.add("do");keywords.add("package");keywords.add("new");
        keywords.add("int");keywords.add("double");keywords.add("float");
        keywords.add("static");keywords.add("const");keywords.add("char");
        keywords.add("goto");keywords.add("boolean");keywords.add("long");
        keywords.add("void");keywords.add("this");keywords.add("try");
        keywords.add("catch");keywords.add("true");keywords.add("print");
        keywords.add("enter"); keywords.add("class"); keywords.add("Byte");
        keywords.add("null");keywords.add("return");
        keywords.add("if");keywords.add("else");
        
        symbols.add("!");symbols.add("&");symbols.add("^");symbols.add("//");
        symbols.add("$");symbols.add("#");symbols.add("@");symbols.add("?");
        symbols.add("~"); symbols.add("'"); //use to print
        symbols.add("]");symbols.add("[");
        
        
         
        
        //types Class (Modifier)
        Modifier.add("public");
        Modifier.add("protected");
        Modifier.add("privet");
        
        // Arthimtic Operations      
        Operation.add("+");
        Operation.add("-");
        Operation.add("*");
        Operation.add("/");
        Operation.add("%");
        
        //Comparsion Operations
        logialOP.add("||");
        logialOP.add("&&");
        logialOP.add("==");
        logialOP.add("<=");
        logialOP.add(">=");
        logialOP.add(">");
        logialOP.add("<");
        logialOP.add("!=");
        
        //puncation Operations
	OpenParnt.add("(*");//begin the condition
	CloseParnt.add("*)"); //end the condition 
	Open__Bracket.add("{*");//begin the loop
	Close_Bracket.add("*}");//end for loop
        SemiColon.add(";");//endsWith
        
        String tokenCategory = null;
        int line=1;
        
        try {
            inputCode = new Scanner(new File(Filename));
            while (inputCode.hasNext()) {
                token = inputCode.next();
                if (keywords.contains(token)) {  
                    tokenCategory = "keyword";
                } else if (symbols.contains(token)) {
                    tokenCategory = "symbols";
                } else if (Operation.contains(token)) {
                    tokenCategory = "Operation";
                } else if (logialOP.contains(token)) {
                    tokenCategory = "logialOP";
                }
                  else if (OpenParnt.contains(token)) {
                     tokenCategory = "OpenParnt";
                }   
                  else if (CloseParnt.contains(token)) {
                     tokenCategory = "CloseParnt";
                }
                  else if (Open__Bracket.contains(token)) {
                     tokenCategory = "Open__Bracket";
                }
                  else if (Close_Bracket.contains(token)) {
                     tokenCategory = "Close_Bracket";
                }
                  else if (SemiColon.contains(token)) {
                     tokenCategory = "SemiColon";
                } 
                  else if (Modifier.contains(token)) {
                     tokenCategory = "Modifier";
                }
                 else if (Letter.contains(token)) {
                     tokenCategory = "Letter";
                }    
                 else if (Pattern.matches(identifer, token)) {
                    tokenCategory = "identifire";
                } else if (Pattern.matches(comment, token)) {
                    tokenCategory = "comment";
                } else if (Pattern.matches(digit, token)) {
                    tokenCategory = "digit";
                } 
                 else {
                    tokenCategory = "there an error in token !!! in line :" + line;
                }
                System.out.println("<" + token + "," + tokenCategory + ">");
               
                if (token.endsWith(";")) {
                    line++;
                }
            }
            System.out.println("Scanner Job is completed");
        } catch (FileNotFoundException ex) {
            System.out.println("File code not found !!");
        }
    }
}
