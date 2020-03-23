import java.util.Scanner;
public class Opgave_6_6 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines:");
        int n = input.nextInt();

        displayPatterns(n);
    }

    private static void displayPatterns(int n) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n - i) ; j++) {

                int numberOfdigit = 0;
                int remainder = n - (j-1);
                while (remainder !=0){
                    numberOfdigit ++;
                    remainder /= 10;
                }
                for (int k = -1; k < numberOfdigit ; k++) {
                    System.out.print(" ");
                }
            }

            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
