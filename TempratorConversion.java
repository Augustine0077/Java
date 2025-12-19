import java.util.Scanner;
public class TempratorConversion {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        double temp;
        double new_temp;
        String f_or_C;
        System.out.print("Enter the temprature :");
        temp = sc.nextDouble();

        System.out.print("Convert celsious or Faranhite (C or F) :");
        f_or_C = sc.next().toUpperCase();


        new_temp = ((f_or_C.equals("C")) ? (temp - 32) *5/9 :(temp *5/9)+31);
        System.out.printf("The temprature is : %.2f",new_temp);



sc.close();

    }
}
