import java.util.Scanner;
public class Eligibility {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);    
        //ask for the user's age
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        //check if the user is eligible to vote
        if (age>=18){
            System.out.println("You are eligible to vote.");
        }else {
            System.out.println("You are not eligible to vote.");
        }
        scanner.close();
        }
    }

