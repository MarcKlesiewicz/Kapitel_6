import javax.crypto.spec.PSource;

public class Opgave_6_8 {
    public static void main(String[] args) {

        final int END = 10;
        final int SQRMETER_START = 30;

        System.out.printf("%-9s%15s", "Miles", "Kilometers");
        System.out.print("\t|\t");
        System.out.printf("%-9s%15s\n", "Kilometers", "Miles");

        for (int p = 1, s = 20; p <= END; p += 1, s += 5) {
            System.out.printf("%-9d%15.3f", p, mileToKilometer(p));
            System.out.print("\t|\t");
            System.out.printf("%-9d%15.3f\n", s, kilometerToMile(s));
        }
    }

    private static double kilometerToMile(double kilometer) {

        return (kilometer / 1.609);

    }

    private static double mileToKilometer(double mile) {
        return (mile * 1.609);

    }
}
