package Assignment_2.Assignment_2_2;

public class Task7 {
    public static void main(String[] args) {
        signIn("ALih");
        signIn("Amankos");
        signIn("user");
    }
    public static void signIn(String username){
        if ("user".equals(username))
            return;
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
