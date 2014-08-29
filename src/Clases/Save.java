package Clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Save {
    
    Clases.BDConectar bd = new Clases.BDConectar();
    
    public String contarhc(String id) {
        try {
            return "SELECT COUNT(*)"
                    + " FROM"
                    + " `database`.`pyp_historiac`"
                    + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "';";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "contar hc" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String contarvisual(String id) {
        try {
            return "SELECT COUNT(*)"
                    + " FROM"
                    + " `database`.`pyp_visual`"
                    + " WHERE `pyp_visual`.`idasistencia`='" + id + "';";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "contar visual" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String contarproce(String id) {
        try {
            return "SELECT COUNT(*)"
                    + "   FROM"
                    + "       `database`.`pyp_procedimiento`"
                    + "   WHERE `pyp_procedimiento`.`id_historiapyp`='" + id + "' AND `pyp_procedimiento`.`estado` = '2';";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "contar procedimiento " + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
        try {
            return "SELECT `pyp_historiac`.`id`"
                    + " FROM"
                    + " `database`.`pyp_historiac`"
                    + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1') "
                    //                + "AND `pyp_historiac`.`estado` = 0"
                    //                + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1"
                    + ";";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar id hc " + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void validacionpacienteaten(String idasis, String est) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "     `database`.`pyp_adm_asist_con` "
                    + " SET `pyp_adm_asist_con`.`estado`=?"
                    + " WHERE `pyp_adm_asist_con`.`id` = ?;");
            bd.preparedStatement.setString(1, est);
            bd.preparedStatement.setString(2, idasis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Up1 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Up1 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public String seleccionaruser(String id) {
        try {
            return "SELECT `pyp_historiac`.`usuariolog`"
                    + " FROM"
                    + " `database`.`pyp_historiac`"
                    + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1') "
                    //                + "AND `pyp_historiac`.`estado` = 0"
                    //                + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1"
                    + ";";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar user" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String seleccionaruservisual(String id) {
        try {
            return "SELECT `pyp_visual`.`usuariolog`"
                    + " FROM"
                    + " `database`.`pyp_visual`"
                    + " WHERE `pyp_visual`.`idasistencia`='" + id + "' AND (`pyp_visual`.`estado` = '0' OR `pyp_visual`.`estado` = '1') "
                    + ";";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "seleccionar usuario visual" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String seleccionaridvisual(String id) {
        try {
            return "SELECT `pyp_visual`.`id`"
                    + " FROM"
                    + " `database`.`pyp_visual`"
                    + " WHERE `pyp_visual`.`idasistencia`='" + id + "' AND (`pyp_visual`.`estado` = '0' OR `pyp_visual`.`estado` = '1')"
                    //                + "AND `pyp_visual`.`estado` = 0"
                    //                + " GROUP BY `pyp_visual`.`id` DESC LIMIT 1"
                    + ";";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "sleccionar id visual" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String seleccionaridhcfinal(String id) {
        try {
            return "SELECT `pyp_historiac`.`id`"
                    + " FROM"
                    + " `database`.`pyp_historiac`"
                    + " WHERE `pyp_historiac`.`id_admisionpyp`='" + id + "' AND `pyp_historiacl`.`estado` = '0'"
                    + " GROUP BY `pyp_historiac`.`id` DESC LIMIT 1;";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "seleccionar id hc final" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String seleccionaridvisualfinal(String id) {
        try {
            return "SELECT `pyp_visual`.`id`"
                    + " FROM"
                    + " `database`.`pyp_visual`"
                    + " WHERE `pyp_visual`.`idasistencia`='" + id + "' AND `pyp_visual`.`estado` = '0'"
                    + " GROUP BY `pyp_visual`.`id` DESC LIMIT 1;";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "seleccionar visual final" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
    
    public void newproce(String id, String idc, String idu, String estado, String fecha, String observacion, String examen) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_procedimiento (id_historiapyp, id_cups, id_usuario, estado, fecha, observacion, examen) VALUES (?, ?, ?, ?, ?, ?, ?)");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, idc);
            bd.preparedStatement.setString(3, idu);
            bd.preparedStatement.setString(4, estado);
            bd.preparedStatement.setString(5, fecha);
            bd.preparedStatement.setString(6, observacion);
            bd.preparedStatement.setString(7, examen);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c007" + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
    
    public void newpruebas(String id, String nombre, String ruta, String tipo, String fecha, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `pyp_pruebascomplementarias` (`id_infohisto`, `nombre`, `ruta`, `tipo`, `fecha`, `userlog`) VALUES (?,?,?,?,?,?);");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, nombre);
            bd.preparedStatement.setString(3, ruta);
            bd.preparedStatement.setString(4, tipo);
            bd.preparedStatement.setString(5, fecha);
            bd.preparedStatement.setInt(6, usuario);
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
        try {
            return "SELECT `pyp_materna`.`id`"
                    + "FROM `database`.`pyp_materna`"
                    + "WHERE (`pyp_materna`.`id_historia` ='" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "seleccionar id materna" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
    
    public void newproceanti(String id, String idc, String idu, String estado, String fecha, String observacion) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO pyp_procedimiento (id_historiapyp, id_cups, id_usuario, estado, tipo, fecha, observacion) VALUES (?, ?, ?, ?, ?, ?, ?)");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, idc);
            bd.preparedStatement.setString(3, idu);
            bd.preparedStatement.setString(4, estado);
            bd.preparedStatement.setString(5, "1");
            bd.preparedStatement.setString(6, fecha);
            bd.preparedStatement.setString(7, observacion);
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
        try {
            return "SELECT `pyp_planificacionf`.`id`"
                    + "FROM `database`.`pyp_planificacionf`"
                    + "WHERE (`pyp_planificacionf`.`idhistoria` = '" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "seleccionar id planificacion" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
        try {
            return "SELECT `pyp_hta`.`id`"
                    + "FROM `database`.`pyp_hta`"
                    + "	WHERE (`pyp_hta`.`idhistoria` = '" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "seleccionar id hta" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
        try {
            return "SELECT COUNT(*)"
                    + "FROM"
                    + "    `database`.`pyp_posologia`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_posologia`.`id_historiac` = `pyp_historiac`.`id`)"
                    + "WHERE (`pyp_posologia`.`id_historiac` ='" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "receta medica" + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
    
    public void nuevaconfig(String idparametro, String tipo, String valor, String validacion) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`config_rel4505` (`config_rel4505`.`idparametro`, `config_rel4505`.`tipo`, `config_rel4505`.`valor`, `config_rel4505`.`validacion`) VALUES (?,?,?,?);");
            bd.preparedStatement.setString(1, idparametro);
            bd.preparedStatement.setString(2, tipo);
            bd.preparedStatement.setString(3, valor);
            bd.preparedStatement.setString(4, validacion);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c028" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c028" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public String cargarpramen(String id) {
        try {
            return "SELECT"
                    + "      `config_rel4505`.`id`"
                    + "      , `config_rel4505`.`idparametro`"
                    + "      , `config_parametros`.`parametro`"
                    + "      , `config_parametros`.`nombre`"
                    + "      , `config_rel4505`.`tipo`"
                    + "      , `config_rel4505`.`valor`"
                    + "      , `config_rel4505`.`validacion`"
                    + "      FROM"
                    + "          `database`.`config_rel4505`"
                    + "           INNER JOIN `database`.`config_parametros` "
                    + "                    ON (`config_rel4505`.`idparametro` = `config_parametros`.`id`)"
                    + "           WHERE (`config_rel4505`.`estado` = 1 AND `config_rel4505`.`id` = '" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cargar parametro mensual " + e.getMessage(), Save.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void modifparam(String id, String tipo, String valor, String validacion) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`config_rel4505`"
                    + "SET `config_rel4505`.`tipo` = ?, `config_rel4505`.`valor` = ?,   `config_rel4505`.`validacion` = ?"
                    + "WHERE `config_rel4505`.`id` = ?;");
            bd.preparedStatement.setString(1, tipo);
            bd.preparedStatement.setString(2, valor);
            bd.preparedStatement.setString(3, validacion);
            bd.preparedStatement.setString(4, id);
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
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
    
    public void newantim(String idh, String idsum, String tipo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`pyp_anticonceptivosm` (`pyp_anticonceptivosm`.`idhistoria`, `pyp_anticonceptivosm`.`idsuministro`, `pyp_anticonceptivosm`.`tipo`) VALUES (?,?,?);");
            bd.preparedStatement.setString(1, idh);
            bd.preparedStatement.setString(2, idsum);
            bd.preparedStatement.setString(3, tipo);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c031" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c031" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
    
    public void newantip(String idh, String idcup, String tipo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`pyp_anticonceptivosp` (`pyp_anticonceptivosp`.`idhistoria`, `pyp_anticonceptivosp`.`idprocedimiento`, `pyp_anticonceptivosp`.`tipo`) VALUES (?,?,?);");
            bd.preparedStatement.setString(1, idh);
            bd.preparedStatement.setString(2, idcup);
            bd.preparedStatement.setString(3, tipo);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c032" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c032" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
    
    public void newrelexamen(String idproc, String fecha, String resultado, String observacion, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("INSERT INTO `database`.`pyp_laboratory` (`idprocedimiento`, `fecha`, `resultado`, `observacion`, `usuariolog`) VALUES (?,?,?,?,?);");
            bd.preparedStatement.setString(1, idproc);
            bd.preparedStatement.setString(2, fecha);
            bd.preparedStatement.setString(3, resultado);
            bd.preparedStatement.setString(4, observacion);
            bd.preparedStatement.setInt(5, usuario);
            bd.preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "c033" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "c033" + e.getMessage(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
}
