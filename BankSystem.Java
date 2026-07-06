
import java.util.Scanner;

public class BankSystem {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        double Balance =5000.00;
        
        System.out.print("1.Check Balance");
        System.out.print("2.Deposit");
        System.out.print("3.Withdraw money");
        System.out.print("Choose 1, 2, or 3");
        int choice = sc.nextInt();
        if(choice == 1 || choice == 2 || choice == 3){
            if(choice ==1){
                System.out.println("Your balance is : " + Balance);
            }else if (choice ==2 ){
                System.out.println("Enter the amount you want to deposit");
                double deposit = sc.nextDouble();
                double newBalance = Balance + deposit;
                System.out.println("Your new balance is : " + newBalance);
            }else if (choice == 3){
                System.out.println("enter the amount you want to withdraw :");
                double withdrawal = sc.nextDouble();
                if( withdrawal <= Balance) {
                double newBalance = Balance - withdrawal; 
                System.out.println("Your current balance is :" + newBalance);}
            else{
                System.out.println("Insufficient funds");
            }}else{
                System.out.println("choose the correct number set");
            }
        }
    }}