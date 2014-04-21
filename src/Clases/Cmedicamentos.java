package Clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cmedicamentos {

    Clases.BDConectar bd = new Clases.BDConectar();
    int i = 0;

    public void getmedicamentos(DefaultTableModel modelo) {
        try {
            bd.ConectarBasedeDatos();
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `sum_suministro`.`id`"
                    + "    , `sum_suministro`.`suministro` AS `Nombre`"
                    + "    , `sum_atc_principioactivo`.`nombre` AS `Principio Activo`"
                    + "    , `sum_suministro`.`concentracion` AS `Concentracion`"
                    + "    , `sum_atc_presentacionfarmaceutica`.`nombre` AS `Presentacion Farmaceutica`"
                    + "    , `sum_suministro`.`unidadmedida` AS `Dosis`"
                    + "    , `sum_suministro`.`viaadministracion` AS `Via de admistracion`"
                    + "    , `sum_suministro`.`Pos`"
                    + "    , `sum_suministro`.`registro_invima` AS `Registro invima`"
                    + "    , `sum_suministro`.`presentacioncomercial` AS `Presentacion Comercial`"
                    + "FROM"
                    + "    `database`.`sum_suministro`"
                    + "    INNER JOIN `database`.`sum_atc_principioactivo` "
                    + "        ON (`sum_suministro`.`id_pricipioactivo` = `sum_atc_principioactivo`.`id`)"
                    + "    INNER JOIN `database`.`sum_atc_presentacionfarmaceutica` "
                    + "        ON (`sum_suministro`.`id_presentacionfarmaceutica` = `sum_atc_presentacionfarmaceutica`.`id`)"
                    + "GROUP BY `Nombre`;");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt("" + bd.resultado.getString("id"), i, 0);
                    modelo.setValueAt("" + bd.resultado.getString("Nombre"), i, 1);
                    modelo.setValueAt("" + bd.resultado.getString("Principio Activo"), i, 2);
                    modelo.setValueAt("" + bd.resultado.getString("Concentracion"), i, 3);
                    modelo.setValueAt("" + bd.resultado.getString("Presentacion Farmaceutica"), i, 4);
                    modelo.setValueAt("" + bd.resultado.getString("Dosis"), i, 5);
                    modelo.setValueAt("" + bd.resultado.getString("Via de admistracion"), i, 6);
                    modelo.setValueAt("" + bd.resultado.getString("Pos"), i, 7);
                    modelo.setValueAt("" + bd.resultado.getString("Registro invima"), i, 8);
                    modelo.setValueAt("" + bd.resultado.getString("Presentacion Comercial"), i, 9);
                    i++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void getmedicamentosanti(DefaultTableModel modelo) {
        try {
            bd.ConectarBasedeDatos();
            Object s[] = null;
            bd.resultado = bd.sentencia.executeQuery("SELECT"
                    + "    `sum_suministro`.`id`"
                    + "    , `sum_suministro`.`suministro` AS `Nombre`"
                    + "    , `sum_atc_principioactivo`.`nombre` AS `Principio Activo`"
                    + "    , `sum_suministro`.`concentracion` AS `Concentracion`"
                    + "    , `sum_atc_presentacionfarmaceutica`.`nombre` AS `Presentacion Farmaceutica`"
                    + "    , `sum_suministro`.`unidadmedida` AS `Dosis`"
                    + "    , `sum_suministro`.`viaadministracion` AS `Via de admistracion`"
                    + "    , `sum_suministro`.`Pos`"
                    + "    , `sum_suministro`.`registro_invima` AS `Registro invima`"
                    + "    , `sum_suministro`.`presentacioncomercial` AS `Presentacion Comercial`"
                    + "FROM\n"
                    + "    `database`.`sum_suministro`"
                    + "    INNER JOIN `database`.`sum_atc_principioactivo` "
                    + "        ON (`sum_suministro`.`id_pricipioactivo` = `sum_atc_principioactivo`.`id`)"
                    + "    INNER JOIN `database`.`sum_atc_subgrupoquimico` "
                    + "        ON (`sum_atc_principioactivo`.`id_subgrupoquimico` = `sum_atc_subgrupoquimico`.`id`)"
                    + "    INNER JOIN `database`.`sum_atc_subgrupofarmacologico` "
                    + "        ON (`sum_atc_subgrupoquimico`.`id_subgrupofarmacologico` = `sum_atc_subgrupofarmacologico`.`id`)"
                    + "    INNER JOIN `database`.`sum_atc_grupofarmacologico` "
                    + "        ON (`sum_atc_subgrupofarmacologico`.`id_grupofarmacologico` = `sum_atc_grupofarmacologico`.`id`)"
                    + "    INNER JOIN `database`.`sum_atc_sistemasorganicos` "
                    + "        ON (`sum_atc_grupofarmacologico`.`id_sistemaorganico` = `sum_atc_sistemasorganicos`.`id`)"
                    + "    INNER JOIN `database`.`sum_atc_presentacionfarmaceutica` "
                    + "        ON (`sum_suministro`.`id_presentacionfarmaceutica` = `sum_atc_presentacionfarmaceutica`.`id`)"
                    + "WHERE (`sum_atc_sistemasorganicos`.`id` =5 ) AND (`sum_atc_grupofarmacologico`.`id` =44)"
                    + "GROUP BY `Nombre`;");
            if (bd.resultado != null) {
                while (bd.resultado.next()) {
                    modelo.addRow(s);
                    modelo.setValueAt("" + bd.resultado.getString("id"), i, 0);
                    modelo.setValueAt("" + bd.resultado.getString("Nombre"), i, 1);
                    modelo.setValueAt("" + bd.resultado.getString("Principio Activo"), i, 2);
                    modelo.setValueAt("" + bd.resultado.getString("Concentracion"), i, 3);
                    modelo.setValueAt("" + bd.resultado.getString("Presentacion Farmaceutica"), i, 4);
                    modelo.setValueAt("" + bd.resultado.getString("Dosis"), i, 5);
                    modelo.setValueAt("" + bd.resultado.getString("Via de admistracion"), i, 6);
                    modelo.setValueAt("" + bd.resultado.getString("Pos"), i, 7);
                    modelo.setValueAt("" + bd.resultado.getString("Registro invima"), i, 8);
                    modelo.setValueAt("" + bd.resultado.getString("Presentacion Comercial"), i, 9);
                    i++;
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
