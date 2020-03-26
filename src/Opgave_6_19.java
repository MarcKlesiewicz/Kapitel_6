import java.util.Scanner;

public class Opgave_6_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first side:");
        double side1 = input.nextDouble();
        System.out.println("Enter second side:");
        double side2 = input.nextDouble();
        System.out.println("Enter third side:");
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)){
            System.out.println("The area of the triangle is " + area(side1, side2, side3) + " m2");
        }else{
            System.out.println("Invalid input");
        }
    }

    public static double area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3)/2;

        double sum = Math.sqrt(s * (s - side1) * (s-side2) * (s-side3));

        return (sum);
    }

    public static boolean isValid(double side1, double side2, double side3) {
        boolean isValid = true;

        if (side1 > 0 && side2 > 0 && side3 > 0 ){
            isValid = true;
        }else{
            isValid = false;

        }
        return (isValid);


    }
}
