import java.util.Scanner;

public class ausadipasal{
  
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a medicine name");
        String medicine1 =scan.nextLine();
        String medicine2 =scan.nextLine();
        String medicine3 =scan.nextLine();
        System.out.println("Enter quantity");
        int available1 =scan.nextInt();
        int available2 =scan.nextInt();
        int available3 =scan.nextInt();
        System.out.println("Enter price");
        double price1 =scan.nextDouble();
        double price2 =scan.nextDouble();
        double price3 =scan.nextDouble();
        scan.nextLine();
        System.out.println("Do you need prescription?");
        String pre = scan.nextLine();
        if(pre.equals("yes")) {
           System.out.println("Medicine has been prescribed");
        
        }else if(pre.equals("no")) {
           System.out.println("Medicine has not been prescribed");
           
        
        }else{
          System.out.println("Invalid ");
        
        }        
    
        
        scan.close();
        
        
        
        
        
        
    
    
    }
}