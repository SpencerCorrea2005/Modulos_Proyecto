/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class FormaPago {
    protected int codigoPago;
    protected String tipoPago;

    public FormaPago(int codigoPago, String tipoPago) {
        this.codigoPago = codigoPago;
        this.tipoPago = tipoPago;
    }

    public void setCodigoPago(int codigoPago) {
        this.codigoPago = codigoPago;
    }

    public int getCodigoPago() {
        return codigoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }
    
    public void pagarProductos() {
        System.out.println("Su compra ha sido pagada y registrada con el número " + codigoPago);
    }
    
    public void guardarRegistroPedido() {
        System.out.println("Registro del pedido guardado con éxito");
    }
    
    public void guardarRegistroPago() {
        System.out.println("Registro del pago guardado con éxito.");
    }
}
