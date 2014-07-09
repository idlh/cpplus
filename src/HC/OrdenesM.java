package HC;

import java.awt.Color;
import entity.PypAdmAsistCon;
import javax.swing.JPanel;
import modulo_pyp.Modulo_PyP;

public class OrdenesM extends javax.swing.JPanel {

//    private int val = 0;//permite mantenir visual el panel 
    private final PypAdmAsistCon pypAdmAsistCon;
    public Procedimientos procedimientos = null;
    public Recomendaciones recomendaciones = null;
    public Medicamentos medicamentos = null;
    public Anticonceptivos anticonceptivos = null;

    public OrdenesM(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        jPanel1.setBackground(Color.white);
        jPanel2.setVisible(false);
        jPanel21.setLocation(10, 113);
        if (medicamentos == null) {
            medicamentos = new Medicamentos(pypAdmAsistCon);
        }
        if (procedimientos == null) {
            procedimientos = new Procedimientos(pypAdmAsistCon);
        }
        if (recomendaciones == null) {
            recomendaciones = new Recomendaciones(pypAdmAsistCon);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 5) {
            jPanel22.setVisible(false);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            jPanel22.setLocation(10, 153);
            if (anticonceptivos == null) {
                anticonceptivos = new Anticonceptivos(pypAdmAsistCon);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ordenes Medicas");
        add(jLabel3);
        jLabel3.setBounds(10, 11, 102, 15);

        jPanel18.setBackground(new java.awt.Color(125, 164, 222));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/1389649412_Capsule.png"))); // NOI18N
        jLabel13.setText("Medicamentos");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel18);
        jPanel18.setBounds(10, 37, 124, 32);

        jPanel19.setBackground(new java.awt.Color(125, 164, 222));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/paraclinicos.png"))); // NOI18N
        jLabel14.setText("Procedimientos");
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
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel19);
        jPanel19.setBounds(10, 75, 124, 32);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(408, 297));
        jPanel1.setMinimumSize(new java.awt.Dimension(408, 297));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 297));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(140, 37, 408, 297);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(124, 221));
        jPanel2.setMinimumSize(new java.awt.Dimension(124, 221));
        jPanel2.setPreferredSize(new java.awt.Dimension(124, 221));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        add(jPanel2);
        jPanel2.setBounds(10, 113, 124, 177);

        jPanel22.setBackground(new java.awt.Color(125, 164, 222));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/preservativos.png"))); // NOI18N
        jLabel17.setText("Anticonceptivos");
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
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        add(jPanel22);
        jPanel22.setBounds(200, 0, 124, 35);

        jPanel21.setBackground(new java.awt.Color(125, 164, 222));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/reco.png"))); // NOI18N
        jLabel16.setText("Recomendaciones");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel21);
        jPanel21.setBounds(10, 296, 124, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        darayuda("Medicamentos");
        jPanel18.setBackground(new Color(255, 227, 255));

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        retornarayuda();
        jPanel18.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        darayuda("Procedimiento");
        jPanel19.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        retornarayuda();
        jPanel19.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        darayuda("Recomendaciones");
        jPanel21.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        retornarayuda();
        jPanel21.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        explode(medicamentos);
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        if (jPanel2.isVisible() == false) {
            jPanel21.setLocation(10, 296);
            jPanel2.setVisible(true);
            this.jPanel2.removeAll();
            procedimientos.setBounds(0, 0, 124, 221);
            this.jPanel2.add(procedimientos);
            procedimientos.setVisible(true);
            this.jPanel2.validate();
            this.jPanel2.repaint();
            if (jPanel22.isVisible() == true) {
                jPanel22.setVisible(false);
            }
        } else {
            this.jPanel2.removeAll();
            jPanel2.setVisible(false);
            jPanel21.setLocation(10, 113);
            this.jPanel1.validate();
            this.jPanel1.repaint();
            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
                jPanel22.setVisible(true);
                jPanel22.setLocation(10, 153);
            }
        }
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
        explode(recomendaciones);
    }//GEN-LAST:event_jLabel16MouseReleased

    private void jLabel17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseReleased
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            new Clases.Explode(jPanel1, anticonceptivos).play();
        }
    }//GEN-LAST:event_jLabel17MouseReleased

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jPanel22.setBackground(new Color(255, 227, 255));
        HC.Planificacion.jLabel4.setText("Anticonceptivos");
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jPanel22.setBackground(new Color(125, 164, 222));
        HC.Planificacion.jLabel4.setText("...");
    }//GEN-LAST:event_jLabel17MouseExited

    public void actordenesm() {
        recomendaciones.actrecomendaciones();
        medicamentos.actmedicamentos();
        procedimientos.guardarprocedimientos();
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            anticonceptivos.guardaranticonceptivos();
        }
    }

    public void cargarordenesm() {
        recomendaciones.cargarrecom();
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            anticonceptivos.cargaranticonceptivos();
        }
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
        this.jPanel1.removeAll();
        new Clases.Explode(jPanel1, panel).play();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel18;
    javax.swing.JPanel jPanel19;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel21;
    javax.swing.JPanel jPanel22;
    // End of variables declaration//GEN-END:variables
}
