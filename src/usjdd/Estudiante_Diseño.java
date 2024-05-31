
package usjdd;


public class Estudiante_Diseño {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Modalidadestudio ;
    private int Cantidadasignaturas;
    private int Serial;
    
    public Estudiante_Diseño(String cedula,String nombre, String apellido,String telefono, String modalidadestudio, int cantidadasignaturas, int serial) {

        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono= telefono;
        Modalidadestudio = modalidadestudio;
        Cantidadasignaturas = cantidadasignaturas;
        Serial = serial;
        
    }
    
    
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getModalidadestudio() {
        return Modalidadestudio;
    }
    public void setModalidadestudio(String modalidadestudios) {
        Modalidadestudio = modalidadestudios;
    }
    public int getCantidadasignaturas() {
        return Cantidadasignaturas;
    }
    public void setCantidadasignaturas(int cantidadasignaturas) {
    Cantidadasignaturas = cantidadasignaturas;
    }
    
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int serial) {
        Serial = serial;
    }
}

    
    

