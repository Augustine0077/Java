import java.util.Scanner;

public class Forloop {
    public static void main(String[]args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
//        String name;
//        int size;
//        System.out.println("Enter your name");
//        name = scanner.nextLine();
//
//        System.out.println("Howmny time you want to print your name");
//        size = scanner.nextInt();
//
//        for(int i=0;i < size;i++)
//        {
//            System.out.println(name);
//
//        }
        int start;
        int second;
        System.out.println("Howmany seconds count from ?:");
        start = scanner.nextInt();
        for(int i = start-1; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year");


    }
}
