import java.util.ArrayList;

public class primeNumbers {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 1000; counter++) {
            boolean isPrime = true;

            for (int checkNum = 2; checkNum <= counter / 2; checkNum++) {

                if (counter % checkNum == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(counter);
            }
        }
    }
}