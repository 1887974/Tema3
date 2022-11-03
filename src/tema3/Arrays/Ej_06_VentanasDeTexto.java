package tema3.Arrays;

import javax.swing.JOptionPane;

public class Ej_06_VentanasDeTexto {

    public static void main(String[] args) {
        
        int dia, mes, year;
        
        dia = Integer.parseInt (JOptionPane.showInputDialog("Introduzca el día: "));
        mes = Integer.parseInt (JOptionPane.showInputDialog("Introduzca el número del mes: "));
        year = Integer.parseInt (JOptionPane.showInputDialog("Introduzca el año: "));
        
        if (dia >= 1 && dia <= 30) {
            JOptionPane.showMessageDialog(null, "Día correcto. ");
        } else {
            JOptionPane.showMessageDialog(null, "Día incorrecto. ");
        }
        
        if (mes >= 1 && mes <= 12) {
            JOptionPane.showMessageDialog(null, "Mes correcto. ");
        } else {
            JOptionPane.showMessageDialog(null, "Mes incorrecto. ");
        }
    
        if (year != 0) {
            JOptionPane.showMessageDialog(null, "Año correcto. ");
        } else {
            JOptionPane.showMessageDialog(null, "Año incorrecto. ");
        }
    
    
    }
}


