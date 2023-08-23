/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author jordy
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {

    public static void main(String[] args) {
        try {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
            int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

            int mayor = Math.max(numero1, Math.max(numero2, numero3));
            JOptionPane.showMessageDialog(null, "El mayor número es: " + mayor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos.");
        }
    }
}
