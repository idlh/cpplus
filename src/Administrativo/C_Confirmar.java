/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

import Controladores.PypAdmAgendJpaController;
import Entidades.PypAdmAgend;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IdlhDeveloper
 */
public class C_Confirmar extends javax.swing.JPanel {
Clases.Funciones_AD Funciones = new Clases.Funciones_AD();
    /**
     * Creates new form C_Confirmar
     */
    public C_Confirmar() {
        initComponents();
        CrearModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(138, 207, 244));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Atención Administrativa");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 160, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/calendar.png"))); // NOI18N
        jLabel2.setText("Confirmación Asistencia");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 22, 280, 20);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(590, 20, 73, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 750, 50);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 50, 750, 10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 363, 750, 10);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tabla.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 730, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(698, 321, 40, 40);

        jLabel4.setText("Fecha:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 50, 20);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(70, 70, 110, 20);

        jLabel5.setText("Busqueda:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 70, 60, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(300, 70, 200, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Aceptar-ok.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(650, 320, 40, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        jLabel7.setToolTipText("Realize una busqueda");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 62, 30, 30);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alert.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(12, 340, 410, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Clases.Declaraciones_AD.CContenedor.area.remove(Clases.Declaraciones_AD.CContenedor.area.getSelectedComponent());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Search_A();
        jLabel8.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(jDateChooser1.getDateEditor().getDate() != null){
            Search_A();
        }else{
           jLabel8.setVisible(true); 
           jLabel8.setText("Por favor ingrese una fecha");
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(tabla.getRowCount()!=0){
            System.out.println("da");
        }else{
           jLabel8.setVisible(true); 
           jLabel8.setText("Por favor realize una busqueda"); 
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Search_A();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static DefaultTableModel modelo;
     private void CrearModelo(){
         try {
             modelo = (new DefaultTableModel(
                null, new String [] {
                "id","Identificacion","Paciente",
                "Programa","Fecha","Hora"}){
                Class[] types = new Class [] {
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                false,false,false,false,false
                };
                @Override
                public Class getColumnClass(int columnIndex) {
                   return types [columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int colIndex){
                   return canEdit [colIndex];
                }
            });
           tabla.setModel(modelo);
           tabla.getTableHeader().setReorderingAllowed(false);
           tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           tabla.getColumnModel().getColumn(1).setPreferredWidth(92);
           tabla.getColumnModel().getColumn(1).setMaxWidth(92);
           tabla.getColumnModel().getColumn(4).setPreferredWidth(70);
           tabla.getColumnModel().getColumn(4).setMaxWidth(70);
           tabla.getColumnModel().getColumn(5).setPreferredWidth(70);
           tabla.getColumnModel().getColumn(5).setMaxWidth(70);
           Funciones.ocultarColumnas(tabla, new int[] {0});
           } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e.toString()+"error2");
            }     
        } 
        private void Search_A(){
            try {
                int u=0;
                Object M[]=null;
                List<PypAdmAgend> Listado;
                String nombre;
                PypAdmAgendJpaController ControlA = new PypAdmAgendJpaController();
                Listado=ControlA.find_Pacientes_Agendados();
                for (int i = 0; i < Listado.size(); i++) {
                modelo.addRow(M);
                nombre= Listado.get(i).getIdPaciente().getNombre1()+" "+Listado.get(i).getIdPaciente().getNombre1()+
                " "+Listado.get(i).getIdPaciente().getApellido1()+" "+Listado.get(i).getIdPaciente().getApellido2();       
                modelo.setValueAt(Listado.get(i), u, 0);   
                modelo.setValueAt(Listado.get(i).getIdPaciente().getNumDoc(), u, 1);
                modelo.setValueAt(nombre, u, 2);   
                modelo.setValueAt(Listado.get(i).getIdPrograma().getNombre(), u, 3);
                modelo.setValueAt(Listado.get(i).getFecha(), u, 4);
                modelo.setValueAt(Listado.get(i).getHora(), u, 5);
                u=u+1;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
