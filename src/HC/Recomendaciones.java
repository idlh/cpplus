package HC;

import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.Save;
import Clases.Funciones_AD;
import java.awt.Color;

/**
 *
 * @author Camilo
 */
public class Recomendaciones extends javax.swing.JPanel {

    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    Save sav = new Save();
    Funciones_AD Funciones = new Funciones_AD();

    public Recomendaciones(PypAdmAsistCon pypAdmAsistCon) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(408, 297));
        setMinimumSize(new java.awt.Dimension(408, 297));
        setPreferredSize(new java.awt.Dimension(408, 297));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/reco.png"))); // NOI18N
        jLabel1.setText("Recomendaciones");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Ninguna");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
        });
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        jTextArea1.setForeground(Color.black);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        jTextArea1.selectAll();
    }//GEN-LAST:event_jTextArea1FocusGained

    public void actrecomendaciones(String idhc) {
        act.actrecomendaciones(idhc, jTextArea1.getText().toUpperCase().toString());
    }

    public void cargarrecom(String idhc) {
        Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
        if (!h[0][26].toString().equals("NINGUNA")) {
            jTextArea1.setForeground(Color.BLACK);
            jTextArea1.setText(h[0][26].toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel jLabel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
