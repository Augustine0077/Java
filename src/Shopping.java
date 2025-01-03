import java.util.Scanner;

public class Shopping {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        double quantity;
        char currency = '$';
        double total;

        System.out.println("what item would you like");
        item = scanner.nextLine();

        System.out.println("what is the price of each");
        price=scanner.nextDouble();

        System.out.println("Howmany would you like");
        quantity = scanner.nextDouble();

        total = price * quantity;
        System.out.println("You have bought " + quantity+" " + "and" + item+ "s");
        System.out.println("The final peice is "+ total);
    }
}





