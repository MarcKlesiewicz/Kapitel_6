import java.util.Scanner;

public class Opgave_06_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The number of letters is " + countLetters(s));

    }

    public static int countLetters(String s) {

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i))){
                counter++;
            }
        }
        return (counter);
    }

    public static boolean isLetter(char ch) {
        return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
    }
}
