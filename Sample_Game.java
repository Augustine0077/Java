import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noune1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (decription)");
        adjective1 = scanner.nextLine();
        System.out.println("enter a noune (a animal or person)");
        noune1 = scanner.nextLine();
        System.out.println("Enter an adjective (decription)");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb that ending with -ing(action)");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (decription)");
        adjective3 = scanner.nextLine();

        System.out.println("Today i went to"+ adjective1+"zoo");
        System.out.println("In a exhibition , i saw a "+noune1+".");
        System.out.println(noune1+" was "+adjective2+"and"+verb1+"!");
        System.out.println("i was "+adjective3 +"!");
        scanner.close();

    }
}


