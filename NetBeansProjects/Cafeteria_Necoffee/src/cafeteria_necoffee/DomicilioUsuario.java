/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class DomicilioUsuario {
    private String codigoDireccion;
    private String numeroCalle;
    private String numeroCarrera;
    private String numeroPuerta;
    private String barrio;
    private String ciudad;
    private String departamento;

    public DomicilioUsuario(String codigoDireccion, String numeroCalle, String numeroCarrera, String numeroPuerta, String barrio, String ciudad, String departamento) {
        this.codigoDireccion = codigoDireccion;
        this.numeroCalle = numeroCalle;
        this.numeroCarrera = numeroCarrera;
        this.numeroPuerta = numeroPuerta;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigoDireccion() {
        return codigoDireccion;
    }

    public void setCodigoDireccion(String codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getNumeroCarrera() {
        return numeroCarrera;
    }

    public void setNumeroCarrera(String numeroCarrera) {
        this.numeroCarrera = numeroCarrera;
    }

    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(String numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
