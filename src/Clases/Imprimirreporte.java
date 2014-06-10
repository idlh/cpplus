package Clases;

import com.itextpdf.text.pdf.PdfReader;
import com.mysql.jdbc.Connection;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Camilo
 */
public class Imprimirreporte {

    private String idhc, nombrereport, codigo, servicio, version;
    private Connection conexion;
    public File tempfile;

    public String getIdhc() {
        return idhc;
    }

    public void setIdhc(String idhc) {
        this.idhc = idhc;
    }

    public String getNombrereport() {
        return nombrereport;
    }

    public void setNombrereport(String nombrereport) {
        this.nombrereport = nombrereport;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

//    public PdfReader Imprimirhistoria() {
//        try {
//            Map parametro = new HashMap();
//            parametro.put("idhistoria", getIdhc());
//            parametro.put("nombrereporte", getNombrereport());
//            parametro.put("servicio", getServicio());
//            parametro.put("codigo", getCodigo());
//            parametro.put("version", getVersion());
//            JasperPrint informe = JasperFillManager.fillReport(System.getProperty("user.dir")+"/Reportes/Epicrisis.jasper", parametro, getConexion());
//        } catch (Exception e) {
//            return null;
//        }
//    }
}
