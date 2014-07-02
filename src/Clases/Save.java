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

    public String contarvisual(String id) {
        return "SELECT COUNT(*)"
                + " FROM"
                + " `database`.`pyp_visual`"
                + " WHERE `pyp_visual`.`idasistencia`='" + id + "';";
    }

    public String contarproce(String id) {
        return "SELECT COUNT(*)"
                + "   FROM"
                + "       `database`.`pyp_procedimiento`"
                + "   WHERE `pyp_procedimiento`.`id_historiapyp`='" + id + "';";
    }

    public void crearhcnueva(String idasis, String idp, String dxp) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_historiac (id_admisionpyp, usuariolog, diagnosticos) VALUES ('" + idasis + "', '" + idp + "', '" + dxp + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c001 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c001 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void crearvisualnueva(String idasis, String idp, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_visual (idasistencia, usuariolog, fecha) VALUES ('" + idasis + "', '" + idp + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c001.0 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c001.0 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String seleccionaridhc(String id) {
        return "SELECT `pyp_historiac`.`id`"
                + " FROM"
                + " `database`.`pyp_historiac`"
                + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "' "
                //                + "AND `pyp_historiac`.`estado` = 0"
                //                + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1"
                + ";";
    }

    public String seleccionaridvisual(String id) {
        return "SELECT `pyp_visual`.`id`"
                + " FROM"
                + " `database`.`pyp_visual`"
                + " WHERE `pyp_visual`.`idasistencia`='" + id + "' "
                //                + "AND `pyp_visual`.`estado` = 0"
                //                + " GROUP BY `pyp_visual`.`id` DESC LIMIT 1"
                + ";";
    }

    public String seleccionaridhcfinal(String id) {
        return "SELECT `pyp_historiac`.`id`"
                + " FROM"
                + " `database`.`pyp_historiac`"
                + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "'"
                + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1;";
    }

    public String seleccionaridvisualfinal(String id) {
        return "SELECT `pyp_visual`.`id`"
                + " FROM"
                + " `database`.`pyp_visual`"
                + " WHERE `pyp_visual`.`idasistencia`='" + id + "'"
                + " GROUP BY `pyp_visual`.`id` DESC LIMIT 1;";
    }

    public void newadulto(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_adulto (id_historia, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c002" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c002" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newagineco(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_antecedentesg (Id_historiac, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c003" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c003" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void neweventose(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_eventose (Idhistoriac, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c004" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c004" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newexpf(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_explofisica (idhistoriac, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
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

    public void newproce(String id, String idc, String idu, String estado, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_procedimiento (id_historiapyp, id_cups, id_usuario, estado, fecha) VALUES (?, ?, ?, ?, ?)");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, idc);
            bd.preparedStatement.setString(3, idu);
            bd.preparedStatement.setString(4, estado);
            bd.preparedStatement.setString(5, fecha);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newpruebas(String id, String nombre, String ruta, String tipo, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `pyp_pruebascomplementarias` (`id_infohisto`, `nombre`, `ruta`, `tipo`, `fecha`) VALUES (?,?,?,?,?);");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, nombre);
            bd.preparedStatement.setString(3, ruta);
            bd.preparedStatement.setString(4, tipo);
            bd.preparedStatement.setString(5, fecha);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c008" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c008" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newmaterna(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_materna (id_historia, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c009" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c009" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String idmaterna(String id) {
        return "SELECT `pyp_materna`.`id`"
                + "FROM `database`.`pyp_materna`"
                + "WHERE (`pyp_materna`.`id_historia` ='" + id + "');";
    }

    public void newobstetrico(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO `pyp_materna_obstetricos` (`id_materna`, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "');");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c010" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c010" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newgestaac(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO `pyp_materna_gestaactual` (`id_materna`, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "');");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c011" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c011" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newparto(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO `pyp_postparto` (`id_historiac`, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c012" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c012" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newrecien(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO `pyp_recienniacido` (`idhistoria`, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c013" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c013" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newposoanti(String id, String sum, String dosis, String canti, String dosisu, String via, String administracion, String user, String fecha, String estado) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_posologia (id_historiac, id_suministro, dosis_n, cantidad,"
                    + "dosis_u, via, administracion, usuario, fdigita, estado, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            bd.preparedStatement.setString(11, "1");
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c014" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c014" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newproceanti(String id, String idc, String idu, String estado, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_procedimiento (id_historiapyp, id_cups, id_usuario, estado, tipo, fecha) VALUES (?, ?, ?, ?, ?, ?)");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, idc);
            bd.preparedStatement.setString(3, idu);
            bd.preparedStatement.setString(4, estado);
            bd.preparedStatement.setString(5, "1");
            bd.preparedStatement.setString(6, fecha);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c015" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c015" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newplanificacion(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO `pyp_planificacionf` (`idhistoria`, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c016" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c016" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newjoven(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO `pyp_joven` (`idhistoria`, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c016" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c016" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newhta(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_hta (idhistoria, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c017" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c017" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newcrecimiento(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_crecimiento (idhistoria, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c018" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c018" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newinfoante(String idpaciente, String alergias, String ingresos, String traumatismos, String tratamientos, String dm,
            String hta, String dislipidemia, String deschdd, String tabaco, String alcochol, String droga, String otrosh, String basal, String familiares) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`info_ant_personales` (`info_ant_personales`.`id_paciente`, `info_ant_personales`.`alergias`,"
                    + "	    `info_ant_personales`.`ingresos_previos`,`info_ant_personales`.`traumatismos`, `info_ant_personales`.`tratamientos`,"
                    + "	    `info_ant_personales`.`dm`, `info_ant_personales`.`hta`, `info_ant_personales`.`dislipidemia`, `info_ant_personales`.`desc_hdd`,"
                    + "	    `info_ant_personales`.`tabaco`, `info_ant_personales`.`alcohol`, `info_ant_personales`.`droga`, `info_ant_personales`.`otros_habitos`,"
                    + "	    `info_ant_personales`.`situacion_basal`, `info_ant_personales`.`ant_familiares`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            bd.preparedStatement.setString(1, idpaciente);
            bd.preparedStatement.setString(2, alergias);
            bd.preparedStatement.setString(3, ingresos);
            bd.preparedStatement.setString(4, traumatismos);
            bd.preparedStatement.setString(5, tratamientos);
            bd.preparedStatement.setString(6, dm);
            bd.preparedStatement.setString(7, hta);
            bd.preparedStatement.setString(8, dislipidemia);
            bd.preparedStatement.setString(9, deschdd);
            bd.preparedStatement.setString(10, tabaco);
            bd.preparedStatement.setString(11, alcochol);
            bd.preparedStatement.setString(12, droga);
            bd.preparedStatement.setString(13, otrosh);
            bd.preparedStatement.setString(14, basal);
            bd.preparedStatement.setString(15, familiares);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c019 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c019 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String selectidplanifica(String id) {
        return "SELECT `pyp_planificacionf`.`id`"
                + "FROM `database`.`pyp_planificacionf`"
                + "WHERE (`pyp_planificacionf`.`idhistoria` = '" + id + "')";
    }

    public void newplanicontrol(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_planificacion_control (idplanificacion, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c020 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c020 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String selectidhta(String id) {
        return "SELECT `pyp_hta`.`id`"
                + "FROM `database`.`pyp_hta`"
                + "	WHERE (`pyp_hta`.`idhistoria` = '" + id + "')";
    }

    public void newhtacontrol(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_hta_control (idhta, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c021 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c021 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newcrecimientomeses(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_crecimiento_eadmeses (idhistoria, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c022 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c022 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newcrecimientoaños(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_crecimiento_eadaños (idhistoria, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c023 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c023 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void controlp(String id, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_contolmaterno (idhistoria, fecha) VALUES ('" + id + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c024 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c024 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void newginecog(String idpaciente, String fum, String ciclos, String gestas, String partos, String abortos, String cesareas,
            String vaginales, String fup, String menarquia, String edadinicio, String vidasexual, String relacionescon, String parejaestable,
            String usopreservativo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`pyp_info_antecedentesg` (`pyp_info_antecedentesg`.`idpaciente`,"
                    + "	`pyp_info_antecedentesg`.`FUM`, `pyp_info_antecedentesg`.`Ciclos`, `pyp_info_antecedentesg`.`gestas`,"
                    + "	`pyp_info_antecedentesg`.`partos`, `pyp_info_antecedentesg`.`abortos`, `pyp_info_antecedentesg`.`cesareas`, `pyp_info_antecedentesg`.`vaginales`,"
                    + "	`pyp_info_antecedentesg`.`FUP`, `pyp_info_antecedentesg`.`menarquia`, `pyp_info_antecedentesg`.`edadinicio`, `pyp_info_antecedentesg`.`vidasexualac`,"
                    + "	`pyp_info_antecedentesg`.`relacionescon`, `pyp_info_antecedentesg`.`parejaestable`, `pyp_info_antecedentesg`.`usopreservativo`) VALUES ("
                    + "	?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            bd.preparedStatement.setString(1, idpaciente);
            bd.preparedStatement.setString(2, fum);
            bd.preparedStatement.setString(3, ciclos);
            bd.preparedStatement.setString(4, gestas);
            bd.preparedStatement.setString(5, partos);
            bd.preparedStatement.setString(6, abortos);
            bd.preparedStatement.setString(7, cesareas);
            bd.preparedStatement.setString(8, vaginales);
            bd.preparedStatement.setString(9, fup);
            bd.preparedStatement.setString(10, menarquia);
            bd.preparedStatement.setString(11, edadinicio);
            bd.preparedStatement.setString(12, vidasexual);
            bd.preparedStatement.setString(13, relacionescon);
            bd.preparedStatement.setString(14, parejaestable);
            bd.preparedStatement.setString(15, usopreservativo);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c025 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c025 " + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void newdm(String id, String usuario, String fecha) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_dm (idhistoria, userlog, fecha) VALUES ('" + id + "', '" + usuario + "', '" + fecha + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c026" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c026" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String recetam(String id) {
        return "SELECT COUNT(*)"
                + "FROM"
                + "    `database`.`pyp_posologia`"
                + "    INNER JOIN `database`.`pyp_historiac` "
                + "        ON (`pyp_posologia`.`id_historiac` = `pyp_historiac`.`id`)"
                + "WHERE (`pyp_posologia`.`id_historiac` ='" + id + "');";
    }

    public void newreceta(String historia, String usuario, String tipo, String estado) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("INSERT INTO pyp_receta_medica (id_historiapyp, id_decription_login, tipo, estado) VALUES "
                    + "('" + historia + "','" + usuario + "', '" + tipo + "', '" + estado + "')");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c027" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c027" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void nuevaconfig(String idparametro, String tipo, String valor) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`config_rel4505` (`config_rel4505`.`idparametro`, `config_rel4505`.`tipo`, `config_rel4505`.`valor`) VALUES (?,?,?);");
            bd.preparedStatement.setString(1, idparametro);
            bd.preparedStatement.setString(2, tipo);
            bd.preparedStatement.setString(3, valor);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c028" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c028" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarpramen(String id) {
        return "SELECT"
                + "      `config_rel4505`.`id`"
                + "      , `config_rel4505`.`idparametro`"
                + "      , `config_parametros`.`parametro`"
                + "      , `config_parametros`.`nombre`"
                + "      , `config_rel4505`.`tipo`"
                + "      , `config_rel4505`.`valor`"
                + "      FROM"
                + "          `database`.`config_rel4505`"
                + "           INNER JOIN `database`.`config_parametros` "
                + "                    ON (`config_rel4505`.`idparametro` = `config_parametros`.`id`)"
                + "           WHERE (`config_rel4505`.`estado` = 1 AND `config_rel4505`.`id` = '" + id + "');";
    }

    public void modifparam(String id, String tipo, String valor) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`config_rel4505`"
                    + "SET `config_rel4505`.`tipo` = ?, `config_rel4505`.`valor` = ?"
                    + "WHERE `config_rel4505`.`id` = ?;");
            bd.preparedStatement.setString(1, tipo);
            bd.preparedStatement.setString(2, valor);
            bd.preparedStatement.setString(3, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c029" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c029" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void deshabilitarparam(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`config_rel4505`"
                    + " SET `config_rel4505`.`estado` = 0"
                    + " WHERE `config_rel4505`.`id` = ?;");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c030" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c030" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
