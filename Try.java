import java.util.Scanner;
public class Try {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try{
        //get inputs
System.out.println("Enter the numerator:");
int numerator = scanner.nextInt();
System.out.println("Enter the denominator:");
int denominator=scanner.nextInt();
//perform division
int result = numerator / denominator;
System.out.println("Results:" + 10);
    }
    catch (ArithmeticException e){
        //handle division by zero
        System.out.println("Error:Division by zero is not allowed.");
}finally{
    //always execute this block
    System.out.println("Division attempt completed.");
}
scanner.close();
}  
}
