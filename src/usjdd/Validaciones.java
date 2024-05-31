
package usjdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Validaciones {
     
    // validar input
    
    public String validacionInput(String mensaje, String regex) { 

        Pattern pattern = Pattern.compile(regex);
        String input = JOptionPane.showInputDialog(null, mensaje, "", JOptionPane.QUESTION_MESSAGE);
        Matcher matcher = pattern.matcher(input);

        while (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "No se permite. Intento de nuevo. " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            input = JOptionPane.showInputDialog(null, mensaje, "", JOptionPane.QUESTION_MESSAGE);
            matcher = pattern.matcher(input);
        }
        return input;

    } 
    
    // validaciones de numeros 
    
    public class ValidacionNumeros {
    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String input = scanner.nextLine();

        if (esNumero(input)) {
            System.out.println("Entrada válida: " + input);
        } else {
            System.out.println("Entrada inválida. Solo se permiten números.");
        }
    }

    public  boolean esNumero(String input) {
        return input.matches("\\d+");
    }
}

   // validaciones de letras 
    
    public class ValidacionLetras {
    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String input = scanner.nextLine();

        if (esLetra(input)) {
            System.out.println("Entrada válida: " + input);
        } else {
            System.out.println("Entrada inválida. Solo se permiten letras.");
        }
    }

    public  boolean esLetra(String input) {
        return input.matches("[a-zA-Z]+");
    }
}
    
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
} // fin validaciones 
