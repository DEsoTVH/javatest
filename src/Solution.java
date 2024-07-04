import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String text = " loves me.";
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int n = 0;

        while (n < 10) {
            System.out.println(name + text);
            n++;
        }


    }
}