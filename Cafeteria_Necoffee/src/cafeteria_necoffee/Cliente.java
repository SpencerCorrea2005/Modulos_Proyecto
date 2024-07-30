/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class Cliente extends Usuario {
    private final int idCliente;

    public Cliente(int idCliente, int numDocIdentidad, String tipoDocIdentidad, String nombreUsuario, int telefono, String direccionDomicilio) {
        super(numDocIdentidad, tipoDocIdentidad, nombreUsuario, telefono, direccionDomicilio);
        this.idCliente = idCliente;
    }
    
    public void conocerProductos(){
        System.out.println("Señor cliente con ID: " + idCliente + ". "
                + "\nA continuación, conocerá los productos en inventario de la cafetería");
    }
    
    public void ordenarProductos(){
        System.out.println("Ordenando los productos disponibles...");
    }
    
    public void pagarProductos(){
        System.out.println("Pagando los productos ordenados...");
    }

}
