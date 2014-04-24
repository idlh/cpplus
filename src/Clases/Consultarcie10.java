package Clases;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Consultarcie10 {

    Clases.BDConectar db = new Clases.BDConectar();

    public void llamar_cie(String codigo) {
        try {
            db.ConectarBasedeDatos();
            db.resultado = db.sentencia.executeQuery("SELECT CONCAT(`codigo`,' - ', `descripcion`) AS cie FROM `database`.`static_cie10` WHERE (`codigo` ='" + codigo + "');");
            if (db.resultado != null) {
                while (db.resultado.next()) {
                    HC.DiagnosticosM.jTextField1.setText(db.resultado.getString("cie"));
                    HC.DiagnosticosM.jTextField1.setToolTipText(db.resultado.getString("cie"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ningun dato encontrado", "MENSAJE DE INFORMACION", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            db.DesconectarBasedeDatos();
        }
    }
}
