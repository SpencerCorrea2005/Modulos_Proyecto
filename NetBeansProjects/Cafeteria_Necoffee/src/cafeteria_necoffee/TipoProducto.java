/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class TipoProducto {
    private short codTipoProducto;
    private String nombre;

    public TipoProducto(short codTipoProducto, String nombre) {
        this.codTipoProducto = codTipoProducto;
        this.nombre = nombre;
    }

    public short getCodTipoProducto() {
        return codTipoProducto;
    }

    public void setCodTipoProducto(short codTipoProducto) {
        this.codTipoProducto = codTipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void clasificarProducto() {
        System.out.println("""
                           Este producto posee las siguientes caracter\u00edsticas: 
                           Se identifica con el c\u00f3digo: """ + codTipoProducto 
                + " \nEs de tipo: " + nombre);
    }
}
