package Clases;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Cmedicamentos {
    Clases.BDConectar bd = new Clases.BDConectar();
    int i = 0;
    public void getmedicamentos(){
        try {
            bd.ConectarBasedeDatos();
            Object s[]=null;
            bd.resultado = bd.sentencia.executeQuery("SELECT\n" +
"    `sum_suministro`.`id`\n" +
"    , `sum_suministro`.`suministro` AS `Nombre`\n" +
"    , `sum_atc_principioactivo`.`nombre` AS `Principio Activo`\n" +
"    , `sum_suministro`.`concentracion` AS `Concentracion`\n" +
"    , `sum_atc_presentacionfarmaceutica`.`nombre` AS `Presentacion Farmaceutica`\n" +
"    , `sum_suministro`.`unidadmedida` AS `Dosis`\n" +
"    , `sum_suministro`.`viaadministracion` AS `Via de admistracion`\n" +
"    , `sum_suministro`.`Pos`\n" +
"    , `sum_suministro`.`registro_invima` AS `Registro invima`\n" +
"    , `sum_suministro`.`presentacioncomercial` AS `Presentacion Comercial`\n" +
"FROM\n" +
"    `database`.`sum_suministro`\n" +
"    INNER JOIN `database`.`sum_atc_principioactivo` \n" +
"        ON (`sum_suministro`.`id_pricipioactivo` = `sum_atc_principioactivo`.`id`)\n" +
"    INNER JOIN `database`.`sum_atc_presentacionfarmaceutica` \n" +
"        ON (`sum_suministro`.`id_presentacionfarmaceutica` = `sum_atc_presentacionfarmaceutica`.`id`)\n" +
"GROUP BY `Nombre`;");
            if(bd.resultado != null){ 
                while(bd.resultado.next()){
                    Dialogos.HCDiag.Dmedicamentos.modelo.addRow(s);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("id"), i, 0);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Nombre"), i, 1);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Principio Activo"), i, 2);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Concentracion"), i, 3);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Presentacion Farmaceutica"), i, 4);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Dosis"), i, 5);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Via de admistracion"), i, 6);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Pos"), i, 7);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Registro invima"), i, 8);
                    Dialogos.HCDiag.Dmedicamentos.modelo.setValueAt(""+bd.resultado.getString("Presentacion Comercial"), i, 9);
                    i++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
