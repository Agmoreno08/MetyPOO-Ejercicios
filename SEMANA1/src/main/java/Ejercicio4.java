import java.util.Scanner;


interface MayorDeTresNumeros {
    int encontrarMayor(int num1, int num2, int num3);
}


class MayorDeTresNumerosImpl implements MayorDeTresNumeros {


    @Override
    public int encontrarMayor(int num1, int num2, int num3) {
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();


        MayorDeTresNumerosImpl mayorDeTresNumeros = new MayorDeTresNumerosImpl();


        int mayor = mayorDeTresNumeros.encontrarMayor(num1, num2, num3);


        System.out.println("El mayor de los tres números es: " + mayor);


        scanner.close();
    }
}

