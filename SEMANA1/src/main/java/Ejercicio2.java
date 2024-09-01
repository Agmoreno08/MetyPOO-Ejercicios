import java.util.Scanner;

interface Paridad {
    boolean esPar(int numero);
}

class ParOImpar implements Paridad {


    @Override
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingrese un número entero: ");


            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();


                Paridad parOImpar = new ParOImpar();


                String resultado = parOImpar.esPar(numero) ? "par" : "impar";
                System.out.println("El número " + numero + " es " + resultado + ".");

            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }
}

