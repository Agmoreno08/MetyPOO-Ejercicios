import java.util.Scanner;

interface CalculoArea {
    double calcularArea(double radio);
}
class AreaCirculo implements CalculoArea {


    @Override
    public double calcularArea(double radio) {
        // Definir el valor de Pi
        final double PI = Math.PI;


        return PI * radio * radio;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        AreaCirculo areaCirculo = new AreaCirculo();
        double area = areaCirculo.calcularArea(radio);

        // Mostrar el resultado en la consola
        System.out.println("El área del círculo es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}

