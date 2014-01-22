/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

/**
 *
 * @author IdlhDeveloper
 */
public class Funciones_AD {
    
      public void ocultarColumnas(JTable tbl, int columna[]){
       for(int i = 0;i<columna.length;i++){
       tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
       tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
       tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
       tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
       }
     }
     public int ConvertirObjectToInt(Object Obj) {  
     int NumInt = Integer.parseInt(ConvertirObjectToString(Obj));
     return NumInt;
    }   
    public String ConvertirObjectToString(Object Obj) {
     String Str="";
     if(Obj!=null){
     Str = Obj.toString();
     }
     return Str;
    } 
    SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public String getFecha(JDateChooser jd){ 
        if (jd.getDate()!=null){
            return yyyyMMdd.format(jd.getDate());
        }else{
            return null;
       }
    }
    
    
    
}
