import java.util.Scanner;
public class AreaOfTriangel {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the project Area finding Triange");

        System.out.println("Enter the height of the Triangle: ");
        Double height = sc.nextDouble();

        System.out.println("Enter the width of the Triangle");
        double width = sc.nextDouble();

        double area = (height *width ) / 2;

        System.out.println("Your area of triangle is : " + area);

        sc.close();
    }
    
}
