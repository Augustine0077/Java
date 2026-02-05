import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        //asking user to enter the first number resing it into num1
        double num1;
        double num2;
        char operand;
        double result =0;


        System.out.println("enter the first num");
        num1 = sc.nextInt();

        System.out.println("choose the operand (+,-,*,/,%)");
        operand = sc.next().charAt(0);

        System.out.println("enter the 2nd number");
        num2 = sc.nextDouble();

        switch (operand)
        {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            default ->
            {
                System.out.println("Invalid operator");
            }


        }
        System.out.println("Result is : " +result);
        sc.close();

    }
}
