import java.util.Scanner;

public class ggT {

    public static void main(String[] args) {

        int biggestDivision, number1, number2, m, n, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        number1 = sc.nextInt();
        System.out.print("Enter second number:");
        number2 = sc.nextInt();

        if (number1 >= number2) {
            m = number1;
            n = number2;
        } else {
            m = number2;
            n = number1;
        }

        r = m % n;

        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        System.out.println("The biggest divider of " + number1 + " and " + number2 + " is: ");
        System.out.println("" + n);
    }
}
