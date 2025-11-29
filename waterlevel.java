import java.util.Scanner;

public class waterlevel{
 
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter water level");
        double lit = scan.nextDouble();
        String lvl = ( lit >=1000 ) ? ("Over level") : ("Under level");
        System.out.println(lvl);
        scan.close();
        
        
    
    
    
    }

}