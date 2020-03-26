import java.util.Scanner;

public class Opgave_6_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(randomInt(0,1) + " ");
            }
            System.out.println();
        }
    }

    public static int randomInt(int zero, int one) {
        return (int) (zero + Math.random() * (one - zero + 1));
    }
}
