import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// Übungsblatt 1 Aufgabe 5

public class faculty {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter a number:");
        int numb1 = sc.nextInt();

        System.out.print("Enter a second number:");
        int numb2 = sc.nextInt();

        if (numb1 > numb2) {
            for (; numb2 <= numb1; numb2++) {
                result += numb2;
                System.out.println(numb2);
            }
        } else if (numb2 > numb1) {
                for (; numb1 <= numb2; numb1++) {
                    result += numb1;
                    System.out.println(numb1);
                }
            }
        System.out.println("Result: " + result);
        }

    }

