import java.util.Random;
import java.util.Scanner;

public class Number_gussing {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemp = 0;
        int random_number = random.nextInt(1,50);

        System.out.println("Guess a number between 1 - 10");



        do {
            System.out.println("Enter a guss : ");
            guess = scanner.nextInt();
           // System.out.println("system number :"+random_number);
            attemp++;

            if(guess < random_number)

            {
                System.out.println("Too low");
            }

            else if (guess > random_number)
            {
                System.out.println("Too high");
            }


            else
            {
                System.out.println("You win");
                System.out.println("The number of attempts you had : "+attemp);
            }
        }

        while(guess!=random_number);
        //System.out.println("You have won the game");
        scanner.close();
    }
}
