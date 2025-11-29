import java.util.Scanner;

public class Wap{
 
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
       
      System.out.print("Enter a number: ");
      
       if (scan.hasNextDouble()) {
           double num = scan.nextDouble();
           String result = (num > 0)? "positive" :  
                           (num < 0)? "negative" :  
                          (num == 0 )? "zero" : "Neither";
                      System.out.println("The number is: " + result);    
       } else{  
            System.out.println("The input is not a valid number.");
            
            
            
            
    
    
    
    }

        scan.close();

    }
}