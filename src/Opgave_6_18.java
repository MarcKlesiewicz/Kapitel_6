import java.util.Scanner;

public class Opgave_6_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("- A password must have at least ten characters");
        System.out.println("- A password consists of only letters and digits");
        System.out.println("- A password must contain at least three digits");
        System.out.println("Enter password: ");
        String passWord = input.nextLine();

        if (checkPassword(passWord)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }

    public static boolean checkPassword(String passWord) {
        boolean checkPassword = true;

        if (passWord.length() < 10) {
            checkPassword = false;
        }else{
            int numberOfDigit = 0;
            for (int i = 0; i < passWord.length() ; i++) {
                if (isDigit(passWord.charAt(i)) || isletter(passWord.charAt(i))){
                    if (isDigit(passWord.charAt(i))){
                        numberOfDigit++;
                    }
                }else{
                    checkPassword = false;
                    break;
                }
            }
            if (numberOfDigit < 2){
                checkPassword = false;
            }
        }
        return (checkPassword);
    }

    private static boolean isletter(char ch) {
        return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
    }

    public static boolean isDigit(char ch) {
        return (ch <= '9' && ch >= '0');
    }
    
}
