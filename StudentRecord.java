import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
//The Student class represents a student with a name and a grade.
class Student {
    private String name;  // Student's name
    private int grade;    // Student's grade (integer for simplicity)
    //Constructor to create a new Student.
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    //get the student name
    public String getName() {
        return name;
    }
  //set the student name
    public void setName(String name) {
        this.name = name;
    }
   //get student grade
    public int getGrade() {
        return grade;
    }
   //set student grade
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
/* The StudentGradeTracker class manages student records through a command-line interface.
    It allows adding, updating, deleting, and displaying student records.
 */
 class StudentGradeTracker {
    // TreeMap to store students with ID as key, sorted by ID
    private Map<Integer, Student> students = new TreeMap<>();
    // Scanner to read user input from the console
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {    //execution starts here
        StudentGradeTracker tracker = new StudentGradeTracker();
        tracker.run();  // Start the application
    }

    /**
     * Runs the main loop, displaying the menu and handling user choices.
     */
    public void run() {
        boolean running = true;  // Controls the main loop
        while (running) {
            displayMenu();  // Show options to the user
            String input = scanner.nextLine();  // Read user choice as string
            try {
                int choice = Integer.parseInt(input);  // Parse choice to integer
                switch (choice) {
                    case 1:
                        addStudent();  // Add a new student
                        break;
                    case 2:
                        updateStudent();  // Update an existing student
                        break;
                    case 3:
                        deleteStudent();  // Delete a student
                        break;
                    case 4:
                        displayStudents();  // Display all students
                        break;
                    case 5:
                        running = false;  // Exit the loop
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        System.out.println("Thank you for using the Student Grade Tracker.");
        scanner.close();  // Close the scanner when done
    }

    /**
     * Displays the menu options to the user.
     */
    private void displayMenu() {
        System.out.println("\nWelcome to the Student Grade Tracker");
        System.out.println("1. Add a new student");
        System.out.println("2. Update a student's record");
        System.out.println("3. Delete a student's record");
        System.out.println("4. Display all students");
        System.out.println("5. Exit");
        System.out.print("Please choose an option (1-5): ");
    }

    /**
     * Adds a new student to the records.
     */
    private void addStudent() {
        System.out.print("Enter student ID: ");
        String idInput = scanner.nextLine();
        try {
            int id = Integer.parseInt(idInput);  // Parse ID
            if (students.containsKey(id)) {
                System.out.println("Student ID already exists.");
            } else {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student grade: ");
                String gradeInput = scanner.nextLine();
                try {
                    int grade = Integer.parseInt(gradeInput);  // Parse grade
                    Student student = new Student(name, grade);
                    students.put(id, student);  // Add to TreeMap
                    System.out.println("Student added successfully.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid grade. Please enter an integer.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter an integer.");
        }
    }

    /**
     * Updates an existing student's record.
     */
    private void updateStudent() {
        System.out.print("Enter student ID to update: ");
        String idInput = scanner.nextLine();
        try {
            int id = Integer.parseInt(idInput);  // Parse ID
            if (students.containsKey(id)) {
                Student student = students.get(id);
                // Show current student details
                System.out.println("Current student information:");
                System.out.println("ID: " + id + ", Name: " + student.getName() + ", Grade: " + student.getGrade());
                System.out.println("What do you want to update?");
                System.out.println("1. Name");
                System.out.println("2. Grade");
                System.out.println("3. Both");
                System.out.print("Choose an option (1-3): ");
                String optionInput = scanner.nextLine();
                try {
                    int option = Integer.parseInt(optionInput);  // Parse update option
                    if (option == 1 || option == 3) {
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        student.setName(newName);  // Update name
                    }
                    if (option == 2 || option == 3) {
                        System.out.print("Enter new grade: ");
                        String newGradeInput = scanner.nextLine();
                        try {
                            int newGrade = Integer.parseInt(newGradeInput);  // Parse new grade
                            student.setGrade(newGrade);  // Update grade
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid grade. Please enter an integer.");
                        }
                    }
                    if (option >= 1 && option <= 3) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Invalid option.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid option. Please enter a number.");
                }
            } else {
                System.out.println("Student ID not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter an integer.");
        }
    }

    /**
     * Deletes a student's record.
     */
    private void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String idInput = scanner.nextLine();
        try {
            int id = Integer.parseInt(idInput);  // Parse ID
            if (students.containsKey(id)) {
                students.remove(id);  // Remove student from TreeMap
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student ID not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter an integer.");
        }
    }

    /**
     * Displays all student records, sorted by ID.
     */
    private void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Student Records:");
            // Iterate through TreeMap, which is sorted by ID
            for (Map.Entry<Integer, Student> entry : students.entrySet()) {
                int id = entry.getKey();
                Student student = entry.getValue();
                System.out.println("ID: " + id + ", Name: " + student.getName() + ", Grade: " + student.getGrade());
            }
        }
    }
}
