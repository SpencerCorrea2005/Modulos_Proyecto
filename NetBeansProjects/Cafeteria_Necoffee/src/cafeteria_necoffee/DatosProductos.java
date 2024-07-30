/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class DatosProductos {
    private int ID_ProductosCafeteros;
    private String nombreProducto;
    private String descripcion;
    private String precioProducto;
    
    //Constructor

    public DatosProductos(int ID_ProductosCafeteros, String nombreProducto, String descripcion, String precioProducto) {
        this.ID_ProductosCafeteros = ID_ProductosCafeteros;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
    }
    
    //Getters y Setters

    public int getID_ProductosCafeteros() {
        return ID_ProductosCafeteros;
    }

    public void setID_ProductosCafeteros(int ID_ProductosCafeteros) {
        this.ID_ProductosCafeteros = ID_ProductosCafeteros;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    //Otros métodos
    
    public String describirProducto() {
        return descripcion;
    }
    
    public void agregarCarritoCompras() {
        System.out.println("Se ha agregado al carrito de compras el producto " + nombreProducto);
    }
}
