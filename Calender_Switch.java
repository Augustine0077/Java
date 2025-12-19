import java.util.Scanner;
public class Calender_Switch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1-7 : ");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("Sunday");
            default ->System.out.println(day+" is not valid ");

        }
    }
}
