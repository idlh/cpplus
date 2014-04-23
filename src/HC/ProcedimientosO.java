package HC;

import Clases.Funciones_AD;
import Dialogos.HCDiag.Dprocedimientos;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Clases.Save;
import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.CargarordenesM;

/**
 *
 * @author Camilo
 */
public class ProcedimientosO extends javax.swing.JPanel {

    Dialogos.HCDiag.Dprocedimientos prog;
    private DefaultTableModel modelo;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    CargarordenesM tab = new CargarordenesM();
    String est = "1";
    int rowindex, columnindex;

    public ProcedimientosO(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        tabla();
    }

    /**
     * This method is called frordenesm within the constructor to initialize the
     * form. WARNING: Do NOT motivocdify this code. The content of this method
     * is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Trablaotrosprocedimientos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(408, 297));
        setMinimumSize(new java.awt.Dimension(408, 297));
        setPreferredSize(new java.awt.Dimension(408, 297));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Procedimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        Trablaotrosprocedimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Trablaotrosprocedimientos.setFocusable(false);
        Trablaotrosprocedimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TrablaotrosprocedimientosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Trablaotrosprocedimientos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/añardirc1.png"))); // NOI18N
        jButton1.setToolTipText("Añadir paraclinico");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(43, 40));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/añadirc2.png"))); // NOI18N
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quitarc1.png"))); // NOI18N
        jButton3.setToolTipText("Quitar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quitarc2.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/otros.png"))); // NOI18N
        jLabel1.setText("Otros procedimientos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3) {
            HC.Adulto.jLabel4.setText("Añadir procedimiento");
        } else {
            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
                HC.Controlprenatal.jLabel4.setText("Añadir procedimiento");
            } else {
                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
                    HC.Postparto.jLabel4.setText("Añadir procedimiento");
                } else {
                    if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
                        HC.RecienNacido.jLabel4.setText("Añadir procedimiento");
                    } else {
                        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
                            HC.Planificacion.jLabel4.setText("Añadir procedimiento");
                        } else {
                            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
                                HC.Jovensano.jLabel4.setText("Añadir procedimiento");
                            } else {
                                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
                                    HC.Hipertenso.jLabel4.setText("Añadir procedimiento");
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3) {
            HC.Adulto.jLabel4.setText("...");
        } else {
            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
                HC.Controlprenatal.jLabel4.setText("...");
            } else {
                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
                    HC.Postparto.jLabel4.setText("...");
                } else {
                    if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
                        HC.RecienNacido.jLabel4.setText("...");
                    } else {
                        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
                            HC.Planificacion.jLabel4.setText("...");
                        } else {
                            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
                                HC.Jovensano.jLabel4.setText("...");
                            } else {
                                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
                                    HC.Hipertenso.jLabel4.setText("...");
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3) {
            HC.Adulto.jLabel4.setText("Quitar procedimiento");
        } else {
            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
                HC.Controlprenatal.jLabel4.setText("Quitar procedimiento");
            } else {
                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
                    HC.Postparto.jLabel4.setText("Quitar procedimiento");
                } else {
                    if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
                        HC.RecienNacido.jLabel4.setText("Quitar procedimiento");
                    } else {
                        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
                            HC.Planificacion.jLabel4.setText("Quitar procedimiento");
                        } else {
                            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
                                HC.Jovensano.jLabel4.setText("Quitar procedimiento");
                            } else {
                                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
                                    HC.Hipertenso.jLabel4.setText("Quitar procedimiento");
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3) {
            HC.Adulto.jLabel4.setText("...");
        } else {
            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
                HC.Controlprenatal.jLabel4.setText("...");
            } else {
                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
                    HC.Postparto.jLabel4.setText("...");
                } else {
                    if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
                        HC.RecienNacido.jLabel4.setText("...");
                    } else {
                        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
                            HC.Planificacion.jLabel4.setText("...");
                        } else {
                            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
                                HC.Jovensano.jLabel4.setText("...");
                            } else {
                                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
                                    HC.Hipertenso.jLabel4.setText("...");
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        final Dprocedimientos pr = new Dprocedimientos((Frame) SwingUtilities.getWindowAncestor(this), true);
        pr.procotros();
        pr.jButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean validacion = false;
                for (int k = 0; k < modelo.getRowCount(); k++) {
                    if (((String) modelo.getValueAt(k, 0)).equals((String) pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 0))) {
                        validacion = true;
                        break;
                    }
                }
                if (validacion == false) {
                    Agregar_Registro(pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 0).toString(),
                            pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 1).toString(),
                            pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 2).toString(),
                            pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 3).toString(),
                            "1");
                    pr.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Ya el procedimiento fue agregado");
                }
            }
        });
        pr.setVisible(true);
        est = "2";
    }//GEN-LAST:event_jButton1MouseReleased

    private void TrablaotrosprocedimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrablaotrosprocedimientosMouseEntered
        rowindex = Trablaotrosprocedimientos.rowAtPoint(evt.getPoint());
        columnindex = Trablaotrosprocedimientos.columnAtPoint(evt.getPoint());
        Trablaotrosprocedimientos.setToolTipText((String) Trablaotrosprocedimientos.getValueAt(rowindex, columnindex));
    }//GEN-LAST:event_TrablaotrosprocedimientosMouseEntered

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        quitarrgistro();
    }//GEN-LAST:event_jButton3MouseReleased
    private void tabla() {
        try {
            getModelo();
            Trablaotrosprocedimientos.getTableHeader().setReorderingAllowed(false);
            Trablaotrosprocedimientos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(Trablaotrosprocedimientos, new int[]{0, 1, 3, 4});
            Funciones_AD.setSizeColumnas(Trablaotrosprocedimientos, new int[]{1}, new int[]{450});
            Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b != 0) {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
                String d = (c[0][0].toString());
                tab.cargartablaotros(modelo, d, "17");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), ProcedimientosO.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Codigo", "Procedimiento", "Categoria", "Estado"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false
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
        Trablaotrosprocedimientos.setModel(modelo);
    }

    public void Agregar_Registro(String r1, String r2, String r3, String r4, String r5) {
        try {
            Object nuevo[] = {r1, r2, r3, r4, r5};
            modelo.addRow(nuevo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " :(  " + e.getMessage());
        }
    }

    public void quitarrgistro() {
        if (modelo.getRowCount() > 0 && Trablaotrosprocedimientos.getSelectedRow() > -1) {
            if (modelo.getValueAt(Trablaotrosprocedimientos.getSelectedRow(), 4).equals("2")) {
                modelo.setValueAt("0", rowindex, 4);
                est = "3";
            } else {
                if (modelo.getRowCount() > 0 && Trablaotrosprocedimientos.getSelectedRow() > -1) {
                    if (modelo.getValueAt(Trablaotrosprocedimientos.getSelectedRow(), 4).equals("1")) {
                        modelo.removeRow(Trablaotrosprocedimientos.getSelectedRow());
                    }
                }
            }
        }
    }

    public void actproceotr() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        if (est.toString().equals("2")) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                if (modelo.getValueAt(i, 4).equals("1")) {
                    modelo.setValueAt("2", i, 4);
                    sav.newproce(d, modelo.getValueAt(i, 0).toString(),
                            pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), modelo.getValueAt(i, 4).toString()
                    );
                }
            }
        } else {
            if (est.toString().equals("3")) {
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    if (modelo.getValueAt(i, 4).equals("0")) {
                        act.actprocedimiento(d, modelo.getValueAt(Trablaotrosprocedimientos.getSelectedRow(), 0).toString(), "0");
                    }
                }
            }
        }
        est = "1";
        Trablaotrosprocedimientos.removeAll();
        tabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable Trablaotrosprocedimientos;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
