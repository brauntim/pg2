import java.util.Scanner;

public class kgv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for the first number: ");
        int numb1 = sc.nextInt();
        System.out.print("Enter a value for the second number: ");
        int numb2 = sc.nextInt();

        int kgvValue = bigMultiply(numb1, numb2);
        System.out.println("Biggest KGV is: " + kgvValue);

    }
    public static int bigMultiply(int numb1, int numb2) {
        if (numb1 >= numb2) {
            int big = numb1;
            int n = numb2;
            return big * n / bigDivision(big, n);
        } else {
            int big = numb2;
            int n = numb1;
            return n * big / bigDivision(n, big);
        }
    }
    public static int bigDivision(int numb1, int numb2) {
        int r = numb1 % numb2;
        while (r != 0) {
            numb1 = numb2;
            numb2 = r;
            r = numb1 % numb2;
        }
        return numb2;
    }
}

