
package usjdd;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class Exportar {
    
    
    // exportar estudiantes ingenieria
    
    
    @SuppressWarnings("static-access")
    public void exportarIngenieria(LinkedList<Estudiante_Ingenieria> PrestamosIngenieria)
    {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("EstudiantesIngenieria.txt");
            boolean exits = archivo.exists();
            FileWriter exportar = new FileWriter(archivo,!exits);

            for ( Estudiante_Ingenieria est : PrestamosIngenieria) {
                exportar.write("cedula" + ":" +  est.getCedula() + "\n" );
                exportar.write("Nombre" + " : " + est.getNombre() + "\n");
                exportar.write("Apellido" + " : " + est.getApellido()+ "\n");
                exportar.write("Telefono" + " : " + est.getTelefono()+"\n");
                exportar.write("Numero de semestre" + " : " + est.getNumerosemestre()+ "\n");
                exportar.write("Promedio" +" : " + est.getPromedio()+"\n");
                exportar.write("Serial" +" : " + est.getSerial()+"\n");
                exportar.write("\n\n");
            }
            exportar.close();
            jo.showMessageDialog(null,"Datos Exportados correctamente","Exportar", 1);
        } catch (Exception e) {
            jo.showMessageDialog(null,"Error al exportar los datos" + e.getMessage()+ " ","Exportar", 0);
        }
    }
}// fin clase exportar ING
    
    
  
    
    
    
    
    
    
    
    

