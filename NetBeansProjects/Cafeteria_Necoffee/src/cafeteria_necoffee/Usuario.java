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
    protected String apellidoUsuario;
    protected String telefono;
    
    
    //Métodos
    
    //Método constructor

    public Usuario(int numDocIdentidad, String tipoDocIdentidad, String nombreUsuario, String apellidoUsuario, String telefono) {
        this.numDocIdentidad = numDocIdentidad;
        this.tipoDocIdentidad = tipoDocIdentidad;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.telefono = telefono;
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

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }  
    
    //Otros métodos
    
    public void ingresarPagina() {
        System.out.println("Bienvenido a la página" + nombreUsuario);
    }
    
    public void registrarse() {
        System.out.println("A continuación, te vas a registrar en la página web de la cafetería");
    }
    
}
