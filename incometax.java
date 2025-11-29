import java.util.Scanner;

public class incometax{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter annual income");
        double income = scan.nextInt();
        double tax;
        if(income >0 && income <= 500000){
            tax = income *0.01;
        }else if(income > 500000 && income <= 700000){
            tax = 5000 + (income - 500000)*0.1; 
        }else if(income > 700000 && income <=1000000){
            tax = 25000 +(income - 700000)*0.2;
        }else if(income > 1000000 && income <=2000000){
            tax = 150000 + 25000 +(income - 1000000)*0.3;
        }else if(income > 2000000 && income <=5000000){
            tax = 175000 + 288000 +(income - 2000000)*0.36;
        }else{
            tax = 463000 +(income - 5000000)*0.39;
            
        }
        System.out.println("Payable Tax Income" + tax);
    }
} 