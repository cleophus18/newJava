//FIRSTLY IM GOING IMPORT THE SCANNER SO IT CAN BE THE MAIN TOOL USED
import java.util.Scanner;

public class Extreme001{
    public static void main(String[] args) {
        //ENTERED THE SCANNER COMMAND TO ACTIVATE THE SCANNER//
        Scanner scanner = new Scanner(System.in);
        //THIS IS A WHILE LOOP THAT WILL RUN UNTIL THE USER CHOOSES TO EXIT//
        while (true) {
            //THIS IS THE MAIN MENU FOR THE STUDENT MANAGEMENT SYSTEM//
            System.out.println("ABC College Student Management");
            System.out.println("1. NEW APPLICATION");
            System.out.println("2. SEARCH FOR STUDENT INFORMATION");
            System.out.println("3. DELETE CURRENT  STUDENT");
            System.out.println("4. VIEW STUDENT REPORT");
            System.out.println("5. EXIT");
            System.out.print("Select an option: ");
            //THIS IS THE SWITCH STATEMENT THAT WILL RUN THE STUDENT MANAGEMENT SYSTEM//
            String Choice = scanner.nextLine();
           //THIS IS WHERE THE USER CHOICE WILL GO TO ACTIVATE THE SPECIFIC METHOD//
            switch (Choice) {
                case "1","ONE":
                //THIS IS WHERE NEW STUDENT WILL ENTER THEIR INFORMATION//
                    Student.saveStudent();
                    break;
                //THIS IS WHERE THE USER CAN SEARCH FOR THEIR STUDENT ID//
                case "2","TWO":
                    Student.searchStudent();
                    break;
                //THIS IS WHERE STUDENTS DELETE THEIR INFORMATION//
                case "3","THREE":
                    Student.deleteStudent();
                    break;
                    //THIS IS WHERE THE STUDENT'S REPORT WILL BE SHOWN//
                case "4","FOUR":
                    Student.studentReport();
                    break;
                    //YHIS IS WHERE YOU EXIT THE PROGRAM//
                case "5","FIVE":
                    Student.exitStudentApplication();
                    return;
                    //IF THE USER ENTERS AN INVALID OPTION LIKE A WORD INSTEAD OF A NUMBER//
                    //IT WILL TELL THEM TO TRY AGAIN//
                default:
                    System.out.println("INVALID OPTION PLEASE TRY AGAIN.");
            }
        }
    }
}
