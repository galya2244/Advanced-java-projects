
package cyber.coffee;



import java.util.Scanner;
import javax.swing.JFrame;

public class CyberCoffee  {

    public static void main(String[] args) {
        
         
        
         Thanks A = new Thanks();
         DRIVE B = new DRIVE();
         Tablesout C = new  Tablesout ();
         
         Scanner keyboard = new Scanner (System.in);
         System.out.println("Holle DEAR");
         System.out.println("please enter your choose to reserve a table or deliver your order");
          
          String G1 = keyboard .nextLine();
          
          if("table".equals(G1))
    { 
        
         System.out.println("please enter your choose indoor OR outdoor table");
        
        
         String num11 = keyboard .nextLine();
         if ("indoor".equals(num11))
         {   
            C. printTablesinside();
         }
         if("outdoor".equals(num11))
         {
             C.printTablesout();// استدعاء
         }  
   
    }
             if("deliver".equals(G1))
             {
                B.printDRIVE();
             }    
             
             
              A.printThanks();

             
        
         
         
}
}
        
    

    

   
    

