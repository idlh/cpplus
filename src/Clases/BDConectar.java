/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author DeveloperTwo
 */
public class BDConectar {
    public Connection conexion,conexionLite;
    public Statement sentencia,sentenciaLite;
    public ResultSet resultado,resultadoLite;

     public void ConectarBasedeDatos(){
         try {
             final String Controlador = "com.mysql.jdbc.Driver";
             Class.forName( Controlador );
             final String url_bd = "jdbc:mysql://192.168.1.102:3306/database";
             conexion = DriverManager.getConnection(url_bd,"root","9RLH5QEwQ4dF");
//             final String url_bd = "jdbc:mysql://localhost:3306/database";
//             conexion = DriverManager.getConnection(url_bd,"root","root");
             sentencia = conexion.createStatement();
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage(), "Clipa+", JOptionPane.ERROR_MESSAGE);
          }
     }
     public void DesconectarBasedeDatos() {
        try {
            if (conexion != null ) {
                if(sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        }
        catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex.getMessage(), "Clipa+", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
      public Connection getConnection(){
      return conexion;
   }
     public void ConectarBasedeDatosLite(){
         try {
             final String Controlador = "org.sqlite.JDBC";
             Class.forName( Controlador );
             final String url_bd = "jdbc:sqlite:clipaplus_beta.db";
             conexionLite = DriverManager.getConnection(url_bd);
             sentenciaLite = conexionLite.createStatement();
         }
         catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage(), "Clipa+", JOptionPane.ERROR_MESSAGE);
          }
     }
     public void DesconectarBasedeDatosLite() {
        try {
            if (conexionLite != null ) {
                if(sentenciaLite != null) {
                    sentenciaLite.close();
                }
                conexionLite.close();
            }
        }
        catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex.getMessage(), "Clipa+", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}
