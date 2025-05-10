import java.util.Scanner;
public class multiplicationTable {  //class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication table for which number: ");
        int num1 = sc.nextInt();    //get userinput for which multiplcation table to print
        System.out.print("Starting from 0 to what: ");  // get userinput for end of multipliction starting from 0 - n
        int num2 = sc.nextInt();
        for(int i = 0; i <= num2; i++){ //multiplicating from 0 - n
            System.out.println(num1 + " * " + i + " = " + (num1*i));  // at each i, print the result of the multiplication
        }
        sc.close();
    }
}
