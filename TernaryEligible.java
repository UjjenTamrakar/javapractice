import java.util.Scanner;

public class TernaryEligible{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int age = scan.nextInt();
        
        String isVote = (age >= 18) ? "Alr you can vote lets start with your id" : "Your age is under 18";
        System.out.println(isVote);
        
        if(age >= 18){
            scan.nextLine();
        }else{
            return;
        }
        
        System.out.println("Whats ur id?");
        int userID = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Whats your name");
        String userName = scan.nextLine();
        
        System.out.println("Whats yo sex?");
        String sex = scan.nextLine();
        
        System.out.println("----------Voter Details--------------");
        System.out.println("Voter ID : " + userID + "\n" + "Voter Name : " + userName + "\n" + "Voter Gender : " + sex);
        
        scan.close();
    }
}