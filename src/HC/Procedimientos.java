package HC;

import java.awt.Color;
import entity.PypAdmAsistCon;
import Clases.Funciones_AD;
import Clases.Save;
import javax.swing.JPanel;
import modulo_pyp.Modulo_PyP;

/**
 *
 * @author Camilo
 */
public class Procedimientos extends javax.swing.JPanel {

    public ProcedimientosM procesosmonitorizacion = null;
    public ProcedimientosL procesoslaboratorios = null;
    public ProcedimientosI procesosimagenologia = null;
    public ProcedimientosQ procesosquirurgicos = null;
    public ProcedimientosO procesosotros = null;
    Dialogos.HCDiag.Dprocedimientos prog;
    private PypAdmAsistCon pypAdmAsistCon;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    private final int usuario;

    public Procedimientos(PypAdmAsistCon pypAdmAsistCon, Integer usuario) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        this.usuario = usuario;
        if (procesosmonitorizacion == null) {
            procesosmonitorizacion = new ProcedimientosM(pypAdmAsistCon, usuario);
        }
        if (procesoslaboratorios == null) {
            procesoslaboratorios = new ProcedimientosL(pypAdmAsistCon, usuario);
        }
        if (procesosimagenologia == null) {
            procesosimagenologia = new ProcedimientosI(pypAdmAsistCon, usuario);
        }
        if (procesosquirurgicos == null) {
            procesosquirurgicos = new ProcedimientosQ(pypAdmAsistCon, usuario);
        }
        if (procesosotros == null) {
            procesosotros = new ProcedimientosO(pypAdmAsistCon, usuario);
        }
    }

    /**
     * This medicamentosthod is called frordenesm within the constructor to
     * initialize the form. WARNING: Do NOT motivocdify this code. The content
     * of this medicamentosthod is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(124, 221));
        setMinimumSize(new java.awt.Dimension(124, 221));
        setPreferredSize(new java.awt.Dimension(124, 221));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/1389649334_first_aid_kit.png"))); // NOI18N
        jLabel14.setText("Monitorización");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lab.png"))); // NOI18N
        jLabel16.setText("Laboratorio");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel16MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/XRay2.png"))); // NOI18N
        jLabel17.setText("Imagenologia");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel17MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/otros.png"))); // NOI18N
        jLabel18.setText("Otros procedimientos");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quirur.png"))); // NOI18N
        jLabel19.setText("Quirúrgicos");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel19MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        darayuda("Procedimientos Monitorizacion");
        jPanel19.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        retornarayuda();
        jPanel19.setBackground(Color.white);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        darayuda("Procedimientos Laboratorio");
        jPanel21.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        retornarayuda();
        jPanel21.setBackground(Color.white);
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        darayuda("Procedimientos Imagenología");
        jPanel22.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        retornarayuda();
        jPanel22.setBackground(Color.white);
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        darayuda("Otros procedimientos");
        jPanel23.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        retornarayuda();
        jPanel23.setBackground(Color.white);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        darayuda("Procedimientos Quirurgicos");
        jPanel24.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        retornarayuda();
        jPanel24.setBackground(Color.white);
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        explode(procesosmonitorizacion);
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
        explode(procesoslaboratorios);
    }//GEN-LAST:event_jLabel16MouseReleased

    private void jLabel17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseReleased
        explode(procesosimagenologia);
    }//GEN-LAST:event_jLabel17MouseReleased

    private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseReleased
        explode(procesosquirurgicos);
    }//GEN-LAST:event_jLabel19MouseReleased

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
        explode(procesosotros);
    }//GEN-LAST:event_jLabel18MouseReleased

    public void guardarprocedimientos(String idhc) {
        procesosimagenologia.actproceimage(idhc);
        procesoslaboratorios.actprocelab(idhc);
        procesosmonitorizacion.actprocemon(idhc);
        procesosotros.actproceotr(idhc);
        procesosquirurgicos.actprocedquirur(idhc);
    }

    private void retornarayuda() {
        switch (pypAdmAsistCon.getIdAgend().getIdPrograma().getId()) {
            case 3:
                HC.Adulto.jLabel4.setText("...");
                break;
            case 9:
                HC.Controlprenatal.jLabel4.setText("...");
                break;
            case 11:
                HC.Postparto.jLabel4.setText("...");
                break;
            case 10:
                HC.RecienNacido.jLabel4.setText("...");
                break;
            case 5:
                HC.Planificacion.jLabel4.setText("...");
                break;
            case 1:
                HC.Jovensano.jLabel4.setText("...");
                break;
            case 6:
                HC.Hipertenso.jLabel4.setText("...");
                break;
            case 2:
                HC.CYDesarrollo.jLabel4.setText("...");
                break;
            case 7:
                HC.Diabetes.jLabel4.setText("...");
                break;
        }
    }

    private void darayuda(String texto) {
        switch (pypAdmAsistCon.getIdAgend().getIdPrograma().getId()) {
            case 3:
                HC.Adulto.jLabel4.setText(texto);
                break;
            case 9:
                HC.Controlprenatal.jLabel4.setText(texto);
                break;
            case 11:
                HC.Postparto.jLabel4.setText(texto);
                break;
            case 10:
                HC.RecienNacido.jLabel4.setText(texto);
                break;
            case 5:
                HC.Planificacion.jLabel4.setText(texto);
                break;
            case 1:
                HC.Jovensano.jLabel4.setText(texto);
                break;
            case 6:
                HC.Hipertenso.jLabel4.setText(texto);
                break;
            case 2:
                HC.CYDesarrollo.jLabel4.setText(texto);
                break;
            case 7:
                HC.Diabetes.jLabel4.setText(texto);
                break;
        }
    }

    private void explode(JPanel panel) {
        if (Modulo_PyP.d.est.equals("1")) {
            switch (pypAdmAsistCon.getIdAgend().getIdPrograma().getId()) {
                case 3:
                    Modulo_PyP.d.listPacientes.adult.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.adult.ordenesm.jPanel1, panel).play();
                    break;
                case 9:
                    Modulo_PyP.d.listPacientes.controlp.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.controlp.ordenesm.jPanel1, panel).play();
                    break;
                case 11:
                    Modulo_PyP.d.listPacientes.postparto.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.postparto.ordenesm.jPanel1, panel).play();
                    break;
                case 10:
                    Modulo_PyP.d.listPacientes.reciennacido.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.reciennacido.ordenesm.jPanel1, panel).play();
                    break;
                case 5:
                    Modulo_PyP.d.listPacientes.planificacion.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.planificacion.ordenesm.jPanel1, panel).play();
                    break;
                case 1:
                    Modulo_PyP.d.listPacientes.jovensano.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.jovensano.ordenesm.jPanel1, panel).play();
                    break;
                case 6:
                    Modulo_PyP.d.listPacientes.hipertenso.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.hipertenso.ordenesm.jPanel1, panel).play();
                    break;
                case 2:
                    Modulo_PyP.d.listPacientes.cydesarrollo.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.cydesarrollo.ordenesm.jPanel1, panel).play();
                    break;
                case 7:
                    Modulo_PyP.d.listPacientes.diabetes.ordenesm.jPanel1.removeAll();
                    new Clases.Explode(Modulo_PyP.d.listPacientes.diabetes.ordenesm.jPanel1, panel).play();
                    break;
            }
        } else {
            if (Modulo_PyP.d.est.equals("2")) {
                switch (pypAdmAsistCon.getIdAgend().getIdPrograma().getId()) {
                    case 3:
                        Modulo_PyP.d.panelc.historias.adult.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.adult.ordenesm.jPanel1, panel).play();
                        break;
                    case 9:
                        Modulo_PyP.d.panelc.historias.controlp.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.controlp.ordenesm.jPanel1, panel).play();
                        break;
                    case 11:
                        Modulo_PyP.d.panelc.historias.postparto.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.postparto.ordenesm.jPanel1, panel).play();
                        break;
                    case 10:
                        Modulo_PyP.d.panelc.historias.reciennacido.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.reciennacido.ordenesm.jPanel1, panel).play();
                        break;
                    case 5:
                        Modulo_PyP.d.panelc.historias.planificacion.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.planificacion.ordenesm.jPanel1, panel).play();
                        break;
                    case 1:
                        Modulo_PyP.d.panelc.historias.jovensano.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.jovensano.ordenesm.jPanel1, panel).play();
                        break;
                    case 6:
                        Modulo_PyP.d.panelc.historias.hipertenso.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.hipertenso.ordenesm.jPanel1, panel).play();
                        break;
                    case 2:
                        Modulo_PyP.d.panelc.historias.cydesarrollo.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.cydesarrollo.ordenesm.jPanel1, panel).play();
                        break;
                    case 7:
                        Modulo_PyP.d.panelc.historias.diabetes.ordenesm.jPanel1.removeAll();
                        new Clases.Explode(Modulo_PyP.d.panelc.historias.diabetes.ordenesm.jPanel1, panel).play();
                        break;
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel19;
    javax.swing.JPanel jPanel19;
    javax.swing.JPanel jPanel20;
    javax.swing.JPanel jPanel21;
    javax.swing.JPanel jPanel22;
    javax.swing.JPanel jPanel23;
    javax.swing.JPanel jPanel24;
    // End of variables declaration//GEN-END:variables
}
