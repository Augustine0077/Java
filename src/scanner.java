import java.util.Scanner;
public class scanner {
    public static void scanner(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scanner.nextLine();
        System.out.println("hello" + name);
        scanner.close();
    }
}
