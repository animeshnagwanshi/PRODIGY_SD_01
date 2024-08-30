import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature value and unit
        System.out.println("Enter temperature value:");
        double tempValue = scanner.nextDouble();

        System.out.println("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char tempUnit = scanner.next().toUpperCase().charAt(0);

        // Perform conversions
        switch (tempUnit) {
            case 'C':
                convertFromCelsius(tempValue);
                break;
            case 'F':
                convertFromFahrenheit(tempValue);
                break;
            case 'K':
                convertFromKelvin(tempValue);
                break;
            default:
                System.out.println("Invalid unit entered.");
                break;
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);
        System.out.printf("%.2f Celsius = %.2f Fahrenheit = %.2f Kelvin\n", celsius, fahrenheit, kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        double kelvin = celsiusToKelvin(celsius);
        System.out.printf("%.2f Fahrenheit = %.2f Celsius = %.2f Kelvin\n", fahrenheit, celsius, kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Kelvin = %.2f Celsius = %.2f Fahrenheit\n", kelvin, celsius, fahrenheit);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
