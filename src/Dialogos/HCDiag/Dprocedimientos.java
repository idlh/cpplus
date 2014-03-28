package Dialogos.HCDiag;

import Clases.Funciones_AD;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Clases.Procedimientos;
import HC.OrdenesM;
import HC.ProcedimientosL;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Alvaro Monsalve
 */
public class Dprocedimientos extends javax.swing.JDialog {
    Clases.Procedimientos mos = new Clases.Procedimientos();
    //HC.ProcedimientosL pl = new ProcedimientosL();
    public Dprocedimientos(java.awt.Frame parent, boolean modal) {        
        super(parent, modal);
        initComponents();
        jTable1.addMouseListener(new MouseAdapter() {});
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(470, 381));
        setMinimumSize(new java.awt.Dimension(470, 381));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 227, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Procedimientos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));
        jPanel3.setOpaque(false);

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
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Doble click al procedimiento para añadirlo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
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

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        TableRowSorter sorter = new TableRowSorter(Clases.Procedimientos.modelo);
        sorter.setRowFilter (RowFilter.regexFilter(jTextField1.getText().toUpperCase()));
        jTable1.setRowSorter (sorter);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_formWindowClosing

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.toFront();
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowLostFocus

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        this.toFront();
    }//GEN-LAST:event_formMouseDragged

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
//        int row = jTable1.rowAtPoint(evt.getPoint());        
//        int  i=0;        
//        Object a[]=null;
        
        //este  metodo lo enviaremos desde el boton que llama este formulario
//        if (evt.getClickCount() == 2){   
//           
//            OrdenesM.pa.pl.Agregar_Registro(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), 
//                    jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(),
//                    jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()
//            );
//            this.hide();
//        }
    }//GEN-LAST:event_jTable1MouseReleased
    public void procotros(){
        try {
                mos.getModelo();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0,2});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1}, new int[]{450});
                mos.Mostrar_datosO();            
        } catch (Exception e) {
        }
    }
    public void procquirur(){
        try {
                mos.getModelo();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0,2});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1}, new int[]{450});
                mos.Mostrar_datosQ();            
        } catch (Exception e) {
        }
    }
    public void procimage(){
        try {
                mos.getModelo();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0,2});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1}, new int[]{450});
                mos.Mostrar_datosI();
        } catch (Exception e) {
        }
    }
    public void proclab(){
        try {
                mos.getModelo();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0,2});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1}, new int[]{450});
                mos.Mostrar_datosL();
        } catch (Exception e) {
        }
    }
    public void procMon(){
        try {
                mos.getModelo();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0,2});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1}, new int[]{450});
                mos.Mostrar_datosM();
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
