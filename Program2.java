import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1) {
                for (int j = 0; j < breadth; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                System.out.print("*");
                for (int j = 1; j < breadth - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
        scanner.close();
    }
}
