import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your  number");

        int num = scanner.nextInt();

        if (num % 2 == 0) {

            System.out.println(num + "is Even");

        }

        else {
            System.out.println(num + " is Odd");
        }

    }
}
