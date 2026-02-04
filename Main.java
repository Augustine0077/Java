package src;
class Students {
    private String name ;
    private int age ;

    public String Getnamee() {
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public int Getagee() {
        return age;
    }
    public void setAge(int a){
        age = a;
    }


}


public class Main
{
    public static void main(String[] args)
    {

        Students stud = new Students();
       stud.setName("Augustine");
       stud.setAge(17);
        System.out.println(stud.Getnamee() + " : " + stud.Getagee());

    }

}

