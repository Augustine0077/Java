import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        Double price;
        int number_item;
        double total;

        System.out.print("what would you like to bye : ");
        item = sc.nextLine();

        System.out.print("What is the price of each : ");
        price = sc.nextDouble();

        System.out.print("Howmany would you like : ");
        number_item = sc.nextInt();

        
        total = price *number_item;

        System.out.println("you have bought "+number_item+" and the full price is :"+ total);
        sc.close();



    }
}
