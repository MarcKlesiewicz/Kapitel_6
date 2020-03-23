import java.util.Scanner;

public class Opgave_6_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        long n = input.nextLong();

        System.out.println("The sum of " + n + " is " + sumDigits(n));

    }

    public static int sumDigits(long n){

        int sum = 0;
        do {
            sum += n % 10;

        }while ((n = n / 10) != 0);

        return sum;

    }
}
