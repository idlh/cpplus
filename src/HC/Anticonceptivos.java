package HC;

import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.Save;
import Clases.Funciones_AD;
import Dialogos.HCDiag.Dmedicamentosanti;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Clases.CargarordenesM;
import java.awt.event.MouseAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import Dialogos.HCDiag.Mostrarmed;
import Dialogos.HCDiag.Dprocedimientos;

/**
 *
 * @author Camilo
 */
public class Anticonceptivos extends javax.swing.JPanel {

    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    Save sav = new Save();
    Funciones_AD Funciones = new Funciones_AD();
    Clases.Cmedicamentos med = new Clases.Cmedicamentos();
    String id, dosis, cantidad, dosisu, via, administracion, fc, fh;
    public DefaultTableModel modelomedi, modelo;
    int row;
    CargarordenesM tab = new CargarordenesM();
    Dialogos.HCDiag.Mostrarmed mosmed;
    Dialogos.HCDiag.Dprocedimientos prog;
    String est = "1", est2 = "1";
    int columnindex, rowindex;
    private final String opc[] = {"Dispositivo Intrauterino", "Dispositivo Intrauterino y Barrera", "Implante Subdérmico", "Implante Subdérmico y Barrera", "Oral",
        "Oral y Barrera", "Inyectable Mensual", "Inyectable Mensual y Barrera", "Inyectable Trimestral", "Inyectable Trimestral y Barrera", "Emergencia",
        "Emergencia y Barrera", "Esterilización", "Esterilización y Barrera", "Barrera"};

    public Anticonceptivos(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        cargar();
        tabla();
        Tabaantimedi.addMouseListener(new MouseAdapter() {
        });
        if (jCheckBox2.isSelected() == false) {
            jTextField1.setEnabled(false);
        } else {
            jTextField1.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabaantimedi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaantiq = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clip_board.png"))); // NOI18N
        jMenuItem2.setText("Propiedades");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.setMaximumSize(new java.awt.Dimension(100, 22));
        jMenuItem2.setMinimumSize(new java.awt.Dimension(100, 22));
        jMenuItem2.setPreferredSize(new java.awt.Dimension(100, 22));
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(408, 297));
        setMinimumSize(new java.awt.Dimension(408, 297));
        setPreferredSize(new java.awt.Dimension(408, 297));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/preservativos.png"))); // NOI18N
        jLabel1.setText("Metodos anticonceptivos");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Eleccion informada");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        Tabaantimedi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabaantimedi.setComponentPopupMenu(jPopupMenu1);
        Tabaantimedi.setFocusable(false);
        Tabaantimedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabaantimediMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabaantimedi);

        tablaantiq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaantiq.setFocusable(false);
        tablaantiq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaantiqMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(tablaantiq);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quitarc1d.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quitarc2d.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quitarc1d.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quitarc2d.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Preservativos");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/quirur.png"))); // NOI18N
        jLabel2.setText("Metodos Quirúrgicos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/medicine.png"))); // NOI18N
        jLabel3.setText("Metodos Suministrables o inyectables");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setText("Cantidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(115, 245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        final Dmedicamentosanti medi = new Dmedicamentosanti((Frame) SwingUtilities.getWindowAncestor(this), true);
        medi.jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (medi.jTextField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "La dosis a aplicar no puede estar vacia");
                    medi.jTextField2.requestFocus();
                } else {
                    if (medi.jComboBox1.getSelectedIndex() == -1) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una unidad para la dosis");
                        medi.jTextField2.requestFocus();
                    } else {
                        if (medi.jComboBox2.getSelectedIndex() == -1) {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar una via de administracion");
                            medi.jTextField2.requestFocus();
                        } else {
                            if (medi.jTextField3.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "La cantidad de suministro no puede ser nula");
                                medi.jTextField3.requestFocus();
                            } else {
                                String Seleccion;
                                Seleccion = (String) JOptionPane.showInputDialog(null, "Tipo de Metodo", "Mensaje", JOptionPane.QUESTION_MESSAGE,
                                        null, opc, "Dispositivo Intrauterino");
                                if (Seleccion != null) {
                                    Agregar_Registro(medi.Tmedicamentos.getValueAt(medi.Tmedicamentos.getSelectedRow(), 0).toString(),
                                            medi.Tmedicamentos.getValueAt(medi.Tmedicamentos.getSelectedRow(), 1).toString(),
                                            medi.jTextField2.getText(),
                                            medi.jComboBox1.getSelectedItem().toString(),
                                            medi.jComboBox2.getSelectedItem().toString(),
                                            medi.jTextArea1.getText().toString(),
                                            medi.jTextField3.getText().toString(),
                                            "1", Seleccion
                                    );
                                    medi.dispose();
                                    id = String.valueOf(medi.Tmedicamentos.getSelectedRow());
                                    dosis = medi.jTextField2.getText().toString();
                                    cantidad = medi.jTextField3.getText().toString();
                                    dosisu = medi.jComboBox1.getSelectedItem().toString();
                                    via = medi.jComboBox2.getSelectedItem().toString();
                                    administracion = medi.jTextArea1.getText().toString();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Debe Seleccionar que tipo de metodo es el medicamento");
                                }
                            }
                        }
                    }
                }
            }
        });
        medi.setVisible(true);
        est2 = "2";
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        final Dprocedimientos pr = new Dprocedimientos((Frame) SwingUtilities.getWindowAncestor(this), true);
        pr.procanti();
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
                    String Seleccion;
                    Seleccion = (String) JOptionPane.showInputDialog(null, "Tipo de Metodo", "Mensaje", JOptionPane.QUESTION_MESSAGE,
                            null, opc, "Dispositivo Intrauterino");
                    if (Seleccion != null) {
                        Agregar_Registroanti(pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 0).toString(),
                                pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 1).toString(),
                                pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 2).toString(),
                                pr.jTable1.getValueAt(pr.jTable1.getSelectedRow(), 3).toString(),
                                "1", Seleccion);
                        pr.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo para el procedimiento");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ya el procedimiento fue agregado");
                }
            }
        });
        pr.setVisible(true);
        est = "2";
    }//GEN-LAST:event_jButton3MouseReleased

    private void TabaantimediMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabaantimediMouseReleased
        row = Tabaantimedi.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TabaantimediMouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        mosmed = new Mostrarmed((Frame) SwingUtilities.getWindowAncestor(this), true);
        mosmed.jTextArea1.setText(Tabaantimedi.getValueAt(row, 1).toString());
        mosmed.jLabel3.setText(Tabaantimedi.getValueAt(row, 2).toString() + " - " + Tabaantimedi.getValueAt(row, 3).toString());
        mosmed.jLabel7.setText(Tabaantimedi.getValueAt(row, 4).toString());
        mosmed.jTextArea2.setText(Tabaantimedi.getValueAt(row, 5).toString().toUpperCase());
        mosmed.setLocationRelativeTo(null);
        mosmed.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void tablaantiqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaantiqMouseEntered
        rowindex = tablaantiq.rowAtPoint(evt.getPoint());
        columnindex = tablaantiq.columnAtPoint(evt.getPoint());
        tablaantiq.setToolTipText((String) tablaantiq.getValueAt(rowindex, columnindex));
    }//GEN-LAST:event_tablaantiqMouseEntered

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        quitarrgistro();
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        quitarrgistroanti();
    }//GEN-LAST:event_jButton4MouseReleased

    private void jCheckBox2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseReleased
        if (jCheckBox2.isSelected() == true) {
            jTextField1.setEnabled(true);
            jTextField1.requestFocus();
        } else {
            jTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2MouseReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.selectAll();
    }//GEN-LAST:event_jTextField1FocusGained

    public void Agregar_Registro(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        try {
            Object nuevo[] = {r1, r2, r3, r4, r5, r6, r7, r8, r9};
            modelomedi.addRow(nuevo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " :(  " + e.getMessage());
        }
    }

    public void getModelo() {
        modelomedi = new DefaultTableModel(
                null, new String[]{"Id", "Medicamento", "dosisf", "dosisff", "viaf", "observacion", "Cantidad sum", "estado", "Tipo"}) {
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
        Tabaantimedi.setModel(modelomedi);
    }

    private void cargar() {
        getModelo();
        Tabaantimedi.getTableHeader().setReorderingAllowed(false);
        Tabaantimedi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Funciones_AD.setOcultarColumnas(Tabaantimedi, new int[]{0, 2, 3, 4, 6, 5, 7, 8});
        Funciones_AD.setSizeColumnas(Tabaantimedi, new int[]{1}, new int[]{650});
        Object a[][];
        a = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
        int b = Integer.parseInt(a[0][0].toString());
        if (b != 0) {
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
            String d = (c[0][0].toString());
            tab.cargartablamedianti(modelomedi, d);
        }
    }

    public void quitarrgistro() {
        if (modelomedi.getRowCount() > 0 && Tabaantimedi.getSelectedRow() > -1) {
            if (modelomedi.getValueAt(Tabaantimedi.getSelectedRow(), 7).equals("2")) {
                modelomedi.setValueAt("0", row, 7);
                est2 = "3";
            } else {
                if (modelomedi.getRowCount() > 0 && Tabaantimedi.getSelectedRow() > -1) {
                    if (modelomedi.getValueAt(Tabaantimedi.getSelectedRow(), 7).equals("1")) {
                        modelomedi.removeRow(Tabaantimedi.getSelectedRow());
                    }
                }
            }
        }
    }

    public void actmedicamentos() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Date fecha = pypAdmAsistCon.getFecha();
        Date hora = pypAdmAsistCon.getHora();
        String patronh = "HH:mm:ss";
        String patron = "yyyy-MM-dd ";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        SimpleDateFormat formatoh = new SimpleDateFormat(patronh);
        fc = formato.format(fecha);
        fh = formatoh.format(hora);
        if (est2.toString().equals("2")) {
            for (int i = 0; i < modelomedi.getRowCount(); i++) {
                if (modelomedi.getValueAt(i, 7).equals("1")) {
                    modelomedi.setValueAt("2", i, 7);
                    sav.newposoanti(d, modelomedi.getValueAt(i, 0).toString(), modelomedi.getValueAt(i, 2).toString(),
                            modelomedi.getValueAt(i, 6).toString(), modelomedi.getValueAt(i, 3).toString(),
                            modelomedi.getValueAt(i, 4).toString(), modelomedi.getValueAt(i, 5).toString().toUpperCase(),
                            pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc + fh, modelomedi.getValueAt(i, 7).toString());
                    sav.newantim(d, modelomedi.getValueAt(i, 0).toString(), modelomedi.getValueAt(i, 8).toString());
                }
            }
        } else {
            if (est2.toString().equals("3")) {
                for (int i = 0; i < modelomedi.getRowCount(); i++) {
                    if (modelomedi.getValueAt(i, 7).equals("0")) {
                        act.actposologia(d, modelomedi.getValueAt(Tabaantimedi.getSelectedRow(), 0).toString(), modelomedi.getValueAt(Tabaantimedi.getSelectedRow(), 2).toString());
                        act.actanti4505m(d, modelomedi.getValueAt(Tabaantimedi.getSelectedRow(), 0).toString());
                    }
                }
            }
        }
        est2 = "1";
        Tabaantimedi.removeAll();
        cargar();
    }

    public void Agregar_Registroanti(String r1, String r2, String r3, String r4, String r5, String r6) {
        try {
            Object nuevo[] = {r1, r2, r3, r4, r5, r6};
            modelo.addRow(nuevo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " :(  " + e.getMessage());
        }
    }

    public void getModeloanti() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Codigo", "Procedimiento", "Categoria", "Estado", "Tipo"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false
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
        tablaantiq.setModel(modelo);
    }

    private void tabla() {
        try {
            getModeloanti();
            tablaantiq.getTableHeader().setReorderingAllowed(false);
            tablaantiq.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(tablaantiq, new int[]{0, 3, 4, 5});
            Funciones_AD.setSizeColumnas(tablaantiq, new int[]{1, 2}, new int[]{45, 405});
            Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b != 0) {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
                String d = (c[0][0].toString());
                tab.cargartablaanti(modelo, d);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), ProcedimientosQ.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void actprocedanti() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Date fecha = pypAdmAsistCon.getFecha();
        String patron = "yyyy-MM-dd", fc;
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        fc = formato.format(fecha);
        if (est.toString().equals("2")) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                if (modelo.getValueAt(i, 4).equals("1")) {
                    modelo.setValueAt("2", i, 4);
                    sav.newproceanti(d, modelo.getValueAt(i, 0).toString(),
                            pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), modelo.getValueAt(i, 4).toString(), fc);
                    sav.newantip(d, modelo.getValueAt(i, 0).toString(), modelo.getValueAt(i, 5).toString());
                }
            }
        } else {
            if (est.toString().equals("3")) {
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    if (modelo.getValueAt(i, 4).equals("0")) {
                        act.actprocedimiento(d, modelo.getValueAt(tablaantiq.getSelectedRow(), 0).toString(), "0");
                        act.actanti4505p(d, modelo.getValueAt(tablaantiq.getSelectedRow(), 1).toString());
                    }
                }
            }
        }
        est = "1";
        tablaantiq.removeAll();
        tabla();
    }

    public void quitarrgistroanti() {
        if (modelo.getRowCount() > 0 && tablaantiq.getSelectedRow() > -1) {
            if (modelo.getValueAt(tablaantiq.getSelectedRow(), 4).equals("2")) {
                modelo.setValueAt("0", rowindex, 4);
                est = "3";
            } else {
                if (modelo.getRowCount() > 0 && tablaantiq.getSelectedRow() > -1) {
                    if (modelo.getValueAt(tablaantiq.getSelectedRow(), 4).equals("1")) {
                        modelo.removeRow(tablaantiq.getSelectedRow());
                    }
                }
            }
        }
    }

    public void guardaranticonceptivos() {
        actmedicamentos();
        actprocedanti();
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        String da1, da2, da3;
        if (jCheckBox1.isSelected() == true) {
            da1 = "1";
        } else {
            da1 = "0";
        }
        if (jCheckBox2.isSelected() == true) {
            da2 = "1";
        } else {
            da2 = "0";
        }
        if (jTextField1.getText().toString().equals("")) {
            da3 = "998";
        } else {
            da3 = jTextField1.getText().toString();
        }
        act.actanticonceptivos(d, da1, da2, da3);
    }

    public void cargaranticonceptivos() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object pypdata[][] = Funciones.RetornarDatos(act.cargaranticonceptivos(d));
        if (pypdata[0][2].toString().equals("1")) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
        }
        if (pypdata[0][3].toString().equals("1")) {
            jCheckBox2.setSelected(true);
        } else {
            jCheckBox2.setSelected(false);
        }
        if (pypdata[0][4].toString().equals("998")) {
            jTextField1.setText("");
        } else {
            jTextField1.setText(pypdata[0][4].toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable Tabaantimedi;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JCheckBox jCheckBox2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JTextField jTextField1;
    javax.swing.JTable tablaantiq;
    // End of variables declaration//GEN-END:variables
}
