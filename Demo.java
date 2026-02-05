class Friend {
    String name;
    static int num_of_friends = 0;

    Friend(String name) {
        this.name = name;
        num_of_friends++;
    }
}

public class Demo {
    public static void main(String[] args) {
        Friend f1 = new Friend("Augustine");
        Friend f2 = new Friend("Ambani");

        System.out.println("Total friends: " + Friend.num_of_friends);
    }
}
