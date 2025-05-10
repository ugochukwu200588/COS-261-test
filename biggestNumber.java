import java.util.Scanner;
public class biggestNumber {    //class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //instance of the scanner class
        int biggest = 0;    //intialize biggest to zero
        for(int i = 0; i < 3; i++){ //using for loop to get 3 numbers and check if the number entered is greater than biggest
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); // get user input
            if(number > biggest){   // if number greater than zero them biggest = number
                biggest = number;
            }
        }
        System.out.println("the biggest of the 3 numbers is: " + biggest); //print the biggest number
        sc.nextInt();
    }
}
