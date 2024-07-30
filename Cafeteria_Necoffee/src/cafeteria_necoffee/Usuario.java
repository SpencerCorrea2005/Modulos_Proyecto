/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class Usuario {
    
    //Atributos
    protected int numDocIdentidad;
    protected String tipoDocIdentidad;
    protected String nombreUsuario;
    protected int telefono;
    protected String direccionDomicilio;
    
    //Métodos
    
    //Método constructor

    public Usuario(int numDocIdentidad, String tipoDocIdentidad, String nombreUsuario, int telefono, String direccionDomicilio) {
        this.numDocIdentidad = numDocIdentidad;
        this.tipoDocIdentidad = tipoDocIdentidad;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.direccionDomicilio = direccionDomicilio;
    }
    
    //Métodos Setters y Getters
    
    public void setNumDocIdentidad(int numDocIdentidad) {
        this.numDocIdentidad = numDocIdentidad;
    }

    public int getNumDocIdentidad() {
        return numDocIdentidad;
    }

    public void setTipoDocIdentidad(String tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }

    public String getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }
    
    //Otros métodos
    
    public void ingresarPagina() {
        System.out.println("Bienvenido a la página" + nombreUsuario);
    }
    
    public void registrarse() {
        System.out.println("A continuación, te vas a registrar en la página web de la cafetería");
    }
    
}
