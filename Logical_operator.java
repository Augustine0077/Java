import java.util.Scanner;

public class Logical_operator
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        {
            //user name must be between 4 -12 character
            //user name must not contain space or underscore

            String user_name;
            System.out.print("Enter the user name : ");
            user_name = sc.next();

            if(user_name.length() <4  || user_name.length() >12)
            {
                    System.out.println("Your user name should between(4 - 12) ");
            }

            else if (user_name.contains(" ") || user_name.contains("_"))
            {
                    System.out.println("User name must not contain any 'white space' or 'underscore '");

            }
            else
            {
                System.out.println("Welcome "+user_name);
            }
        }

    }
}
