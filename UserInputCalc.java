import java.util.Scanner;

public class UserInputCalc{
 
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();
        
        System.out.println("Enter operator +, -, *, /): ");
        char op = scan.next().charAt(0);
        int result = 0; 
        
        if(op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
            
        }
        else if (op == '/') {
            result = a / b;
        }
         else {
            System.out.println("Invalid operator");
            return;
            
            }
            
            System.out.println("Result: " + result);
         
        
        
        
    
    }



}