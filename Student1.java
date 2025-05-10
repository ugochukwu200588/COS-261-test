import java.util.Scanner;
public class Student1 {
    String name, matricNo;
    int score;
    private static void PrintStudentInfo(Student1 s){    // a method that print your details
        System.out.println("Name: "+s.name);
        System.out.println("Matric No: "+s.matricNo);
        System.out.println("Score: "+s.score);
    }
    public static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        Student1 info = new Student1();
        System.out.print("Enter Name: ");
        info.name=sc.nextLine();
        System.out.print("Enter Matric No: ");
        info.matricNo=sc.nextLine();
        System.out.print("Enter Score: ");
        info.score=sc.nextInt();
        System.out.println();       //print a new line in between the user input and the output
        System.out.println("Output: ");
        PrintStudentInfo(info);
        sc.close();
    }
}
