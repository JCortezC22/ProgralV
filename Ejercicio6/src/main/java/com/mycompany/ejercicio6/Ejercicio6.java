/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author jordy
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ejercicio6 {

    public static void main(String[] args) {
        try {
            double largo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));

            if (largo <= 0 || ancho <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese valores positivos.");
            } else {
                double perimetro = 2 * (largo + ancho);
                double area = largo * ancho;

                DecimalFormat df = new DecimalFormat("#.00");
                String mensaje = "Perímetro: " + perimetro + "\n"
                        + "Área: " + df.format(area);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos.");
        }
    }
}
