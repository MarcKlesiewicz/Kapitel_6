import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opgave_6_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        reverse(number);
    }

    private static void reverse(int number) {
        int reverse = 0;
        int digit;

        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }while (number != 0);
        System.out.println(reverse);
    }
}
