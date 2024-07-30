/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeteria_necoffee;

/**
 *
 * @author USUARIO PC
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cafeteria_Necoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3307/cafeteria_database";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cafeteria_Necoffee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            statement = conexion.createStatement();
            
            statement.executeUpdate("INSERT INTO Usuario(NumDocumentoID, NombreUsuario, ApellidosUsuario, TipoDocumentoID, Telefono) VALUES ('5789012', 'Miguel', 'Suarez', 'Cedula de Ciudadania', '3197894025')");
            statement.executeUpdate("INSERT INTO Usuario(NumDocumentoID, NombreUsuario, ApellidosUsuario, TipoDocumentoID, Telefono) VALUES ('1458987102', 'Mariana', 'Gonzalez Garcia', 'Tarjeta de Identidad', '3210257896')");
            statement.executeUpdate("INSERT INTO Usuario(NumDocumentoID, NombreUsuario, ApellidosUsuario, TipoDocumentoID, Telefono) VALUES ('2002003004', 'Jaime', 'Martinez Mendoza', 'Cedula de Ciudadania', '6023541026')");
            statement.executeUpdate("INSERT INTO Usuario(NumDocumentoID, NombreUsuario, ApellidosUsuario, TipoDocumentoID, Telefono) VALUES ('1002005145', 'Ruben Dario', 'Nunez Rodriguez', 'Cedula de Ciudadania', '3204530201')");

            statement.executeUpdate("UPDATE Usuario SET TipoDocumentoID = 'Cedula de Ciudadania'");
            statement.executeUpdate("DELETE FROM Usuario WHERE NombreUsuario='Mariana'");
            
            //Los comentarios representan las funcionalidades de la base de datos (INSERT, SELECT, UPDATE, DELETE)

            rs = statement.executeQuery("SELECT * FROM usuario");
            rs.next();
            
            System.out.println("A continuacion, se presenta a traves de un array el registro de la tabla usuario:");
            System.out.println("NumDocumentoID" + " | " + "NombreUsuario" + " | " + "ApellidosUsuario" + " | " + "TipoDocumentoID" + " | " + "Telefono");
            do {
                System.out.println(rs.getInt("NumDocumentoID") + " | " + rs.getString("NombreUsuario") + " | " + rs.getString("ApellidosUsuario") + " | " + rs.getString("TipoDocumentoID") + " | " + rs.getString("Telefono"));
            } while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Cafeteria_Necoffee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
