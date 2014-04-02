package HC;

/**
 *
 * @author Camilo
 */
public class MotivoC extends javax.swing.JPanel {

    public MotivoC() {
        initComponents();
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
        jCheckBox7.setText("Fracaso economico");
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox7.setFocusable(false);

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Deserción escolar");
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox6.setFocusable(false);

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Dificultades laborales");
        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox8.setFocusable(false);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Separacion o divorcio");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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
