
package usjdd;

import java.util.LinkedList;


public class ImprimirInventario {

     public  void ImprimirInventarioTotal(LinkedList<Estudiante_Ingenieria>PrestamosIngenieria , LinkedList<Estudiante_Diseño>PrestamosDiseño) {
          for (Estudiante_Ingenieria est : PrestamosIngenieria){
            
            System.out.println("Cédula: " + est.getCedula());
            System.out.println("Nombre: " + est.getNombre());
            System.out.println("Apellido: " + est.getApellido());
            System.out.println("Teléfono: " + est.getTelefono());
            System.out.println("Número de semestre: " + est.getNumerosemestre());
            System.out.println("Promedio acumulado: " + est.getPromedio());
            System.out.println("Serial del equipo: " + est.getSerial());
        

          }
         
          for (Estudiante_Diseño estd : PrestamosDiseño){
            
            System.out.println("Cédula: " + estd.getCedula());
            System.out.println("Nombre: " + estd.getNombre());
            System.out.println("Apellido: " + estd.getApellido());
            System.out.println("Teléfono: " + estd.getTelefono());
            System.out.println("Modalidad de estudio " + estd.getModalidadestudio());
            System.out.println("Cantidad de asignaturas: " + estd.getCantidadasignaturas());
            System.out.println("Serial del equipo: " + estd.getSerial()); 
        
            
        System.out.println("Inventario de Equipos Prestados a Estudiantes de Ingeniería:");
        for (Estudiante_Ingenieria estudiante : PrestamosIngenieria) {
            System.out.println("Cédula: " + estudiante.getCedula() + ", Nombre: " + estudiante.getNombre());
        }

        System.out.println("\nInventario de Equipos Prestados a Estudiantes de Diseño:");
        for (Estudiante_Diseño estudiante : PrestamosDiseño) {
            System.out.println("Cédula: " + estudiante.getCedula() + ", Nombre: " + estudiante.getNombre() + ", Serial del equipo: " + estudiante.getSerial());
          }
        }
        }  
       }
     

