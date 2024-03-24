import java.util.Scanner;

public class crossSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numb1 = sc.nextInt();

        int sum = findCrossSum(numb1);
        System.out.println("The cross sum of " + numb1 + " is " + sum);
    }

    public static int findCrossSum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
