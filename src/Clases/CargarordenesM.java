package Clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camilo
 */
public class CargarordenesM {

    BDConectar bd = new BDConectar();
    int c = 0;

    public void cargartabla(DefaultTableModel modelo, String id, String idestructura) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `pyp_procedimiento`.`id_cups` AS `id`"
                    + "    , `config_cups`.`codigo`"
                    + "    , `config_cups`.`de_subcategoria` AS `procedimiento`"
                    + "    , `static_estructura_cups`.`des_capitulo` AS `categoria`"
                    + "    , `pyp_procedimiento`.`estado`"
                    + " FROM"
                    + "    `database`.`pyp_procedimiento`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_procedimiento`.`id_historiapyp` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`config_cups` "
                    + "        ON (`pyp_procedimiento`.`id_cups` = `config_cups`.`id`)"
                    + "    INNER JOIN `database`.`static_estructura_cups` "
                    + "        ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)"
                    + " WHERE (`pyp_procedimiento`.`id_historiapyp` = '" + id + "'"
                    + "    AND `static_estructura_cups`.`id` ='" + idestructura + "' AND `pyp_procedimiento`.`estado` = 2);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("codigo"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("procedimiento"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("categoria"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 4);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab000 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab000 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargartablaquirur(DefaultTableModel modelo, String id, String idestructura) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `pyp_procedimiento`.`id_cups` AS `id`"
                    + "    , `config_cups`.`codigo`"
                    + "    , `config_cups`.`de_subcategoria` AS `procedimiento`"
                    + "    , `static_estructura_cups`.`des_capitulo` AS `categoria`"
                    + "    , `pyp_procedimiento`.`estado`"
                    + " FROM"
                    + "    `database`.`pyp_procedimiento`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_procedimiento`.`id_historiapyp` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`config_cups` "
                    + "        ON (`pyp_procedimiento`.`id_cups` = `config_cups`.`id`)"
                    + "    INNER JOIN `database`.`static_estructura_cups` "
                    + "        ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)"
                    + " WHERE (`pyp_procedimiento`.`id_historiapyp` = '" + id + "'"
                    + "    AND `static_estructura_cups`.`id`<'" + idestructura + "' AND `pyp_procedimiento`.`estado` = 2);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("codigo"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("procedimiento"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("categoria"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 4);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab001 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab001 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargartablaotros(DefaultTableModel modelo, String id, String idestructura) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `pyp_procedimiento`.`id_cups` AS `id`"
                    + "    , `config_cups`.`codigo`"
                    + "    , `config_cups`.`de_subcategoria` AS `procedimiento`"
                    + "    , `static_estructura_cups`.`des_capitulo` AS `categoria`"
                    + "    , `pyp_procedimiento`.`estado`"
                    + " FROM"
                    + "    `database`.`pyp_procedimiento`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_procedimiento`.`id_historiapyp` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`config_cups` "
                    + "        ON (`pyp_procedimiento`.`id_cups` = `config_cups`.`id`)"
                    + "    INNER JOIN `database`.`static_estructura_cups` "
                    + "        ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)"
                    + " WHERE (`pyp_procedimiento`.`id_historiapyp` = '" + id + "'"
                    + "    AND `static_estructura_cups`.`id`>'" + idestructura + "' AND `pyp_procedimiento`.`estado` = 2);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("codigo"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("procedimiento"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("categoria"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 4);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab002 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab002 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargartablamedi(DefaultTableModel modelo, String id) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `pyp_posologia`.`id_suministro`"
                    + "    , `sum_suministro`.`suministro`"
                    + "    , `pyp_posologia`.`dosis_n`"
                    + "    , `pyp_posologia`.`dosis_u`"
                    + "    , `pyp_posologia`.`via`"
                    + "    , `pyp_posologia`.`administracion`"
                    + "    , `pyp_posologia`.`cantidad`"
                    + "    , `pyp_posologia`.`estado`"
                    + " FROM"
                    + "    `database`.`pyp_posologia`"
                    + "    INNER JOIN `database`.`sum_suministro` "
                    + "        ON (`pyp_posologia`.`id_suministro` = `sum_suministro`.`id`)"
                    + " WHERE (`pyp_posologia`.`id_historiac` ='" + id + "'"
                    + "    AND `pyp_posologia`.`estado` =2);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id_suministro"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("suministro"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("dosis_n"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("dosis_u"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("via"), c, 4);
                    modelo.setValueAt(bd.resultado.getString("administracion"), c, 5);
                    modelo.setValueAt(bd.resultado.getString("cantidad"), c, 6);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 7);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab003 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab003 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
}
