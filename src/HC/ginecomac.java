package HC;

import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.Funciones_AD;
import Clases.Save;

/**
 *
 * @author Camilo
 */
public class ginecomac extends javax.swing.JPanel {

    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();

    public ginecomac(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField9 = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTextField10 = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(334, 246));
        setMinimumSize(new java.awt.Dimension(334, 246));
        setPreferredSize(new java.awt.Dimension(334, 246));
        setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel9.setText("Métodos Anticonceptivos");
        add(jLabel9);
        jLabel9.setBounds(10, 11, 130, 11);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Actuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox4.setText("Uso de MAC actual");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.setFocusable(false);
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseReleased(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField9.setEnabled(false);
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox5.setText("Efectos Secundarios");
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.setEnabled(false);
        jCheckBox5.setFocusable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel15.setText("Metodo anticonceptivo:");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No aplica", "Anticonceptivos Orales Combinados", "Anticonceptivos Inyectables Combinados", "Inyectable sólo progrestágenos", "Píldoras sólo progestágenos", "Preservativo", "Definitivos", "DIU", "Jadell", "Otros", "No usaba", " " }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setEnabled(false);
        jComboBox2.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel14.setText("Tiempo uso:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, 0, 203, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel14)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 140, 330, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Previos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox6.setText("Uso de MAC previo");
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox6.setFocusable(false);
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseReleased(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextField10.setEnabled(false);
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox7.setText("Efectos Secundarios");
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox7.setEnabled(false);
        jCheckBox7.setFocusable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel16.setText("Metodo anticonceptivo:");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No aplica", "Anticonceptivos Orales Combinados", "Anticonceptivos Inyectables Combinados", "Inyectable sólo progrestágenos", "Píldoras sólo progestágenos", "Preservativo", "Definitivos", "DIU", "Jadell", "Otros", "No usaba", " " }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.setEnabled(false);
        jComboBox3.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel17.setText("Tiempo uso:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox7)
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel17)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(10, 40, 330, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseReleased
        if (jCheckBox6.isSelected() == true) {
            this.jTextField10.setEnabled(true);
            this.jTextField10.requestFocus();
            this.jComboBox3.setEnabled(true);
            this.jCheckBox7.setEnabled(true);
        } else {
            if (jCheckBox6.isSelected() == false) {
                this.jTextField10.setEnabled(false);
                this.jTextField10.setText(null);
                this.jComboBox3.setEnabled(false);
                this.jComboBox3.setSelectedIndex(-1);
                this.jCheckBox7.setEnabled(false);
                this.jCheckBox7.setSelected(false);
            }
        }
    }//GEN-LAST:event_jCheckBox6MouseReleased

    private void jCheckBox4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseReleased
        if (jCheckBox4.isSelected() == true) {
            this.jTextField9.setEnabled(true);
            this.jTextField9.requestFocus();
            this.jComboBox2.setEnabled(true);
            this.jCheckBox5.setEnabled(true);
        } else {
            if (jCheckBox4.isSelected() == false) {
                this.jTextField9.setEnabled(false);
                this.jTextField9.setText(null);
                this.jComboBox2.setEnabled(false);
                this.jComboBox2.setSelectedIndex(-1);
                this.jCheckBox5.setEnabled(false);
                this.jCheckBox5.setSelected(false);
            }
        }
    }//GEN-LAST:event_jCheckBox4MouseReleased

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        jTextField10.selectAll();
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        jTextField9.selectAll();
    }//GEN-LAST:event_jTextField9FocusGained

    public void actginecomac(String idhc) {
        String q, w, e, r, t, y, j1, j2;
        if (jCheckBox6.isSelected() == true) {
            q = "1";
        } else {
            q = "0";
        }
        if (jCheckBox7.isSelected() == true && jCheckBox7.isEnabled() == true) {
            w = "1";
        } else {
            w = "0";
        }
        if (jCheckBox4.isSelected() == true) {
            e = "1";
        } else {
            e = "0";
        }
        if (jCheckBox5.isSelected() == true && jCheckBox5.isEnabled() == true) {
            r = "1";
        } else {
            r = "0";
        }
        if (jTextField10.isEnabled() == true) {
            j1 = jTextField10.getText().toUpperCase().toString();
        } else {
            j1 = "";
        }
        if (jTextField9.isEnabled() == true) {
            j2 = jTextField10.getText().toUpperCase().toString();
        } else {
            j2 = "";
        }
        if (jComboBox3.isEnabled() == true) {
            t = String.valueOf(jComboBox3.getSelectedIndex());
        } else {
            t = "0";
        }
        if (jComboBox2.isEnabled() == true) {
            y = String.valueOf(jComboBox2.getSelectedIndex());
        } else {
            y = "0";
        }
        act.actualizarginecom(idhc, q, t, j1, w, e, y, j2, r);
    }

    public void cargarginecom(String idhc) {
        Object h[][] = Funciones.RetornarDatos(act.cargarantecedentesg(idhc));
        if (h[0][16].toString().equals("0")) {
            jCheckBox6.setSelected(false);
        } else {
            jCheckBox6.setSelected(true);
            jTextField10.setEnabled(true);
            jComboBox3.setEnabled(true);
            jCheckBox7.setEnabled(true);
        }
        if (h[0][17].toString().equals("0")) {
            jComboBox3.setSelectedIndex(0);
        } else {
            if (h[0][17].toString().equals("1")) {
                jComboBox3.setSelectedIndex(1);
            } else {
                if (h[0][17].toString().equals("2")) {
                    jComboBox3.setSelectedIndex(2);
                } else {
                    if (h[0][17].toString().equals("3")) {
                        jComboBox3.setSelectedIndex(3);
                    } else {
                        if (h[0][17].toString().equals("4")) {
                            jComboBox3.setSelectedIndex(4);
                        } else {
                            if (h[0][17].toString().equals("5")) {
                                jComboBox3.setSelectedIndex(5);
                            } else {
                                if (h[0][17].toString().equals("6")) {
                                    jComboBox3.setSelectedIndex(6);
                                } else {
                                    if (h[0][17].toString().equals("7")) {
                                        jComboBox3.setSelectedIndex(7);
                                    } else {
                                        if (h[0][17].toString().equals("8")) {
                                            jComboBox3.setSelectedIndex(8);
                                        } else {
                                            if (h[0][17].toString().equals("9")) {
                                                jComboBox3.setSelectedIndex(9);
                                            } else {
                                                jComboBox3.setSelectedIndex(10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        jTextField10.setText(h[0][18].toString());
        if (h[0][19].toString().equals("0")) {
            jCheckBox7.setSelected(false);
        } else {
            jCheckBox7.setSelected(true);
        }
        if (h[0][20].toString().equals("0")) {
            jCheckBox4.setSelected(false);
        } else {
            jCheckBox4.setSelected(true);
            jTextField9.setEnabled(true);
            jComboBox2.setEnabled(true);
            jCheckBox5.setEnabled(true);
        }
        if (h[0][21].toString().equals("0")) {
            jComboBox2.setSelectedIndex(0);
        } else {
            if (h[0][21].toString().equals("1")) {
                jComboBox2.setSelectedIndex(1);
            } else {
                if (h[0][21].toString().equals("2")) {
                    jComboBox2.setSelectedIndex(2);
                } else {
                    if (h[0][21].toString().equals("3")) {
                        jComboBox2.setSelectedIndex(3);
                    } else {
                        if (h[0][21].toString().equals("4")) {
                            jComboBox2.setSelectedIndex(4);
                        } else {
                            if (h[0][21].toString().equals("5")) {
                                jComboBox2.setSelectedIndex(5);
                            } else {
                                if (h[0][21].toString().equals("6")) {
                                    jComboBox2.setSelectedIndex(6);
                                } else {
                                    if (h[0][21].toString().equals("7")) {
                                        jComboBox2.setSelectedIndex(7);
                                    } else {
                                        if (h[0][21].toString().equals("8")) {
                                            jComboBox2.setSelectedIndex(8);
                                        } else {
                                            if (h[0][21].toString().equals("9")) {
                                                jComboBox2.setSelectedIndex(9);
                                            } else {
                                                jComboBox2.setSelectedIndex(10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        jTextField9.setText(h[0][22].toString());
        if (h[0][23].toString().equals("0")) {
            jCheckBox5.setSelected(false);
        } else {
            jCheckBox5.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox jCheckBox4;
    javax.swing.JCheckBox jCheckBox5;
    javax.swing.JCheckBox jCheckBox6;
    javax.swing.JCheckBox jCheckBox7;
    javax.swing.JComboBox jComboBox2;
    javax.swing.JComboBox jComboBox3;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JTextField jTextField10;
    javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
