
package com.nk.clase4.app;

import java.awt.Color;
import javax.swing.JLabel;

public class App {

    public static void main(String[] args) {
        
        Forma2 forma2 = new Forma2();
        forma2.setVisible(true);
        
//        Forma1 forma1 = new Forma1();
//        presentar2(forma1);
        
    }
    
    public static void presentar1(Forma1 f) {
        // 1. Hacerlo visible
        f.setVisible(true);
        // 2. Centralo
        f.setLocationRelativeTo(null);
        // 3. Asignarle un titulo
        f.setTitle("Clase Numero 4: Centramos de frames");
        // 4. Asignamos que no sea redimensionable: Se pueden omitir
        f.setResizable(true);
        // 5. Permitimos que este habilitado: Se pueden omitir
        f.setEnabled(true);
        
        // 4. Otras acciones
        f.panel1.setBackground(new Color(0, 200, 200));
//        f.panel1.setBackground(new Color(200, 100, 100));
        f.miLabel.setText("Texto cambiado");
    }
    public static void presentar2(Forma1 f) {
        // 1. Hacerlo visible
        f.setVisible(true);
        // 2. Centralo
//        f.setLocationRelativeTo(null);
        // 3. Asignarle un titulo
        f.setTitle("Presentacion numero 2");
        // 4. Asignamos que no sea redimensionable: Se pueden omitir
        f.setResizable(false);
        // 5. Permitimos que este habilitado: Se pueden omitir
        f.setEnabled(true);
        
        // 4. Otras acciones
        f.panel1.setBackground(new Color(200, 0, 200));
//        f.panel1.setBackground(new Color(200, 100, 100));
        f.miLabel.setText("Texto nuevo");
    }
    
}
