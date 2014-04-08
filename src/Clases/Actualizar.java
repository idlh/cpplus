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
            bd.sentencia.execute("UPDATE `database`.`pyp_eventose`"
                    + " SET `pyp_eventose`.`sepodivorcio` = '" + separacion + "', `pyp_eventose`.`EmbarazoA` = '" + embarazoa + "', `pyp_eventose`.`FracasoE` = '" + fracasoe + "',"
                    + "     `pyp_eventose`.`ConflictoC` = '" + conflictoc + "', `pyp_eventose`.`Salidahijo` = '" + salidah + "', `pyp_eventose`.`DificultadesL` = '" + dificultadesl + "',"
                    + "     `pyp_eventose`.`Muertehijo` = '" + muerteh + "', `pyp_eventose`.`decersionE` = '" + decersione + "', `pyp_eventose`.`otros` = '" + otro + "',"
                    + "     `pyp_eventose`.`totros` = '" + totros + "'"
                    + "WHERE `pyp_eventose`.`Idhistoriac` = '" + id + "'");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_antecedentesg`"
                    + " SET `pyp_antecedentesg`.`FUM` = '" + fum + "', `pyp_antecedentesg`.`Ciclos` = '" + ciclos + "', `pyp_antecedentesg`.`gestas` = '" + gestas + "',"
                    + "    `pyp_antecedentesg`.`partos` = '" + partos + "', `pyp_antecedentesg`.`abortos` = '" + abortos + "', `pyp_antecedentesg`.`cesareas` = '" + cesareas + "',"
                    + "    `pyp_antecedentesg`.`vaginales` = '" + vaginales + "', `pyp_antecedentesg`.`FUP` = '" + fup + "', `pyp_antecedentesg`.`menarquia` = '" + menarquia + "',"
                    + "    `pyp_antecedentesg`.`edadinicio` = '" + edadinicio + "', `pyp_antecedentesg`.`vidasexualac` = '" + vidasexual + "', `pyp_antecedentesg`.`relacionescon` = '" + relacionescon + "',"
                    + "    `pyp_antecedentesg`.`parejaestable` = '" + parejaestable + "', `pyp_antecedentesg`.`usopreservativo` = '" + usopreservativo + "'"
                    + " WHERE `pyp_antecedentesg`.`id_historiac` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_antecedentesg`"
                    + " SET `pyp_antecedentesg`.`macprevio` = '" + macp + "', `pyp_antecedentesg`.`metodoprevio` = '" + metp + "', `pyp_antecedentesg`.`tiempousoprevio` = '" + tp + "',"
                    + "     `pyp_antecedentesg`.`efectosprevios` = '" + ep + "', `pyp_antecedentesg`.`macactual` = '" + maca + "', `pyp_antecedentesg`.`metodoactual` = '" + meta + "',"
                    + "     `pyp_antecedentesg`.`tiempoactual` ='" + ta + "', `pyp_antecedentesg`.`efectosactual` = '" + ea + "'"
                    + " WHERE `pyp_antecedentesg`.`id_historiac` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`alegias` = '" + alerg + "', `pyp_historiac`.`ingresos_previos` = '" + ingprev + "', `pyp_historiac`.`traumatismos` = '" + trau + "',"
                    + "    `pyp_historiac`.`tratamientos` = '" + trat + "', `pyp_historiac`.`dm` ='" + dm + "', `pyp_historiac`.`hta` = '" + hta + "',"
                    + "    `pyp_historiac`.`dislipidemia` = '" + displi + "', `pyp_historiac`.`des_patologicos` = '" + despato + "', `pyp_historiac`.`tabaco` = '" + tabaco + "',"
                    + "    `pyp_historiac`.`alcohol` = '" + alcohol + "', `pyp_historiac`.`droga` = '" + droga + "', `pyp_historiac`.`des_habitos` = '" + deshab + "',"
                    + "    `pyp_historiac`.`situacionbasal` = '" + stub + "', `pyp_historiac`.`ant_familiares` = '" + antf + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`enfermedadactual` = '" + enf + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_explofisica`"
                    + " SET `pyp_explofisica`.`tas` = '" + tas + "', `pyp_explofisica`.`tad` = '" + tad + "', `pyp_explofisica`.`fr`='" + fr + "', `pyp_explofisica`.`fc` = '" + fc + "',"
                    + "    `pyp_explofisica`.`temperatura`= '" + tempe + "', `pyp_explofisica`.`talla` = '" + talla + "', `pyp_explofisica`.`peso` = '" + peso + "',"
                    + "    `pyp_explofisica`.`imc` = '" + imc + "', `pyp_explofisica`.`otro`='" + otro + "', `pyp_explofisica`.`aspectog`='" + aspectog + "', `pyp_explofisica`.`neurologicooc` ='" + neu + "',"
                    + "    `pyp_explofisica`.`cardiovascular` = '" + cardio + "', `pyp_explofisica`.`respiratorio` = '" + resp + "', `pyp_explofisica`.`gastrointestinal` ='" + gastro + "',"
                    + "    `pyp_explofisica`.`genitourinario` = '" + genito + "', `pyp_explofisica`.`hematoinfeccioso`='" + tas + "', `pyp_explofisica`.`endocrinometa` = '" + endoc + "',"
                    + "    `pyp_explofisica`.`osteo`='" + osteo + "'"
                    + "    WHERE `pyp_explofisica`.`idhistoriac` = '" + id + "';");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a007 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a007 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void actpruebasc(String id, String nombre, String ruta, String tipo) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("UPDATE `database`.`pyp_pruebascomplementarias`"
                    + " SET `pyp_pruebascomplementarias`.`nombre` ='" + nombre + "', `pyp_pruebascomplementarias`.`ruta`='" + ruta + "',"
                    + "    `pyp_pruebascomplementarias`.`tipo`='" + tipo + "'"
                    + "    WHERE `pyp_pruebascomplementarias`.`id_infohisto` = '" + id + "';");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "a008 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "a008 " + e.getMessage().toString(), Save.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void acthallasgo(String id, String hallas) {
        try {
            bd.ConectarBasedeDatos();
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + "SET `pyp_historiac`.`hallasgo` = '" + hallas + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = '" + dx + "', `pyp_historiac`.`diagnosticorel1` = '" + dx1 + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = '" + dx + "', `pyp_historiac`.`diagnosticorel2` = '" + dx2 + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = '" + dx + "', `pyp_historiac`.`diagnosticorel3` = '" + dx3 + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`diagnosticos` = '" + dx + "', `pyp_historiac`.`diagnosticorel4` = '" + dx4 + "'"
                    + "    WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`recomendaciones` = '" + reco + "'"
                    + " WHERE `pyp_historiac`.`id` = '" + id + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_posologia`"
                    + " SET `pyp_posologia`.`estado` = 0"
                    + " WHERE `pyp_posologia`.`id_historiac` = '" + idh + "' AND `pyp_posologia`.`id_suministro` = '" + idposo + "' AND `pyp_posologia`.`dosis_n` = '" + dosis + "'");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_procedimiento`"
                    + " SET `pyp_procedimiento`.`estado` = 0"
                    + " WHERE `pyp_procedimiento`.`id_historiapyp` = '" + id + "' AND `pyp_procedimiento`.`id_cups` = '" + idcup + "';");
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
            bd.sentencia.execute("UPDATE `database`.`pyp_historiac`"
                    + " SET `pyp_historiac`.`estado`=1"
                    + " WHERE `pyp_historiac`.`id` = '" + idhc + "' AND `pyp_historiac`.`id_admisionpyp`='" + idhis + "' AND `pyp_historiac`.`estado`=0");
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
}
