import java.util.Scanner;

public class Extreme{
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bright Future Technologies Application");
        System.out.println("****************************************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
         int Num = sc.nextInt();
         while (true){
         if (Num == 1){
             System.out.println("****************************************************************");
             System.out.println("Please select one of the following menu items: ");
             System.out.println("1. Capture a new product");
             System.out.println("2, Search for a product");
             System.out.println("3. Update a product");
             System.out.println("4. Delete a product");
             System.out.println("5. Print report");
             System.out.println("6. Exit Application");
             System.out.println("Select an option: ");
             System.out.println("****************************************************************");
            int Num1 = sc.nextInt();
             switch (Num1){
               case 1:
                  Backend.saveProduct();
                break;
               case 2:
                 
                return;
                default:
                    System.out.println("INVALID OPTION PLEASE TRY AGAIN.");
             }
            
         }else{
            System.out.println("Thank you for using bright future technologies Application");
            System.exit(0);
         }
         sc.close();
   }
}}