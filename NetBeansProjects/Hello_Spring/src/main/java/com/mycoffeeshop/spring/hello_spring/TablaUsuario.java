/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycoffeeshop.spring.hello_spring;

/**
 *
 * @author USUARIO PC
 */
public class TablaUsuario {
    
    //Atributos
    protected int numDocIdentidad;
    protected String tipoDocIdentidad;
    protected String nombreUsuario;
    protected String apellidoUsuario;
    protected String telefono;

    public int getNumDocIdentidad() {
        return numDocIdentidad;
    }

    public void setNumDocIdentidad(int numDocIdentidad) {
        this.numDocIdentidad = numDocIdentidad;
    }

    public String getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }

    public void setTipoDocIdentidad(String tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }  
    
}
