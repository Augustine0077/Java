import java.util.Scanner;
public class SubstringMethods {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        if(email.contains("@"))
        {
            // extracting user name from email

        String user_name  = email.substring(0,email.indexOf("@"));
        System.err.println(user_name);

        // Extracting domain from email
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("domain is " + domain);

        // Extracting top level domain
        String tld = email.substring(email.lastIndexOf("."));
        System.out.println("top level domain is " + tld);
        } 

        else 
        {
            System.out.println("Invalid email address");
        }
    }
}
