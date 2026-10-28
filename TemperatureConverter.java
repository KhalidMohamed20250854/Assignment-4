import java.util.Scanner;

public class TemperatureConverter {
    public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double celsius = getDouble(s, "Enter temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
    }
}
