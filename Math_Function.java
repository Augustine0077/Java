import java.util.Scanner;
public class Math_Function {
    public static void main(String[] args) {



       /*  double result;
        result = Math.pow(2,4);
       result =Math.sqrt(9);
        result= Math.max(10,20);
        result= Math.min(10,20);
        System.out.print(result);
*/

//HYPOTENUSE

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the length of side A : ");
        a = sc.nextDouble();

        System.err.print("Enter the side of B : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        System.err.println("The hypotheneus C is :" +c+ " cm");

        sc.close();


    }
    
}
