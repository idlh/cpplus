/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo.Panelconfig;

import Clases.CargarordenesM;
import Clases.Funciones_AD;
import HC.Adulto;
import HC.AgudezaV;
import HC.CYDesarrollo;
import HC.Controlprenatal;
import HC.Diabetes;
import HC.Hipertenso;
import HC.Jovensano;
import HC.Planificacion;
import HC.Postparto;
import HC.RecienNacido;
import controller.PypAdmAsistConJpaController;
import entity.PypAdmAsistCon;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import modulo_pyp.Desktop;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author Administrador
 */
public class Hhistorias extends javax.swing.JPanel {

    private DefaultTableModel modelo;
    CargarordenesM cargt = new CargarordenesM();
    Properties props = new Properties();
    private EntityManagerFactory factory;
    private PypAdmAsistConJpaController paacjc;
    private PypAdmAsistCon pypAdmAsistCon;
    private final Object dato[] = null;
    public Adulto adult;
    public Controlprenatal controlp;
    public Postparto postparto;
    public RecienNacido reciennacido;
    public Planificacion planificacion;
    public Jovensano jovensano;
    public Hipertenso hipertenso;
    public CYDesarrollo cydesarrollo;
    public AgudezaV agudeza;
    public Diabetes diabetes;
    public int año = 0, mes = 0, edad, idprograma;
    public String progam, name;

    /**
     * Creates new form Hhistorias
     */
    public Hhistorias() {
        initComponents();
        ParametrosBD();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clip_board.png"))); // NOI18N
        jMenuItem1.setText("Revisar");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(562, 345));
        setMinimumSize(new java.awt.Dimension(562, 345));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(125, 164, 222));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(125, 164, 222));
        jLabel1.setText("Busqueda de Historias Clinicas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(125, 164, 222));
        jLabel2.setText("Filtro:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(125, 164, 222));
        jLabel3.setText("Programa:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Joven Sano", "Crecimiento y Desarrollo", "Adulto Sano", "Agudeza Visual", "Planificacion Familiar", "Hipertencion Arterial", "Diabetes", "Citologia", "Control Prenatal", "Recien Nacido", "Post-Parto" }));
        jComboBox1.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search1adm.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(38, 38));
        jButton1.setMinimumSize(new java.awt.Dimension(38, 38));
        jButton1.setPreferredSize(new java.awt.Dimension(38, 38));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search2adm.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 164, 222));
        jLabel4.setText("Desde:");

        jDateChooser1.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 164, 222));
        jLabel5.setText("Hasta:");

        jDateChooser2.setFocusable(false);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Por paciente");
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(125, 164, 222));
        jLabel6.setText("Documento:");

        jTextField1.setEnabled(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc1.png"))); // NOI18N
        jButton6.setToolTipText("Salir");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc2.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, 180, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        jTable1.removeAll();
        showpaciente();
    }//GEN-LAST:event_jButton1MouseReleased

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        if (modelo.getRowCount() > 0 && jTable1.getSelectedRow() > -1) {
            pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            cargarprograma();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente.");
        }
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        if (jTable1.getSelectedRow() != -1) {
            pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            name = pypAdmAsistCon.getIdAgend().getIdPaciente().getNombre1() + " " + pypAdmAsistCon.getIdAgend().getIdPaciente().getApellido1();
            progam = pypAdmAsistCon.getIdAgend().getIdPrograma().getNombre();
            idprograma = pypAdmAsistCon.getIdAgend().getIdPrograma().getId();
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jTable1.removeAll();
        if (jCheckBox1.isSelected() == true) {
            jComboBox1.setEnabled(false);
            jDateChooser1.setEnabled(false);
            jDateChooser2.setEnabled(false);
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
            jTextField1.setEnabled(true);
            jTextField1.requestFocus();
        } else {
            jComboBox1.setEnabled(true);
            jDateChooser1.setEnabled(true);
            jDateChooser2.setEnabled(true);
            jTextField1.setEnabled(false);
            jTextField1.setText(null);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            showpaciente();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        modulo_pyp.Modulo_PyP.d.panelc.Cprincipal.removeAll();
        modulo_pyp.Modulo_PyP.d.panelc.Cprincipal.repaint();
    }//GEN-LAST:event_jButton6MouseReleased
    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "TD", "Documento", "Nombre", "Fecha"}) {
                    Class[] types = new Class[]{
                        PypAdmAsistCon.class,
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
        jTable1.setModel(modelo);
    }

    public void getModelop() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Programa", "Nombre", "Fecha"}) {
                    Class[] types = new Class[]{
                        PypAdmAsistCon.class,
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
        jTable1.setModel(modelo);
    }

    private void tabla() {
        try {
            if (jCheckBox1.isSelected() == false) {
                getModelo();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1, 2, 3, 4}, new int[]{30, 80, 150, 96});
            } else {
                getModelop();
                jTable1.getTableHeader().setReorderingAllowed(false);
                jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                Funciones_AD.setOcultarColumnas(jTable1, new int[]{0});
                Funciones_AD.setSizeColumnas(jTable1, new int[]{1, 2, 3}, new int[]{130, 130, 96});
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), Hhistorias.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Conexion a la persistencia
    private List<String> referenceUser() {
        List<String> parametros = new ArrayList<String>();
        FileReader lector = null;
        try {
            String clipa = System.getProperty("user.dir") + "/src/Recursos/config.clipa";
            String pass = "2f5OKp8g";
            StandardPBEStringEncryptor s = new StandardPBEStringEncryptor();
            s.setPassword(pass);
            String texto = null;
            System.out.println(clipa);
            lector = new FileReader(clipa);

            BufferedReader contenido = new BufferedReader(lector);
            while ((texto = contenido.readLine()) != null) {
                parametros.add(s.decrypt(texto));
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "10133:\n" + ex.getMessage(), Hhistorias.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                lector.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "10134:\n" + ex.getMessage(), Hhistorias.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return parametros;
    }

    private void ParametrosBD() {
        List<String> parametros = referenceUser();
        props.put("javax.persistence.jdbc.user", parametros.get(0));
        props.put("javax.persistence.jdbc.password", parametros.get(1));
        props.put("javax.persistence.jdbc.url", parametros.get(2));
        props.put("javax.persistence.jdbc.driver", parametros.get(3));
    }

    private void showpaciente() {
        factory = Persistence.createEntityManagerFactory("EJB_CEPU", props);
        paacjc = new PypAdmAsistConJpaController(factory);
        List<PypAdmAsistCon> asistCon = null;
        if (jCheckBox1.isSelected() == false) {
            if (jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un rango de fechas valido");
            } else {
                asistCon = paacjc.listPypAdmAsistConadmin(jComboBox1.getSelectedIndex() + 1, jDateChooser1.getDate(), jDateChooser2.getDate());
                tabla();
                if (asistCon != null) {
                    while (modelo.getRowCount() > 0) {
                        modelo.removeRow(0);
                    }
                    for (int i = 0; i < asistCon.size(); i++) {
                        modelo.addRow(dato);
                        modelo.setValueAt(asistCon.get(i), i, 0);
                        modelo.setValueAt(asistCon.get(i).getIdAgend().getIdPaciente().getTipoDoc(), i, 1);
                        modelo.setValueAt(asistCon.get(i).getIdAgend().getIdPaciente().getNumDoc(), i, 2);
                        modelo.setValueAt(asistCon.get(i).getIdAgend().getIdPaciente().getNombre1() + " "
                                + asistCon.get(i).getIdAgend().getIdPaciente().getApellido1(), i, 3);
                        Date fecha = asistCon.get(i).getFecha(), hora = asistCon.get(i).getHora();
                        String patron = "dd/MM/yyyy", fech, hor, patrn = "HH:mm";
                        SimpleDateFormat formato = new SimpleDateFormat(patron);
                        SimpleDateFormat formath = new SimpleDateFormat(patrn);
                        fech = formato.format(fecha);
                        hor = formath.format(hora);
                        modelo.setValueAt(fech + " " + hor, i, 4);
                    }
                }
            }
        } else {
            asistCon = paacjc.listPypAdmAsistConadminp(jTextField1.getText().trim());
            tabla();
            if (asistCon != null) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                for (int i = 0; i < asistCon.size(); i++) {
                    modelo.addRow(dato);
                    modelo.setValueAt(asistCon.get(i), i, 0);
                    String nombrep = null;
                    switch (asistCon.get(i).getIdAgend().getIdPrograma().getId()) {
                        case 1:
                            nombrep = "Joven Sano".toUpperCase();
                            break;
                        case 2:
                            nombrep = "Crecimiento y Dllo".toUpperCase();
                            break;
                        case 3:
                            nombrep = "Adulto Sano".toUpperCase();
                            break;
                        case 4:
                            nombrep = "Agudeza Visual".toUpperCase();
                            break;
                        case 5:
                            nombrep = "Planificacion".toUpperCase();
                            break;
                        case 6:
                            nombrep = "Hipertencion".toUpperCase();
                            break;
                        case 7:
                            nombrep = "Diabetes".toUpperCase();
                            break;
                        case 8:
                            nombrep = "Citologia".toUpperCase();
                            break;
                        case 9:
                            nombrep = "Control Prenatal".toUpperCase();
                            break;
                        case 10:
                            nombrep = "Recien Nacido".toUpperCase();
                            break;
                        case 11:
                            nombrep = "Post - Parto".toUpperCase();
                            break;
                    }
                    modelo.setValueAt(nombrep, i, 1);
                    modelo.setValueAt(asistCon.get(i).getIdAgend().getIdPaciente().getNombre1() + " "
                            + asistCon.get(i).getIdAgend().getIdPaciente().getApellido1(), i, 2);
                    Date fecha = asistCon.get(i).getFecha(), hora = asistCon.get(i).getHora();
                    String patron = "dd/MM/yyyy", fech, hor, patrn = "HH:mm";
                    SimpleDateFormat formato = new SimpleDateFormat(patron);
                    SimpleDateFormat formath = new SimpleDateFormat(patrn);
                    fech = formato.format(fecha);
                    hor = formath.format(hora);
                    modelo.setValueAt(fech + " " + hor, i, 3);
                }
            }
        }
        jTable1.removeAll();
    }
    //Fin parametros persistencia

    private void cargarprograma() {
        pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            adult = new Adulto(factory, pypAdmAsistCon);
            adult.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(adult);
            adult.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            adult = new Adulto(factory, pypAdmAsistCon);
            adult.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(adult);
            adult.jLabel3.setText("Consulta de Control");
            adult.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            controlp = new Controlprenatal(factory, pypAdmAsistCon);
            controlp.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(controlp);
            controlp.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            controlp = new Controlprenatal(factory, pypAdmAsistCon);
            controlp.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(controlp);
            controlp.jLabel3.setText("Consulta de Control");
            controlp.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            postparto = new Postparto(factory, pypAdmAsistCon);
            postparto.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(postparto);
            postparto.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            reciennacido = new RecienNacido(factory, pypAdmAsistCon);
            reciennacido.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(reciennacido);
            reciennacido.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            planificacion = new Planificacion(factory, pypAdmAsistCon);
            planificacion.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(planificacion);
            planificacion.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            planificacion = new Planificacion(factory, pypAdmAsistCon);
            planificacion.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(planificacion);
            planificacion.jLabel3.setText("Consulta de Control");
            planificacion.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            jovensano = new Jovensano(factory, pypAdmAsistCon);
            jovensano.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(jovensano);
            jovensano.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            jovensano = new Jovensano(factory, pypAdmAsistCon);
            jovensano.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(jovensano);
            jovensano.jLabel3.setText("Consulta de Control");
            jovensano.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            hipertenso = new Hipertenso(factory, pypAdmAsistCon);
            hipertenso.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(hipertenso);
            hipertenso.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            hipertenso = new Hipertenso(factory, pypAdmAsistCon);
            hipertenso.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(hipertenso);
            hipertenso.jLabel3.setText("Consulta de Control");
            hipertenso.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            cydesarrollo = new CYDesarrollo(factory, pypAdmAsistCon);
            cydesarrollo.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(cydesarrollo);
            cydesarrollo.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            cydesarrollo = new CYDesarrollo(factory, pypAdmAsistCon);
            cydesarrollo.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(cydesarrollo);
            cydesarrollo.jLabel3.setText("Consulta de Control");
            cydesarrollo.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 4 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            agudeza = new AgudezaV(factory, pypAdmAsistCon);
            agudeza.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(agudeza);
            agudeza.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            diabetes = new Diabetes(factory, pypAdmAsistCon);
            diabetes.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(diabetes);
            diabetes.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            diabetes = new Diabetes(factory, pypAdmAsistCon);
            diabetes.setBounds(0, 0, 745, 393);
            modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
            modulo_pyp.Modulo_PyP.d.Contenedor_.add(diabetes);
            diabetes.jLabel3.setText("Consulta de Control");
            diabetes.setVisible(true);
            modulo_pyp.Modulo_PyP.d.Contenedor_.validate();
            modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton6;
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JComboBox jComboBox1;
    com.toedter.calendar.JDateChooser jDateChooser1;
    com.toedter.calendar.JDateChooser jDateChooser2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1;
    javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
