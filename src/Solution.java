import java.util.Scanner;


public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (password.equalsIgnoreCase(secret)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");

        }
    }

}