public class Opgave_6_12 {
    public static void main(String[] args) {
        printChars('1', 'z', 10);

    }

    private static void printChars(char c, char z, int i) {
        int nuberOfPrinted = 0;

        for (; c <= z ; c++) {
            System.out.print(c + " ");
            nuberOfPrinted++;
            if (nuberOfPrinted % i == 0){
                System.out.println();
            }

        }
    }
}
