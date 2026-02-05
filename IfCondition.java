import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter your name");
        name = sc.nextLine();

        if(name .isEmpty()){
            System.out.println("You hant enter you name enter the name to coninue");
        }
            System.out.println("Enter your name");
            name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age < 0) {
            System.out.println("You are not born yet");
        }
        else if (age < 18) {
            System.out.println("You are a child, you can't vote");
        }
        else if (age < 60) {
            System.out.println("You are an adult and you can vote");
        }
        else if (age <= 90) {
            System.out.println("You are a senior citizen and you can vote");
        }
        else {
            System.out.println("Age seems invalid");
        }

        sc.close();
    }
}
