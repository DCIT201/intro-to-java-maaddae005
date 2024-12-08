import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result;
        do {
            System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2)");
            result = scanner.nextInt();

            if (result != 1 && result != 2) {
                System.out.println("You have entered an invalid conversion choice!");
                System.out.println("Enter a valid conversion choice from the above.");
            }
        } while (result != 1 && result != 2);


        if (result == 1) {
            System.out.println("You have chosen FAHRENHEIT TO CELSIUS!");
            System.out.println("Enter a Fahrenheit Value?");
            double value = scanner.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.println(value + "°F in Celsius is " +(Math.round(valueFinal * 10.0) / 10.0) + "°C");
            System.out.println("Great!");
        } else if (result == 2) {
            System.out.println("You have chosen CELSIUS TO FAHRENHEIT!");
            System.out.println("Enter a Celsius Value?");
            double value = scanner.nextDouble();
            double valueFinal = (value * 9 / 5) + 32;
            System.out.println(value + "°C in Fahrenheit is " +(Math.round(valueFinal * 10.0) / 10.0) + "°F");
            System.out.println("Great!");
        }
    }
}