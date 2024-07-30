/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
public class Administrador extends Usuario {
    private final int idAdministrador;

    public Administrador(int idAdministrador, int numDocIdentidad, String tipoDocIdentidad, String nombreUsuario, String apellidoUsuario, String telefono) {
        super(numDocIdentidad, tipoDocIdentidad, nombreUsuario, apellidoUsuario, telefono);
        this.idAdministrador = idAdministrador;
    }
    
    public void consultarHistorial(){
        System.out.println("Su código de administrador del sistema es: " + idAdministrador +
                "\nSe presenta el historial de compras de los clientes");
    }
    
    
}
