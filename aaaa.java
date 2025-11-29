import java.util.Scanner;

public class aaaa{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your name cuhh");
        String name = scan.nextLine();
        System.out.println("your age cuh?");
        int age = scan.nextInt();
        if(age >=18){
            System.out.println("cuh you are legal");
        }else{
            System.out.println("fuhh off cuh your are underage");
        }
    }
}