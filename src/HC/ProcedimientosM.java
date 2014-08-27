package HC;

import Clases.Actualizar;
import Clases.CargarordenesM;
import Clases.Funciones_AD;
import Clases.IconCellRendererlabel;
import Clases.Save;
import Dialogos.HCDiag.Dprocedimientos;
import entity.PypAdmAsistCon;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Dialogos.HCDiag.PrpProcedimiento;

/**
 *
 * @author Camilo
 */
public class ProcedimientosM extends javax.swing.JPanel {

    Dialogos.HCDiag.Dprocedimientos prog;
    private DefaultTableModel modelo;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    Actualizar act = new Actualizar();
    private final PypAdmAsistCon pypAdmAsistCon;
    public String idcolumna;
    CargarordenesM tab = new CargarordenesM();
    String est = "1";
    int rowindex;
    ImageIcon icon = null, icono2 = null, icono3 = null;
    Object[] fila = new Object[2];
    private final int usuario;

    public ProcedimientosM(PypAdmAsistCon pypAdmAsistCon, Integer usuario) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        this.usuario = usuario;
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Justificaciones = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablemonitorizacion = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Justificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clip_board.png"))); // NOI18N
        Justificaciones.setText("Justificaciones");
        Justificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Justificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JustificacionesMouseReleased(evt);
            }
        });
        jPopupMenu1.add(Justificaciones);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(408, 297));
        setMinimumSize(new java.awt.Dimension(408, 297));
        setPreferredSize(new java.awt.Dimension(408, 297));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Procedimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        Tablemonitorizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tablemonitorizacion.setComponentPopupMenu(jPopupMenu1);
        Tablemonitorizacion.setFocusable(false);
        Tablemonitorizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablemonitorizacionMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Tablemonitorizacion);

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_red.png"))); // NOI18N
        jLabel4.setText("Eliminado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_green.png"))); // NOI18N
        jLabel3.setText("Guardado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_blue.png"))); // NOI18N
        jLabel2.setText("Sin guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/1389649334_first_aid_kit.png"))); // NOI18N
        jLabel1.setText("Monitorización y tratamientos diagnosticos");

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
        darayuda("Añadir Procedimiento");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        retornarayuda();
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        darayuda("Quitar Procedimiento");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        retornarayuda();
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        if (Tablemonitorizacion.getSelectedRow() > -1) {
            if (Tablemonitorizacion.getValueAt(Tablemonitorizacion.getSelectedRow(), 4).toString().equals("0")) {
                Tablemonitorizacion.setValueAt("2", Tablemonitorizacion.getSelectedRow(), 4);
                icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_green.png"));
                modelo.setValueAt(fila[0] = new JLabel(icon), Tablemonitorizacion.getSelectedRow(), 5);
            } else {
                pasarprocedimientos();
            }
        } else {
            pasarprocedimientos();
        }
    }//GEN-LAST:event_jButton1MouseReleased

    private void TablemonitorizacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablemonitorizacionMouseEntered
        rowindex = Tablemonitorizacion.rowAtPoint(evt.getPoint());
        Tablemonitorizacion.setToolTipText((String) Tablemonitorizacion.getValueAt(rowindex, 2));
    }//GEN-LAST:event_TablemonitorizacionMouseEntered

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        quitarrgistro();
    }//GEN-LAST:event_jButton3MouseReleased

    private void JustificacionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JustificacionesMouseReleased
        final PrpProcedimiento procedi = new PrpProcedimiento((Frame) SwingUtilities.getWindowAncestor(this), true);
        icono2 = new javax.swing.ImageIcon(getClass().getResource("/Recursos/savec2.png"));
        icono3 = new javax.swing.ImageIcon(getClass().getResource("/Recursos/savec1.png"));
        procedi.jButton1.setIcon(icono2);
        procedi.jButton1.setRolloverIcon(icono3);
        procedi.jLabel2.setText("<html>\n"
                + "<div style=\"width:380;\">" + String.valueOf(Tablemonitorizacion.getValueAt(Tablemonitorizacion.getSelectedRow(), 2)) + "\n"
                + "</div>\n"
                + "\n"
                + "</html>");
        procedi.jTextArea1.setText(modelo.getValueAt(Tablemonitorizacion.getSelectedRow(), 6).toString());
        if (modelo.getValueAt(Tablemonitorizacion.getSelectedRow(), 8).toString().equals("1")) {
            procedi.jCheckBox1.setSelected(true);
        } else {
            procedi.jCheckBox1.setSelected(false);
        }
        procedi.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String examen;
                if (procedi.jCheckBox1.isSelected() == true) {
                    examen = "1";
                } else {
                    examen = "0";
                }
                modelo.setValueAt(procedi.jTextArea1.getText().toUpperCase(), Tablemonitorizacion.getSelectedRow(), 6);
                modelo.setValueAt(examen, Tablemonitorizacion.getSelectedRow(), 8);
                icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_blue.png"));
                modelo.setValueAt(fila[0] = new JLabel(icon), Tablemonitorizacion.getSelectedRow(), 5);
                Tablemonitorizacion.setDefaultRenderer(Object.class, new IconCellRendererlabel());
                procedi.dispose();
            }
        });
        procedi.setLocationRelativeTo(null);
        procedi.setVisible(true);
        est = "5";
    }//GEN-LAST:event_JustificacionesMouseReleased
    private void tabla() {
        try {
            getModelo();
            Tablemonitorizacion.getTableHeader().setReorderingAllowed(false);
            Tablemonitorizacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(Tablemonitorizacion, new int[]{0, 3, 4, 6});
            Funciones_AD.setSizeColumnas(Tablemonitorizacion, new int[]{1, 2, 5}, new int[]{45, 295, 16});
            Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b != 0) {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
                String idhc = (c[0][0].toString());
                tab.cargartabla(modelo, idhc, "16");
                for (int u = 0; u < modelo.getRowCount(); u++) {
                    if (modelo.getValueAt(u, 4).equals("2")) {
                        icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_green.png"));
                        modelo.setValueAt(fila[0] = new JLabel(icon), u, 5);
                        Tablemonitorizacion.setDefaultRenderer(Object.class, new IconCellRendererlabel());
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), ProcedimientosM.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Codigo", "Procedimiento", "Categoria", "Estado", "", "Justificacion", "idp", "Examen"}) {
                    Class[] types = new Class[]{
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
                        false, false, false, false, false, false, false, false, false
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
        Tablemonitorizacion.setModel(modelo);
    }

    public void Agregar_Registro(String r1, String r2, String r3, String r4, String r5, ImageIcon icon, String r6, String r7, String r8) {
        try {
            Object nuevo[] = {r1, r2, r3, r4, r5, icon, r6, r7, r8};
            modelo.addRow(nuevo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " :(  " + e.getMessage());
        }
    }

    public void quitarrgistro() {
        if (modelo.getRowCount() > 0 && Tablemonitorizacion.getSelectedRow() > -1) {
            if (modelo.getValueAt(Tablemonitorizacion.getSelectedRow(), 4).equals("2")) {
                modelo.setValueAt("0", Tablemonitorizacion.getSelectedRow(), 4);
                if (modelo.getValueAt(Tablemonitorizacion.getSelectedRow(), 4).equals("0")) {
                    icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_red.png"));
                    modelo.setValueAt(fila[0] = new JLabel(icon), Tablemonitorizacion.getSelectedRow(), 5);
                    Tablemonitorizacion.setDefaultRenderer(Object.class, new IconCellRendererlabel());
                }
                est = "3";
            } else {
                if (modelo.getRowCount() > 0 && Tablemonitorizacion.getSelectedRow() > -1) {
                    if (modelo.getValueAt(Tablemonitorizacion.getSelectedRow(), 4).equals("1")) {
                        modelo.removeRow(Tablemonitorizacion.getSelectedRow());
                    }
                }
            }
        }
    }

    public void actprocemon(String idhc) {
        Date fecha = pypAdmAsistCon.getFecha();
        String patron = "yyyy-MM-dd", fc;
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        fc = formato.format(fecha);
        if (est.toString().equals("2")) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                if (modelo.getValueAt(i, 4).equals("1")) {
                    modelo.setValueAt("2", i, 4);
                    sav.newproce(idhc, modelo.getValueAt(i, 0).toString(),
                            String.valueOf(usuario), modelo.getValueAt(i, 4).toString(), fc, modelo.getValueAt(i, 6).toString().toUpperCase(),
                            modelo.getValueAt(i, 8).toString());
                }
            }
        } else {
            if (est.toString().equals("3")) {
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    if (modelo.getValueAt(i, 4).equals("0")) {
                        act.actprocedimiento(idhc, modelo.getValueAt(Tablemonitorizacion.getSelectedRow(), 0).toString(), "0");
                    }
                }
            } else {
                if (est.toString().equals("5")) {
                    for (int i = 0; i < modelo.getRowCount(); i++) {
                        if (modelo.getValueAt(i, 4).toString().equals("2")) {
                            act.actobservacionp(modelo.getValueAt(i, 7).toString(), modelo.getValueAt(i, 6).toString());
                            act.actexamen(modelo.getValueAt(i, 7).toString(), modelo.getValueAt(i, 8).toString());
                        } else {
                            if (modelo.getValueAt(i, 4).equals("1")) {
                                modelo.setValueAt("2", i, 4);
                                sav.newproce(idhc, modelo.getValueAt(i, 0).toString(),
                                        String.valueOf(usuario), modelo.getValueAt(i, 4).toString(), fc, modelo.getValueAt(i, 6).toString().toUpperCase(),
                                        modelo.getValueAt(i, 8).toString());
                            }
                        }
                    }
                }
            }
        }
        est = "1";
        Tablemonitorizacion.removeAll();
        tabla();
    }

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

    private void pasarprocedimientos() {
        final Dprocedimientos pr = new Dprocedimientos((Frame) SwingUtilities.getWindowAncestor(this), true);
        pr.procMon();
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
                    final PrpProcedimiento procedi = new PrpProcedimiento(null, true);
                    procedi.jLabel2.setText("<html>\n"
                            + "<div style=\"width:380;\">" + String.valueOf(pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 2)) + "\n"
                            + "</div>\n"
                            + "\n"
                            + "</html>");
                    procedi.jButton1.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (!procedi.jTextArea1.getText().equals("")) {
                                String examen;
                                if (procedi.jCheckBox1.isSelected() == true) {
                                    examen = "1";
                                } else {
                                    examen = "0";
                                }
                                icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/bullet_blue.png"));
                                Agregar_Registro(pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 0).toString(),
                                        pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 1).toString(),
                                        pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 2).toString(),
                                        pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 3).toString(),
                                        "1", icon, procedi.jTextArea1.getText(), null, examen);
                                pr.dispose();
                                for (int u = 0; u < modelo.getRowCount(); u++) {
                                    if (modelo.getValueAt(u, 4).equals("1")) {
                                        modelo.setValueAt(fila[0] = new JLabel(icon), u, 5);
                                        Tablemonitorizacion.setDefaultRenderer(Object.class, new IconCellRendererlabel());
                                    }
                                }
                                procedi.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Debe existir una justificacion para que pueda ordenarse el procedimiento");
                            }
                        }
                    });
                    procedi.setLocationRelativeTo(null);
                    procedi.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Ya el procedimiento fue agregado");
                }
            }
        });
        pr.setVisible(true);
        est = "2";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuItem Justificaciones;
    javax.swing.JTable Tablemonitorizacion;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JPanel jPanel1;
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
