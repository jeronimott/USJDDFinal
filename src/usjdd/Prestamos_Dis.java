
package usjdd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Prestamos_Dis {
    public void Menudiseño (Scanner scanner, LinkedList<Estudiante_Diseño>  PrestamosDiseño){
        
        Scanner sc = new Scanner(System.in);
        boolean entreda = true;
        while (entreda){
          int opcion;
          System.out.println("MENU ESTUDIANTES DE DISEÑO");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Importar");
            System.out.println("6. Exportar");
            System.out.println("7. Volver al menú principal");
            System.out.print  ("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    registrod (PrestamosDiseño);
                    
                    break;
                case 2:
                    modificard(PrestamosDiseño);
                    
                    break;
                case 3:
                    devoluciond (PrestamosDiseño);
                    
                    break;
                case 4:
                    buscarequipod (PrestamosDiseño);
                    
                    break;
                case 5:
                    ImportarDiseño ("EstudiantesDiseño.txt",PrestamosDiseño);
                    
                    break;
                case 6:
                    Exportar_Di exd = new Exportar_Di();
                    exd.exportarDiseño(PrestamosDiseño);
                    
                    break;
                case 7:
                    System.out.println("Volviendo al menú principal...");
                    entreda = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            } 
        }
    }
    
    // registro de estudiante
    
    public LinkedList<Estudiante_Diseño> registrod(LinkedList<Estudiante_Diseño>PrestamosDiseño ) {
        Scanner scanner = new Scanner(System.in);
        Estudiante_Diseño d= new Estudiante_Diseño(null, null, null, null, null, 0,0);
        
        
        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();
        do {
            
        for (Estudiante_Diseño estudiante : PrestamosDiseño) {
            if (estudiante.getCedula().equals(cedula)) {
                System.out.println("Error: Ya existe un registro con esa cédula.");
                cedula = null; 
                       
            }
        }
        } while (cedula == null);
        d.setCedula(cedula);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        d.setNombre(nombre);
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();
        d.setApellido(apellido);
        System.out.print("Ingrese el teléfono del estudiante: ");
        String telefono = scanner.nextLine();
        d.setTelefono(telefono);
        System.out.print("Modalidad de estudi (virtual / precensial): ");
        String Modalidadestudio = scanner.nextLine();
        d.setModalidadestudio(Modalidadestudio);
        System.out.print("Ingrese cantidad de asignaturas: ");
        int Cantidadasignaturas = scanner.nextInt();
        scanner.nextLine();
        d.setCantidadasignaturas(Cantidadasignaturas);
        System.out.print("Ingrese el serial del equipo: ");
        int serial = scanner.nextInt();
        scanner.nextLine();
        do {
            
        for (Estudiante_Diseño estudiante : PrestamosDiseño) {
            if (estudiante.getSerial() == serial) {
                System.out.println("Error: Ya existe un registro con esa cédula.");
                serial = 0; 
                       
            }
        }
        } while (serial == 0);
        d.setSerial(serial);
        
        PrestamosDiseño.add(d);
        System.out.println("Registro con exito");

      return  PrestamosDiseño;
   } //fin clase de registro  
    
    
    
    //Modificacion de estudiante 
    
    public LinkedList<Estudiante_Diseño> modificard(LinkedList<Estudiante_Diseño>PrestamosDiseño) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String cs = sc.nextLine();
        Estudiante_Diseño estd=null;

        for (Estudiante_Diseño d: PrestamosDiseño){
            if(d.getCedula().equals(cs) || d.getSerial() == Integer.parseInt(cs)){
                estd = d;
            }
        }
        
        if (estd != null) {
            System.out.print("Ingrese el nuevo numero de asignaturas: ");
            int cantidadasignaturas = sc.nextInt();
            estd.setCantidadasignaturas(cantidadasignaturas);
            System.out.print("Ingrese la nueva modalidad de estudio: ");
            String modalidadEstudio = sc.nextLine();
            sc.nextLine();
            estd.setModalidadestudio(modalidadEstudio);
            System.out.println("Préstamo modificado exitosamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
        return PrestamosDiseño;
    }// fin clase de modificacion
    
     
      
      
    
    // devolucion de equipo
    
     public LinkedList<Estudiante_Diseño> devoluciond(LinkedList<Estudiante_Diseño>PrestamosDiseño ) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String cs = sc.nextLine();
        Estudiante_Diseño estd=null;
        
        for (Estudiante_Diseño d: PrestamosDiseño){
            if(d.getCedula().equals(cs) ||d.getSerial() == Integer.parseInt(cs) ){
                estd = d;
            }
        }
        if (estd != null) {
            PrestamosDiseño.remove(estd);
            System.out.println("Devolución de equipo realizada exitosamente.");
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }
        return PrestamosDiseño;
    }// fin clase de devolucion de equipo 
    
    
    
    
    // Buscar equipo 
    
     public void buscarequipod (LinkedList<Estudiante_Diseño>PrestamosDiseño ) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula o serial del estudiante: ");
        String cs = sc.nextLine();
        Estudiante_Diseño estd =null;

        for (Estudiante_Diseño d: PrestamosDiseño){
            if(d.getCedula().equals(cs) || d.getSerial() == Integer.parseInt(cs)){
                estd = d;
            }
        }
         
        if (estd != null) {
            System.out.println("Estudiante encontrado: ");
            System.out.println("Cédula: " + estd.getCedula());
            System.out.println("Nombre: " + estd.getNombre());
            System.out.println("Apellido: " + estd.getApellido());
            System.out.println("Teléfono: " + estd.getTelefono());
            System.out.println("Modalidad de estudio: " + estd.getModalidadestudio());
            System.out.println("Cantidad de asignaturas: " + estd.getCantidadasignaturas());
            System.out.println("Serial del equipo: " + estd.getSerial());
        } else {
            System.out.println("Error: Estudiante no encontrado.");
        }

    } // fin buscar
    
   
    
    
    // importar estudiante
    
    
    public LinkedList<Estudiante_Diseño> ImportarDiseño (String Archivo ,LinkedList<Estudiante_Diseño>PrestamosDiseño) {
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
                        String modalidadestudio = importar.readLine().split(":")[1].trim();
                        int cantidadasignaturas = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        int serial = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        Estudiante_Diseño EstDi = new Estudiante_Diseño( cedula, nombre,  apellido,  telefono,  modalidadestudio,  cantidadasignaturas,  serial);
                        PrestamosDiseño.add(EstDi);
                        // Leer la línea en blanco entre empleados
                        importar.readLine();
                        break;

                    default:
                        break;
                }
            }
            importar.close();
        } catch (IOException d) {
            d.printStackTrace();
        }
        return PrestamosDiseño;
    }
} // fin clase importar
    
    
 // fin exportar 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

