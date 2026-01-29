import java.util.Random;
import java.util.random.*;
public class RandomNber 
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        /*int number1;
        int number2;
        int number3;

        number1 = rand.nextInt(1,6 );
        number2 = rand.nextInt(1,6 );
        number3 = rand.nextInt(1,6 );


        System.out.println( number1);
        System.out.println(number2);
        System.out.println(number3);
        */

        boolean is_heads;
        is_heads = rand.nextBoolean();
        if(is_heads)
            {

        System.out.print("HEAD");
             }
    else
    {
        System.out.println("Tail");
    }
}
    
}
