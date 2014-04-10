package Clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Save {

    Clases.BDConectar bd = new Clases.BDConectar();

    public String contarhc(String id) {
        return "SELECT COUNT(*)"
                + " FROM"
                + " `database`.`pyp_historiac`"
                + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "';";
    }

    public String contarproce(String id) {
        return "SELECT COUNT(*)"
                + "   FROM"
                + "       `database`.`pyp_procedimiento`"
                + "   WHERE `pyp_procedimiento`.`id_historiapyp`='" + id + "';";
    }

    public void crearhcnueva(String idasis, String idp) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_historiac (id_admisionpyp, usuariolog) VALUES ('" + idasis + "', '" + idp + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c001 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c001 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String seleccionaridhc(String id) {
        return "SELECT `pyp_historiac`.`id`"
                + " FROM"
                + " `database`.`pyp_historiac`"
                + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "' AND `pyp_historiac`.`estado` = 0"
                + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1;";
    }

    public String seleccionaridhcfinal(String id) {
        return "SELECT `pyp_historiac`.`id`"
                + " FROM"
                + " `database`.`pyp_historiac`"
                + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "'"
                + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1;";
    }

    public void newadulto(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_adulto (id_historia) VALUES ('" + id + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c002" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c002" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newagineco(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_antecedentesg (Id_historiac) VALUES ('" + id + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c003" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c003" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void neweventose(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_eventose (Idhistoriac) VALUES ('" + id + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c004" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c004" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newexpf(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_explofisica (idhistoriac) VALUES ('" + id + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c005" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c005" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newposo(String id, String sum, String dosis, String canti, String dosisu, String via, String administracion, String user, String fecha, String estado) {
        try {
            bd.ConectarBasedeDatos();
//            bd.sentencia.execute("INSERT INTO pyp_posologia (id_historiac, id_suministro, dosis_n, cantidad,"
//                    + "dosis_u, via, administracion, usuario, fdigita, estado) VALUES ('" + id + "', '" + sum + "', '" + dosis + "',"
//                    + "'" + canti + "', '" + dosisu + "', '" + via + "', '" + administracion + "', '" + user + "', '" + fecha + "', '" + estado + "')");
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_posologia (id_historiac, id_suministro, dosis_n, cantidad,"
                    + "dosis_u, via, administracion, usuario, fdigita, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, sum);
            bd.preparedStatement.setString(3, dosis);
            bd.preparedStatement.setString(4, canti);
            bd.preparedStatement.setString(5, dosisu);
            bd.preparedStatement.setString(6, via);
            bd.preparedStatement.setString(7, administracion);
            bd.preparedStatement.setString(8, user);
            bd.preparedStatement.setString(9, fecha);
            bd.preparedStatement.setString(10, estado);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c006" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c006" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newproce(String id, String idc, String idu, String estado) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_procedimiento (id_historiapyp, id_cups, id_usuario, estado) VALUES (?, ?, ?, ?)");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, idc);
            bd.preparedStatement.setString(3, idu);
            bd.preparedStatement.setString(4, estado);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newpruebas(String id, String nombre, String ruta, String tipo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `pyp_pruebascomplementarias` (`id_infohisto`, `nombre`, `ruta`, `tipo`) VALUES (?,?,?,?);");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, nombre);
            bd.preparedStatement.setString(3, ruta);
            bd.preparedStatement.setString(4, tipo);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c008" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c008" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
}
