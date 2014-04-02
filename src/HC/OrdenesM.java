package HC;

import java.awt.Color;
import entity.PypAdmAsistCon;

public class OrdenesM extends javax.swing.JPanel {

    public int val = 0;
    private final PypAdmAsistCon pypAdmAsistCon;
    public static HC.Procedimientos pa = null;
    HC.Recomendaciones reco = null;
    HC.Medicamentos me = null;

    public OrdenesM(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        jPanel1.setBackground(Color.white);
        if (val == 0) {
            jPanel2.setVisible(false);
            jPanel21.setLocation(10, 113);
        }
        val = 1;
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
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        add(jPanel21);
        jPanel21.setBounds(10, 296, 124, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        HC.Adulto.jLabel4.setText("Medicamentos");
        jPanel18.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        HC.Adulto.jLabel4.setText("...");
        jPanel18.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        HC.Adulto.jLabel4.setText("Procedimientos");
        jPanel19.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        HC.Adulto.jLabel4.setText("...");
        jPanel19.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        HC.Adulto.jLabel4.setText("Recomendaciones");
        jPanel21.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        HC.Adulto.jLabel4.setText("...");
        jPanel21.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        if (me == null) {
            me = new Medicamentos(pypAdmAsistCon);
        }
        // TODO add your handling code here:
        jPanel1.removeAll();
//        me.setBounds(0, 0, 408, 297);
//        jPanel1.add(me);        
//        me.setVisible(true);  
//        jPanel1.validate();
//        jPanel1.repaint();
        new Clases.Explode(HC.OrdenesM.jPanel1, me).play();
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        if (val == 1) {
            jPanel21.setLocation(10, 296);
            jPanel2.setVisible(true);
            if (pa == null) {
                pa = new Procedimientos();
            }
            this.jPanel2.removeAll();
            pa.setBounds(0, 0, 124, 221);
            this.jPanel2.add(pa);
            pa.setVisible(true);
            this.jPanel2.validate();
            this.jPanel2.repaint();
            val = 0;
        } else {
            if (val == 0) {
                this.jPanel2.removeAll();
                jPanel2.setVisible(false);
                jPanel21.setLocation(10, 113);
                this.jPanel1.validate();
                this.jPanel1.repaint();
                val = 1;
            }
        }
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
        if (reco == null) {
            reco = new Recomendaciones();
        }
        jPanel1.removeAll();
//        reco.setBounds(0, 0, 408, 297);
//        jPanel1.add(reco);        
//        reco.setVisible(true);
//        jPanel1.validate();
//        jPanel1.repaint();
        new Clases.Explode(HC.OrdenesM.jPanel1, reco).play();
    }//GEN-LAST:event_jLabel16MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel18;
    javax.swing.JPanel jPanel19;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel21;
    // End of variables declaration//GEN-END:variables
}
