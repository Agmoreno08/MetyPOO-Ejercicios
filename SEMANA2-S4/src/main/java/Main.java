import models.Calculator;
import models.Circle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido");
        double radius;
        radius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio del Circulo: git"));
        Circle circle = new Circle(radius);
        Calculator calc = new Calculator();
        JOptionPane.showMessageDialog(null, String.format("El area del circulo es: " +
                "%.2f", calc.calculateArea(circle)));
    }
}