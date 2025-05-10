import java.util.Scanner;   //importing the scanner class
public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //creating an instancce of the scanner class
        System.out.print("Enter first number: ");   //get first user input
        int num1 =sc.nextInt();
        System.out.print("Enter second number: ");  //get second user input
        int num2 =sc.nextInt();
        int sum = num1 + num2;  //calculatong their sum
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + sum);  //print sum
        sc.close(); //close the scanner class
    }
}
