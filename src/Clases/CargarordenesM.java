package Clases;

import Dialogos.HCDiag.Dprocedimientos;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
                    + "    AND `static_estructura_cups`.`id` ='" + idestructura + "' AND `pyp_procedimiento`.`estado` = 2 AND `pyp_procedimiento`.`tipo` = 0);");
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
                    + "    AND `static_estructura_cups`.`id`<'" + idestructura + "' AND `pyp_procedimiento`.`estado` = 2 AND `pyp_procedimiento`.`tipo` = 0);");
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
                    + "    AND `static_estructura_cups`.`id`>'" + idestructura + "' AND `pyp_procedimiento`.`estado` = 2 AND `pyp_procedimiento`.`tipo` = 0);");
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
                    + "    AND `pyp_posologia`.`estado` =2 AND `pyp_posologia`.`tipo` = 0);");
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

    public void cargartablapruebas(DefaultTableModel modelo, String id) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/Delete16x16.png"));
            ImageIcon icon2 = new javax.swing.ImageIcon(getClass().getResource("/Recursos/download.png"));
            bd.resultado = bd.sentencia.executeQuery("SELECT "
                    + "     `pyp_pruebascomplementarias`.`nombre`"
                    + "    , `pyp_pruebascomplementarias`.`ruta`"
                    + "    , `pyp_pruebascomplementarias`.`tipo`"
                    + "    , `pyp_pruebascomplementarias`.`estado`"
                    + "	FROM `database`.`pyp_pruebascomplementarias`"
                    + "	WHERE `pyp_pruebascomplementarias`.`id_infohisto`='" + id + "' AND `pyp_pruebascomplementarias`.`estado` = 1;");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(new JLabel(icon), c, 0);
                    modelo.setValueAt(new JLabel(icon2), c, 1);
                    modelo.setValueAt(bd.resultado.getString("nombre"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("ruta"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("tipo"), c, 4);
                    modelo.setValueAt(bd.resultado.getString("ruta"), c, 5);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 6);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab004 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab004 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cargartablamedianti(DefaultTableModel modelo, String id) {
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
                    + "    AND `pyp_posologia`.`estado` = 2 AND `pyp_posologia`.`tipo` = 1);");
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
            JOptionPane.showMessageDialog(null, "tab004 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab004 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargartablaanti(DefaultTableModel modelo, String id) {
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
                    + "    AND `pyp_procedimiento`.`tipo`= 1 AND `pyp_procedimiento`.`estado` = 2);");
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
            JOptionPane.showMessageDialog(null, "tab005 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab005 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargaranteparaclinico(DefaultTableModel modelo, String idpaciente) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `pyp_procedimiento`.`id_cups`"
                    + "    , `config_cups`.`codigo`"
                    + "    , `config_cups`.`de_subcategoria`"
                    + "    , `static_estructura_cups`.`des_capitulo`"
                    + "    , `pyp_procedimiento`.`estado`"
                    + "FROM"
                    + "    `database`.`pyp_procedimiento`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_procedimiento`.`id_historiapyp` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_agend` "
                    + "        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "    INNER JOIN `database`.`info_paciente` "
                    + "        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`)"
                    + "    INNER JOIN `database`.`config_cups` "
                    + "        ON (`pyp_procedimiento`.`id_cups` = `config_cups`.`id`)"
                    + "    INNER JOIN `database`.`static_estructura_cups` "
                    + "        ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)"
                    + "WHERE (`pyp_adm_agend`.`id_paciente` ='" + idpaciente + "'"
                    + "    AND `pyp_procedimiento`.`estado` =2"
                    + "    AND `pyp_historiac`.`estado` =1);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id_cups"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("codigo"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("de_subcategoria"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("des_capitulo"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 4);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab006 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab006 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargarantemedicamento(DefaultTableModel modelo, String idpaciente) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `pyp_posologia`.`id_suministro`"
                    + "    , `sum_suministro`.`suministro`"
                    + "FROM"
                    + "    `database`.`pyp_historiac`"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_agend` "
                    + "        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "    INNER JOIN `database`.`info_paciente` "
                    + "        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`)"
                    + "    INNER JOIN `database`.`pyp_posologia` "
                    + "        ON (`pyp_posologia`.`id_historiac` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`sum_suministro` "
                    + "        ON (`pyp_posologia`.`id_suministro` = `sum_suministro`.`id`)"
                    + "WHERE (`pyp_adm_agend`.`id_paciente` = '" + idpaciente + "'"
                    + "    AND `pyp_historiac`.`estado` =1"
                    + "    AND `pyp_posologia`.`estado` =2);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id_suministro"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("suministro"), c, 1);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab007 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab007 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargarcontrolp(DefaultTableModel modelo, String id) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    DATE_FORMAT(`pyp_contolmaterno`.`fecha`, '%d/%m/%Y') AS `fecha`"
                    + "    , `pyp_explofisica`.`peso`"
                    + "    , `pyp_explofisica`.`imc`"
                    + "    , `pyp_contolmaterno`.`ganancia`"
                    + "    , `pyp_contolmaterno`.`ncontrol` AS `control`"
                    + "FROM"
                    + "    `database`.`pyp_explofisica`"
                    + "    INNER JOIN `database`.`pyp_historiac` "
                    + "        ON (`pyp_explofisica`.`idhistoriac` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_contolmaterno` "
                    + "        ON (`pyp_contolmaterno`.`idhistoria` = `pyp_historiac`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_asist_con` "
                    + "        ON (`pyp_historiac`.`id_admisionpyp` = `pyp_adm_asist_con`.`id`)"
                    + "    INNER JOIN `database`.`pyp_adm_agend` "
                    + "        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`)"
                    + "    INNER JOIN `database`.`info_paciente` "
                    + "        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`)"
                    + "WHERE (`info_paciente`.`id` =  '" + id + "' AND `pyp_historiac`.`estado` =1);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("fecha"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("peso"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("imc"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("ganancia"), c, 3);
                    modelo.setValueAt(bd.resultado.getString("control"), c, 4);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab008 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab008 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargarhistorias(DefaultTableModel model, Integer idprograma) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT "
                    + "    `info_paciente`.`tipo_doc` "
                    + "    , `info_paciente`.`num_doc` "
                    + "    , CONCAT(`info_paciente`.`nombre1`,' ', `info_paciente`.`apellido1`)AS nombre "
                    + "    , DATE_FORMAT(CONCAT(`pyp_adm_asist_con`.`fecha`,' ', `pyp_adm_asist_con`.`hora`), '%d/%m/%Y %H:%i') AS Fecha "
                    + "    ,`pyp_adm_asist_con`.`id`"
                    + "FROM "
                    + "    `database`.`pyp_adm_asist_con` "
                    + "    INNER JOIN `database`.`pyp_adm_agend` "
                    + "        ON (`pyp_adm_asist_con`.`id_agend` = `pyp_adm_agend`.`id`) "
                    + "    INNER JOIN `database`.`info_paciente` "
                    + "        ON (`pyp_adm_agend`.`id_paciente` = `info_paciente`.`id`) "
                    + "WHERE (`pyp_adm_agend`.`id_programa` ='" + idprograma + "'"
                    + "    AND `pyp_adm_asist_con`.`estado` =2);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    model.addRow(s);
                    model.setValueAt(bd.resultado.getString("id"), c, 0);
                    model.setValueAt(bd.resultado.getString("tipo_doc"), c, 1);
                    model.setValueAt(bd.resultado.getString("num_doc"), c, 2);
                    model.setValueAt(bd.resultado.getString("nombre"), c, 3);
                    model.setValueAt(bd.resultado.getString("Fecha"), c, 4);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab009 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab009 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargartablaconfig(DefaultTableModel modelo) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            String tipo = null;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `config_rel4505`.`id`"
                    + "    , `config_rel4505`.`idparametro`"
                    + "    , `config_parametros`.`parametro`"
                    + "    , `config_parametros`.`nombre`"
                    + "    , `config_rel4505`.`tipo`"
                    + "    , `config_rel4505`.`valor`"
                    + "FROM"
                    + "    `database`.`config_rel4505`"
                    + "    INNER JOIN `database`.`config_parametros` "
                    + "        ON (`config_rel4505`.`idparametro` = `config_parametros`.`id`)"
                    + "WHERE (`config_rel4505`.`estado` = 1);");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("idparametro"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("parametro"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("nombre"), c, 3);
                    if (bd.resultado.getString("tipo").equals("0")) {
                        tipo = "DIAGNOSTICO";
                    } else {
                        if (bd.resultado.getString("tipo").equals("1")) {
                            tipo = "MEDICAMENTO";
                        } else {
                            if (bd.resultado.getString("tipo").equals("2")) {
                                tipo = "PROCEDIMIENTO";
                            } else {
                                if (bd.resultado.getString("tipo").equals("3")) {
                                    tipo = "DATO PERSONAL";
                                } else {
                                    if (bd.resultado.getString("tipo").equals("4")) {
                                        tipo = "OTRO";
                                    } else {
                                        tipo = bd.resultado.getString("tipo");
                                    }
                                }
                            }
                        }
                    }
                    modelo.setValueAt(tipo, c, 4);
                    modelo.setValueAt(bd.resultado.getString("valor"), c, 5);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab010 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab010 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }

    public void cargartablaparametros(DefaultTableModel modelo) {
        try {
            bd.ConectarBasedeDatos();
            c = 0;
            String tipo = null;
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `id`"
                    + "    , `parametro`"
                    + "    , `nombre`"
                    + "    , `estado`"
                    + "FROM"
                    + "    `database`.`config_parametros`;");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt(bd.resultado.getString("id"), c, 0);
                    modelo.setValueAt(bd.resultado.getString("parametro"), c, 1);
                    modelo.setValueAt(bd.resultado.getString("nombre"), c, 2);
                    modelo.setValueAt(bd.resultado.getString("estado"), c, 3);
                    c++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "tab011 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "tab011 " + e.getMessage().toString(), CargarordenesM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            bd.DesconectarBasedeDatos();
        }
    }
}
