package HC;

import Clases.Actualizar;
import Clases.Funciones_AD;
import Clases.Save;
import entity.PypAdmAsistCon;

/**
 *
 * @author Camilo
 */
public class MotivoC extends javax.swing.JPanel {

    Actualizar act = new Actualizar();
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    private final PypAdmAsistCon pypAdmAsistCon;

    public MotivoC(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        if (jCheckBox10.isSelected() == false) {
            jTextArea1.setEnabled(false);
        } else {
            jTextArea1.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));
        setPreferredSize(new java.awt.Dimension(558, 345));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Motivo de consulta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Eventos estresantes");

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Otros");
        jCheckBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox10.setFocusable(false);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Victima de maltrato");
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox7.setFocusable(false);

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Gestación");
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox6.setFocusable(false);

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Dificultades laborales");
        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox8.setFocusable(false);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Violencia sexual");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Muerte de un hijo");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.setFocusable(false);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Conflicto conyugal");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Salida de un hijo del hogar");
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.setFocusable(false);

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Embarazo adolecente");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(125, 164, 222));
        jLabel3.setText("...");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox7)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        if (jCheckBox10.isSelected() == false) {
            jTextArea1.setEnabled(false);
        } else {
            jTextArea1.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        jTextArea1.selectAll();
    }//GEN-LAST:event_jTextArea1FocusGained

    public void actualizardatos(String idhc) {
        String q, w, e, r, t, y, u, i, o;
        if (jCheckBox1.isSelected() == true) {
            q = "1";
        } else {
            q = "0";
        }
        if (jCheckBox4.isSelected() == true) {
            w = "1";
        } else {
            w = "0";
        }
        if (jCheckBox7.isSelected() == true) {
            e = "1";
        } else {
            e = "0";
        }
        if (jCheckBox2.isSelected() == true) {
            r = "1";
        } else {
            r = "0";
        }
        if (jCheckBox5.isSelected() == true) {
            t = "1";
        } else {
            t = "0";
        }
        if (jCheckBox8.isSelected() == true) {
            y = "1";
        } else {
            y = "0";
        }
        if (jCheckBox3.isSelected() == true) {
            u = "1";
        } else {
            u = "0";
        }
        if (jCheckBox6.isSelected() == true) {
            i = "1";
        } else {
            i = "0";
        }
        if (jCheckBox10.isSelected() == true) {
            o = "1";
        } else {
            o = "0";
        }
        act.actueventos(idhc, q, w, e, r, t, y, u, i, o, jTextArea1.getText().toUpperCase().toString());
    }

    public void cargareventose(String idhc) {
        Object h[][] = Funciones.RetornarDatos(act.cargareventose(idhc));
        if (h[0][2].toString().equals("0")) {
            jCheckBox1.setSelected(false);
        } else {
            jCheckBox1.setSelected(true);
        }
        if (h[0][3].toString().equals("0")) {
            jCheckBox4.setSelected(false);
        } else {
            jCheckBox4.setSelected(true);
        }
        if (h[0][4].toString().equals("0")) {
            jCheckBox7.setSelected(false);
        } else {
            jCheckBox7.setSelected(true);
        }
        if (h[0][5].toString().equals("0")) {
            jCheckBox2.setSelected(false);
        } else {
            jCheckBox2.setSelected(true);
        }
        if (h[0][6].toString().equals("0")) {
            jCheckBox5.setSelected(false);
        } else {
            jCheckBox5.setSelected(true);
        }
        if (h[0][7].toString().equals("0")) {
            jCheckBox8.setSelected(false);
        } else {
            jCheckBox8.setSelected(true);
        }
        if (h[0][8].toString().equals("0")) {
            jCheckBox3.setSelected(false);
        } else {
            jCheckBox3.setSelected(true);
        }
        if (h[0][9].toString().equals("0")) {
            jCheckBox6.setSelected(false);
        } else {
            jCheckBox6.setSelected(true);
        }
        if (h[0][10].toString().equals("0")) {
            jCheckBox10.setSelected(false);
            jTextArea1.setEnabled(false);
        } else {
            jCheckBox10.setSelected(true);
            jTextArea1.setEnabled(true);
        }
        jTextArea1.setText(h[0][11].toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JCheckBox jCheckBox10;
    javax.swing.JCheckBox jCheckBox2;
    javax.swing.JCheckBox jCheckBox3;
    javax.swing.JCheckBox jCheckBox4;
    javax.swing.JCheckBox jCheckBox5;
    javax.swing.JCheckBox jCheckBox6;
    javax.swing.JCheckBox jCheckBox7;
    javax.swing.JCheckBox jCheckBox8;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
