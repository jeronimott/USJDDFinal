
package usjdd;

import java.util.Scanner;


public class Computador_Portatil {
   
    private String Serial;
    private String Marca;
    private float Tamaño;
    private float Precio;
    private float Peso;
    private String Sistemaoperativo;
    private String Procesador;
    
    
    public Computador_Portatil (String serial,String marca, float tamaño,float precio, float peso, String sistemaoperativo, String procesador) {

        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio= precio;
        Peso = peso;
        Sistemaoperativo = sistemaoperativo;
        Procesador = procesador;
    }
    
    
    //submenu
    
    public String SeleccioSistemaOperativo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el sistema operativo:");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return "Windows 7";
            case 2:
                return "Windows 10";
            case 3:
                return "Windows 11";
            default:
                return "Windows 10";
        }
    }

    public String SeleccioProcesador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el procesador:");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel® Core™ i5");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                return "AMD Ryzen";
            case 2:
                return "Intel® Core™ i5";
            default:
                return "Intel® Core™ i5";
        }
    } // fin submenu
    
    
    
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
    public String getSistemaOperativo() {
        return Sistemaoperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.Sistemaoperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        this.Procesador = procesador;
        
    }
       
    
}
