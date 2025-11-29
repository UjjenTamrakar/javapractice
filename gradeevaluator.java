import java.util.Scanner;

public class gradeevaluator{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a grade");
    double gpa = scan.nextDouble();
    
    if(gpa > 40){
        System.out.println("You are passed");
    
    }else {
       System.out.println("You are failed fuhh off bih");
    }
    
    
    
    }
}