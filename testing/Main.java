import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Submit a value for a: ");
        double a = scanner.nextDouble();
        System.out.println("Submit a value for b: ");
        double b = scanner.nextDouble();
        System.out.println("Submit a value for c: ");
        double c = scanner.nextDouble();

        double root = b * b - 4 * a * c;

        if (root > 0) {
            double x1 = (-b + Math.sqrt(root)) / (2 * a);
            double x2 = (-b - Math.sqrt(root)) / (2 * a);
            System.out.println("The results are:" + x1 + "and:" + x2);
        } else if (root == 0) {
            double x = -b / (2 * a);
            System.out.println("The result is:" + x);
        } else {
            System.out.println("There is no real solution!");
        }
    }
}