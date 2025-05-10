import java.util.Scanner;
public class Person {       //base class
    String name;
    int age;
    public class Teacher extends Person {       // base class inheritng the Person class property (subclass)
        int salary;     // assume you add an extra property to the class name person
    }
    public static void displayInfo(Person p) {      // method that display info for person
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
    }
    public static void displayInfo(Teacher t) {     // method that display info for teacher
            System.out.println("name: " + t.name);
            System.out.println("age: " + t.age);
            System.out.println("salary: " + t.salary);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();   // create an instance of the person class
        System.out.println("Enter your name: ");
        person.name = sc.nextLine();
        System.out.println("Enter your age: ");
        person.age = sc.nextInt();
        System.out.println();   //print a new line
        System.out.println("Output for Person class: ");
        displayInfo(person);
        System.out.println();       // print a new line

        Person.Teacher teacher = new Person().new Teacher();  //creating an instance of the teacher sub class
        System.out.println("Enter teacher name: ");
        teacher.name = sc.next();
        System.out.println("Enter teacher age: ");
        teacher.age = sc.nextInt();
        System.out.println("Enter teacher salary: ");
        teacher.salary = sc.nextInt();
        System.out.println();   //print a new line
        System.out.println("Output for Teacher class: ");
        displayInfo(teacher);   //print the teachers info

    }
}

