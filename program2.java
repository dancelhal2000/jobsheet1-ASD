
import java.util.Scanner;

public class program2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input nim : ");
        long nim = sc.nextLong();
        int n = (int) (nim % 100);
        if (n < 10) {
            n = n + 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}