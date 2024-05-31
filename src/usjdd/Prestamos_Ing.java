
package usjdd;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Prestamos_Ing {
    
    public void MenuIngenieria (Scanner scanner, LinkedList<Estudiante_Ingenieria> PrestamosIngenieria){
        
        Scanner sc = new Scanner(System.in);
        boolean entrada = true;
        while (entrada){
          int opcion;
          System.out.println("MENU ESTUDIANTES DE INGENIERIA");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Importar estudiante");
            System.out.println("6. exportar estudiante");
            System.out.println("7. Volver al menú principal");
            System.out.print  ("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    registro(PrestamosIngenieria);
                    
                    break;
                case 2:
                    modificar(PrestamosIngenieria);
 
                    break;
                case 3:
                    devolucion (PrestamosIngenieria);
                    
                    break;
                case 4:
                    buscarequipo (PrestamosIngenieria);
                    
                    break;
                case 5:
                    ImportarIngenieria ("EstudiantesIngenieria.txt",PrestamosIngenieria);
                    
                    
                    break;
                case 6:
                    Exportar ex = new Exportar();
                    ex.exportarIngenieria(PrestamosIngenieria);
                    break;
                case 7:
                    System.out.println("Volviendo al menú principal...");
                    entrada =false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    
            } 
        }
    }
    
    
    // registro de estudiante
    
    public LinkedList<Estudiante_Ingenieria> registro(LinkedList<Estudiante_Ingenieria>PrestamosIngenieria ) {
        Scanner scanner = new Scanner(System.in);
        Estudiante_Ingenieria e= new Estudiante_Ingenieria(null, null, null, null, 0, 0, null);
        
        
        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();

        
        do {
            
        for (Estudiante_Ingenieria estudiante : PrestamosIngenieria) {
            if (estudiante.getCedula().equals(cedula)) {
                System.out.println("Error: Ya existe un registro con esa cédula.");
                cedula = null; 
                       
            }
        }
        } while (cedula == null);
        e.setCedula(cedula);
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        e.setNombre(nombre);
        
        
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();
        e.setApellido(apellido);
        System.out.print("Ingrese el teléfono del estudiante: ");
        String telefono = scanner.nextLine();
        e.setTelefono(telefono);
        System.out.print("Ingrese el número de semestre: ");
        int Semestre = scanner.nextInt();
        e.setNumerosemestre(Semestre);
        System.out.print("Ingrese el promedio acumulado: ");
        float promedioAcumulado = scanner.nextFloat();
        scanner.nextLine();
        e.setPromedio(promedioAcumulado); 
        System.out.print("Ingrese el serial del equipo: ");
        String serial = scanner.nextLine();
        
        do {
            
        for (Estudiante_Ingenieria estudiante : PrestamosIngenieria) {
            if (estudiante.getSerial().equals(serial)) {
                System.out.println("Error: Ya existe un registro con esa cédula.");
                serial = null; 
                       
            }
        }
        } while (serial == null);
        e.setSerial(serial);
        
        PrestamosIngenieria.add(e);
        System.out.println("Registro con exito");

      return  PrestamosIngenieria;
   } //fin clase de registro  
    
    
    
    //Modificacion de estudiante 
    
    public LinkedList<Estudiante_Ingenieria> modificar(LinkedList<Estudiante_Ingenieria>PrestamosIngenieria ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String cs = sc.nextLine();
        Estudiante_Ingenieria est=null;

        for (Estudiante_Ingenieria e: PrestamosIngenieria){
            if(e.getCedula().equals(cs) || e.getSerial().equals(cs)){
                est=e;
            }
        }
        
        if (est != null) {
            System.out.print("Ingrese el nuevo número de semestre: ");
            int numeroSemestre = sc.nextInt();
            est.setNumerosemestre(numeroSemestre);
            System.out.print("Ingrese el nuevo promedio acumulado: ");
            float promedioAcumulado = sc.nextFloat();
            sc.nextLine();
            est.setPromedio(promedioAcumulado);
            System.out.println("Préstamo modificado exitosamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
        return PrestamosIngenieria;
    }// fin clase de modificacion
    
     
      
      
    
    // devolucion de equipo
    
     public LinkedList<Estudiante_Ingenieria> devolucion(LinkedList<Estudiante_Ingenieria>PrestamosIngenieria ) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String cs = sc.nextLine();
        Estudiante_Ingenieria est=null;
        
        for (Estudiante_Ingenieria e: PrestamosIngenieria){
            if(e.getCedula().equals(cs) || e.getSerial().equals(cs)){
                est=e;
            }
        }
        if (est != null) {
            PrestamosIngenieria.remove(est);
            System.out.println("Devolución de equipo realizada exitosamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
        return PrestamosIngenieria;
    }// fin clase de devolucion de equipo 
    
    
    
    
    // Buscar equipo 
    
     public void buscarequipo (LinkedList<Estudiante_Ingenieria>PrestamosIngenieria ) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String cs = sc.nextLine();
        Estudiante_Ingenieria est=null;

        for (Estudiante_Ingenieria e: PrestamosIngenieria){
            if(e.getCedula().equals(cs) || e.getSerial().equals(cs)){
                est=e;
            }
        }
         
        if (est != null) {
            System.out.println("Estudiante encontrado: ");
            System.out.println("Cédula: " + est.getCedula());
            System.out.println("Nombre: " + est.getNombre());
            System.out.println("Apellido: " + est.getApellido());
            System.out.println("Teléfono: " + est.getTelefono());
            System.out.println("Número de semestre: " + est.getNumerosemestre());
            System.out.println("Promedio acumulado: " + est.getPromedio());
            System.out.println("Serial del equipo: " + est.getSerial());
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }

    } // fin buscar
    
   
    
    
    // importar estudiante
    
    
    public LinkedList<Estudiante_Ingenieria> ImportarIngenieria(String Archivo ,LinkedList<Estudiante_Ingenieria>PrestamosIngenieria) {
        try {
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String Linea= "";
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1];
                switch (Atributo) {
                    case "cedula":
                        
                        String cedula = valor.trim();
                        String nombre = importar.readLine().split(":")[1].trim();
                        String apellido = importar.readLine().split(":")[1].trim();
                        String telefono = importar.readLine().split(":")[1].trim();
                        int numerosemestre = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        float promedio = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String serial = importar.readLine().split(":")[1].trim();
                        Estudiante_Ingenieria EstIn = new Estudiante_Ingenieria( cedula, nombre,  apellido,  telefono,  numerosemestre,  promedio,  serial);
                        PrestamosIngenieria.add(EstIn);
                        // Leer la línea en blanco entre empleados
                        importar.readLine();
                        break;

                    default:
                        break;
                }
            }
            importar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return PrestamosIngenieria;
    }
} // fin clase importar
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
// fin clase de prestamos de ingernieria 