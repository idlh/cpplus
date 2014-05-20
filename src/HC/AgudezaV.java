package HC;

import Clases.Actualizar;
import Clases.Funciones_AD;
import Clases.Save;
import Dialogos.HCDiag.Imprimir;
import entity.PypAdmAsistCon;
import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Camilo
 */
public class AgudezaV extends javax.swing.JPanel {

    private final EntityManagerFactory factory;
    private final PypAdmAsistCon pypAdmAsistCon;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    visual agudeza = null;
    Actualizar act = new Actualizar();
    String Estadofinal = "1";

    public AgudezaV(EntityManagerFactory factory, PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.factory = factory;
        this.pypAdmAsistCon = pypAdmAsistCon;
        jPanel4.setBackground(Color.white);
        jLabel9.setVisible(false);
        jLabel12.setVisible(false);
        if (agudeza == null) {
            agudeza = new visual(pypAdmAsistCon);
        }
        crearhc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(745, 393));
        setMinimumSize(new java.awt.Dimension(745, 393));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(745, 393));
        jPanel1.setMinimumSize(new java.awt.Dimension(745, 393));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 393));

        jPanel4.setBackground(new java.awt.Color(125, 164, 222));
        jPanel4.setMaximumSize(new java.awt.Dimension(558, 345));
        jPanel4.setMinimumSize(new java.awt.Dimension(558, 345));
        jPanel4.setPreferredSize(new java.awt.Dimension(558, 345));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 227, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("  Agudeza Visual");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 227, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Detección Temprana De Las Alteraciones De la Agudeza Visual");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 21, 320, 13);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CONSULTA POR PROGRAMA DE");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 2, 190, 15);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc2.png"))); // NOI18N
        jButton1.setToolTipText("Salir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc1.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(700, 2, 38, 38);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/impc2.png"))); // NOI18N
        jButton2.setToolTipText("Imprimir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/impc1.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(654, 2, 38, 38);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/savec2.png"))); // NOI18N
        jButton3.setToolTipText("Guardar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/savec1.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(562, 2, 38, 38);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc2.png"))); // NOI18N
        jButton4.setToolTipText("Finalizar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc1.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(608, 2, 38, 38);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Datos guardados Satisfactoriamente");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(294, 25, 250, 13);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Historia finalizada Correctamente");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(294, 25, 250, 13);

        jLabel4.setBackground(new java.awt.Color(125, 164, 222));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 164, 222));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jLabel4.setText("Guardar");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jLabel4.setText("Finalizar");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jLabel4.setText("Imprimir");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel4.setText("Agudeza Visual");
        jPanel9.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel4.setText("...");
        jPanel9.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jLabel4.setText("Salir");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.jPanel4.removeAll();
        agudeza.jLabel3.setText("Detección Temprana De Las Alteraciones De la Agudeza Visual");
        new Clases.Explode(jPanel4, agudeza).play();
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
        modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        if (Estadofinal.equals("1")) {
            Object a[][] = Funciones.RetornarDatos(sav.contarvisual(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b == 0) {
                Date fecha = pypAdmAsistCon.getFecha();
                String patron = "yyyy-MM-dd", fc;
                SimpleDateFormat formato = new SimpleDateFormat(patron);
                fc = formato.format(fecha);
                sav.crearvisualnueva(pypAdmAsistCon.getId().toString(), pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisual(pypAdmAsistCon.getId().toString()));
                String d = (c[0][0].toString());
                Object h[][] = Funciones.RetornarDatos(act.cargardatosvisual(d));
                if (h[0][10].toString().equals("0")) {
                    agudeza.actualizardatos();
                }
            } else {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisual(pypAdmAsistCon.getId().toString()));
                String d = (c[0][0].toString());
                Object h[][] = Funciones.RetornarDatos(act.cargardatosvisual(d));
                if (h[0][10].toString().equals("0")) {
                    agudeza.actualizardatos();
                }
            }
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisual(pypAdmAsistCon.getId().toString()));
            String d = (c[0][0].toString());
            if (pypAdmAsistCon.getEstado().toString().equals("1")) {
                act.guardadovisual(d, pypAdmAsistCon.getId().toString());
            }
            jLabel9.setVisible(true);
            Contar();
        } else {
            JOptionPane.showMessageDialog(null, "La historia ya se encuentra finalizada");
        }
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        if (Estadofinal.equals("1")) {
            Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b == 0) {
                sav.crearhcnueva(pypAdmAsistCon.getId().toString(), pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), "11803");
                Date fecha = pypAdmAsistCon.getFecha();
                String patron = "yyyy-MM-dd", fc;
                SimpleDateFormat formato = new SimpleDateFormat(patron);
                fc = formato.format(fecha);
                sav.crearvisualnueva(pypAdmAsistCon.getId().toString(), pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisual(pypAdmAsistCon.getId().toString()));
                String d = (c[0][0].toString());
                Object h[][] = Funciones.RetornarDatos(act.cargardatosvisual(d));
                int id = Integer.parseInt(h[0][10].toString());
                if (id == 0) {
                    String mensaje = "¿Si finaliza la Valoracion no podra modificarla posteriormente? ";
                    int entrada = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar finalizacion", JOptionPane.YES_NO_OPTION);
                    if (entrada == 0) {
                        agudeza.actualizardatos();
                        act.finalizarvisual(d, pypAdmAsistCon.getId().toString());
                        Estadofinal = "2";
                        imprimirhis();
                    }
                }
            } else {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisualfinal(pypAdmAsistCon.getId().toString()));
                String d = (c[0][0].toString());
                Object h[][] = Funciones.RetornarDatos(act.cargardatosvisual(d));
                int id = Integer.parseInt(h[0][10].toString());
                if (id == 0) {
                    String mensaje = "¿Si finaliza la Valoracion no podra modificarla posteriormente? ";
                    int entrada = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar finalizacion", JOptionPane.YES_NO_OPTION);
                    if (entrada == 0) {
                        agudeza.actualizardatos();
                        act.finalizarvisual(d, pypAdmAsistCon.getId().toString());
                        Estadofinal = "2";
                        imprimirhis();
                    }
                }
                jLabel12.setVisible(true);
                Contar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La historia ya se encuentra finalizada");
        }
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        if (Estadofinal.equals("2")) {
            imprimirhis();
        } else {
            JOptionPane.showMessageDialog(null, "Debe finalizar para poder imprimir la historia");
        }
    }//GEN-LAST:event_jButton2MouseReleased

    private void crearhc() {
        Object a[][] = Funciones.RetornarDatos(sav.contarvisual(pypAdmAsistCon.getId().toString()));
        int b = Integer.parseInt(a[0][0].toString());
        if (b != 0) {
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisual(pypAdmAsistCon.getId().toString()));
            String d = (c[0][0].toString());
            Object h[][] = Funciones.RetornarDatos(act.cargardatosvisual(d));
            if (h[0][10].toString().equals("0")) {
                agudeza.cargarvisual();
            }
        }
    }
    private Timer timer = new Timer();
    private int segundos = 5;

    class Contador extends TimerTask {

        @Override
        public void run() {
            segundos--;
            if (segundos == 0) {
                Detener();
                jLabel9.setVisible(false);
                jLabel12.setVisible(false);
            }
        }
    }

    public void Contar() {
        this.segundos = 5;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 600);
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void Detener() {
        timer.cancel();
    }

    public void imprimirhis() {
        final Imprimir imp = new Imprimir((Frame) SwingUtilities.getWindowAncestor(this), true);
        imp.setLocationRelativeTo(null);
        imp.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
