/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class Factura {
    private int ID_Factura;
    private int totalProductos;
    private int cantidadPagada;
    private int devuelta;
    private String domicilioEmpresa;
    private String fechaFacturacion;
    
    //Método constructor

    public Factura(int ID_Factura, int totalProductos, int cantidadPagada, int devuelta, String domicilioEmpresa, String fechaFacturacion) {
        this.ID_Factura = ID_Factura;
        this.totalProductos = totalProductos;
        this.cantidadPagada = cantidadPagada;
        this.devuelta = devuelta;
        this.domicilioEmpresa = domicilioEmpresa;
        this.fechaFacturacion = fechaFacturacion;
    }
    
    //Métodos set y get

    public int getID_Factura() {
        return ID_Factura;
    }

    public void setID_Factura(int ID_Factura) {
        this.ID_Factura = ID_Factura;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public int getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(int cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }

    public int getDevuelta() {
        return devuelta;
    }

    public void setDevuelta(int devuelta) {
        this.devuelta = devuelta;
    }

    public String getDomicilioEmpresa() {
        return domicilioEmpresa;
    }

    public void setDomicilioEmpresa(String domicilioEmpresa) {
        this.domicilioEmpresa = domicilioEmpresa;
    }
    
    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }
    
    
    //Métodos adicionales
    
    public void emitirFactura() {
        System.out.println("""
                           Estimado usuario. Los datos de su factura son: 
                           ID_Factura: """ + ID_Factura + 
                            ".\nValor total de la compra realizada" + totalProductos +
                            "\nLa cantidad pagada es: " + cantidadPagada +
                            "\nSu devuelta es: " + devuelta +
                            "\nEl domicilio de la empresa es: " + domicilioEmpresa);
    }
    
    public void guardarFactura() {
        System.out.println("Factura guardada con éxito");
    }
    
    public void registrarPedido() {
        System.out.println("Pedido registrado");
    }
    
    public void registropagoRealizado() {
        System.out.println("Se ha registrado el pago realizado con éxito dentro del sistema");
    }

}
