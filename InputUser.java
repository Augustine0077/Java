import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class InputUser
{
    public static void main(String[] args)
{   Scanner sc = new Scanner(System.in);
    /* 
    


    System.out.println("Enter your name :");
    String name = sc.nextLine();

    System.out.println("Enter your age :");
    int age = sc.nextInt();
    
    System.out.println("Enter your GPA :");
    Double gpa = sc.nextDouble();

    System.out.println("Are you a studnet (true / false)");
    boolean student = sc.nextBoolean();

   

    System.out.println("Your name is "+ name);
    System.out.println("Your age is "+age);
    System.out.println("Your GPA is : "+gpa);

    if(student)
{
        System.out.println("You can enter to the class");
}
    else{
        System.out.println("You can't enter into the class");
}
*/

//Commen issue

System.out.println("Enter  your age");
int age = sc.nextInt();
sc.nextLine();
 // in here to avoid the buffer included the buffer method ..for that used the--> sc.nextLinr()

System.out.println("Enter your faviourite colour");
String colour = sc.nextLine();


System.out.println("your age is :" + age);
System.out.println("Your faviourite coloue :" +colour );


}
}
