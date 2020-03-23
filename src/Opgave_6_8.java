

public class Opgave_6_8 {
    public static void main(String[] args) {


        System.out.printf("%-9s%15s", "Miles", "Kilometers");
        System.out.print("\t|\t");
        System.out.printf("%-9s%15s\n", "Kilometers", "Miles");

        for (int i = 1, j = 20; i <= 10; i += 1, j += 5) {
            System.out.printf("%-9d%15.3f", i, mileToKilometer(i));
            System.out.print("\t|\t");
            System.out.printf("%-9d%15.3f\n", j, kilometerToMile(j));
        }
    }

    private static double kilometerToMile(double kilometer) {

        return (kilometer / 1.609);

    }

    private static double mileToKilometer(double mile) {
        return (mile * 1.609);

    }
}
