package Clases;

import com.itextpdf.text.pdf.PdfReader;
import java.sql.Connection;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

/**
 *
 * @author Camilo
 */
public class Imprimirreporte {

    private String idhc, nombrereport, codigo, servicio, version, nombrereceta;
    private Connection conexion;
    public File tempFile, tempFiler;

    public String getNombrereceta() {
        return nombrereceta;
    }

    public void setNombrereceta(String nombrereceta) {
        this.nombrereceta = nombrereceta;
    }

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

    public PdfReader Imprimirhistoria() {
        try {
            Map parametro = new HashMap();
            JasperPrint informe;
            parametro.put("idhistoria", getIdhc());
            parametro.put("nombrereporte", getNombrereport());
            parametro.put("servicio", getServicio());
            parametro.put("codigo", getCodigo());
            parametro.put("version", getVersion());
            if (modulo_pyp.Modulo_PyP.d.est.equals("1")) {
                if (modulo_pyp.Modulo_PyP.d.listPacientes.idprograma != 4) {
                    informe = JasperFillManager.fillReport(System.getProperty("user.dir") + "/src/Reporte_pyp/historia_pyp.jasper", parametro, getConexion());
                } else {
                    informe = JasperFillManager.fillReport(System.getProperty("user.dir") + "/src/Reporte_pyp/visual.jasper", parametro, getConexion());
                }
            }else{
                if (modulo_pyp.Modulo_PyP.d.panelc.historias.idprograma != 4) {
                    informe = JasperFillManager.fillReport(System.getProperty("user.dir") + "/src/Reporte_pyp/historia_pyp.jasper", parametro, getConexion());
                } else {
                    informe = JasperFillManager.fillReport(System.getProperty("user.dir") + "/src/Reporte_pyp/visual.jasper", parametro, getConexion());
                }
            }
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, informe);
            tempFile = File.createTempFile("Historia", ".pdf");
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, tempFile);
            exporter.exportReport();
            return new PdfReader(tempFile.getAbsolutePath());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error General Lanzando Reporte Descripcion: Pparameter001406-1 " + e.getMessage());
            return null;
        }
    }

    public PdfReader Imprimirrecetario() {
        try {
            Map parametro = new HashMap();
            JasperPrint informe;
            parametro.put("idhistoria", getIdhc());
            parametro.put("nombrereporte", getNombrereceta());
            parametro.put("servicio", getServicio());
            parametro.put("codigo", getCodigo());
            parametro.put("version", getVersion());
            informe = JasperFillManager.fillReport(System.getProperty("user.dir") + "/src/Reporte_pyp/recetario.jasper", parametro, getConexion());
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, informe);
            tempFiler = File.createTempFile("Recetario", ".pdf");
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, tempFile);
            exporter.exportReport();
            return new PdfReader(tempFile.getAbsolutePath());
        } catch (Exception e) {
            return null;
        }
    }
}
