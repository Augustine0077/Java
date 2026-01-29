//import java.util.Random;
//public class Randnumber {
//    public static void main(String[] args){
//        int number;
//        Random random = new Random();
//        number=random.nextInt(1,100);
//        System.out.println(number);
//    }
//}

import java.util.Random;
public class Randnumber{
    public static void main(String[] args){
        boolean heads;
        Random random = new Random();
        heads = random.nextBoolean();
        if(heads){
            System.out.println("heads");
        }
        else{
            System.out.println("Tail");
        }
    }
}
