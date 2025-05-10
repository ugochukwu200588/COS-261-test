import java.util.Scanner;
public class evenOrOdd {    //class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // instance of the scanner class
        System.out.println("Enter a number: ");
        int number = sc.nextInt();  //get user input
        if (number % 2 == 0) {  //check if a number is divisible by 2
            System.out.println("even"); //print even
        }
        else {
            System.out.println("odd");  //print odd
        }
        sc.close();
    }
}
