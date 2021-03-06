package HC;

import Clases.Actualizar;
import Clases.Consultarcie10;
import Clases.Funciones_AD;
import Clases.Save;
import Dialogos.HCDiag.DgCie10;
import entity.PypAdmAsistCon;
import entity.StaticCie10;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Camilo
 */
public class DiagnosticosM extends javax.swing.JPanel {

    private Clases.Consultarcie10 cie;
    private final EntityManagerFactory factory;
    private final PypAdmAsistCon pypAdmAsistCon;
    private StaticCie10 cie101, cie102, cie103, cie104;
    int est = 0, est2 = 0, est3 = 0, est4 = 0;
    public int ciep = 0;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    Actualizar act = new Actualizar();
    private final List<String> tratamiento = new ArrayList<String>();
    int seleccion1 = 0, seleccion2 = 0, seleccion3 = 0, seleccion4 = 0;

    public DiagnosticosM(EntityManagerFactory factory, PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.factory = factory;
        this.pypAdmAsistCon = pypAdmAsistCon;
//         pypAdmAsistCon = (PypAdmAsistCon) Dialogos.HCDiag.ListPacientes.jTable1.getValueAt(Dialogos.HCDiag.ListPacientes.jTable1.getSelectedRow(), 0);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z108");
            jTextField1.setEditable(false);
            ciep = 11859;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z348");
            jTextField1.setEditable(false);
            ciep = 11968;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z392");
            jTextField1.setEditable(false);
            ciep = 12008;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z761");
            jTextField1.setEditable(false);
            ciep = 12251;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z300");
            jTextField1.setEditable(false);
            ciep = 11947;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z003");
            jTextField1.setEditable(false);
            ciep = 11798;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
            cie = new Consultarcie10();
            cie.llamar_cie("I10X");
            jTextField1.setEditable(false);
            ciep = 3181;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            cie = new Consultarcie10();
            cie.llamar_cie("Z001");
            jTextField1.setEditable(false);
            ciep = 11796;
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7) {
            cie = new Consultarcie10();
            cie.llamar_cie("E119");
            jTextField1.setEditable(false);
            ciep = 1739;
        }
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        tratamiento.add("NO APLICA");
        tratamiento.add("SI RECIBE PERO AUN NO LO HA TERMINADO");
        tratamiento.add("SI RECIBIÓ TRATAMIENTO Y YA LO TERMINO");
        tratamiento.add("NO RECIBIÓ TRATAMIENTO POR UNA TRADICION");
        tratamiento.add("NO RECIBIÓ TRATAMIENTO POR CONDICION DE SALUD");
        tratamiento.add("NO RECIBIÓ TRATAMIENTO POR NEGACION DEL USUARIO");
        tratamiento.add("NO RECIBIO TRATAMIENTO POR DATOS NO ACTUALIZADOS");
        tratamiento.add("NO RECIBIO TRATAMIENTO POR OTRAS RAZONES");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Diagnostico Medico");

        jLabel1.setText("Diagnostico principal");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(125, 164, 222));

        jLabel2.setText("Diagnostico Relacionado 1");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(125, 164, 222));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton2.setToolTipText("Añadir Dx relacionado 1");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });

        jLabel4.setText("Diagnostico Relacionado 2");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton3.setToolTipText("Añadir Dx relacionado 2");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
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

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(125, 164, 222));

        jLabel5.setText("Diagnostico Relacionado 3");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(125, 164, 222));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton4.setToolTipText("Añadir Dx relacionado 4");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setEnabled(false);
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton5.setToolTipText("Añadir Dx relacionado 3");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setEnabled(false);
        jButton5.setFocusable(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });

        jLabel6.setText("Diagnostico Relacionado 4");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(125, 164, 222));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        final DgCie10 dc = new DgCie10((Frame) SwingUtilities.getWindowAncestor(this), true, factory);
        dc.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] opciones = tratamiento.toArray();
                Object value = JOptionPane.showInputDialog(null, "Tratamiento para el Diagnostico", "mensaje",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                seleccion1 = tratamiento.indexOf(value);
                if (seleccion1 > -1) {
                    cie101 = (StaticCie10) dc.jTable1.getValueAt(dc.jTable1.getSelectedRow(), 0);
                    jTextField2.setText(cie101.getCodigo() + " - " + cie101.getDescripcion());
                    dc.dispose();
                    jButton3.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe añadir el tipo de tratamiento");
                }
            }
        });
        dc.setVisible(true);
        est = 1;
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        final DgCie10 dc = new DgCie10((Frame) SwingUtilities.getWindowAncestor(this), true, factory);
        dc.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] opciones = tratamiento.toArray();
                Object value = JOptionPane.showInputDialog(null, "Tratamiento para el Diagnostico", "mensaje",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                seleccion2 = tratamiento.indexOf(value);
                if (seleccion2 > -1) {
                    cie102 = (StaticCie10) dc.jTable1.getValueAt(dc.jTable1.getSelectedRow(), 0);
                    jTextField3.setText(cie102.getCodigo() + " - " + cie102.getDescripcion());
                    dc.dispose();
                    jButton5.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe añadir el tipo de tratamiento");
                }
            }
        });
        dc.setVisible(true);
        est2 = 2;
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        final DgCie10 dc = new DgCie10((Frame) SwingUtilities.getWindowAncestor(this), true, factory);
        dc.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] opciones = tratamiento.toArray();
                Object value = JOptionPane.showInputDialog(null, "Tratamiento para el Diagnostico", "mensaje",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                seleccion3 = tratamiento.indexOf(value);
                if (seleccion3 > -1) {
                    cie103 = (StaticCie10) dc.jTable1.getValueAt(dc.jTable1.getSelectedRow(), 0);
                    jTextField5.setText(cie103.getCodigo() + " - " + cie103.getDescripcion());
                    dc.dispose();
                    jButton4.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe añadir el tipo de tratamiento");
                }
            }
        });
        dc.setVisible(true);
        est3 = 3;
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        final DgCie10 dc = new DgCie10((Frame) SwingUtilities.getWindowAncestor(this), true, factory);
        dc.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] opciones = tratamiento.toArray();
                Object value = JOptionPane.showInputDialog(null, "Tratamiento para el Diagnostico", "mensaje",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                seleccion4 = tratamiento.indexOf(value);
                if (seleccion4 > -1) {
                    cie104 = (StaticCie10) dc.jTable1.getValueAt(dc.jTable1.getSelectedRow(), 0);
                    jTextField4.setText(cie104.getCodigo() + " - " + cie104.getDescripcion());
                    dc.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe añadir el tipo de tratamiento");
                }
            }
        });
        dc.setVisible(true);
        est4 = 4;
    }//GEN-LAST:event_jButton4MouseReleased

    public void actdx(String idhc) {
        int d1, d2, d3, d4;
        if (est == 1) {
            if (jTextField2.getText().equals("")) {
                d1 = 1;
            } else {
                d1 = cie101.getId();
            }
            act.actdx1(idhc, ciep, d1, seleccion1);
        }
        if (est2 == 2) {
            if (jTextField3.getText().equals("")) {
                d2 = 1;
            } else {
                d2 = cie102.getId();
            }
            act.actdx2(idhc, ciep, d2, seleccion2);
        }
        if (est3 == 3) {
            if (jTextField5.getText().equals("")) {
                d3 = 1;
            } else {
                d3 = cie103.getId();
            }
            act.actdx3(idhc, ciep, d3, seleccion3);
        }
        if (est4 == 4) {
            if (jTextField4.getText().equals("")) {
                d4 = 1;
            } else {
                d4 = cie104.getId();
            }
            act.actdx4(idhc, ciep, d4, seleccion4);
        }
    }

    public void cargardx(String idhc) {
        Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
        Object r1[][] = Funciones.RetornarDatos(act.cargarcierel1(h[0][18].toString()));
        Object r2[][] = Funciones.RetornarDatos(act.cargarcierel2(h[0][19].toString()));
        Object r3[][] = Funciones.RetornarDatos(act.cargarcierel3(h[0][20].toString()));
        Object r4[][] = Funciones.RetornarDatos(act.cargarcierel4(h[0][21].toString()));
        if (h[0][18].toString().equals("1")) {
            jTextField2.setText("");
        } else {
            jTextField2.setText(r1[0][0].toString());
            jButton3.setEnabled(true);
        }
        if (h[0][19].toString().equals("1")) {
            jTextField3.setText("");
        } else {
            jTextField3.setText(r2[0][0].toString());
            jButton5.setEnabled(true);
        }
        if (h[0][20].toString().equals("1")) {
            jTextField5.setText("");
        } else {
            jTextField5.setText(r3[0][0].toString());
            jButton4.setEnabled(true);
        }
        if (h[0][21].toString().equals("1")) {
            jTextField4.setText("");
        } else {
            jTextField4.setText(r4[0][0].toString());
        }
    }

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        darayuda("Añadir Diagnostico");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        retornarayuda();
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        darayuda("Añadir Diagnostico");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        retornarayuda();
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        darayuda("Añadir Diagnostico");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        retornarayuda();
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        darayuda("Añadir Diagnostico");
    }//GEN-LAST:event_jButton4MouseEntered

    private void retornarayuda() {
        switch (pypAdmAsistCon.getIdAgend().getIdPrograma().getId()) {
            case 3:
                HC.Adulto.jLabel4.setText("...");
                break;
            case 9:
                HC.Controlprenatal.jLabel4.setText("...");
                break;
            case 11:
                HC.Postparto.jLabel4.setText("...");
                break;
            case 10:
                HC.RecienNacido.jLabel4.setText("...");
                break;
            case 5:
                HC.Planificacion.jLabel4.setText("...");
                break;
            case 1:
                HC.Jovensano.jLabel4.setText("...");
                break;
            case 6:
                HC.Hipertenso.jLabel4.setText("...");
                break;
            case 2:
                HC.CYDesarrollo.jLabel4.setText("...");
                break;
        }
    }

    private void darayuda(String texto) {
        switch (pypAdmAsistCon.getIdAgend().getIdPrograma().getId()) {
            case 3:
                HC.Adulto.jLabel4.setText(texto);
                break;
            case 9:
                HC.Controlprenatal.jLabel4.setText(texto);
                break;
            case 11:
                HC.Postparto.jLabel4.setText(texto);
                break;
            case 10:
                HC.RecienNacido.jLabel4.setText(texto);
                break;
            case 5:
                HC.Planificacion.jLabel4.setText(texto);
                break;
            case 1:
                HC.Jovensano.jLabel4.setText(texto);
                break;
            case 6:
                HC.Hipertenso.jLabel4.setText(texto);
                break;
            case 2:
                HC.CYDesarrollo.jLabel4.setText(texto);
                break;
        }
    }

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        retornarayuda();
    }//GEN-LAST:event_jButton4MouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JButton jButton5;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField2;
    javax.swing.JTextField jTextField3;
    javax.swing.JTextField jTextField4;
    javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
