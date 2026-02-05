import java.util.Scanner;
public class Weight_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg ;
        double lbs;
        int option;

        System.out.print("Weight conversion program\n");
        System.out.println(" press 1 to convert lbs to kg \n press 2 to convert kg to lbs");
        option = sc.nextInt();

        if(option == 1)
        {
            System.out.println("Enter the weight in lbs");
            lbs = sc.nextDouble();
            kg = lbs * 0.453592;
            System.err.printf("The convereted value is %.2f",kg);
        }
        else if(option == 2){
            System.err.println("Enter the wegiht in kg");
            kg = sc.nextDouble();
            lbs = kg / 0.45359237;
            System.out.printf("The converted value is %.2f",lbs);

        }
        else{
            System.out.println("Invalid option");
        }
    }
    
}
