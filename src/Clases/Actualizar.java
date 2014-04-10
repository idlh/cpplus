package Clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Actualizar {

    BDConectar bd = new BDConectar();

    public String Selectidposo(String id) {
        return "SELECT `pyp_posologia`.`id`"
                + " FROM `database`.`pyp_posologia`"
                + " WHERE `pyp_posologia`.`id_historiac` = '" + id + "' AND `pyp_posologia`.`estado`='0'";
    }

    public String Selectidproc(String id) {
        return "SELECT `pyp_procedimiento`.`id`"
                + " FROM `database`.`pyp_procedimiento`"
                + " WHERE `pyp_procedimiento`.`id_historiapyp` = '" + id + "' AND `pyp_procedimiento`.`estado`='0'";
    }

    public void desactivarproc(String id) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("UPDATE `database`.`pyp_procedimiento`"
                    + " SET `pyp_procedimiento`.`estado` = 0"
                    + " WHERE `pyp_procedimiento`.`id` = '" + id + "' AND `pyp_procedimiento`.`estado` = '1';");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a001 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a001 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actueventos(String id, String separacion, String embarazoa, String fracasoe, String conflictoc, String salidah,
            String dificultadesl, String muerteh, String decersione, String otro, String totros) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_eventose`"
                    + " SET `pyp_eventose`.`sepodivorcio` = ?, `pyp_eventose`.`EmbarazoA` = ?, `pyp_eventose`.`FracasoE` = ?,"
                    + "     `pyp_eventose`.`ConflictoC` = ?, `pyp_eventose`.`Salidahijo` = ?, `pyp_eventose`.`DificultadesL` = ?,"
                    + "     `pyp_eventose`.`Muertehijo` = ?, `pyp_eventose`.`decersionE` = ?, `pyp_eventose`.`otros` = ?,"
                    + "     `pyp_eventose`.`totros` = ?"
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
            bd.preparedStatement.setString(11, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a002 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a002 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "a003 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a003 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "a004 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a004 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actualizarantp(String id, String alerg, String ingprev, String trau, String trat, String dm, String hta, String displi,
            String despato, String tabaco, String alcohol, String droga, String deshab, String stub, String antf) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`alegias` = ?, `pyp_historiac`.`ingresos_previos` = ?, `pyp_historiac`.`traumatismos` = ?,"
                    + "    `pyp_historiac`.`tratamientos` = ?, `pyp_historiac`.`dm` =?, `pyp_historiac`.`hta` = ?,"
                    + "    `pyp_historiac`.`dislipidemia` = ?, `pyp_historiac`.`des_patologicos` = ?, `pyp_historiac`.`tabaco` = ?,"
                    + "    `pyp_historiac`.`alcohol` = ?, `pyp_historiac`.`droga` = ?, `pyp_historiac`.`des_habitos` = ?,"
                    + "    `pyp_historiac`.`situacionbasal` = ?, `pyp_historiac`.`ant_familiares` = ?"
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
            bd.preparedStatement.setString(15, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a005 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a005 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "a006 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a006 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actexploracion(String id, int tas, int tad, float fr, int fc, float tempe, int talla, float peso,
            float imc, String otro, String aspectog, String neu, String cardio, String resp, String gastro, String genito,
            String hemato, String endoc, String osteo) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_explofisica`"
                    + " SET `pyp_explofisica`.`tas` = ?, `pyp_explofisica`.`tad` = ?, `pyp_explofisica`.`fr`=?, `pyp_explofisica`.`fc` = ?,"
                    + "    `pyp_explofisica`.`temperatura`= ?, `pyp_explofisica`.`talla` = ?, `pyp_explofisica`.`peso` = ?,"
                    + "    `pyp_explofisica`.`imc` = ?, `pyp_explofisica`.`otro`=?, `pyp_explofisica`.`aspectog`=?, `pyp_explofisica`.`neurologicooc` =?,"
                    + "    `pyp_explofisica`.`cardiovascular` = ?, `pyp_explofisica`.`respiratorio` = ?, `pyp_explofisica`.`gastrointestinal` =?,"
                    + "    `pyp_explofisica`.`genitourinario` = ?, `pyp_explofisica`.`hematoinfeccioso`=?, `pyp_explofisica`.`endocrinometa` = ?,"
                    + "    `pyp_explofisica`.`osteo`=?"
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
            bd.preparedStatement.setString(19, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a007 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a007 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "a009 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a009 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx1(String id, int dx, int dx1) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel1` = ?"
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx1);
            bd.preparedStatement.setString(3, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r1 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r1 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx2(String id, int dx, int dx2) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel2` = ?"
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx2);
            bd.preparedStatement.setString(3, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r2 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r2 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx3(String id, int dx, int dx3) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel3` = ?"
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx3);
            bd.preparedStatement.setString(3, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r3 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r3 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actdx4(String id, int dx, int dx4) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = ?, `pyp_historiac`.`diagnosticorel4` = ?"
                    + "    WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setInt(1, dx);
            bd.preparedStatement.setInt(2, dx4);
            bd.preparedStatement.setString(3, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a010r4 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a010r4 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actrecomendaciones(String id, String reco) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`recomendaciones` = ?"
                    + " WHERE `pyp_historiac`.`id` = ?;");
            bd.preparedStatement.setString(1, reco);
            bd.preparedStatement.setString(2, id);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a011 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a011 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargardatoshc(String id) {
        return "SELECT *"
                + "  FROM `database`.`pyp_historiac`"
                + "  WHERE `pyp_historiac`.`id` = '" + id + "';";
    }

    public String cargarcierel1(String id) {
        return "SELECT"
                + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                + " FROM"
                + "    `database`.`pyp_historiac`"
                + "    INNER JOIN `database`.`static_cie10` "
                + "        ON (`pyp_historiac`.`diagnosticorel1` = `static_cie10`.`id`)"
                + "        WHERE (`pyp_historiac`.`diagnosticorel1` ='" + id + "');";
    }

    public String cargarcierel2(String id) {
        return "SELECT"
                + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                + " FROM"
                + "    `database`.`pyp_historiac`"
                + "    INNER JOIN `database`.`static_cie10` "
                + "        ON (`pyp_historiac`.`diagnosticorel2` = `static_cie10`.`id`)"
                + "        WHERE (`pyp_historiac`.`diagnosticorel2` ='" + id + "');";
    }

    public String cargarcierel3(String id) {
        return "SELECT"
                + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                + " FROM"
                + "    `database`.`pyp_historiac`"
                + "    INNER JOIN `database`.`static_cie10` "
                + "        ON (`pyp_historiac`.`diagnosticorel3` = `static_cie10`.`id`)"
                + "        WHERE (`pyp_historiac`.`diagnosticorel3` ='" + id + "');";
    }

    public String cargarcierel4(String id) {
        return "SELECT"
                + "    CONCAT(`static_cie10`.`codigo`,' - ', `static_cie10`.`descripcion`) AS dx1"
                + " FROM"
                + "    `database`.`pyp_historiac`"
                + "    INNER JOIN `database`.`static_cie10` "
                + "        ON (`pyp_historiac`.`diagnosticorel4` = `static_cie10`.`id`)"
                + "        WHERE (`pyp_historiac`.`diagnosticorel4` ='" + id + "');";
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
            JOptionPane.showMessageDialog(null, "a012 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a012 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargareventose(String id) {
        return "SELECT *"
                + " FROM `database`.`pyp_eventose`"
                + " WHERE `pyp_eventose`.`Idhistoriac` = '" + id + "'";
    }

    public void actprocedimiento(String id, String idcup) {
        try {
            bd.ConectarBasedeDatos();
            bd.preparedStatement = bd.getConnection().prepareStatement("UPDATE `database`.`pyp_procedimiento`"
                    + " SET `pyp_procedimiento`.`estado` = 0"
                    + " WHERE `pyp_procedimiento`.`id_historiapyp` = ? AND `pyp_procedimiento`.`id_cups` = ?;");
            bd.preparedStatement.setString(1, id);
            bd.preparedStatement.setString(2, idcup);
            bd.preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a013 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a013 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "a014 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a014 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String cargarantecedentesg(String id) {
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
    }

    public String cargarexploracion(String id) {
        return "SELECT *"
                + "  FROM"
                + "       `database`.`pyp_explofisica`"
                + "  WHERE"
                + "       `pyp_explofisica`.`idhistoriac` = '" + id + "'";
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
            JOptionPane.showMessageDialog(null, "a015 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a015 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public String cargarpruebas(String id) {
        return "SELECT COUNT(`pyp_pruebascomplementarias`.`id`) AS cantidad\n"
                + "	FROM `pyp_pruebascomplementarias`\n"
                + "	WHERE `pyp_pruebascomplementarias`.`id_infohisto` = '" + id + "';";
    }
}
