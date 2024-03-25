public class Main {
    public static void main(String[] args) {

        for (int checkNum = 1; checkNum <= 1000; checkNum++) {
            boolean isPrime = true;

            for (int divider = 2; divider <= checkNum / 2; divider++) {

                if (checkNum % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(checkNum);
            }
        }
    }
}

//  1   2   3   4   5   6       7       8       9       10
//      1   1   12  12  123     123     1234    1234    12345
