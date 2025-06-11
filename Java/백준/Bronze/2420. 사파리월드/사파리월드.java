import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(abs(n - m));
    }
}