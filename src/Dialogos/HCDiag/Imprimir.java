package Dialogos.HCDiag;

import Clases.BDConectar;
import Clases.Funciones_AD;
import Clases.Imprimirreporte;
import com.itextpdf.text.pdf.PdfCopyFields;
import com.itextpdf.text.pdf.PdfReader;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import Clases.Save;
import net.sf.jasperreports.engine.util.FileBufferedOutputStream;

/**
 *
 * @author Camilo
 */
public class Imprimir extends javax.swing.JDialog {

    Imprimirreporte imp = new Imprimirreporte();
    Funciones_AD Funciones = new Funciones_AD();
    String id;
    Save sav = new Save();

    /**
     * Creates new form Imprimir
     */
    public Imprimir(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jLabel2.setText("<html>\n"
                + "<div style=\"width:250;\">" + "  A continuacion se imprimira la historia clinica referente al programa de: " + "<b>" + modulo_pyp.Modulo_PyP.d.listPacientes.progam + "</b>"
                + " y la receta medica(en caso de que exista) del (la) paciente: " + "<b>" + modulo_pyp.Modulo_PyP.d.listPacientes.name + "</b>" + ", presione el boton aceptar o pulse enter para continuar..." + "\n"
                + "</div>\n"
                + "</html>");
        idhisto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(125, 164, 222));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/print_32.png"))); // NOI18N
        jLabel1.setText("Confirmación de impresión...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel2.setText("...");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 222, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        hiloreporte ut = new hiloreporte(this);
        Thread thread = new Thread(ut);
        thread.start();
    }//GEN-LAST:event_jButton1MouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            hiloreporte ut = new hiloreporte(this);
            Thread thread = new Thread(ut);
            thread.start();
        }
    }//GEN-LAST:event_formKeyPressed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Imprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imprimir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Imprimir dialog = new Imprimir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void idhisto() {
        switch (modulo_pyp.Modulo_PyP.d.listPacientes.idprograma) {
            case 3:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.adult.idhc;
                break;
            case 9:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.controlp.idhc;
                break;
            case 11:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.postparto.idhc;
                break;
            case 10:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.reciennacido.idhc;
                break;
            case 5:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.planificacion.idhc;
                break;
            case 1:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.jovensano.idhc;
                break;
            case 6:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.hipertenso.idhc;
                break;
            case 2:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.cydesarrollo.idhc;
                break;
            case 4:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.agudeza.idhc;
                break;
            case 7:
                id = modulo_pyp.Modulo_PyP.d.listPacientes.diabetes.idhc;
                break;
        }
    }

    private class hiloreporte extends Thread {

        Dialog form = null;

        public hiloreporte(Dialog form) {
            this.form = form;
        }

        @Override
        public void run() {
            try {
                PdfReader reader = null, reader2 = null;
                File archivoTemporal, archivotemp;
                archivoTemporal = File.createTempFile("Historia", ".pdf");
                BDConectar bd = new BDConectar();
                bd.ConectarBasedeDatos();
                imp.setIdhc(id);
                imp.setNombrereport(modulo_pyp.Modulo_PyP.d.listPacientes.progam);
                imp.setCodigo("PP-F01-1420");
                imp.setConexion(bd.conexion);
                imp.setServicio("P Y P");
                imp.setVersion("1.0");
                reader = imp.Imprimirhistoria();
                bd.DesconectarBasedeDatos();
                imp.tempFile.deleteOnExit();
                PdfCopyFields copy = new PdfCopyFields(new FileOutputStream(archivoTemporal));
                if (reader != null) {
                    copy.addDocument(reader);
                }
                copy.close();
                Desktop.getDesktop().open(archivoTemporal);
                //recetario                
                Object poso[][] = Funciones.RetornarDatos(sav.recetam(id));
                String cantiposo = poso[0][0].toString();
                if (!cantiposo.equals("0")) {
                    archivotemp = File.createTempFile("Recetario", ".pdf");
                    bd.ConectarBasedeDatos();
                    imp.setNombrereceta("RECETA MEDICA");
                    imp.setIdhc(id);
                    imp.setCodigo("PP-F01-1420");
                    imp.setConexion(bd.conexion);
                    imp.setServicio("P Y P");
                    imp.setVersion("1.0");
                    reader2 = imp.Imprimirrecetario();
                    bd.DesconectarBasedeDatos();
                    imp.tempFiler.deleteOnExit();
                    PdfCopyFields copyr = new PdfCopyFields(new FileOutputStream(archivotemp));
                    if (reader2 != null) {
                        copyr.addDocument(reader2);
                    }
                    copyr.close();
                    Desktop.getDesktop().open(archivotemp);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "r001 " + e.getMessage(), Imprimir.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
            ((Imprimir) form).dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
