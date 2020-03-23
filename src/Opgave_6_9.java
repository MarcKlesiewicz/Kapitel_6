public class Opgave_6_9 {
    public static void main(String[] args) {


        System.out.printf("%-9s%15s", "Kilograms", "Pounds");
        System.out.print("\t|\t");
        System.out.printf("%-9s%15s\n", "Pounds", "Kilograms");

        for (int i = 1, j = 20; i <= 199; i += 2, j += 5) {
            System.out.printf("%-9d%15.3f", i, kilogramToPound(i));
            System.out.print("\t|\t");
            System.out.printf("%-9d%15.3f\n", j, poundToKilogram(j));
        }
    }

    private static double poundToKilogram(double pound) {

        return (0.453 * pound);

    }

    private static double kilogramToPound(double kilogram) {
        return (2.204 * kilogram);

    }
}
