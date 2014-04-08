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
                + "                FROM"
                + "                 `database`.`pyp_procedimiento`"
                + "                 WHERE `pyp_procedimiento`.`id_historiapyp`='" + id + "';";
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
                + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "' AND `pyp_historiac`.`estado` = 1"
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
            bd.sentencia.execute("INSERT INTO pyp_posologia (id_historiac, id_suministro, dosis_n, cantidad,"
                    + "dosis_u, via, administracion, usuario, fdigita, estado) VALUES ('" + id + "', '" + sum + "', '" + dosis + "',"
                    + "'" + canti + "', '" + dosisu + "', '" + via + "', '" + administracion + "', '" + user + "', '" + fecha + "', '" + estado + "')");
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
            bd.sentencia.execute("INSERT INTO pyp_procedimiento (id_historiapyp, id_cups, id_usuario, estado) VALUES ('" + id + "', '" + idc + "', '" + idu + "', '" + estado + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newpruebas(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_pruebascomplementarias (id_infohisto) VALUES ('" + id + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c008" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c008" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
}
