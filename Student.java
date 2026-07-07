import java.util.ArrayList;
import java.util.Scanner;

public class Student {
// THIS IS WHERE THE STUDENTS INFORMATION WILL BE SAVED//
    private String studentID;
    private String name;
    private int age;
    private String course;
    
  //THIS COMMAND LINE IS USED TO SAVE AND STORE THE OBJECTS OF THE STUDENT USING A DYNAMIC LIST//
    private static ArrayList<Student> students = new ArrayList<>();
//A constructor is a special method that is called when you create a new object from a class. 
//Its purpose is to initialize the object's fields with the values you provide.
    public Student(String studentID, String name, int age, String course) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.course = course;
        
    }

    public static void saveStudent() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENTER STUDENT ID:");
        String ID = scanner.nextLine();

        System.out.print("ENTER STUDENT FULL NAME:");
        String NAME = scanner.nextLine();

        System.out.print("ENTER THE COURSE:");
        String COURSE = scanner.nextLine();

        int AGE = 0;
        while (true) {
            System.out.print("ENTER STUDENT AGE:");
            String ageInput = scanner.nextLine();
            try {
                AGE = Integer.parseInt(ageInput);
                // Check if age is valid, 16 or older)//
                if (AGE >= 16)
                    break;
                else
                    System.out.println("Age must be 16 or older.");
                    //THE CATCH HELPS USE IDENTIFY THE TEXT THAT WAS PLACED IN THE AGE FIELD IF CATCHES IF THE USER ENTERED NUMBERS OR WORDS IF THEY DIDNT IT WILL PRINT OUT INVALID INPUT//
                    // C  REPRESENTS THE WRONG INPUT THAT WAS ENTERED//
                } catch (NumberFormatException c) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
        System.out.println("Student successfully saved.");

        Student newStudent = new Student(ID, NAME, AGE, COURSE);

        students.add(newStudent);
    }

    public static void searchStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE STUDENT'S ID TO SEARCHH:");
        
        String ID = scanner.nextLine();

        for (Student s : students) {
            if (s.studentID.equals(ID)) {
                System.out.println("Student Found:");
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();

        for (Student s : students) {
            if (s.studentID.equals(id)) {
                System.out.print("Are you sure you want to delete this student? (yes/no): ");
                String confirm = scanner.nextLine();

                if (confirm.equalsIgnoreCase("yes")) {
                    students.remove(s);
                    System.out.println("Student successfully deleted.");
                } else {
                    System.out.println("Deletion cancelled.");
                }

                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void studentReport() {
        if (students.isEmpty()) {
            System.out.println("No students to show.");
        } else {
            System.out.println("STUDENT REPORT");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Thank you! Exiting application.");
        System.exit(0); // Stops the program
    }
 // THIS METHOD IS USED TO PRINT OUT THE STUDENT INFORMATION IN A FORMATTED WAY//
    @Override
    public String toString() {
        return "ID: " + studentID + ", Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}

