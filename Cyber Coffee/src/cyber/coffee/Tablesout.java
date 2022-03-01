
package cyber.coffee;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Tablesout  extends Tablesinside {
    public void printTablesout(){
         Scanner keyboard = new Scanner (System.in);
         
        System.out.println("Hello dear..");
       
        try{
              System.out.println("write the number of tables");
              int number33 = keyboard.nextInt();
             
              System.out.println("write the number for how many people");
              int number2 = keyboard.nextInt();
        
            }
   catch(Exception e)
  {         
       System.out.println("NoMatchException"+e);
      
  }
       

}
}