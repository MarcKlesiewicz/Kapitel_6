import java.util.Scanner;

public class Opgave_6_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        while (number < 100){

            System.out.println("Enter an integer: ");
            number = input.nextInt();
        }

        if (isPalindrome(number)){
            System.out.println(number + " is a palindrome");
        }else {
            System.out.println(number + " is not a palindrome");
        }


    }
    private static int reverse(int number) {
        int reverse = 0;
        int digit;

        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }while (number != 0);
        return reverse;
    }

    private static boolean isPalindrome(int number) {

        return (number == reverse(number));
    }

}
