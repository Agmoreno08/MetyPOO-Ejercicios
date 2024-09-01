import java.util.Scanner;

class CelsiusAFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();


        double fahrenheit = (celsius * 9 / 5) + 32;


        System.out.printf("La temperatura en grados Fahrenheit es: %.2f%n", fahrenheit);

        // Cerrar el scanner
        scanner.close();
    }
}
