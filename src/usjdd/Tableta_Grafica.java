
package usjdd;

import java.util.Scanner;


public class Tableta_Grafica {
 
    private String Serial;
    private String Marca;
    private float Tamaño;
    private float Precio;
    private float Peso;
    private String Almacenamiento;
    
    public Tableta_Grafica(String serial,String marca, float tamaño,float precio, float peso, String almacenamiento) {

        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio= precio;
        Peso = peso;
        Almacenamiento = almacenamiento;
    }
    
    
    
    //submenu 
       
    public String SeleccionarAlmacenamiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el almacenamiento:");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                return "256 GB";
            case 2:
                return "512 GB";
            case 3:
                return "1 TB";
            default:
                return "256 GB";
                
        }
    }// fin submenu
       
    
    
     public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    
    public float getTamaño() {
        return Tamaño;
    }
    public void setTamaño(float tamaño) {
        Tamaño = tamaño;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }
    public float getPeso() {
        return Peso;
    }
    public void setPeso(float peso) {
        Peso = peso;
    }
    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.Almacenamiento = almacenamiento;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
} // fin tableta grafica 
