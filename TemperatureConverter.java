import java.util.*;

public class TemperatureConverter {
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //method to convert fahrenheit to celsious
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

    
        System.out.print("Enter  temperature value: ");
        double temperature = Sc.nextDouble();

        System.out.print("Enter  unit of measurement (C for Celsius, F for Fahrenheit): ");
        char unit = Sc.next().toUpperCase().charAt(0);

    
        if(unit =='C') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, fahrenheit);
        } 
        else if (unit == 'F') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, celsius);
        } 
        else {
            System.out.println("Invalid unit entered. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

        Sc.close();
    }
}

