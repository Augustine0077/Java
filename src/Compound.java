import java.util.Scanner;
public class Compound {
    public static void main(String []args){
        Scanner scanner =new Scanner(System.in);
        double priciple;
        double rate;
        int timesCompound;
        int year;
        double amount;
        System.out.println("Enter the Principle amount");
        priciple=scanner.nextDouble();
        System.out.println("Enter the intrest rate in %");
        rate=scanner.nextDouble()/100 ;
        System.out.println("Enter the times compound per year");
        timesCompound=scanner.nextInt();
        System.out.println("enter the number of years");
        year= scanner.nextInt();
        amount = priciple *Math.pow(1+ rate / timesCompound,timesCompound*year);
        System.out.println("The amount after " +year +"is:$"+ amount);
        scanner.close();

    }
}

