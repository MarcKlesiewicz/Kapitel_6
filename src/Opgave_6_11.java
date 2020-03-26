public class Opgave_6_11 {
    public static void main(String[] args) {

        final int END = 100000;

        System.out.printf("%-9s", "Sales Amount");
        System.out.print("\t|\t");
        System.out.printf("%-9s\n", "Commission");

        for (double i = 10000; i <= END ; i+= 5000) {

            System.out.printf("%-9d", i);
            System.out.print("\t|\t");
            System.out.printf("%-9d\n", computeCommission(i));

        }
    }

    public static double computeCommission(double salesAmount) {

        double commission = salesAmount * 0.09;

        return (commission);
    }

}
