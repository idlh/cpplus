/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    SimpleDateFormat yyyy_MMdd = new SimpleDateFormat("yyyy-MM-dd");
    public String get_Fecha_yyyMMdd(JDateChooser jd){ 
        if (jd.getDate()!=null){
            return yyyy_MMdd.format(jd.getDate());
        }else{
            return null;
       }
    }
   public int getInteger(String valor){
        int integer = Integer.parseInt(valor);
        return integer;
    } 
  public String getFecha_Jcalendar(JCalendar calendario){
      Date date = calendario.getDate(); 
     SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd"); 
     return format2.format(date);
  }  
  public java.util.Date stringToDate(String fecha){ 
    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd"); 
    Date fechaEnviar=null; 
    try { 
    fechaEnviar = formatoDelTexto.parse(fecha); 
    return fechaEnviar; 
    } 
    catch (ParseException ex) { 
    ex.printStackTrace(); 
    return null; 
    } 
    }
  public Date getHora(String Hora) throws ParseException{
      Date f;
      SimpleDateFormat format = new SimpleDateFormat("HH:mm");
      f=format.parse(Hora);
      return f;
    }
  public String Formatear_Fecha_object(Date d){
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoDeFecha.format(d);
    }
  public String Formatear_Hora(Date d){
    SimpleDateFormat formatoDeFecha = new SimpleDateFormat("HH:mm");
    return formatoDeFecha.format(d);
    }
  public java.util.Date StringToDate(String fecha){ 
   SimpleDateFormat formatoDelTextoo = new SimpleDateFormat("yyyy-MM-dd"); 
   Date fechaEnviar=null; 
   try { 
   fechaEnviar = formatoDelTextoo.parse(fecha); 
   return fechaEnviar; 
   } 
   catch (ParseException ex) { 
   ex.printStackTrace(); 
   return null; 
  } 
 }  
  
  
  /**
   * Funcion para ocultar columnas
   * @param tbl JTable
   * @param columna vector que enumera las columnas de la JTable
   */    
  public static void setOcultarColumnas(JTable tbl, int columna[]){
    for(int i = 0;i<columna.length;i++){
        tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
        tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
        tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
        tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
    }
  }
  
    /**
     * Funcion para darle tamaños a columnas
     * @param tbl JTable
     * @param columna vector que enumera las columnas de la JTable
     * @param sizeColumn vector que asigna size respectivamente a columna
     */
    public static void setSizeColumnas(JTable tbl,int columna[], int sizeColumn[]){
        for(int i=0;i<columna.length;i++){
            tbl.getColumnModel().getColumn(columna[i]).setMinWidth(sizeColumn[i]);
            tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(sizeColumn[i]);
        }
    }
  
}
