import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max amount of rows u want to print! ");
        int rows = sc.nextInt();

        print(rows);
    }

    public static void print(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i-1, j-1) + pascal(i -1, j);
        }
    }
}

//                                         first digit = i, second digit = j
//  if j == 0 -> 1  ||  if j == i -> 1

//            1                                      00
//          1   1                                 10    11>
//       1    2    1                           20    21    22
//    1    3     3    1                      30   31    32    33
//  1    4    6     4     1                40   41   42    43   44