import java.util.Scanner;

public class While_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /* String name = "";

        while(name.isEmpty()) {
            System.out.print("Enter your name : ");
            name = sc.nextLine();
        }
        System.out.println("Hello "+name);
        sc.close();

         */
        String responce = "";
        while(!responce.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Enter Q to exit");

            responce = sc.next().toUpperCase();

        }
        System.out.println("You have quit the game");
    }

}
