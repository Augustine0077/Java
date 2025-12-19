import java.util.Scanner;
public class ifstatment
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int age;
        String name;
        boolean student;



        System.out.println("enter your name");
        name = scanner.nextLine();

        System.out.println("Are  you a student type ('true or false')");
        student =scanner.nextBoolean();

        System.out.println("enter your age");
        age=scanner.nextInt();



        if(name.isEmpty()){
            System.out.println("You haven't write yor name");
        }
        else{
            System.out.println("hello " +name);
        }

        if(student ){
            System.out.println("You are a student+");
        }
        else {
            System.out.println("You are not a student");
        }

        if (age>=70) {
        System.out.println("You are a senior ");
    }
        else if(age >= 18)
        {
             System.out.println("You are adult");
        }

        else if (age < 0) {
            System.out.println("you have not being born yet");

            }
        else if (age == 0){
            System.out.println("you are a babay");
        }
        else{
            System.out.println("you are child");
        }

    }
}
