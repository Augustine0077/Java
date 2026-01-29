import java.util.Scanner;

public class Compound_intrest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Read inputs
        System.out.print("Enter principal amount: ");
        double principal_amount = sc.nextDouble();

        System.out.print("Enter annual interest rate (percent): ");
        double annual_intrest = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        // Calculate amount = principal * (1 + r/100)^time
        double amount = principal_amount * Math.pow(1 + annual_intrest / 100.0, time);
        double compound_interest = amount - principal_amount;

        System.out.printf("Amount after %.2f years: %.2f%n", time, amount);
        System.out.printf("Compound interest: %.2f%n", compound_interest);

        sc.close();
    }
}
