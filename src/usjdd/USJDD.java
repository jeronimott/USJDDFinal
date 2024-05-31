
package usjdd;

import java.util.LinkedList;
import java.util.Scanner;

public class USJDD {
 
    public static void main(String[] args) {
      LinkedList<Estudiante_Ingenieria>  PrestamosIngenieria= new LinkedList<>(); 
      LinkedList<Estudiante_Diseño> PrestamosDiseño= new LinkedList<>();   
    boolean entrada = true;
    Scanner sc = new Scanner(System.in);
    int a =0;
    
        int opt =0;
        
        System.out.println("Bienvenido al menu principal de la UDJDD, seleccioen una opcion para continuar:");
        System.out.println("1.Estudiantes de ingenieria");
        System.out.println("2.Estudiantes de diseño");
        System.out.println("3.Inventario");
        System.out.println("4.Salir del programa");
        
        try { 
            a=sc.nextInt();
            } catch (NumberFormatException e) {}
            opt = a;
            sc.nextLine();
          
            
     switch(opt){
     case 1: 
         Prestamos_Ing pi = new Prestamos_Ing();
         pi.MenuIngenieria(sc, PrestamosIngenieria);
         break;
     case 2: 
         Prestamos_Dis po = new Prestamos_Dis();
         po.Menudiseño(sc, PrestamosDiseño);
         break;
     case 3: 
         ImprimirInventario in = new ImprimirInventario();
         in.ImprimirInventarioTotal(PrestamosIngenieria, PrestamosDiseño);

         break; 
     case 4: 
          System.out.println("Saliendo del programa...");           
         entrada = false;
         break;
     default:
         System.out.println("Opción inválida. Intente nuevamente.");
        
         
     
}
     sc.close();
}
    
    }
    

