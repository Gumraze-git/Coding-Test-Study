import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
