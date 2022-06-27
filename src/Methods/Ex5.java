package Methods;

public class Ex5 {
    public static void main(String[] args) {
        checkAge(17);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        }
        else {
            System.out.println("Acces granted");
        }
    }
}
