import java.util.Scanner;

public class ConeVolume {
    public static double coneVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * hValue;
        return volume;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double diameter = s.nextDouble();
        System.out.print("Enter height: ");
        double height = s.nextDouble();
        
        double volume = coneVolume(diameter, height);
        System.out.printf("Volume: %.2f\n", volume);
    }
}
