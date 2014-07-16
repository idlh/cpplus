/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos.HCDiag;

import Clases.Cmedicamentos;
import Clases.Funciones_AD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Clases.FuncionesC;

/**
 *
 * @author Camilo
 */
public class Dmedicamentosanti extends javax.swing.JDialog {

    Clases.Cmedicamentos med = new Cmedicamentos();
    public DefaultTableModel modelo;
    int row;
    FuncionesC FuncionesC = new FuncionesC();

    public Dmedicamentosanti(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargar();
        jLabel8.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tmedicamentos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 227, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listado de medicamentos anticonceptivos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Tmedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tmedicamentos.setFocusable(false);
        Tmedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TmedicamentosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tmedicamentos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(125, 164, 222));
        jLabel2.setText("Buscar");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jTextField1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setFocusable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel8.setText("jLabel8");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 11, 290, 180);

        jTabbedPane1.addTab("Descripcion", jPanel4);

        jTabbedPane2.setFocusable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(125, 164, 222));
        jLabel3.setText("Dosis:");

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[G] Gramo", "[GT] Gotas", "[CC] Centimetros Cubicos", "[MCG] Microgramos", "[MCL] Microlitros", "[MEQ] Miliequivalentes", "[MG] Miligramos", "[ML] Mililitros", "[Puff] Inhalación", "[U] Unidades", "[Tps] Cucharadita", "[TP] Cucharada", "[L] Litros", " ", " " }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 164, 222));
        jLabel4.setText("Via:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[IM] Intramuscular", "[IV] Intravenosa", "[VB] Vía Bucal (enjuages, aplicación tópica)", "[Vic] Vía Intracavernosa", "[Vinh] Vía Inhalatoria", "[VO] Vía Oral", "[Vof] Vía Oftálmica", "[Vot] Vía Otica", "[VP] Vía(s) Parental(es)", "[VR] Vía Rectal", "[Vsc] Vía Subcutánea", "[VSl] Vía Sublingual", "[VT] Vía Tópica", "[VTd] Vía Transdérmica", "[VV] Vía Vaginal (o vulvar)", " " }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 164, 222));
        jLabel5.setText("Administracion");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(125, 164, 222));
        jLabel6.setText("Cantidad del suministro");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox2, 0, 250, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Posologia", jPanel5);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc2.png"))); // NOI18N
        jButton2.setToolTipText("Aceptar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc1.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc2.png"))); // NOI18N
        jButton1.setToolTipText("Cancelar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jTabbedPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Tmedicamentos.setModel(new DefaultTableModel());
    }//GEN-LAST:event_formWindowClosing

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        this.dispose();
    }//GEN-LAST:event_jButton1MouseReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        TableRowSorter sorter = new TableRowSorter(modelo);
        sorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase()));
        Tmedicamentos.setRowSorter(sorter);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void TmedicamentosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmedicamentosMouseReleased
        row = Tmedicamentos.rowAtPoint(evt.getPoint());
        String a = null, b = null;
        if (String.valueOf(Tmedicamentos.getValueAt(row, 7)).equals("1")) {
            a = "MEDICAMENTO POS";
        } else {
            a = "MEDICAMENTO NO POS";
        }
        if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mg/ml")) {
            b = "MILIGRAMOS/MILILITROS";
        } else {
            if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mg")) {
                b = "MILIGRAMOS";
            } else {
                if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("ml")) {
                    b = "MILILITROS";
                } else {
                    if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("g")) {
                        b = "GRAMO";
                    } else {
                        if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("%")) {
                            b = "A NECESIDAD";
                        } else {
                            if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("CC")) {
                                b = "CENTIMETROS CUBICOS";
                            } else {
                                if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("g/ml")) {
                                    b = "GRAMOS/MILILITROS";
                                } else {
                                    if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals(" l")) {
                                        b = "LITROS";
                                    } else {
                                        if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("g/ml")) {
                                            b = "GRAMOS/MILILITROS";
                                        } else {
                                            if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mcg")) {
                                                b = "MICROGRAMOS";
                                            } else {
                                                if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mEq")) {
                                                    b = "MILIEQUIVALENTES";
                                                } else {
                                                    if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mEq/ml")) {
                                                        b = "MILIEQUIVALENTES/MILILITROS";
                                                    } else {
                                                        if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mg/g")) {
                                                            b = "MILIGRAMOS/GRAMOS";
                                                        } else {
                                                            if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("mg/l")) {
                                                                b = "MILIGRAMOS/LITROS";
                                                            } else {
                                                                if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("U.I")) {
                                                                    b = "UNIDADES";
                                                                } else {
                                                                    if (String.valueOf(Tmedicamentos.getValueAt(row, 5)).equals("U/ml")) {
                                                                        b = "UNIDAD/MILILITROS";
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
                            }
                        }
                    }
                }
            }
        }
        jLabel8.setText("<html>\n"
                + "<div style=\"width:290;\">" + "<b>" + "NOMBRE: " + "</b>" + Tmedicamentos.getValueAt(row, 1) + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "PRINCIPIO ACTIVO: " + "</b>" + Tmedicamentos.getValueAt(row, 2) + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "CONCENTRACION: " + "</b>" + Tmedicamentos.getValueAt(row, 3) + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "PRESENTACION FARMACEUTICA: " + "</b>" + Tmedicamentos.getValueAt(row, 4) + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "DOSIS: " + "</b>" + b + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "VIA ADMINISTRACIONS: " + "</b>" + Tmedicamentos.getValueAt(row, 6) + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + a + "</b>" + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "REGISTRO INVIMA: " + "</b>" + Tmedicamentos.getValueAt(row, 8) + "\n"
                + "</div>\n" + "<div style=\"width:290;\">" + "<b>" + "PRESENTACION COMERCIAL: " + "</b>" + Tmedicamentos.getValueAt(row, 9) + "\n"
                + "</div>\n"
                + "\n"
                + "</html>");
    }//GEN-LAST:event_TmedicamentosMouseReleased

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField3.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextArea1.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jPanel2.setBackground(new Color(125, 164, 222));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jPanel2.setBackground(new Color(255,227,255));
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jPanel2.setBackground(new Color(125, 164, 222));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jPanel2.setBackground(new Color(255,227,255));
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseExited

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (((javax.swing.JTextField) evt.getSource()).getText().contains(",")) {
            ((javax.swing.JTextField) evt.getSource()).setText(FuncionesC.FormatDecimal(((javax.swing.JTextField) evt.getSource()).getText()));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    /**
     * @param args the cordenesmmand line arguments
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
            java.util.logging.Logger.getLogger(Dmedicamentosanti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dmedicamentosanti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dmedicamentosanti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dmedicamentosanti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dmedicamentosanti dialog = new Dmedicamentosanti(new javax.swing.JFrame(), true);
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

    private void cargar() {
        getModelo();
        Tmedicamentos.getTableHeader().setReorderingAllowed(false);
        Tmedicamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Funciones_AD.setOcultarColumnas(Tmedicamentos, new int[]{0, 2, 4, 5, 7, 8, 9});
        Funciones_AD.setSizeColumnas(Tmedicamentos, new int[]{1, 2, 3}, new int[]{310, 170, 170});
        obtenermedicamentos();
    }

    public void obtenermedicamentos() {
        try {
            med.getmedicamentosanti(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }

    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Medicamento", "Principío Activo", "Concentracion", "Presentacion Farmaceutica", "Dosis", "Via de administracion", "pos", "Registro invima", "Presentacion Comercial"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false, false, false, false
                    };

                    @Override
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    @Override
                    public boolean isCellEditable(int rowIndex, int colIndex) {
                        return canEdit[colIndex];
                    }
                };
        Tmedicamentos.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tmedicamentos;
    javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTextArea jTextArea1;
    javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
