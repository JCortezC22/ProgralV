/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author jordy
 */
import javax.swing.JOptionPane;
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor:"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo valor:"));

            String operaciones = "Suma: " + (valor1 + valor2) + "\n"
                    + "Resta: " + (valor1 - valor2) + "\n"
                    + "Multiplicación: " + (valor1 * valor2) + "\n";

            if (valor2 != 0) {
                operaciones += "División: " + (valor1 / valor2);
            } else {
                operaciones += "División: No se puede dividir por cero.";
            }

            JOptionPane.showMessageDialog(null, operaciones);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos.");
        }
    }
}
