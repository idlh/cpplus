package Clases;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Actualizar {

    BDConectar bd = new BDConectar();

    public String Selectidposo(String id) {
        try {
            return "SELECT `pyp_posologia`.`id`"
                    + " FROM `database`.`pyp_posologia`"
                    + " WHERE `pyp_posologia`.`id_historiac` = '" + id + "' AND `pyp_posologia`.`estado`='0' ";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar id posologia " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String Selectidproc(String id) {
        try {
            return "SELECT `pyp_procedimiento`.`id`"
                    + " FROM `database`.`pyp_procedimiento`"
                    + " WHERE `pyp_procedimiento`.`id_historiapyp` = '" + id + "' AND `pyp_procedimiento`.`estado`='0'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar id procedimiento " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String obteneridespecialidad(String nombre) {
        try {
            return "SELECT"
                    + "    `id`"
                    + "FROM"
                    + "    `database`.`static_especialidades`"
                    + "WHERE (`especialidad` = '" + nombre + "' AND `estado` <> '0');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Obtener id especialidad " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void desactivarproc(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("UPDATE `database`.`pyp_procedimiento`"
                    + " SET `pyp_procedimiento`.`estado` = 0"
                    + " WHERE `pyp_procedimiento`.`id` = '" + id + "' AND `pyp_procedimiento`.`estado` = '1';");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a001 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a001 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actueventos(String id, String separacion, String embarazoa, String fracasoe, String conflictoc, String salidah,
            String dificultadesl, String muerteh, String decersione, String otro, String totros, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_eventose`"
                    + " SET `pyp_eventose`.`sepodivorcio` = ?, `pyp_eventose`.`EmbarazoA` = ?, `pyp_eventose`.`FracasoE` = ?,"
                    + "     `pyp_eventose`.`ConflictoC` = ?, `pyp_eventose`.`Salidahijo` = ?, `pyp_eventose`.`DificultadesL` = ?,"
                    + "     `pyp_eventose`.`Muertehijo` = ?, `pyp_eventose`.`decersionE` = ?, `pyp_eventose`.`otros` = ?,"
                    + "     `pyp_eventose`.`totros` = ?, `pyp_eventose`.`userlog` = ?"
                    + "WHERE `pyp_eventose`.`Idhistoriac` = ?");
            bd.preparedStatement.setString(1, separacion);
            bd.preparedStatement.setString(2, embarazoa);
            bd.preparedStatement.setString(3, fracasoe);
            bd.preparedStatement.setString(4, conflictoc);
            bd.preparedStatement.setString(5, salidah);
            bd.preparedStatement.setString(6, dificultadesl);
            bd.preparedStatement.setString(7, muerteh);
            bd.preparedStatement.setString(8, decersione);
            bd.preparedStatement.setString(9, otro);
            bd.preparedStatement.setString(10, totros);
            bd.preparedStatement.setInt(11, usuario);
            bd.preparedStatement.setString(12, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a002 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a002 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actualizarginecog(String id, String fum, String ciclos, String gestas, String partos, String abortos, String cesareas,
            String vaginales, String fup, String menarquia, String edadinicio, String vidasexual, String relacionescon, String parejaestable,
            String usopreservativo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_antecedentesg`"
                    + " SET `pyp_antecedentesg`.`FUM` = ?, `pyp_antecedentesg`.`Ciclos` = ?, `pyp_antecedentesg`.`gestas` = ?,"
                    + "    `pyp_antecedentesg`.`partos` = ?, `pyp_antecedentesg`.`abortos` = ?, `pyp_antecedentesg`.`cesareas` = ?,"
                    + "    `pyp_antecedentesg`.`vaginales` = ?, `pyp_antecedentesg`.`FUP` = ?, `pyp_antecedentesg`.`menarquia` = ?,"
                    + "    `pyp_antecedentesg`.`edadinicio` = ?, `pyp_antecedentesg`.`vidasexualac` = ?, `pyp_antecedentesg`.`relacionescon` = ?,"
                    + "    `pyp_antecedentesg`.`parejaestable` = ?, `pyp_antecedentesg`.`usopreservativo` = ?"
                    + " WHERE `pyp_antecedentesg`.`id_historiac` = ?;");
            bd.preparedStatement.setString(1, fum);
            bd.preparedStatement.setString(2, ciclos);
            bd.preparedStatement.setString(3, gestas);
            bd.preparedStatement.setString(4, partos);
            bd.preparedStatement.setString(5, abortos);
            bd.preparedStatement.setString(6, cesareas);
            bd.preparedStatement.setString(7, vaginales);
            bd.preparedStatement.setString(8, fup);
            bd.preparedStatement.setString(9, menarquia);
            bd.preparedStatement.setString(10, edadinicio);
            bd.preparedStatement.setString(11, vidasexual);
            bd.preparedStatement.setString(12, relacionescon);
            bd.preparedStatement.setString(13, parejaestable);
            bd.preparedStatement.setString(14, usopreservativo);
            bd.preparedStatement.setString(15, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a003 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a003 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actualizarginecom(String id, String macp, String metp, String tp, String ep, String maca, String meta, String ta, String ea) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_antecedentesg`"
                    + " SET `pyp_antecedentesg`.`macprevio` = ?, `pyp_antecedentesg`.`metodoprevio` = ?, `pyp_antecedentesg`.`tiempousoprevio` = ?,"
                    + "     `pyp_antecedentesg`.`efectosprevios` = ?, `pyp_antecedentesg`.`macactual` = ?, `pyp_antecedentesg`.`metodoactual` = ?,"
                    + "     `pyp_antecedentesg`.`tiempoactual` =?, `pyp_antecedentesg`.`efectosactual` = ?"
                    + " WHERE `pyp_antecedentesg`.`id_historiac` = ?;");
            bd.preparedStatement.setString(1, macp);
            bd.preparedStatement.setString(2, metp);
            bd.preparedStatement.setString(3, tp);
            bd.preparedStatement.setString(4, ep);
            bd.preparedStatement.setString(5, maca);
            bd.preparedStatement.setString(6, meta);
            bd.preparedStatement.setString(7, ta);
            bd.preparedStatement.setString(8, ea);
            bd.preparedStatement.setString(9, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a004 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a004 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actualizarantp(String id, String alerg, String ingprev, String trau, String trat, String dm, String hta, String displi,
            String despato, String tabaco, String alcohol, String droga, String deshab, String stub, String antf, String user) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`alegias` = ?, `pyp_historiac`.`ingresos_previos` = ?, `pyp_historiac`.`traumatismos` = ?,"
                    + "    `pyp_historiac`.`tratamientos` = ?, `pyp_historiac`.`dm` =?, `pyp_historiac`.`hta` = ?,"
                    + "    `pyp_historiac`.`dislipidemia` = ?, `pyp_historiac`.`des_patologicos` = ?, `pyp_historiac`.`tabaco` = ?,"
                    + "    `pyp_historiac`.`alcohol` = ?, `pyp_historiac`.`droga` = ?, `pyp_historiac`.`des_habitos` = ?,"
                    + "    `pyp_historiac`.`situacionbasal` = ?, `pyp_historiac`.`ant_familiares` = ?, `pyp_historiac`.`usuariolog` = ?"
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setString(1, alerg);
            bd.preparedStatement.setString(2, ingprev);
            bd.preparedStatement.setString(3, trau);
            bd.preparedStatement.setString(4, trat);
            bd.preparedStatement.setString(5, dm);
            bd.preparedStatement.setString(6, hta);
            bd.preparedStatement.setString(7, displi);
            bd.preparedStatement.setString(8, despato);
            bd.preparedStatement.setString(9, tabaco);
            bd.preparedStatement.setString(10, alcohol);
            bd.preparedStatement.setString(11, droga);
            bd.preparedStatement.setString(12, deshab);
            bd.preparedStatement.setString(13, stub);
            bd.preparedStatement.setString(14, antf);
            bd.preparedStatement.setString(15, user);
            bd.preparedStatement.setString(16, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a005 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a005 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actenfactual(String id, String enf) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`enfermedadactual` = ?  WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setString(1, enf);
            bd.preparedStatement.setString(2, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a006 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a006 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actexploracion(String id, int tas, int tad, float fr, int fc, float tempe, int talla, float peso,
            float imc, String otro, String aspectog, String neu, String cardio, String resp, String gastro, String genito,
            String hemato, String endoc, String osteo, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_explofisica`"
                    + " SET `pyp_explofisica`.`tas` = ?, `pyp_explofisica`.`tad` = ?, `pyp_explofisica`.`fr`=?, `pyp_explofisica`.`fc` = ?,"
                    + "    `pyp_explofisica`.`temperatura`= ?, `pyp_explofisica`.`talla` = ?, `pyp_explofisica`.`peso` = ?,"
                    + "    `pyp_explofisica`.`imc` = ?, `pyp_explofisica`.`otro`=?, `pyp_explofisica`.`aspectog`=?, `pyp_explofisica`.`neurologicooc` =?,"
                    + "    `pyp_explofisica`.`cardiovascular` = ?, `pyp_explofisica`.`respiratorio` = ?, `pyp_explofisica`.`gastrointestinal` =?,"
                    + "    `pyp_explofisica`.`genitourinario` = ?, `pyp_explofisica`.`hematoinfeccioso`=?, `pyp_explofisica`.`endocrinometa` = ?,"
                    + "    `pyp_explofisica`.`osteo`=?, `pyp_explofisica`.`userlog`=?"
                    + "    WHERE `pyp_explofisica`.`idhistoriac` = ?;");
            bd.preparedStatement.setInt(1, tas);
            bd.preparedStatement.setInt(2, tad);
            bd.preparedStatement.setFloat(3, fr);
            bd.preparedStatement.setInt(4, fc);
            bd.preparedStatement.setFloat(5, tempe);
            bd.preparedStatement.setInt(6, talla);
            bd.preparedStatement.setFloat(7, peso);
            bd.preparedStatement.setFloat(8, imc);
            bd.preparedStatement.setString(9, otro);
            bd.preparedStatement.setString(10, aspectog);
            bd.preparedStatement.setString(11, neu);
            bd.preparedStatement.setString(12, cardio);
            bd.preparedStatement.setString(13, resp);
            bd.preparedStatement.setString(14, gastro);
            bd.preparedStatement.setString(15, genito);
            bd.preparedStatement.setString(16, hemato);
            bd.preparedStatement.setString(17, endoc);
            bd.preparedStatement.setString(18, osteo);
            bd.preparedStatement.setInt(19, usuario);
            bd.preparedStatement.setString(20, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a007 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a007 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void acthallasgo(String id, String hallas) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + "SET `pyp_historiac`.`hallasgo` = ?"
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setString(1, hallas);
            bd.preparedStatement.setString(2, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a009 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a009 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx1(String id, int dx, int dx1, int tratamiento1) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel1` = ?, `pyp_historiac`.`tratamiento1` = ? "
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx1);
            bd.preparedStatement.setInt(3, tratamiento1);
            bd.preparedStatement.setString(4, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r1 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r1 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx2(String id, int dx, int dx2, int tratamiento2) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel2` = ?, `pyp_historiac`.`tratamiento2` = ? "
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx2);
            bd.preparedStatement.setInt(3, tratamiento2);
            bd.preparedStatement.setString(4, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r2 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r2 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx3(String id, int dx, int dx3, int tratamiento3) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel3` = ?, `pyp_historiac`.`tratamiento3` = ? "
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx3);
            bd.preparedStatement.setInt(3, tratamiento3);
            bd.preparedStatement.setString(4, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r3 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r3 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx4(String id, int dx, int dx4, int tratamiento4) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel4` = ?, `pyp_historiac`.`tratamiento4` = ? "
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx4);
            bd.preparedStatement.setInt(3, tratamiento4);
            bd.preparedStatement.setString(4, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r4 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r4 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actrecomendaciones(String id, String reco, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`recomendaciones` = ?, `pyp_historiac`.`usuariolog` = ?"
                    + " WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setString(1, reco);
            bd.preparedStatement.setInt(2, usuario);
            bd.preparedStatement.setString(3, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a011 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a011 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargardatoshc(String id) {
        try {
            return "SELECT *"
                    + "  FROM `database`.`pyp_historiac`"
                    + "  WHERE `pyp_historiac`.`id` = '" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cargar hc " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargardatosvisual(String id) {
        try {
            return "SELECT *"
                    + "  FROM `database`.`pyp_visual`"
                    + "  WHERE `pyp_visual`.`id` = '" + id + "';";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar datos tamizaje visual " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargarcierel1(String id) {
        try {
            return "SELECT"
                    + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                    + " FROM"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`static_cie10` "
                    + "        ON (`pyp_historiac`.`diagnosticorel1` = `static_cie10`.`id`)"
                    + "        WHERE `pyp_historiac`.`diagnosticorel1` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar cie 1" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargarcierel2(String id) {
        try {
            return "SELECT"
                    + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                    + " FROM"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`static_cie10` "
                    + "        ON (`pyp_historiac`.`diagnosticorel2` = `static_cie10`.`id`)"
                    + "        WHERE `pyp_historiac`.`diagnosticorel2` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar cie 2" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargarcierel3(String id) {
        try {
            return "SELECT"
                    + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                    + " FROM"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`static_cie10` "
                    + "        ON (`pyp_historiac`.`diagnosticorel3` = `static_cie10`.`id`)"
                    + "        WHERE `pyp_historiac`.`diagnosticorel3` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar cie 3" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargarcierel4(String id) {
        try {
            return "SELECT"
                    + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                    + " FROM"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`static_cie10` "
                    + "        ON (`pyp_historiac`.`diagnosticorel4` = `static_cie10`.`id`)"
                    + "        WHERE `pyp_historiac`.`diagnosticorel4` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar cie 4" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actposologia(String idh, String idposo, String dosis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_posologia`"
                    + " SET `pyp_posologia`.`estado` = 0"
                    + " WHERE `pyp_posologia`.`id_historiac` = ? AND `pyp_posologia`.`id_suministro` = ? AND `pyp_posologia`.`dosis_n` = ?");
            bd.preparedStatement.setString(1, idh);
            bd.preparedStatement.setString(2, idposo);
            bd.preparedStatement.setString(3, dosis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a012 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a012 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargareventose(String id) {
        try {
            return "SELECT *"
                    + " FROM `database`.`pyp_eventose`"
                    + "                  INNER JOIN `database`.`pyp_historiac` "
                    + "                  ON (`pyp_eventose`.`Idhistoriac` = `pyp_historiac`.`id`)"
                    + " WHERE `pyp_eventose`.`Idhistoriac` = '" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar eventos estresantes " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actprocedimiento(String id, String idcup, String esta) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_procedimiento`"
                    + " SET `pyp_procedimiento`.`estado` = ?"
                    + " WHERE `pyp_procedimiento`.`id_historiapyp` = ? AND `pyp_procedimiento`.`id_cups` = ?;");
            bd.preparedStatement.setString(1, esta);
            bd.preparedStatement.setString(2, id);
            bd.preparedStatement.setString(3, idcup);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a013 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a013 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void finalizarhc(String idhc, String idhis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + " SET `pyp_historiac`.`estado`=1, `pyp_adm_asist_con`.`estado`=2"
                    + " WHERE `pyp_historiac`.`id` = ? AND `pyp_historiac`.`id_admisionpyp`=? AND `pyp_historiac`.`estado`=0;");
            bd.preparedStatement.setString(1, idhc);
            bd.preparedStatement.setString(2, idhis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a014 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a014 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void finalizarvisual(String idhc, String idhis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "    `database`.`pyp_visual`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_visual`.`idasistencia` = `pyp_adm_asist_con`.`id`)"
                    + " SET `pyp_visual`.`estado`=1, `pyp_adm_asist_con`.`estado`=2"
                    + " WHERE `pyp_visual`.`id` = ? AND `pyp_visual`.`idasistencia`=? AND `pyp_visual`.`estado`=0;");
            bd.preparedStatement.setString(1, idhc);
            bd.preparedStatement.setString(2, idhis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a014.1 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a014.1 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarantecedentesg(String id) {
        try {
            return "SELECT `pyp_antecedentesg`.`id`"
                    + "    , `pyp_antecedentesg`.`id_historiac`"
                    + "    , DATE_FORMAT(`pyp_antecedentesg`.`FUM`, '%d/%m/%Y') AS `FUM`"
                    + "    , `pyp_antecedentesg`.`Ciclos`"
                    + "    , `pyp_antecedentesg`.`gestas`"
                    + "    , `pyp_antecedentesg`.`partos`"
                    + "    , `pyp_antecedentesg`.`abortos`"
                    + "    , `pyp_antecedentesg`.`cesareas`"
                    + "    , `pyp_antecedentesg`.`vaginales`"
                    + "    , DATE_FORMAT(`pyp_antecedentesg`.`FUP`, '%d/%m/%Y') AS `FUP`"
                    + "    , `pyp_antecedentesg`.`menarquia`"
                    + "    , `pyp_antecedentesg`.`edadinicio`"
                    + "    , `pyp_antecedentesg`.`vidasexualac`"
                    + "    , `pyp_antecedentesg`.`relacionescon`"
                    + "    , `pyp_antecedentesg`.`parejaestable`"
                    + "    , `pyp_antecedentesg`.`usopreservativo`"
                    + "    , `pyp_antecedentesg`.`macprevio`"
                    + "    , `pyp_antecedentesg`.`metodoprevio`"
                    + "    , `pyp_antecedentesg`.`tiempousoprevio`"
                    + "    , `pyp_antecedentesg`.`efectosprevios`"
                    + "    , `pyp_antecedentesg`.`macactual`"
                    + "    , `pyp_antecedentesg`.`metodoactual`"
                    + "    , `pyp_antecedentesg`.`tiempoactual`"
                    + "    , `pyp_antecedentesg`.`efectosactual`"
                    + " FROM `database`.`pyp_antecedentesg`"
                    + " WHERE `pyp_antecedentesg`.`id_historiac` = '" + id + "'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar antecedentes gineco " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargaranteg(String idpaciente) {
        try {
            return "SELECT "
                    + "	`pyp_info_antecedentesg`.`id`"
                    + "      , `pyp_info_antecedentesg`.`idpaciente`"
                    + "      , DATE_FORMAT(`pyp_info_antecedentesg`.`FUM`, '%d/%m/%Y') AS `FUM`"
                    + "      , `pyp_info_antecedentesg`.`Ciclos`"
                    + "      , `pyp_info_antecedentesg`.`gestas`"
                    + "      , `pyp_info_antecedentesg`.`partos`"
                    + "      , `pyp_info_antecedentesg`.`abortos`"
                    + "      , `pyp_info_antecedentesg`.`cesareas`"
                    + "      , `pyp_info_antecedentesg`.`vaginales`"
                    + "      , DATE_FORMAT(`pyp_info_antecedentesg`.`FUP`, '%d/%m/%Y') AS `FUP`"
                    + "      , `pyp_info_antecedentesg`.`menarquia`"
                    + "      , `pyp_info_antecedentesg`.`edadinicio`"
                    + "      , `pyp_info_antecedentesg`.`vidasexualac`"
                    + "      , `pyp_info_antecedentesg`.`relacionescon`"
                    + "      , `pyp_info_antecedentesg`.`parejaestable`"
                    + "      , `pyp_info_antecedentesg`.`usopreservativo`"
                    + "      FROM `database`.`pyp_info_antecedentesg`"
                    + "      WHERE `pyp_info_antecedentesg`.`idpaciente` = '" + idpaciente + "'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar antecedentes gineco " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargarexploracion(String id) {
        try {
            return "SELECT *"
                    + "  FROM"
                    + "       `database`.`pyp_explofisica`"
                    + "  WHERE"
                    + "       `pyp_explofisica`.`idhistoriac` = '" + id + "'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar exploracion fisica " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actualizarpruebas(String id, String nombre) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_pruebascomplementarias`"
                    + " SET `pyp_pruebascomplementarias`.`estado` = 0"
                    + " WHERE `pyp_pruebascomplementarias`.`id_infohisto` = ? AND `pyp_pruebascomplementarias`.`nombre` = ?;");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, nombre);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a015 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a015 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarpruebas(String id) {
        try {
            return "SELECT COUNT(`pyp_pruebascomplementarias`.`id`) AS cantidad"
                    + "	FROM `pyp_pruebascomplementarias`"
                    + "	WHERE `pyp_pruebascomplementarias`.`id_infohisto` = '" + id + "';";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar pruebas complementarias " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actobstetricos(String id, String fcu, String nmuertos, String nvivos, String viven, String muertossem,
            String despuessem, String ultimoprevio, String embarazop, String embarazod, String complicaciones, String fracasomac,
            int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareCall("UPDATE `database`.`pyp_materna`"
                    + " INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_materna_obstetricos` "
                    + "        ON (`pyp_materna_obstetricos`.`id_materna` = `pyp_materna`.`id`)"
                    + "	SET `pyp_materna_obstetricos`.`fcuembarazo` = ?, `pyp_materna_obstetricos`.`nacidosmuertos` = ?,"
                    + "	    `pyp_materna_obstetricos`.`nacidosvivos` = ?, `pyp_materna_obstetricos`.`viven` = ?,"
                    + "	    `pyp_materna_obstetricos`.`muertos1sem` = ?, `pyp_materna_obstetricos`.`despues1sem` = ?,"
                    + "	    `pyp_materna_obstetricos`.`ultimoprevio` = ?, `pyp_materna_obstetricos`.`embarazop` = ?,"
                    + "	    `pyp_materna_obstetricos`.`embarazod` = ?, `pyp_materna_obstetricos`.`complicaciones` = ?,"
                    + "	    `pyp_materna_obstetricos`.`fracasomac` = ?, `pyp_materna_obstetricos`.`userlog` = ?"
                    + "	    WHERE (`pyp_historiac`.`id` = ?);");
            bd.preparedStatement.setString(1, fcu);
            bd.preparedStatement.setString(2, nmuertos);
            bd.preparedStatement.setString(3, nvivos);
            bd.preparedStatement.setString(4, viven);
            bd.preparedStatement.setString(5, muertossem);
            bd.preparedStatement.setString(6, despuessem);
            bd.preparedStatement.setString(7, ultimoprevio);
            bd.preparedStatement.setString(8, embarazop);
            bd.preparedStatement.setString(9, embarazod);
            bd.preparedStatement.setString(10, complicaciones);
            bd.preparedStatement.setString(11, fracasomac);
            bd.preparedStatement.setInt(12, usuario);
            bd.preparedStatement.setString(13, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a016 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a016 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarobtetricos(String id) {
        try {
            return "SELECT"
                    + "     `pyp_materna_obstetricos`.`id`"
                    + "    , `pyp_materna_obstetricos`.`id_materna`"
                    + "    , DATE_FORMAT (`pyp_materna_obstetricos`.`fcuembarazo`, '%d/%m/%Y') AS `fcuembarazo`"
                    + "    , `pyp_materna_obstetricos`.`nacidosmuertos`"
                    + "    , `pyp_materna_obstetricos`.`nacidosvivos`"
                    + "    , `pyp_materna_obstetricos`.`viven`"
                    + "    , `pyp_materna_obstetricos`.`muertos1sem`"
                    + "    , `pyp_materna_obstetricos`.`despues1sem`"
                    + "    , `pyp_materna_obstetricos`.`ultimoprevio`"
                    + "    , `pyp_materna_obstetricos`.`embarazop`"
                    + "    , `pyp_materna_obstetricos`.`embarazod`"
                    + "    , `pyp_materna_obstetricos`.`complicaciones`"
                    + "    , `pyp_materna_obstetricos`.`fracasomac`"
                    + " FROM"
                    + "    `database`.`pyp_materna`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_materna_obstetricos` "
                    + "        ON (`pyp_materna_obstetricos`.`id_materna` = `pyp_materna`.`id`)"
                    + " WHERE (`pyp_historiac`.`id` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar obstetricos" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actgestaante(String id, String vdmenor, String vdmayor, String sullivan, String agshb,
            String toxoplasma, String grupos, String sifilis, String antiprevia, String antiembarazo,
            String antitevigente, String mesd1, String mesd2, String vihcon, String vihsoli, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_materna`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_materna_gestaactual` "
                    + "        ON (`pyp_materna_gestaactual`.`id_materna` = `pyp_materna`.`id`)"
                    + " SET `pyp_materna_gestaactual`.`vdrlmenor` = ?, `pyp_materna_gestaactual`.`vdrlmayor` = ?"
                    + "    , `pyp_materna_gestaactual`.`tsullivan` = ?, `pyp_materna_gestaactual`.`agshb` = ?"
                    + "    , `pyp_materna_gestaactual`.`toxoplasma` = ?, `pyp_materna_gestaactual`.`grupos`=?"
                    + "    , `pyp_materna_gestaactual`.`sifilisfta` = ?, `pyp_materna_gestaactual`.`antiprevia`=?"
                    + "    , `pyp_materna_gestaactual`.`antiembarazo` = ?, `pyp_materna_gestaactual`.`antitevigente`=?"
                    + "    , `pyp_materna_gestaactual`.`mesd1`=?, `pyp_materna_gestaactual`.`mesd2`=?"
                    + "    , `pyp_materna_gestaactual`.`vihconsej`=?, `pyp_materna_gestaactual`.`vihsolicitado`=?,"
                    + "      `pyp_materna_gestaactual`.`userlog`=?"
                    + " WHERE (`pyp_historiac`.`id` =?);");
            bd.preparedStatement.setString(1, vdmenor);
            bd.preparedStatement.setString(2, vdmayor);
            bd.preparedStatement.setString(3, sullivan);
            bd.preparedStatement.setString(4, agshb);
            bd.preparedStatement.setString(5, toxoplasma);
            bd.preparedStatement.setString(6, grupos);
            bd.preparedStatement.setString(7, sifilis);
            bd.preparedStatement.setString(8, antiprevia);
            bd.preparedStatement.setString(9, antiembarazo);
            bd.preparedStatement.setString(10, antitevigente);
            bd.preparedStatement.setString(11, mesd1);
            bd.preparedStatement.setString(12, mesd2);
            bd.preparedStatement.setString(13, vihcon);
            bd.preparedStatement.setString(14, vihsoli);
            bd.preparedStatement.setInt(15, usuario);
            bd.preparedStatement.setString(16, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a017 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a017 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargargesta(String id) {
        try {
            return "SELECT"
                    + "   `pyp_materna_gestaactual`.`id`"
                    + "    , `pyp_materna_gestaactual`.`id_materna`"
                    + "    ,`pyp_materna_gestaactual`.`vdrlmenor`"
                    + "    , `pyp_materna_gestaactual`.`vdrlmayor`"
                    + "    , `pyp_materna_gestaactual`.`tsullivan`"
                    + "    , `pyp_materna_gestaactual`.`agshb`"
                    + "    , `pyp_materna_gestaactual`.`toxoplasma`"
                    + "    , `pyp_materna_gestaactual`.`grupos`"
                    + "    , `pyp_materna_gestaactual`.`sifilisfta`"
                    + "    , `pyp_materna_gestaactual`.`antiprevia`"
                    + "    , `pyp_materna_gestaactual`.`antiembarazo`"
                    + "    , `pyp_materna_gestaactual`.`antitevigente`"
                    + "    , `pyp_materna_gestaactual`.`mesd1`"
                    + "    , `pyp_materna_gestaactual`.`mesd2`"
                    + "    , `pyp_materna_gestaactual`.`vihconsej`"
                    + "    , `pyp_materna_gestaactual`.`vihsolicitado`"
                    + "    , DATE_FORMAT(`pyp_materna_gestaactual`.`fpp`, '%d/%m/%Y') AS `FechaParto`"
                    + "    , `pyp_materna_gestaactual`.`egfum`"
                    + "    , `pyp_materna_gestaactual`.`egeco`"
                    + "    , `pyp_materna_gestaactual`.`eg`"
                    + "    , `pyp_materna_gestaactual`.`alturau`"
                    + "    , `pyp_materna_gestaactual`.`movfetales`"
                    + "    , `pyp_materna_gestaactual`.`fcf`"
                    + "    , `pyp_materna_gestaactual`.`presentacion`"
                    + "    , `pyp_materna_gestaactual`.`fe`"
                    + "    , `pyp_materna_gestaactual`.`folatos`"
                    + "    , `pyp_materna_gestaactual`.`calcio`"
                    + "FROM"
                    + "    `database`.`pyp_materna`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_materna_gestaactual` "
                    + "        ON (`pyp_materna_gestaactual`.`id_materna` = `pyp_materna`.`id`)"
                    + "WHERE (`pyp_historiac`.`id` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar datos gesta actual" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actgestafinal(String id, String fpp, String egfum, String egeco, String eg, String alturau,
            String movfetales, String fcf, String presentacion, String fe, String folatos, String calcio, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareCall("UPDATE `database`.`pyp_materna`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_materna_gestaactual` "
                    + "        ON (`pyp_materna_gestaactual`.`id_materna` = `pyp_materna`.`id`)"
                    + " SET `pyp_materna_gestaactual`.`fpp` = ?, `pyp_materna_gestaactual`.`egfum` = ?"
                    + "    , `pyp_materna_gestaactual`.`egeco` = ?, `pyp_materna_gestaactual`.`eg` = ?"
                    + "    , `pyp_materna_gestaactual`.`alturau` = ?, `pyp_materna_gestaactual`.`movfetales` = ?"
                    + "    , `pyp_materna_gestaactual`.`fcf` = ?, `pyp_materna_gestaactual`.`presentacion` = ?"
                    + "    , `pyp_materna_gestaactual`.`fe` = ?, `pyp_materna_gestaactual`.`folatos` = ?"
                    + "    , `pyp_materna_gestaactual`.`calcio` = ?,`pyp_materna_gestaactual`.`userlog` = ?"
                    + " WHERE (`pyp_historiac`.`id` =?);");
            bd.preparedStatement.setString(1, fpp);
            bd.preparedStatement.setString(2, egfum);
            bd.preparedStatement.setString(3, egeco);
            bd.preparedStatement.setString(4, eg);
            bd.preparedStatement.setString(5, alturau);
            bd.preparedStatement.setString(6, movfetales);
            bd.preparedStatement.setString(7, fcf);
            bd.preparedStatement.setString(8, presentacion);
            bd.preparedStatement.setString(9, fe);
            bd.preparedStatement.setString(10, folatos);
            bd.preparedStatement.setString(11, calcio);
            bd.preparedStatement.setInt(12, usuario);
            bd.preparedStatement.setString(13, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a018 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a018 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void apgarparto(String id, String colorp, String fc, String reflejos, String tonom, String respiracion, String resultado, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("update `database`.`pyp_postparto`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_postparto`.`id_historiac` = `pyp_historiac`.`id`)"
                    + "SET `pyp_postparto`.`colorpiel` = ?, `pyp_postparto`.`frecucardiaca` = ?, `pyp_postparto`.`reflejos` = ?,"
                    + "    `pyp_postparto`.`tonomuscular` = ?, `pyp_postparto`.`respiracion` = ?, `pyp_postparto`.`resultado` = ?,"
                    + "    `pyp_postparto`.`userlog` = ?"
                    + "WHERE (`pyp_historiac`.`id` =?);");
            bd.preparedStatement.setString(1, colorp);
            bd.preparedStatement.setString(2, fc);
            bd.preparedStatement.setString(3, reflejos);
            bd.preparedStatement.setString(4, tonom);
            bd.preparedStatement.setString(5, respiracion);
            bd.preparedStatement.setString(6, resultado);
            bd.preparedStatement.setInt(7, usuario);
            bd.preparedStatement.setString(8, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a019 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a019 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void posparto(String id, String terminacion, String edad, String vacuancion, String agsph, String vih, String vdrl,
            String feto, String partot, String hospi, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("update `database`.`pyp_postparto`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_postparto`.`id_historiac` = `pyp_historiac`.`id`)"
                    + " SET `pyp_postparto`.`terminacionparto` = ?, `pyp_postparto`.`edadgestaparto` = ?, `pyp_postparto`.`vacunaciont` = ?,"
                    + "    `pyp_postparto`.`agsph` = ?, `pyp_postparto`.`vih` = ?, `pyp_postparto`.`vdrl` = ?, `pyp_postparto`.`feto` = ?,"
                    + "    `pyp_postparto`.`partotraumado` = ?, `pyp_postparto`.`hospitaizacion` = ?, `pyp_postparto`.`userlog` = ?"
                    + " WHERE (`pyp_historiac`.`id` =?);");
            bd.preparedStatement.setString(1, terminacion);
            bd.preparedStatement.setString(2, edad);
            bd.preparedStatement.setString(3, vacuancion);
            bd.preparedStatement.setString(4, agsph);
            bd.preparedStatement.setString(5, vih);
            bd.preparedStatement.setString(6, vdrl);
            bd.preparedStatement.setString(7, feto);
            bd.preparedStatement.setString(8, partot);
            bd.preparedStatement.setString(9, hospi);
            bd.preparedStatement.setInt(10, usuario);
            bd.preparedStatement.setString(11, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a020 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a020 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarpostparto(String id) {
        try {
            return "SELECT"
                    + "	`pyp_postparto`.*"
                    + " FROM"
                    + "    `database`.`pyp_postparto`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_postparto`.`id_historiac` = `pyp_historiac`.`id`)"
                    + " WHERE (`pyp_historiac`.`id` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar dato post parto " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void apgarrecien(String id, String colorp, String fc, String reflejos, String tonom, String respiracion, String resultado, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("update `database`.`pyp_recienniacido`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_recienniacido`.`idhistoria` = `pyp_historiac`.`id`)"
                    + " SET `pyp_recienniacido`.`colorpiel` = ?, `pyp_recienniacido`.`frecucardiaca` = ?, `pyp_recienniacido`.`reflejos` = ?,"
                    + "    `pyp_recienniacido`.`tonomuscular` = ?, `pyp_recienniacido`.`respiracion` = ?, `pyp_recienniacido`.`resultado` = ?,"
                    + "    `pyp_recienniacido`.`userlog` = ?"
                    + " WHERE (`pyp_historiac`.`id` =?);");
            bd.preparedStatement.setString(1, colorp);
            bd.preparedStatement.setString(2, fc);
            bd.preparedStatement.setString(3, reflejos);
            bd.preparedStatement.setString(4, tonom);
            bd.preparedStatement.setString(5, respiracion);
            bd.preparedStatement.setString(6, resultado);
            bd.preparedStatement.setInt(7, usuario);
            bd.preparedStatement.setString(8, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a021 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a021 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void actrecien(String id, String incmpatibilidad, String sufrimiento, String icteria, String patologia,
            String partoprolongado, String partotraumatico, String hospitalizacion, String otros, float pesoalnacer,
            float talla, String eg, float tsh, String terminap, String hemoclasificacion, String vdrl, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("update `database`.`pyp_recienniacido`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_recienniacido`.`idhistoria` = `pyp_historiac`.`id`)"
                    + " set `pyp_recienniacido`.`incompatibilidadrh` = ?"
                    + "    , `pyp_recienniacido`.`sufrimientofetal` = ?, `pyp_recienniacido`.`icteria` = ?"
                    + "    , `pyp_recienniacido`.`patologiascpn` = ?, `pyp_recienniacido`.`partoprolongado` = ?"
                    + "    , `pyp_recienniacido`.`partotraumatico` = ?, `pyp_recienniacido`.`hospitalizacion` = ?"
                    + "    , `pyp_recienniacido`.`otros` = ?, `pyp_recienniacido`.`pesoalnacer` = ?"
                    + "    , `pyp_recienniacido`.`tallanacer` = ?, `pyp_recienniacido`.`egparto` = ?"
                    + "    , `pyp_recienniacido`.`tshneonatal` = ?, `pyp_recienniacido`.`terminaparto` = ?"
                    + "    , `pyp_recienniacido`.`hemoclasificacion` = ?, `pyp_recienniacido`.`vdrl` = ?, `pyp_recienniacido`.`userlog` = ?"
                    + " WHERE (`pyp_historiac`.`id` = ?);");
            bd.preparedStatement.setString(1, incmpatibilidad);
            bd.preparedStatement.setString(2, sufrimiento);
            bd.preparedStatement.setString(3, icteria);
            bd.preparedStatement.setString(4, patologia);
            bd.preparedStatement.setString(5, partoprolongado);
            bd.preparedStatement.setString(6, partotraumatico);
            bd.preparedStatement.setString(7, hospitalizacion);
            bd.preparedStatement.setString(8, otros);
            bd.preparedStatement.setFloat(9, pesoalnacer);
            bd.preparedStatement.setFloat(10, talla);
            bd.preparedStatement.setString(11, eg);
            bd.preparedStatement.setFloat(12, tsh);
            bd.preparedStatement.setString(13, terminap);
            bd.preparedStatement.setString(14, hemoclasificacion);
            bd.preparedStatement.setString(15, vdrl);
            bd.preparedStatement.setInt(16, usuario);
            bd.preparedStatement.setString(17, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a022 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a022 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarrecien(String id) {
        try {
            return "SELECT"
                    + "`pyp_recienniacido`.*"
                    + "FROM"
                    + "    `database`.`pyp_recienniacido`"
                    + "    INNER JOIN `database`.`pyp_historiac`"
                    + "        ON (`pyp_recienniacido`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "WHERE (`pyp_historiac`.`id` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar datos recien nacido" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actanticonceptivos(String id, String eleccionifor, String preservativos, String cantidad) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_planificacionf`"
                    + " SET `pyp_planificacionf`.`elecioninfor` = ?, `pyp_planificacionf`.`preservativos` = ?,"
                    + "    `pyp_planificacionf`.`cantidadpre` = ?"
                    + "    WHERE(`pyp_planificacionf`.`idhistoria` = ?)");
            bd.preparedStatement.setString(1, eleccionifor);
            bd.preparedStatement.setString(2, preservativos);
            bd.preparedStatement.setString(3, cantidad);
            bd.preparedStatement.setString(4, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a023 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a023 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargaranticonceptivos(String id) {
        try {
            return "SELECT *"
                    + "FROM `database`.`pyp_planificacionf`"
                    + "WHERE (`pyp_planificacionf`.`idhistoria`='" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar datos de planificacion familiar " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actjoven(String id, String desarrolloa, String desarrollovello, String valoracionv, String fechavv,
            String valoraciono, String fechavo, String controlplaca, String sellantes, String fluor, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_joven`"
                    + " SET `pyp_joven`.`desarrolloa`=?, `pyp_joven`.`desarrollovello`=?, `pyp_joven`.`valoracionv`=?,"
                    + "    `pyp_joven`.`fechavv`=?, `pyp_joven`.`valoraciono`=?, `pyp_joven`.`fechavo`=?,"
                    + "    `pyp_joven`.`controlplaca`=?, `pyp_joven`.`sellantes`=?, `pyp_joven`.`flour`=?,"
                    + "    `pyp_joven`.`userlog`=?"
                    + "    WHERE(`pyp_joven`.`idhistoria`=?)");
            bd.preparedStatement.setString(1, desarrolloa);
            bd.preparedStatement.setString(2, desarrollovello);
            bd.preparedStatement.setString(3, valoracionv);
            bd.preparedStatement.setString(4, fechavv);
            bd.preparedStatement.setString(5, valoraciono);
            bd.preparedStatement.setString(6, fechavo);
            bd.preparedStatement.setString(7, controlplaca);
            bd.preparedStatement.setString(8, sellantes);
            bd.preparedStatement.setString(9, fluor);
            bd.preparedStatement.setInt(10, usuario);
            bd.preparedStatement.setString(11, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a024 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a024 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarjoven(String id) {
        try {
            return "SELECT `pyp_joven`.`id`"
                    + "    , `pyp_joven`.`idhistoria`"
                    + "    , `pyp_joven`.`desarrolloa`"
                    + "    , `pyp_joven`.`desarrollovello`"
                    + "    , `pyp_joven`.`valoracionv`"
                    + "    , DATE_FORMAT(`pyp_joven`.`fechavv`, '%d/%m/%Y') AS fechavv"
                    + "    , `pyp_joven`.`valoraciono`"
                    + "    , DATE_FORMAT(`pyp_joven`.`fechavo`, '%d/%m/%Y') AS fechavo"
                    + "    , `pyp_joven`.`controlplaca`"
                    + "    , `pyp_joven`.`sellantes`"
                    + "    , `pyp_joven`.`flour`"
                    + " FROM `database`.`pyp_joven`"
                    + " WHERE (`pyp_joven`.`idhistoria`='" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar datos joven sano" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void acthta(String id, String hta, String htac, String dm1, String dm1c, String dm2, String dm2c, String dislipidemia,
            String dislipidemiac, String estadio, String riesgo, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("update `database`.`pyp_hta`"
                    + " set `pyp_hta`.`hta`=?, `pyp_hta`.`htac`=?, `pyp_hta`.`dm1`=?, `pyp_hta`.`dm1c`=?,"
                    + "    `pyp_hta`.`dm2`=?, `pyp_hta`.`dm2c`=?, `pyp_hta`.`dislipidemia`=?, `pyp_hta`.`dislipidemiac`=?,"
                    + "    `pyp_hta`.`estadio`=?, `pyp_hta`.`riesgo`=?, `pyp_hta`.`userlog`=?"
                    + "    where(`pyp_hta`.`idhistoria`=?)");
            bd.preparedStatement.setString(1, hta);
            bd.preparedStatement.setString(2, htac);
            bd.preparedStatement.setString(3, dm1);
            bd.preparedStatement.setString(4, dm1c);
            bd.preparedStatement.setString(5, dm2);
            bd.preparedStatement.setString(6, dm2c);
            bd.preparedStatement.setString(7, dislipidemia);
            bd.preparedStatement.setString(8, dislipidemiac);
            bd.preparedStatement.setString(9, estadio);
            bd.preparedStatement.setString(10, riesgo);
            bd.preparedStatement.setInt(11, usuario);
            bd.preparedStatement.setString(12, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a025 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a025 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarhta(String id) {
        try {
            return "SELECT * "
                    + "FROM `database`.`pyp_hta`"
                    + "WHERE(`pyp_hta`.`idhistoria`='" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar hta " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargardm(String id) {
        try {
            return "SELECT * "
                    + "FROM `database`.`pyp_dm`"
                    + "WHERE(`pyp_dm`.`idhistoria`='" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar diabetes " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actvaloracion(String id, String meses, String mg, String mfa, String al, String ps, String total, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_crecimiento_eadmeses`"
                    + " SET `pyp_crecimiento_eadmeses`.`meses`=?, `pyp_crecimiento_eadmeses`.`mg`=?, `pyp_crecimiento_eadmeses`.`mfa`=?, "
                    + " `pyp_crecimiento_eadmeses`.`al`=?, `pyp_crecimiento_eadmeses`.`ps`=?, `pyp_crecimiento_eadmeses`.`total`=?,"
                    + " `pyp_crecimiento_eadmeses`.`userlog`=?"
                    + " WHERE(`pyp_crecimiento_eadmeses`.`idhistoria`=?)");
            bd.preparedStatement.setString(1, meses);
            bd.preparedStatement.setString(2, mg);
            bd.preparedStatement.setString(3, mfa);
            bd.preparedStatement.setString(4, al);
            bd.preparedStatement.setString(5, ps);
            bd.preparedStatement.setString(6, total);
            bd.preparedStatement.setInt(7, usuario);
            bd.preparedStatement.setString(8, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a026 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a026 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarcrecimiento(String id) {
        try {
            return "SELECT *"
                    + "FROM `database`.`pyp_crecimiento`"
                    + "WHERE(`pyp_crecimiento`.`idhistoria`='" + id + "')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar crecimiento" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actcrecimientoapgar(String id, String colorpiel, String frecuenciac, String reflejos, String tonomuscular,
            String respiracion, String resultado, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_crecimiento`"
                    + "SET `pyp_crecimiento`.`colorpiel`=?, `pyp_crecimiento`.`frecucardiaca`=?, `pyp_crecimiento`.`reflejos`=?,"
                    + "    `pyp_crecimiento`.`tonomuscular`=?, `pyp_crecimiento`.`respiracion`=?, `pyp_crecimiento`.`resultado`=?,"
                    + "    `pyp_crecimiento`.`userlog`=?"
                    + "    WHERE(`pyp_crecimiento`.`idhistoria`=?)");
            bd.preparedStatement.setString(1, colorpiel);
            bd.preparedStatement.setString(2, frecuenciac);
            bd.preparedStatement.setString(3, reflejos);
            bd.preparedStatement.setString(4, tonomuscular);
            bd.preparedStatement.setString(5, respiracion);
            bd.preparedStatement.setString(6, resultado);
            bd.preparedStatement.setInt(7, usuario);
            bd.preparedStatement.setString(8, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a027 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a027 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actcrecimiento(String id, String incompatibilidad, String sufrimiento, String icteria, String patologiascpn,
            String partoprolongado, String partotraumatico, String hospitalizacion, String otros, float pesoalnacer, float tallanacer,
            String egparto, float tshneonatal, String terminaparto, String hemoclasificacion, String vdrl, String alimentacion,
            String lugarnacimiento, String embarazodeseado, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_crecimiento`"
                    + " SET `pyp_crecimiento`.`incompatibilidadrh`=?, `pyp_crecimiento`.`sufrimientofetal`=?, `pyp_crecimiento`.`icteria`=?,"
                    + "    `pyp_crecimiento`.`patologiascpn`=?, `pyp_crecimiento`.`partoprolongado`=?, `pyp_crecimiento`.`partotraumatico`=?,"
                    + "    `pyp_crecimiento`.`hospitalizacion`=?, `pyp_crecimiento`.`otros`=?, `pyp_crecimiento`.`pesoalnacer`=?,"
                    + "    `pyp_crecimiento`.`tallanacer`=?, `pyp_crecimiento`.`egparto`=?, `pyp_crecimiento`.`tshneonatal`=?,"
                    + "    `pyp_crecimiento`.`terminaparto`=?, `pyp_crecimiento`.`hemoclasificacion`=?, `pyp_crecimiento`.`vdrl`=?,"
                    + "    `pyp_crecimiento`.`alimentacion`=?, `pyp_crecimiento`.`lugarnacimiento`=?, `pyp_crecimiento`.`embarazodeseado`=?,"
                    + "    `pyp_crecimiento`.`userlog`=?"
                    + "    WHERE(`pyp_crecimiento`.`idhistoria`=?)");
            bd.preparedStatement.setString(1, incompatibilidad);
            bd.preparedStatement.setString(2, sufrimiento);
            bd.preparedStatement.setString(3, icteria);
            bd.preparedStatement.setString(4, patologiascpn);
            bd.preparedStatement.setString(5, partoprolongado);
            bd.preparedStatement.setString(6, partotraumatico);
            bd.preparedStatement.setString(7, hospitalizacion);
            bd.preparedStatement.setString(8, otros);
            bd.preparedStatement.setFloat(9, pesoalnacer);
            bd.preparedStatement.setFloat(10, tallanacer);
            bd.preparedStatement.setString(11, egparto);
            bd.preparedStatement.setFloat(12, tshneonatal);
            bd.preparedStatement.setString(13, terminaparto);
            bd.preparedStatement.setString(14, hemoclasificacion);
            bd.preparedStatement.setString(15, vdrl);
            bd.preparedStatement.setString(16, alimentacion);
            bd.preparedStatement.setString(17, lugarnacimiento);
            bd.preparedStatement.setString(18, embarazodeseado);
            bd.preparedStatement.setInt(19, usuario);
            bd.preparedStatement.setString(20, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a028 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a028 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarante(String idpaciente) {
        try {
            return "SELECT *"
                    + "FROM `database`.`info_ant_personales`"
                    + "WHERE `info_ant_personales`.`id_paciente` = '" + idpaciente + "'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar anteceentes" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String contarantecedente(String idpaciente) {
        try {
            return "SELECT COUNT(*)"
                    + "FROM `database`.`info_ant_personales`"
                    + "WHERE `info_ant_personales`.`id_paciente` = '" + idpaciente + "'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar contar antecedentes" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String contarginecog(String id) {
        try {
            return "SELECT COUNT(*)"
                    + "FROM `database`.`pyp_info_antecedentesg`"
                    + "WHERE `pyp_info_antecedentesg`.`idpaciente` = '" + id + "'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar gineco" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actinfoante(String idpaciente, String alergias, String ingresos, String traumatismos, String tratamientos, String dm,
            String hta, String dislipidemia, String deschdd, String tabaco, String alcochol, String droga, String otrosh, String basal, String familiares) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`info_ant_personales` "
                    + "SET  `info_ant_personales`.`alergias`=?, `info_ant_personales`.`ingresos_previos`=?,"
                    + "	    `info_ant_personales`.`traumatismos`=?, `info_ant_personales`.`tratamientos`=?, `info_ant_personales`.`dm`=?, "
                    + "	    `info_ant_personales`.`hta`=?, `info_ant_personales`.`dislipidemia`=?, `info_ant_personales`.`desc_hdd`=?,"
                    + "	    `info_ant_personales`.`tabaco`=?, `info_ant_personales`.`alcohol`=?, `info_ant_personales`.`droga`=?, "
                    + "	    `info_ant_personales`.`otros_habitos`=?, `info_ant_personales`.`situacion_basal`=?, `info_ant_personales`.`ant_familiares`=?"
                    + "	    WHERE (`info_ant_personales`.`id_paciente`=?);");
            bd.preparedStatement.setString(1, alergias);
            bd.preparedStatement.setString(2, ingresos);
            bd.preparedStatement.setString(3, traumatismos);
            bd.preparedStatement.setString(4, tratamientos);
            bd.preparedStatement.setString(5, dm);
            bd.preparedStatement.setString(6, hta);
            bd.preparedStatement.setString(7, dislipidemia);
            bd.preparedStatement.setString(8, deschdd);
            bd.preparedStatement.setString(9, tabaco);
            bd.preparedStatement.setString(10, alcochol);
            bd.preparedStatement.setString(11, droga);
            bd.preparedStatement.setString(12, otrosh);
            bd.preparedStatement.setString(13, basal);
            bd.preparedStatement.setString(14, familiares);
            bd.preparedStatement.setString(15, idpaciente);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a029 " + e.getMessage(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a029 " + e.getMessage(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void actcontrolplanif(String id, String macante, String satisfaccion, String comportamiento, String trastornos, String molestiasmamas,
            String manchaspiel, String dolorvientre, String expulsion, String edemas, String varices, String mareos, String cefaleas, String flujo,
            String urinarios, String citologia, String fechacito, String riesgoproductivo, String descripcion, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_planificacion_control`"
                    + " SET `pyp_planificacion_control`.`macante`=?, `pyp_planificacion_control`.`satisfaccion`=?, `pyp_planificacion_control`.`comprotamiento`=?,"
                    + "    `pyp_planificacion_control`.`transtornos`=?, `pyp_planificacion_control`.`molestiamamas`=?, `pyp_planificacion_control`.`manchaspiel`=?,"
                    + "    `pyp_planificacion_control`.`dolorvientre`=?, `pyp_planificacion_control`.`expulsion`=?, `pyp_planificacion_control`.`edemas`=?,"
                    + "    `pyp_planificacion_control`.`varices`=?, `pyp_planificacion_control`.`mareos`=?, `pyp_planificacion_control`.`cefaleas`=?,"
                    + "    `pyp_planificacion_control`.`flujo`=?, `pyp_planificacion_control`.`urinarios`=?, `pyp_planificacion_control`.`citologia`=?,"
                    + "    `pyp_planificacion_control`.`fechacito`=?, `pyp_planificacion_control`.`riesgoproductivo`=?, `pyp_planificacion_control`.`descripcion`=?,"
                    + "    `pyp_planificacion_control`.`userlog`=?"
                    + "    WHERE(`pyp_planificacion_control`.`idplanificacion`=?)");
            bd.preparedStatement.setString(1, macante);
            bd.preparedStatement.setString(2, satisfaccion);
            bd.preparedStatement.setString(3, comportamiento);
            bd.preparedStatement.setString(4, trastornos);
            bd.preparedStatement.setString(5, molestiasmamas);
            bd.preparedStatement.setString(6, manchaspiel);
            bd.preparedStatement.setString(7, dolorvientre);
            bd.preparedStatement.setString(8, expulsion);
            bd.preparedStatement.setString(9, edemas);
            bd.preparedStatement.setString(10, varices);
            bd.preparedStatement.setString(11, mareos);
            bd.preparedStatement.setString(12, cefaleas);
            bd.preparedStatement.setString(13, flujo);
            bd.preparedStatement.setString(14, urinarios);
            bd.preparedStatement.setString(15, citologia);
            bd.preparedStatement.setString(16, fechacito);
            bd.preparedStatement.setString(17, riesgoproductivo);
            bd.preparedStatement.setString(18, descripcion);
            bd.preparedStatement.setInt(19, usuario);
            bd.preparedStatement.setString(20, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a030 " + e.getMessage(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a030 " + e.getMessage(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarcontrolplani(String id) {
        try {
            return "SELECT"
                    + "    `pyp_planificacion_control`.`id`"
                    + "    , `pyp_planificacion_control`.`idplanificacion`"
                    + "    , `pyp_planificacion_control`.`macante`"
                    + "    , `pyp_planificacion_control`.`satisfaccion`"
                    + "    , `pyp_planificacion_control`.`comprotamiento`"
                    + "    , `pyp_planificacion_control`.`transtornos`"
                    + "    , `pyp_planificacion_control`.`molestiamamas`"
                    + "    , `pyp_planificacion_control`.`manchaspiel`"
                    + "    , `pyp_planificacion_control`.`dolorvientre`"
                    + "    , `pyp_planificacion_control`.`expulsion`"
                    + "    , `pyp_planificacion_control`.`edemas`"
                    + "    , `pyp_planificacion_control`.`varices`"
                    + "    , `pyp_planificacion_control`.`mareos`"
                    + "    , `pyp_planificacion_control`.`cefaleas`"
                    + "    , `pyp_planificacion_control`.`flujo`"
                    + "    , `pyp_planificacion_control`.`urinarios`"
                    + "    , `pyp_planificacion_control`.`citologia`"
                    + "    , DATE_FORMAT(`pyp_planificacion_control`.`fechacito`, '%d/%m/%Y') AS `fechacito`"
                    + "    , `pyp_planificacion_control`.`riesgoproductivo`"
                    + "    , `pyp_planificacion_control`.`descripcion`"
                    + "FROM"
                    + "    `database`.`pyp_planificacion_control`"
                    + "    INNER JOIN `database`.`pyp_planificacionf` "
                    + "        ON (`pyp_planificacion_control`.`idplanificacion` = `pyp_planificacionf`.`id`)"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_planificacionf`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "WHERE (`pyp_historiac`.`id` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar control planificacion " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void guardadohc(String idhc, String idhis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + " SET `pyp_adm_asist_con`.`estado`=3"
                    + " WHERE `pyp_historiac`.`id` = ? AND `pyp_historiac`.`id_admisionpyp`=? AND `pyp_historiac`.`estado`=0;");
            bd.preparedStatement.setString(1, idhc);
            bd.preparedStatement.setString(2, idhis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void guardadovisual(String idhc, String idhis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "    `database`.`pyp_visual`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_visual`.`idasistencia` = `pyp_adm_asist_con`.`id`)"
                    + " SET `pyp_adm_asist_con`.`estado`=3"
                    + " WHERE `pyp_visual`.`id` = ? AND `pyp_visual`.`idasistencia`=? AND `pyp_visual`.`estado`=0;");
            bd.preparedStatement.setString(1, idhc);
            bd.preparedStatement.setString(2, idhis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cambioestadohc(String idhc, String idhis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + " SET `pyp_adm_asist_con`.`estado`=1"
                    + " WHERE `pyp_historiac`.`id` = ? AND `pyp_historiac`.`id_admisionpyp`=? AND `pyp_historiac`.`estado`=0;");
            bd.preparedStatement.setString(1, idhc);
            bd.preparedStatement.setString(2, idhis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cambioestadovisual(String idhc, String idhis) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE"
                    + "    `database`.`pyp_visual`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_visual`.`idasistencia` = `pyp_adm_asist_con`.`id`)"
                    + " SET `pyp_adm_asist_con`.`estado`=1"
                    + " WHERE `pyp_visual`.`id` = ? AND `pyp_visual`.`idasistencia`=? AND `pyp_visual`.`estado`=0;");
            bd.preparedStatement.setString(1, idhc);
            bd.preparedStatement.setString(2, idhis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a031 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void acthtacontrol(String id, String dieta, String ejercicio, String esecundarios, String tratamiento, String observacion, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_hta_control`"
                    + "SET `pyp_hta_control`.`dieta` = ?, `pyp_hta_control`.`ejercicio` = ?,"
                    + "    `pyp_hta_control`.`esecundarios` = ?, `pyp_hta_control`.`tratamiento` = ?,"
                    + "    `pyp_hta_control`.`observacion` = ?, `pyp_hta_control`.`userlog` = ?"
                    + "    WHERE `pyp_hta_control`.`idhta` = ?;");
            bd.preparedStatement.setString(1, dieta);
            bd.preparedStatement.setString(2, ejercicio);
            bd.preparedStatement.setString(3, esecundarios);
            bd.preparedStatement.setString(4, tratamiento);
            bd.preparedStatement.setString(5, observacion);
            bd.preparedStatement.setInt(6, usuario);
            bd.preparedStatement.setString(7, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a032 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a032 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarhtacontrol(String id) {
        try {
            return "SELECT `pyp_hta_control`.*"
                    + "FROM"
                    + "    `database`.`pyp_hta`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_hta`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_hta_control` "
                    + "        ON (`pyp_hta_control`.`idhta` = `pyp_hta`.`id`)"
                    + "WHERE (`pyp_historiac`.`id` ='" + id + "' AND (`pyp_historiac`.`estado` = '0' OR `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar hta control " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void guardarvisual(String id, String idasis, String ojoderecho, String ojoizquierdo, String ambos, String ojoderecho2,
            String ojoizquierdo2, String ambos2, String observacion, String usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_visual`"
                    + "SET `pyp_visual`.`ojoderecho`=?, `pyp_visual`.`ojoizquierdo`=?,"
                    + "    `pyp_visual`.`ambos`=?, `pyp_visual`.`aojoderecho`=?,"
                    + "    `pyp_visual`.`aojoizquierdo`=?, `pyp_visual`.`aambos`=?,"
                    + "    `pyp_visual`.`observacion`=?, `pyp_visual`.`usuariolog`=?"
                    + "    WHERE (`pyp_visual`.`id`=? AND `pyp_visual`.`idasistencia`=?)");
            bd.preparedStatement.setString(1, ojoderecho);
            bd.preparedStatement.setString(2, ojoizquierdo);
            bd.preparedStatement.setString(3, ambos);
            bd.preparedStatement.setString(4, ojoderecho2);
            bd.preparedStatement.setString(5, ojoizquierdo2);
            bd.preparedStatement.setString(6, ambos2);
            bd.preparedStatement.setString(7, observacion);
            bd.preparedStatement.setString(8, usuario);
            bd.preparedStatement.setString(9, id);
            bd.preparedStatement.setString(10, idasis);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a033 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a033 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarmeses(String id) {
        try {
            return "SELECT *"
                    + "FROM `database`.`pyp_crecimiento_eadmeses`"
                    + "WHERE(`pyp_crecimiento_eadmeses`.`idhistoria` = '" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar crecimiento meses" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargaraños(String id) {
        try {
            return "SELECT *"
                    + "FROM `pyp_crecimiento_eadaños`"
                    + "WHERE(`pyp_crecimiento_eadaños`.`idhistoria` = '" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar crecimiento años" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actvaloracionaños(String id, String meses, String mg, String mfa, String al, String ps, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_crecimiento_eadaños`"
                    + "SET `pyp_crecimiento_eadaños`.`edad`=?, `pyp_crecimiento_eadaños`.`mg`=?, `pyp_crecimiento_eadaños`.`mfa`=?,"
                    + " `pyp_crecimiento_eadaños`.`dl`=?, `pyp_crecimiento_eadaños`.`ps`=?, `pyp_crecimiento_eadaños`.`userlog`=?"
                    + "WHERE(`pyp_crecimiento_eadaños`.`idhistoria`=?)");
            bd.preparedStatement.setString(1, meses);
            bd.preparedStatement.setString(2, mg);
            bd.preparedStatement.setString(3, mfa);
            bd.preparedStatement.setString(4, al);
            bd.preparedStatement.setString(5, ps);
            bd.preparedStatement.setInt(6, usuario);
            bd.preparedStatement.setString(7, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a034 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a034 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarganancia(String id) {
        try {
            return "SELECT"
                    + "    `pyp_explofisica`.`peso`"
                    + "FROM"
                    + "    `database`.`pyp_explofisica`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_explofisica`.`idhistoriac` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_agend` "
                    + "        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "    INNER JOIN `database`.`info_paciente` "
                    + "        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`)"
                    + "WHERE (`info_paciente`.`id` = '" + id + "'"
                    + "    AND `pyp_historiac`.`estado` =1 AND `pyp_adm_agend`.`id_programa` = 9)"
                    + "GROUP BY `pyp_explofisica`.`id` DESC LIMIT 1;";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar ganancia materna" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void controlmaterno(String id, String fecha, String ganancia, String ncontrol, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_contolmaterno`"
                    + "	SET `pyp_contolmaterno`.`fecha` = ?, `pyp_contolmaterno`.`ganancia`=?,"
                    + "	    `pyp_contolmaterno`.`ncontrol`=?, `pyp_contolmaterno`.`userlog`=?"
                    + "	    WHERE(`pyp_contolmaterno`.`idhistoria` = ?);");
            bd.preparedStatement.setString(1, fecha);
            bd.preparedStatement.setString(2, ganancia);
            bd.preparedStatement.setString(3, ncontrol);
            bd.preparedStatement.setInt(4, usuario);
            bd.preparedStatement.setString(5, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a035 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a035 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarcantidadcontrol(String id) {
        try {
            return "SELECT"
                    + "    COUNT(`pyp_adm_asist_con`.`id`)"
                    + "FROM"
                    + "    `database`.`pyp_adm_asist_con`"
                    + "    INNER JOIN `database`.`pyp_adm_agend` "
                    + "        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "WHERE (`pyp_adm_asist_con`.`estado` =2"
                    + "    AND `pyp_adm_agend`.`id_paciente` ='" + id + "'"
                    + "    AND `pyp_adm_agend`.`id_programa` =9);";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar cantidad control" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargargananciam(String id) {
        try {
            return "SELECT *"
                    + "FROM `database`.`pyp_contolmaterno`"
                    + "WHERE (`pyp_contolmaterno`.`idhistoria` ='" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar ganancia m " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actualizarginecoginfo(String id, String fum, String ciclos, String gestas, String partos, String abortos, String cesareas,
            String vaginales, String fup, String menarquia, String edadinicio, String vidasexual, String relacionescon, String parejaestable,
            String usopreservativo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_info_antecedentesg` "
                    + "SET `pyp_info_antecedentesg`.`FUM`=?, `pyp_info_antecedentesg`.`Ciclos`=?, `pyp_info_antecedentesg`.`gestas`=?,"
                    + "	   `pyp_info_antecedentesg`.`partos`=?, `pyp_info_antecedentesg`.`abortos`=?, `pyp_info_antecedentesg`.`cesareas`=?, `pyp_info_antecedentesg`.`vaginales`=?,"
                    + "	   `pyp_info_antecedentesg`.`FUP`=?, `pyp_info_antecedentesg`.`menarquia`=?, `pyp_info_antecedentesg`.`edadinicio`=?, `pyp_info_antecedentesg`.`vidasexualac`=?,"
                    + "	   `pyp_info_antecedentesg`.`relacionescon`=?, `pyp_info_antecedentesg`.`parejaestable`=?, `pyp_info_antecedentesg`.`usopreservativo`=?"
                    + "	WHERE(`pyp_info_antecedentesg`.`idpaciente` =?);");
            bd.preparedStatement.setString(1, fum);
            bd.preparedStatement.setString(2, ciclos);
            bd.preparedStatement.setString(3, gestas);
            bd.preparedStatement.setString(4, partos);
            bd.preparedStatement.setString(5, abortos);
            bd.preparedStatement.setString(6, cesareas);
            bd.preparedStatement.setString(7, vaginales);
            bd.preparedStatement.setString(8, fup);
            bd.preparedStatement.setString(9, menarquia);
            bd.preparedStatement.setString(10, edadinicio);
            bd.preparedStatement.setString(11, vidasexual);
            bd.preparedStatement.setString(12, relacionescon);
            bd.preparedStatement.setString(13, parejaestable);
            bd.preparedStatement.setString(14, usopreservativo);
            bd.preparedStatement.setString(15, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a036 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a036 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdm(String id, String hta, String htac, String dm1, String dm1c, String dm2, String dm2c, String dislipidemia,
            String dislipidemiac, String dieta, String ejercicio, String esecundarios, String tratamiento, String observacion, String glucometria,
            String trat, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_dm`"
                    + "SET `pyp_dm`.`hta` = ?, `pyp_dm`.`htac` = ?, `pyp_dm`.`dm1` = ?,"
                    + "    `pyp_dm`.`dm1c` = ?, `pyp_dm`.`dm2` = ?, `pyp_dm`.`dm2c` = ?,"
                    + "    `pyp_dm`.`dislipidemia` = ?, `pyp_dm`.`dislipidemiac` = ?,"
                    + "    `pyp_dm`.`dieta` = ?, `pyp_dm`.`ejercicio` = ?, `pyp_dm`.`esecundarios` =?,"
                    + "    `pyp_dm`.`glucometria` = ?, `pyp_dm`.`trat` = ?, `pyp_dm`.`tratamiento` =?,"
                    + "    `pyp_dm`.`observacion` = ?, `pyp_dm`.`userlog` = ?"
                    + "    WHERE (`pyp_dm`.`idhistoria` = ?)");
            bd.preparedStatement.setString(1, hta);
            bd.preparedStatement.setString(2, htac);
            bd.preparedStatement.setString(3, dm1);
            bd.preparedStatement.setString(4, dm1c);
            bd.preparedStatement.setString(5, dm2);
            bd.preparedStatement.setString(6, dm2c);
            bd.preparedStatement.setString(7, dislipidemia);
            bd.preparedStatement.setString(8, dislipidemiac);
            bd.preparedStatement.setString(9, dieta);
            bd.preparedStatement.setString(10, ejercicio);
            bd.preparedStatement.setString(11, esecundarios);
            bd.preparedStatement.setString(12, glucometria);
            bd.preparedStatement.setString(13, trat);
            bd.preparedStatement.setString(14, tratamiento);
            bd.preparedStatement.setString(15, observacion);
            bd.preparedStatement.setInt(16, usuario);
            bd.preparedStatement.setString(17, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a025 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a025 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String rel4505mes(String nombreentidad, String fechaini, String fechafin) {
        try {
            return "SELECT"
                    + "                    `pyp_adm_agend`.`id_programa`"
                    + "                    , `pyp_adm_asist_con`.`primera_vez`"
                    + "                    , `info_paciente`.`tipo_doc`"
                    + "                    , `info_paciente`.`num_doc`"
                    + "                    , `info_paciente`.`apellido1`"
                    + "                    , `info_paciente`.`apellido2`"
                    + "                    , `info_paciente`.`nombre1`"
                    + "                    , `info_paciente`.`nombre2`"
                    + "                    ,DATE_FORMAT(`info_paciente`.`fecha_nacimiento`, '%Y-%m-%d') AS fecha"
                    + "                    , `info_paciente`.`genero`"
                    + "                    , `info_paciente`.`raza`"
                    + "                    , `info_paciente`.`etnia`"
                    + "                    , `pyp_adm_agend`.`escolaridad`"
                    + "                    , `pyp_eventose`.`decersionE` AS `gestacion`"
                    + "                    , `static_cie10`.`codigo`"
                    + "                    , `static_cie10_1`.`codigo`"
                    + "                    , `static_cie10_2`.`codigo`"
                    + "                    , `static_cie10_3`.`codigo`"
                    + "                    , `pyp_adm_agend`.`fecha` AS `fechaatencion`"
                    + "                    , `pyp_explofisica`.`peso`"
                    + "                    , `pyp_explofisica`.`talla`"
                    + "                    , `pyp_materna_gestaactual`.`fpp`"
                    + "                    , `pyp_crecimiento`.`egparto`"
                    + "                    , `pyp_antecedentesg`.`metodoactual`"
                    + "                    , `pyp_contolmaterno`.`ncontrol`"
                    + "                    , `pyp_materna_gestaactual`.`fe`"
                    + "                    , `pyp_materna_gestaactual`.`folatos`"
                    + "                    , `pyp_materna_gestaactual`.`calcio`"
                    + "                    , `pyp_recienniacido`.`tshneonatal`"
                    + "                    , `calc_edad`(`info_paciente`.`fecha_nacimiento`) as edada"
                    + "                    ,`pyp_antecedentesg`.`FUP`"
                    + "                    ,`pyp_adm_asist_con`.`fecha` AS `faten`"
                    + "                    ,`pyp_historiac`.`id`"
                    + "                FROM"
                    + "                    `database`.`pyp_adm_asist_con`"
                    + "                    INNER JOIN `database`.`pyp_adm_agend` "
                    + "                        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "                    INNER JOIN `database`.`info_paciente` "
                    + "                        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`)"
                    + "                    INNER JOIN `database`.`info_entidades` "
                    + "                        ON (`info_paciente`.`contratante` = `info_entidades`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_historiac` "
                    + "                        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_eventose` "
                    + "                        ON (`pyp_eventose`.`Idhistoriac` = `pyp_historiac`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_explofisica` "
                    + "                        ON (`pyp_explofisica`.`idhistoriac` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_crecimiento` "
                    + "                        ON (`pyp_crecimiento`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_antecedentesg` "
                    + "                        ON (`pyp_antecedentesg`.`id_historiac` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_contolmaterno` "
                    + "                        ON (`pyp_contolmaterno`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_materna` "
                    + "                        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_materna_gestaactual` "
                    + "                        ON (`pyp_materna_gestaactual`.`id_materna` = `pyp_materna`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_recienniacido` "
                    + "                        ON (`pyp_recienniacido`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` "
                    + "                        ON (`pyp_historiac`.`diagnosticorel1` = `static_cie10`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` AS `static_cie10_1`"
                    + "                        ON (`pyp_historiac`.`diagnosticorel2` = `static_cie10_1`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` AS `static_cie10_2`"
                    + "                        ON (`pyp_historiac`.`diagnosticorel3` = `static_cie10_2`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` AS `static_cie10_3`"
                    + "                        ON (`pyp_historiac`.`diagnosticorel4` = `static_cie10_3`.`id`)"
                    + "WHERE (`info_entidades`.`nombre_entidad` = '" + nombreentidad + "' AND `pyp_adm_asist_con`.`fecha` BETWEEN '" + fechaini + "' AND '" + fechafin + "' AND `pyp_adm_asist_con`.`estado` = 2 AND `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar rel 4505mes " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String rel4505tri(String nombreentidad, String fechaini, String fechafin) {
        try {
            return "SELECT"
                    + "                    `pyp_adm_agend`.`id_programa`"
                    + "                    , `pyp_adm_asist_con`.`primera_vez`"
                    + "                    , `info_paciente`.`tipo_doc`"
                    + "                    , `info_paciente`.`num_doc`"
                    + "                    , `info_paciente`.`apellido1`"
                    + "                    , `info_paciente`.`apellido2`"
                    + "                    , `info_paciente`.`nombre1`"
                    + "                    , `info_paciente`.`nombre2`"
                    + "                    ,DATE_FORMAT(`info_paciente`.`fecha_nacimiento`, '%Y-%m-%d') AS fecha"
                    + "                    , `info_paciente`.`genero`"
                    + "                    , `info_paciente`.`raza`"
                    + "                    , `info_paciente`.`etnia`"
                    + "                    , `pyp_adm_agend`.`escolaridad`"
                    + "                    , `pyp_eventose`.`decersionE` AS `gestacion`"
                    + "                    , `static_cie10`.`codigo`"
                    + "                    , `static_cie10_1`.`codigo`"
                    + "                    , `static_cie10_2`.`codigo`"
                    + "                    , `static_cie10_3`.`codigo`"
                    + "                    , `pyp_adm_agend`.`fecha` AS `fechaatencion`"
                    + "                    , `pyp_explofisica`.`peso`"
                    + "                    , `pyp_explofisica`.`talla`"
                    + "                    , `pyp_materna_gestaactual`.`fpp`"
                    + "                    , `pyp_crecimiento`.`egparto`"
                    + "                    , `pyp_antecedentesg`.`metodoactual`"
                    + "                    , `pyp_contolmaterno`.`ncontrol`"
                    + "                    , `pyp_materna_gestaactual`.`fe`"
                    + "                    , `pyp_materna_gestaactual`.`folatos`"
                    + "                    , `pyp_materna_gestaactual`.`calcio`"
                    + "                    , `pyp_recienniacido`.`tshneonatal`"
                    + "                    , `calc_edad`(`info_paciente`.`fecha_nacimiento`) as edada"
                    + "                    ,`pyp_antecedentesg`.`FUP`"
                    + "                    ,`pyp_adm_asist_con`.`fecha` AS `faten`"
                    + "                    ,`pyp_historiac`.`id`"
                    + "                FROM"
                    + "                    `database`.`pyp_adm_asist_con`"
                    + "                    INNER JOIN `database`.`pyp_adm_agend` "
                    + "                        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "                    INNER JOIN `database`.`info_paciente` "
                    + "                        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`)"
                    + "                    INNER JOIN `database`.`info_entidades` "
                    + "                        ON (`info_paciente`.`contratante` = `info_entidades`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_historiac` "
                    + "                        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_eventose` "
                    + "                        ON (`pyp_eventose`.`Idhistoriac` = `pyp_historiac`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_explofisica` "
                    + "                        ON (`pyp_explofisica`.`idhistoriac` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_crecimiento` "
                    + "                        ON (`pyp_crecimiento`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "                    INNER JOIN `database`.`pyp_antecedentesg` "
                    + "                        ON (`pyp_antecedentesg`.`id_historiac` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_contolmaterno` "
                    + "                        ON (`pyp_contolmaterno`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_materna` "
                    + "                        ON (`pyp_materna`.`id_historia` = `pyp_historiac`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_materna_gestaactual` "
                    + "                        ON (`pyp_materna_gestaactual`.`id_materna` = `pyp_materna`.`id`)"
                    + "                    LEFT JOIN `database`.`pyp_recienniacido` "
                    + "                        ON (`pyp_recienniacido`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` "
                    + "                        ON (`pyp_historiac`.`diagnosticorel1` = `static_cie10`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` AS `static_cie10_1`"
                    + "                        ON (`pyp_historiac`.`diagnosticorel2` = `static_cie10_1`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` AS `static_cie10_2`"
                    + "                        ON (`pyp_historiac`.`diagnosticorel3` = `static_cie10_2`.`id`)"
                    + "                    INNER JOIN `database`.`static_cie10` AS `static_cie10_3`"
                    + "                        ON (`pyp_historiac`.`diagnosticorel4` = `static_cie10_3`.`id`)"
                    + "WHERE (`info_entidades`.`nombre_entidad` = '" + nombreentidad + "' AND `pyp_adm_asist_con`.`fecha` BETWEEN '" + fechaini + "' AND '" + fechafin + "' AND `pyp_adm_asist_con`.`estado` = 2 AND `pyp_historiac`.`estado` = '1');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar rel 4505trimestral" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String cargarparam() {
        try {
            return "SELECT"
                    + "    `config_rel4505`.`id`"
                    + "    , `config_rel4505`.`idparametro`"
                    + "    , `config_parametros`.`parametro`"
                    + "    , `config_parametros`.`nombre`"
                    + "    , `config_rel4505`.`tipo`"
                    + "    , `config_rel4505`.`valor`"
                    + "    , `config_rel4505`.`validacion`"
                    + "FROM"
                    + "    `database`.`config_rel4505`"
                    + "    INNER JOIN `database`.`config_parametros` "
                    + "        ON (`config_rel4505`.`idparametro` = `config_parametros`.`id`)"
                    + "WHERE (`config_rel4505`.`estado` = 1);";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar parametro" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actobservacionp(String id, String observacion) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_procedimiento`"
                    + "SET `pyp_procedimiento`.`observacion` = ?"
                    + "WHERE `pyp_procedimiento`.`id` =?");
            bd.preparedStatement.setString(1, observacion);
            bd.preparedStatement.setString(2, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a026 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a026 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String posologia4505(String id) {
        try {
            return "SELECT"
                    + "    `pyp_posologia`.`id_suministro`"
                    + " FROM"
                    + "    `database`.`pyp_posologia`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_posologia`.`id_historiac` = `pyp_historiac`.`id`)"
                    + " WHERE (`pyp_historiac`.`id` ='" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar posologia 4505" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String procedimiento4505(String id) {
        try {
            return "SELECT"
                    + "    `config_cups`.`codigo`"
                    + "   ,`pyp_procedimiento`.`id`"
                    + " FROM"
                    + "    `database`.`pyp_procedimiento`"
                    + "    INNER JOIN `database`.`pyp_historiac`"
                    + "        ON (`pyp_procedimiento`.`id_historiapyp` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`config_cups` "
                    + "        ON (`pyp_procedimiento`.`id_cups` = `config_cups`.`id`)"
                    + " WHERE (`pyp_historiac`.`id` ='" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar procedimiento 4505 " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actanti4505m(String idh, String idsum) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_anticonceptivosm` "
                    + "SET `pyp_anticonceptivosm`.`estado` = 0"
                    + " WHERE (`pyp_anticonceptivosm`.`idhistoria` = ? AND `pyp_anticonceptivosm`.`idsuministro` = ?)");
            bd.preparedStatement.setString(1, idh);
            bd.preparedStatement.setString(2, idsum);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a027" + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a027" + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actanti4505p(String idh, String idcup) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_anticonceptivosp` "
                    + "SET `pyp_anticonceptivosp`.`estado` = 0"
                    + " WHERE (`pyp_anticonceptivosp`.`idhistoria` = ? AND `pyp_anticonceptivosp`.`idprocedimiento` = ?)");
            bd.preparedStatement.setString(1, idh);
            bd.preparedStatement.setString(2, idcup);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a027" + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a027" + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actexamen(String id, String examen) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_procedimiento`"
                    + "SET `pyp_procedimiento`.`examen` = ?"
                    + "WHERE `pyp_procedimiento`.`id` =?");
            bd.preparedStatement.setString(1, examen);
            bd.preparedStatement.setString(2, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a028 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a028 " + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String conteoexamen(String idp) {
        try {
            return "SELECT"
                    + " COUNT(`pyp_laboratory`.id) AS `Conteo`"
                    + " FROM `database`.`pyp_laboratory`"
                    + " WHERE(`pyp_laboratory`.`idprocedimiento` = '" + idp + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "conteo examen " + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void actrexamen(String idp, String fecha, String resultado, String observacion, int usuario) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_laboratory`"
                    + " SET `pyp_laboratory`.`fecha` = ?, `pyp_laboratory`.`resultado` = ?, `pyp_laboratory`.`observacion` = ?, `pyp_laboratory`.`usuariolog` = ?"
                    + " WHERE (`pyp_laboratory`.`idprocedimiento` = ?);");
            bd.preparedStatement.setString(1, fecha);
            bd.preparedStatement.setString(2, resultado);
            bd.preparedStatement.setString(3, observacion);
            bd.preparedStatement.setInt(4, usuario);
            bd.preparedStatement.setString(5, idp);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a029" + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a029" + e.getMessage().toString(), Actualizar.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargadatoslaboratorio(String id) {
        try {
            return "SELECT *"
                    + "FROM `database`.`pyp_laboratory`"
                    + "WHERE (`pyp_laboratory`.`idprocedimiento`= '" + id + "');";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cargar datos laboratorio" + e.getMessage(), Actualizar.class.getName(), JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
