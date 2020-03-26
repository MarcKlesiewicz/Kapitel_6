public class Opgave_6_13 {
    public static void main(String[] args) {

        System.out.printf("%-9s", "l");
        System.out.print("\t|\t");
        System.out.printf("%-9s\n", "m(i)");


        for (int i = 1; i <= 20; i++) {

            System.out.printf("%-9d", i);
            System.out.print("\t|\t");
            System.out.printf("%-9d\n", sum(i));

        }
    }

    public static double sum(int n) {

        double sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += 1.0*i/(i+1);
            
        }
        return (sum);
    }
}
