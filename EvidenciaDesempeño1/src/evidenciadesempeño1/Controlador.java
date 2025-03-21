/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidenciadesempeño1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author emman
 */
public class Controlador {
     Modelo modelo;
    Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.getJButtonGenerar().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            generatePassword();
        }
    });
}
void generatePassword() {
        int length = 10; // Longitud por defecto

        boolean useLetters = vista.getJCheckBoxLetras().isSelected();
        boolean useNumbers = vista.getJCheckBoxNumeros().isSelected();
        boolean useSymbols = vista.getJCheckBoxSimbolos().isSelected();

        
        String password = Modelo.Generador.generatePassword(length, useLetters, useNumbers, useSymbols);

        
        vista.getJTextFieldContraseña().setText(password);
    }
}
