/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usjdd;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author jeront1
 */
public class Exportar_Di {
    
    
    // exportar estudiantes Diseño
    
    
    @SuppressWarnings("static-access")
    public void exportarDiseño(LinkedList<Estudiante_Diseño> PrestamosDiseño)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("EstudiantesIngenieria.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for ( Estudiante_Diseño estd : PrestamosDiseño) {
                exportar.write("cedula" + ":" +  estd.getCedula() + "\n" );
                exportar.write("Nombre" + " : " + estd.getNombre() + "\n");
                exportar.write("Apellido" + " : " + estd.getApellido()+ "\n");
                exportar.write("Telefono" + " : " + estd.getTelefono()+"\n");
                exportar.write("Modalidad de estudio" + " : " + estd.getModalidadestudio()+ "\n");
                exportar.write("Cantidad de asignaturas" +" : " + estd.getCantidadasignaturas()+"\n");
                exportar.write("Serial" +" : " + estd.getSerial()+"\n");
                exportar.write("\n\n");
            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
    
    
    
    
}
