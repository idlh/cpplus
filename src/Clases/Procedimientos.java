package Clases;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dialogos.HCDiag.Dprocedimientos;

public class Procedimientos {
     
    Clases.BDConectar bd = new Clases.BDConectar();
    int i = 0;
    public void Mostrar_datosO(){
        try {
            bd.ConectarBasedeDatos();
            i=0;
            Object s[]=null;
            bd.resultado = bd.sentencia.executeQuery("SELECT\n" +
"     `config_cups`.`codigo`\n" +
"    , `config_cups`.`de_subcategoria`\n" +
"    , `static_estructura_cups`.`des_capitulo`\n" +
"FROM\n" +
"    `database`.`config_cups`\n" +
"    INNER JOIN `database`.`static_estructura_cups`\n" +
"       ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)\n" +
"       WHERE(`config_cups`.`estado_urg`<>'0' AND `static_estructura_cups`.`id`>17);");
            if(bd.resultado != null){ 
                while(bd.resultado.next()){
                    modelo.addRow(s);
                    modelo.setValueAt(""+bd.resultado.getString("codigo"), i, 0);
                    modelo.setValueAt(""+bd.resultado.getString("de_subcategoria"), i, 1);
                    modelo.setValueAt(""+bd.resultado.getString("des_capitulo"), i, 2);
                    i++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
     public void Mostrar_datosQ(){
        try {
            bd.ConectarBasedeDatos();
            i=0;
            Object s[]=null;
            bd.resultado = bd.sentencia.executeQuery("SELECT\n" +
"     `config_cups`.`codigo`\n" +
"    , `config_cups`.`de_subcategoria`\n" +
"    , `static_estructura_cups`.`des_capitulo`\n" +
"FROM\n" +
"    `database`.`config_cups`\n" +
"    INNER JOIN `database`.`static_estructura_cups`\n" +
"       ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)\n" +
"       where(`config_cups`.`estado_urg`<>'0' and `static_estructura_cups`.`id`<15);");
            if(bd.resultado != null){ 
                while(bd.resultado.next()){
                    modelo.addRow(s);
                    modelo.setValueAt(""+bd.resultado.getString("codigo"), i, 0);
                    modelo.setValueAt(""+bd.resultado.getString("de_subcategoria"), i, 1);
                    modelo.setValueAt(""+bd.resultado.getString("des_capitulo"), i, 2);
                    i++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
     public void Mostrar_datosI(){
        try {
            bd.ConectarBasedeDatos();
            i=0;
            Object s[]=null;
            bd.resultado = bd.sentencia.executeQuery("SELECT\n" +
"     `config_cups`.`codigo`\n" +
"    , `config_cups`.`de_subcategoria`\n" +
"    , `static_estructura_cups`.`des_capitulo`\n" +
"FROM\n" +
"    `database`.`config_cups`\n" +
"    INNER JOIN `database`.`static_estructura_cups`\n" +
"       ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)\n" +
"       WHERE(`config_cups`.`estado_urg`<>'0' AND `static_estructura_cups`.`id`=15);");
            if(bd.resultado != null){ 
                while(bd.resultado.next()){
                    modelo.addRow(s);
                    modelo.setValueAt(""+bd.resultado.getString("codigo"), i, 0);
                    modelo.setValueAt(""+bd.resultado.getString("de_subcategoria"), i, 1);
                    modelo.setValueAt(""+bd.resultado.getString("des_capitulo"), i, 2);
                    i++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
     public void Mostrar_datosL(){
        try {
            bd.ConectarBasedeDatos();
            i=0;
            Object s[]=null;
            bd.resultado = bd.sentencia.executeQuery("SELECT\n" +
"     `config_cups`.`codigo`\n" +
"    , `config_cups`.`de_subcategoria`\n" +
"    , `static_estructura_cups`.`des_capitulo`\n" +
"FROM\n" +
"    `database`.`config_cups`\n" +
"    INNER JOIN `database`.`static_estructura_cups`\n" +
"       ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)\n" +
"       WHERE(`config_cups`.`estado_urg`<>'0' AND `static_estructura_cups`.`id`=17);");
            if(bd.resultado != null){ 
                while(bd.resultado.next()){
                    modelo.addRow(s);
                    modelo.setValueAt(""+bd.resultado.getString("codigo"), i, 0);
                    modelo.setValueAt(""+bd.resultado.getString("de_subcategoria"), i, 1);
                    modelo.setValueAt(""+bd.resultado.getString("des_capitulo"), i, 2);
                    i++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
     public void Mostrar_datosM(){
        try {
            bd.ConectarBasedeDatos();
            i=0;
            Object s[]=null;
            bd.resultado = bd.sentencia.executeQuery("SELECT\n" +
"     `config_cups`.`codigo`\n" +
"    , `config_cups`.`de_subcategoria`\n" +
"    , `static_estructura_cups`.`des_capitulo`\n" +
"FROM\n" +
"    `database`.`config_cups`\n" +
"    INNER JOIN `database`.`static_estructura_cups`\n" +
"       ON (`config_cups`.`id_estructura_cups` = `static_estructura_cups`.`id`)\n" +
"       WHERE(`config_cups`.`estado_urg`<>'0' AND `static_estructura_cups`.`id`=16);");
            if(bd.resultado != null){ 
                while(bd.resultado.next()){
                    modelo.addRow(s);
                    modelo.setValueAt(""+bd.resultado.getString("codigo"), i, 0);
                    modelo.setValueAt(""+bd.resultado.getString("de_subcategoria"), i, 1);
                    modelo.setValueAt(""+bd.resultado.getString("des_capitulo"), i, 2);
                    i++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
    public static DefaultTableModel modelo;
     public void getModelo(){
         modelo = new DefaultTableModel(
        null, new String [] {"Codigo","Procedimiento", "Categoria"}){
            Class[] types = new Class []{
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false,false,false
            };
            @Override
            public Class getColumnClass(int columnIndex) {
               return types [columnIndex];
            }
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex){
               return canEdit [colIndex];
            }
        };  
        HC.ProcedimientosL.jTable1.setModel(modelo);
    }    
}
