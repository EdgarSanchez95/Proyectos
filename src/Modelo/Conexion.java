
package Modelo;

import java.sql.*;

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost/sistemaventa?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "1234";
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }
    
    public static void cerrar(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void cerrar(Connection conn) throws SQLException{
        conn.close();
    }
}
