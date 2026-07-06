
import java.util.Scanner;

public class Converter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("****************************************************");
         System.out.println("Welcome to the convertor");
         System.out.println("****************************************************");
         System.out.println("Choose the currency you want to convert from:");
         System.out.println("1.Rands");
         System.out.println("2.Dollar");
         System.out.println("3.Euro");
         int choice = sc.nextInt();

    if(choice == 1 || choice ==2 || choice == 3){
        if(choice == 1){
                    System.out.println("****************************************************");
                    System.out.println("Enter the currency you want to convert to:");
                    System.out.println("****************************************************");
                    System.out.println("1.Dollar");
                    System.out.println("2.Euro");
                    int RandChoice = sc.nextInt();
                        if( RandChoice == 1 || RandChoice == 2){
                            if(RandChoice == 1){
                             System.out.println("****************************************************");
                             System.out.println("Enter the amount you want to convert(RANDS):");
                             System.out.println("****************************************************");
                             double Rands = sc.nextInt();
                             double Outcome = Rands * 0.062;
                             System.out.println("****************************************************");
                             System.out.println("Converted to :" + Outcome);
                             System.out.println("****************************************************");
                                                 }
                            else if(RandChoice == 2){
                             System.out.println("****************************************************");
                             System.out.println("Enter the amount you want to convert(RANDS):");
                             System.out.println("****************************************************");
                             double Rands = sc.nextInt();
                             double Outcome1 = Rands * 0.054;
                             System.out.println("****************************************************");
                             System.out.println("Converted to :" + Outcome1);
                             System.out.println("****************************************************");
                                                 }

                        }else{
                             System.out.println("choose from the given numbers");
                        }
        }else if (choice == 2){
            System.out.println("****************************************************");
                    System.out.println("Enter the currency you want to convert to:");
                    System.out.println("****************************************************");
                    System.out.println("1.Rand");
                    System.out.println("2.Euro");
                    int DollarChoice = sc.nextInt();
                        if(DollarChoice == 1 || DollarChoice == 2){
                            if(RandChoice == 1){
                             System.out.println("****************************************************");
                             System.out.println("Enter the amount you want to convert(Dollar):");
                             System.out.println("****************************************************");
                             double Dollar= sc.nextInt();
                             double Outcome2 = Dollar * 16.22;
                             System.out.println("****************************************************");
                             System.out.println("Converted to :" + Outcome2);
                             System.out.println("****************************************************");
                            }else if(RandChoice == 2){
                             System.out.println("****************************************************");
                             System.out.println("Enter the amount you want to convert(Dollar):");
                             System.out.println("****************************************************");
                             double Dollar= sc.nextInt();
                             double Outcome3 = Dollar * 0.88;
                             System.out.println("****************************************************");
                             System.out.println("Converted to :" + Outcome3);
                             System.out.println("****************************************************");
                                

                            }

                        }else{
                             System.out.println("choose from the given numbers");
                        }

        }else if( choice == 3) 
            {System.out.println("****************************************************");
                    System.out.println("Enter the currency you want to convert to:");
                    System.out.println("****************************************************");
                    System.out.println("1.Rand");
                    System.out.println("2.Dollar");
                    int EuroChoice = sc.nextInt();
                        if(EuroChoice == 1 || EuroChoice == 2){
                            if(EuroChoice == 1){
                             System.out.println("****************************************************");
                             System.out.println("Enter the amount you want to convert(Euro):");
                             System.out.println("****************************************************");
                             double Euro = sc.nextInt();
                             double Outcome4 = Euro * 18.54;
                             System.out.println("****************************************************");
                             System.out.println("Converted to :" + Outcome4);
                             System.out.println("****************************************************");
                                                 }
                         else if(EuroChoice == 2){
                             System.out.println("****************************************************");
                             System.out.println("Enter the amount you want to convert(Euro):");
                             System.out.println("****************************************************");
                             double Euro = sc.nextInt();
                             double Outcome5 = Euro * 1.14 ;
                             System.out.println("****************************************************");
                             System.out.println("Converted to :" + Outcome5);
                             System.out.println("****************************************************");
                                                 }

                        }else{
                             System.out.println("choose from the given numbers");
                        }

        }

    }
    
    else {
        System.out.println("choose from the given numbers");
    }}
    }



