 import java.util.ArrayList;
 import java.util.Scanner;

 private class Backend{

    private static ArrayList<Backend> Information = new ArrayList<>();


    public static void saveProduct(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String ProductName = sc.nextLine();

        System.out.println("Enter the product code: ");
        String ProductCode = sc.nextLine();

        While(true){
        System.out.println("select the product Category(Number): ");
        System.out.println("1.Desktop Computer ");
        System.out.println("2.Laptop");
        System.out.println("3.Tablet");
        System.out.println("4.Printer");
        System.out.println("5.Gaming console");
        int Num2 = sc.nextInt();
        if(Num2 == 1 ||Num2 == 2||Num2 == 3||Num2 == 4||Num2 == 5){

        }else{
           System.out.println("Please enter the given number:");
           System.exit(0);
        }
        
        }


    }

     
 }