/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_pyp;

import Clases.Declaraciones_AD;
import Dialogos.HCDiag.ListPacientes;
import javax.swing.JOptionPane;
public class Desktop extends javax.swing.JFrame {
Clases.Declaraciones_AD Declaraciones = new Clases.Declaraciones_AD();
public Administrativo.C_Agendar Agendar = new Administrativo.C_Agendar();
public Administrativo.C_Confirmar Confirmar = new Administrativo.C_Confirmar();
    /**
     * Creates new form Desktop
     */
    public Desktop() {
        initComponents();
        setLocationRelativeTo(this);
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
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Contenedor_ = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/header.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 980, 70);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel7.setText("Clínica Pajonal LTDA.");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(450, 30, 110, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/footer.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 980, 60);

        Contenedor_.setLayout(null);

        jPanel5.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/37.png"))); // NOI18N
        jLabel5.setText("Agendar Pacientes");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel5.add(jLabel5);
        jLabel5.setBounds(20, 30, 170, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/male.png"))); // NOI18N
        jLabel10.setText("Re - programar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel10);
        jLabel10.setBounds(20, 94, 160, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clip_board.png"))); // NOI18N
        jLabel9.setText("Confirmar Asistencia");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 64, 150, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_blue.png"))); // NOI18N
        jLabel4.setText("Menú Principal");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, 4, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Menu_Izquierdo.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 203, 304);

        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 310, 34, 30);

        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(54, 310, 34, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Contenedor_, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contenedor_, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setLocation(20, 28);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setLocation(20, 30);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
       jLabel9.setLocation(20, 62);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setLocation(20, 64);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Lanzar_Agend();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       Lanzar_Asistencia();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        ListPacientes lp = new ListPacientes(this, true);
        lp.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseReleased
    private void Lanzar_Agend(){
        try {        
            if(Contenedor_.getComponentCount()==0){
                Load_Contenedor();
                Declaraciones_AD.CContenedor.area.addTab("Agendar Pacientes",Agendar);
                Declaraciones_AD.CContenedor.area.setSelectedComponent(Agendar);
                Agendar.repaint();
                Agendar.validate();
                }else{
                Declaraciones_AD.CContenedor.area.addTab("Agendar Pacientes",Agendar);
                Declaraciones_AD.CContenedor.area.setSelectedComponent(Agendar);
                Agendar.repaint();
                Agendar.validate();
                }
                Declaraciones_AD.CContenedor.area.repaint();
                Declaraciones_AD.CContenedor.area.validate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void Lanzar_Asistencia(){
        try {
            if(Contenedor_.getComponentCount()==0){
               Load_Contenedor();
               Declaraciones_AD.CContenedor.area.addTab("Confirmar Asistencia", Confirmar);
               Declaraciones_AD.CContenedor.area.setSelectedComponent(Confirmar);
               Agendar.repaint();
               Agendar.validate();
            }else{
               Declaraciones_AD.CContenedor.area.addTab("Confirmar Asistencia", Confirmar);
               Declaraciones_AD.CContenedor.area.setSelectedComponent(Confirmar);
               Agendar.repaint();
               Agendar.validate(); 
            }
            Declaraciones_AD.CContenedor.area.repaint();
            Declaraciones_AD.CContenedor.area.validate();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.getMessage()); 
        }
    }
    private void Load_Contenedor(){
        Contenedor_.removeAll();
        Declaraciones_AD.CContenedor.setBounds(0, 0, 745, 393);
        Contenedor_.add(Declaraciones_AD.CContenedor);
        this.repaint();
        Contenedor_.repaint();
        Contenedor_.validate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Contenedor_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
