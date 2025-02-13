public class statment {
    public static void main(String[]args){
        boolean is_student=true;c
        boolean is_senior;
        double price =9.99;
                if(is_student){
                    System.out.println("you get a discount of 10%");
                    price *=0.9;
                }
                else{
                    price *=1;
                }
                System.out.println("Your final ticket price is "+price);
    }
}
