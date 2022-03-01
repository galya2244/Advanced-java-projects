package cyber.coffee;;


import java.util.Scanner;


public class Thanks {
    public void printThanks(){
        
      

        System.out.println("your order has been successfully executed and it will be executed as soon as possible please wait");
        
        System.out.println("Your order is Done...Enjoy your meal (:");
        
        System.out.println("please rate your reqest 100% OR 50% OR 0%......." );
        
        
        
        
        Scanner keyboard = new Scanner(System.in);
        int Evaluation = keyboard.nextInt();
       
        
        
        
        if (Evaluation == 100)
        {
           System.out.println("Thank you for your rating 100% :) and we always aspire the best");
        }
        if (Evaluation == 50)
        {
           System.out.println("Thank you for your rating  50% :) and we will try to give you the best one again");
        }
        if (Evaluation == 0)
        System.out.println("Thank you for your rating 0% :( and we sorry for your dislike and we will try to please you again");
            
          
       
        
     
      
     

        
        
        
    }

  

}