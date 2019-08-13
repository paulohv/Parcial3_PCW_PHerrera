/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pauloherrera
 */
public class Conexion {
    
    public static String user = "root";
    public static String password = "root";
    public static String db = "ServicioTecnico";
    public static String url = "jdbc:mysql://localhost:3306/" + db;
    public static Connection con = null;

    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
        public int GuardarCliente(String rut, String nombre,String correo, String telefono) {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO cliente (rut,nombre,correo,telefono) VALUES (?,?,?,?)");

        try {
            conexion = getConexion();
            login.sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            login.sentencia_preparada.setString(1, rut);
            login.sentencia_preparada.setString(2, nombre);
            login.sentencia_preparada.setString(7, correo);
            login.sentencia_preparada.setString(5, telefono);
            resultado = login.sentencia_preparada.executeUpdate();
            login.sentencia_preparada.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return resultado;

    }
    
    
    
}
