/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author jordy
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ejercicio7 {

    public static void main(String[] args) {
        try {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia:"));

            if (radio <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un valor positivo.");
            } else {
                double area = 4 * Math.PI * radio * radio;
                double volumen = 4 * Math.PI * radio * radio * radio / 3.0 ;

                DecimalFormat df = new DecimalFormat("#.00");
                String mensaje = "Área: " + df.format(area) + "\n"
                        + "Volumen: " + df.format(volumen);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido.");
        }
    }
}
