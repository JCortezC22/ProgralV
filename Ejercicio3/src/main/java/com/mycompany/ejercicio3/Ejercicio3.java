/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author jordy
 */

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        try {
            String palabra = JOptionPane.showInputDialog("Ingrese una palabra o número:");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de veces que quiere que se repita:"));

            if (numero <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número mayor que cero.");
            } else {
                StringBuilder resultado = new StringBuilder();
                for (int i = 0; i < numero; i++) {
                    resultado.append(palabra).append("\n");
                }
                JOptionPane.showMessageDialog(null, resultado.toString());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        }
    }
}
