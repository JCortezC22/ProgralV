/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author jordy
 */

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            String apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos:");

            if (!esStringValido(nombre) || !esStringValido(apellidos)) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un nombre y apellido válidos.");
            } else {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
                String fechaActual = dateFormat.format(new Date());

                String mensaje = nombre + " " + apellidos + " " + fechaActual;
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un nombre y apellido válidos.");
        }
    }

    private static boolean esStringValido(String str) {
        return str != null && !str.trim().isEmpty() && !str.matches(".*\\d.*");
    }
    
}
