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

/**
 *
 * @author Camilo
 */
public class ProcedimientosI extends javax.swing.JPanel {

    Dialogos.HCDiag.Dprocedimientos prog;
    public static DefaultTableModel modelo;

    public ProcedimientosI() {
        initComponents();
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
        Tablaimagenologia = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(408, 297));
        setMinimumSize(new java.awt.Dimension(408, 297));
        setPreferredSize(new java.awt.Dimension(408, 297));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Procedimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        Tablaimagenologia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tablaimagenologia.setFocusable(false);
        Tablaimagenologia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaimagenologiaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaimagenologia);

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
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/XRay2.png"))); // NOI18N
        jLabel1.setText("Imagenologia");

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
        HC.Adulto.jLabel4.setText("Añadir Procedimiento");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        HC.Adulto.jLabel4.setText("...");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        HC.Adulto.jLabel4.setText("Quitar Procedimiento");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        HC.Adulto.jLabel4.setText("...");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        final Dprocedimientos pr = new Dprocedimientos((Frame) SwingUtilities.getWindowAncestor(this), true);
        pr.procimage();
        pr.jButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Agregar_Registro(pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 0).toString(),
                        pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 1).toString(),
                        pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 2).toString(),
                        pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 3).toString()
                );
                pr.dispose();
            }
        });
        pr.setVisible(true);
    }//GEN-LAST:event_jButton1MouseReleased

    private void TablaimagenologiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaimagenologiaMouseEntered
        int rowindex = Tablaimagenologia.rowAtPoint(evt.getPoint());
        int columnindex = Tablaimagenologia.columnAtPoint(evt.getPoint());
        Tablaimagenologia.setToolTipText((String) Tablaimagenologia.getValueAt(rowindex, columnindex));
    }//GEN-LAST:event_TablaimagenologiaMouseEntered

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        quitarrgistro();
    }//GEN-LAST:event_jButton3MouseReleased
    private void tabla() {
        try {
            getModelo();
            Tablaimagenologia.getTableHeader().setReorderingAllowed(false);
            Tablaimagenologia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(Tablaimagenologia, new int[]{0, 1, 3});
            Funciones_AD.setSizeColumnas(Tablaimagenologia, new int[]{1}, new int[]{450});
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }

    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Codigo", "Procedimiento", "Categoria"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false
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
        Tablaimagenologia.setModel(modelo);
    }

    public void Agregar_Registro(String r1, String r2, String r3, String r4) {
        try {
            DefaultTableModel temp = (DefaultTableModel) Tablaimagenologia.getModel();
            Object nuevo[] = {r1, r2, r3, r4};
            temp.addRow(nuevo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " :(  " + e.getMessage());
        }
    }

    public void quitarrgistro() {
        if (modelo.getRowCount() > 0 && Tablaimagenologia.getSelectedRow() > -1) {
            modelo.removeRow(Tablaimagenologia.getSelectedRow());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable Tablaimagenologia;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
