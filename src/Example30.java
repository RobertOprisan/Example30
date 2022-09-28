import java.util.Scanner;
public class Example30 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

        for (int line = 1; line <= number; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}

