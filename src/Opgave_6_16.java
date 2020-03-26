import java.util.Scanner;

public class Opgave_6_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dayCount = 0;

        System.out.println("Enter first year:");
        int year1 = input.nextInt();
        System.out.println("Enter second year:");
        int year2 = input.nextInt();

        for (int i = year1; i <= year2 ; i++) {

            dayCount += numberOfDaysInYear(i);

        }
        System.out.println("Number of days between " + year1 + " and " + year2 + " is " + dayCount + " days");

    }


    private static int numberOfDaysInYear(int i) {

        int year = i;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            return (366);
        else
            return(365);
    }
}
