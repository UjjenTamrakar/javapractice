import java.util.Scanner;

public class operator{
   
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scan.nextInt();
        int b = scan.nextInt();
        // arithmetic operator
        System.out.println(a+b);
        // uniary operator
        System.out.println(a++);
        System.out.println(++a);
        //assignment operator
        System.out.println(a=b);
        //relation operator
        System.out.println(a>=b);
        //logical operator
        System.out.println(a==b && b!=a);
        // ternary operator
        String al =(a>b)? "it is greater" : "it is not greater";
        System.out.println(al);
        
        
        
        
        
        
        
       
       
    
    }
    

}