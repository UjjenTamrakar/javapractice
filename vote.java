import java.util.Scanner;

public class vote{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt(); 
        scan.nextLine();
        String eligibility = (age >= 18) ? "eligible" : "not eligible";
         
        if (age < 18){
          
             System.out.println(" you are " + eligibility + " to vote " );
              return;
             
        }
        
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
        
        System.out.print("Enter your user");
        int user = scan.nextInt();
        scan.nextLine();
        System.out.println("\nvoting access granted");
        System.out.println("Name : " + name);
        System.out.println("User : " + user);
        System.out.println("You are eligible to vote");
        
        
        
        
        
        
        
    
    
    }

}