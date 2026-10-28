import java.util.Scanner;

public class AverageCalculator {
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        // Using Scanner s as per standard convention, though not strictly required for this problem
        Scanner s = new Scanner(System.in);
        
        System.out.println(average(4, 7));
        System.out.println(average(2, 4, 9));
        System.out.println(average(2.5, 3.5));
    }
    
    /*
     * Question Answer: Why can't we also declare double average(int x, int y) in the same class?
     * Answer: Because method overloading in Java is determined by the method signature, which consists 
     * of the method name and the parameter types (number, order, and data types). The return type is NOT 
     * part of the signature. Since average(int a, int b) already exists, declaring another method with the 
     * same name and the exact same parameter types (int, int) causes a compile-time error because the 
     * compiler cannot distinguish which method to execute when called with two integers.
     */
}
