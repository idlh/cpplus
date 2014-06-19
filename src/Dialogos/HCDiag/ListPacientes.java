/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos.HCDiag;

import Clases.Funciones_AD;
import HC.Adulto;
import controller.PypAdmAsistConJpaController;
import entity.PypAdmAsistCon;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modulo_pyp.Desktop;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import HC.Controlprenatal;
import HC.Postparto;
import HC.RecienNacido;
import HC.Planificacion;
import HC.Jovensano;
import HC.Hipertenso;
import HC.Diabetes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import HC.CYDesarrollo;
import HC.AgudezaV;
import java.awt.Frame;
import javax.swing.SwingUtilities;
import Clases.Save;
import java.awt.Dialog;

/**
 *
 * @author Alvaro Monsalve
 */
public class ListPacientes extends javax.swing.JDialog {

    Properties props = new Properties();
    private DefaultTableModel modelo;
    private EntityManagerFactory factory;
    private PypAdmAsistConJpaController paacjc;
    private final Object dato[] = null;
    private PypAdmAsistCon pypAdmAsistCon;
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
    Save sav = new Save();
    Funciones_AD Funciones = new Funciones_AD();

    public ListPacientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ParametrosBD();
        showPacientes();
    }

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
            JOptionPane.showMessageDialog(null, "10133:\n" + ex.getMessage(), ListPacientes.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        } finally {
            try {
                lector.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "10134:\n" + ex.getMessage(), ListPacientes.class.getName(), JOptionPane.INFORMATION_MESSAGE);
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
//        props.put("javax.persistence.jdbc.user", "root");
//        props.put("javax.persistence.jdbc.password", "root");
//        props.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost/database");
//        props.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
    }

    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Asistencia", "TD", "Documento", "Nombre"}) {
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

    public void ModeloListadoPaciente() {
        getModelo();
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Funciones_AD.setOcultarColumnas(jTable1, new int[]{0});
        Funciones_AD.setSizeColumnas(jTable1, new int[]{1, 2, 3}, new int[]{30, 80, 198});
    }

    private void showPacientes() {
        factory = Persistence.createEntityManagerFactory("EJB_CEPU", props);
        paacjc = new PypAdmAsistConJpaController(factory);
        List<PypAdmAsistCon> asistCon = null;
        if (jRadioButton1.isSelected() == true) {
            //asignar el id del profecional de la tabla cmprofesionales
            jTable1.removeAll();
            ModeloListadoPaciente();
            asistCon = paacjc.listPypAdmAsistCon(40);
        } else {
            jTable1.removeAll();
            ModeloListadoPaciente();
            asistCon = paacjc.listPypAdmAsistCon();
        }
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
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(674, 378));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 227, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Pacientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sgte2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sgte.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel3.setOpaque(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Mis Pacientes");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setFocusable(false);
        jRadioButton1.setOpaque(false);
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseReleased(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Todos los Pacientes");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setFocusable(false);
        jRadioButton2.setOpaque(false);
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setFocusable(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Del Paciente"));
        jPanel4.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setMaximumSize(new java.awt.Dimension(234, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(234, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(234, 14));

        jLabel4.setMaximumSize(new java.awt.Dimension(188, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(188, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(188, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Documento:");

        jLabel6.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Entidad:");

        jLabel8.setMaximumSize(new java.awt.Dimension(234, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(234, 14));
        jLabel8.setPreferredSize(new java.awt.Dimension(234, 14));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Edad:");

        jLabel10.setMaximumSize(new java.awt.Dimension(90, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(90, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(90, 14));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Programa:");

        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setMaximumSize(new java.awt.Dimension(234, 28));
        jLabel12.setMinimumSize(new java.awt.Dimension(234, 28));
        jLabel12.setPreferredSize(new java.awt.Dimension(234, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Tipo:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Profesional:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        if (modelo.getRowCount() > 0 && jTable1.getSelectedRow() > -1) {
            pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            if (pypAdmAsistCon.getEstado().toString().equals("3")) {
                if (pypAdmAsistCon.getIdControlPro().getIdProfesional().getId() == 40) {
                    hiloprograma ut = new hiloprograma(this);
                    Thread thread = new Thread(ut);
                    thread.start();
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente ya se encuentra en atencion");
                }
            } else {
                cargarprograma();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un paciente.");
        }
    }//GEN-LAST:event_jButton1MouseReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        if (jTable1.getSelectedRow() != -1) {
            pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            jLabel3.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getNombre1() + " "
                    + pypAdmAsistCon.getIdAgend().getIdPaciente().getNombre2() + " "
                    + pypAdmAsistCon.getIdAgend().getIdPaciente().getApellido1() + " "
                    + pypAdmAsistCon.getIdAgend().getIdPaciente().getApellido2());
            name = pypAdmAsistCon.getIdAgend().getIdPaciente().getNombre1() + " " + pypAdmAsistCon.getIdAgend().getIdPaciente().getApellido1();
            jLabel6.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getTipoDoc());
            jLabel4.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getNumDoc());
            jLabel8.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getContratante().getNombreEntidad());
            jLabel12.setText("<html><p>" + pypAdmAsistCon.getIdAgend().getIdPrograma().getNombre() + "</p></html>");
            progam = pypAdmAsistCon.getIdAgend().getIdPrograma().getNombre();
            Date fechap = null;
            Date fechaa = pypAdmAsistCon.getIdAgend().getIdPaciente().getFechaNacimiento();
            String patron = "dd-MM-yyyy";
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            String fc = formato.format(fechaa);
            try {
                fechap = new SimpleDateFormat("dd-MM-yyyy").parse(fc);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "fecha0001 " + e.getMessage(), ListPacientes.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
            Calendar fechaNacimiento = Calendar.getInstance();
            Calendar fechaActual = Calendar.getInstance();
            fechaNacimiento.setTime(fechap);
            año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
            mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
            if (mes < 0 || (mes == 0 && dia < 0)) {
                año--;
            }
            if (año > 5) {
                jLabel10.setText(String.valueOf(año + " AÑOS"));
            } else {
                edad = (año * 12) + mes;
                if (edad < 0) {
                    edad = edad * (-2);
                }
                jLabel10.setText(String.valueOf(edad + " MES(ES)"));
            }
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
                jLabel14.setText("Consulta de control".toUpperCase());
            } else {
                jLabel14.setText("Consulta por primera vez".toUpperCase());
            }
            jLabel17.setText(pypAdmAsistCon.getIdControlPro().getIdProfesional().getIdDescripcionLogin().getNombres() + " " + pypAdmAsistCon.getIdControlPro().getIdProfesional().getIdDescripcionLogin().getApellidos());
            idprograma = pypAdmAsistCon.getIdAgend().getIdPrograma().getId();
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jRadioButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseReleased
        if (jRadioButton2.isSelected() == true) {
            jRadioButton1.setSelected(false);
        }
        showPacientes();
    }//GEN-LAST:event_jRadioButton2MouseReleased

    private void jRadioButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseReleased
        if (jRadioButton2.isSelected() == true) {
            jRadioButton1.setSelected(false);
        }
        showPacientes();
    }//GEN-LAST:event_jRadioButton1MouseReleased

    private void cargarprograma() {
        Desktop desktop = (Desktop) this.getParent();
        pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            adult = new Adulto(factory, pypAdmAsistCon);
            adult.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(adult);
            adult.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 3 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            adult = new Adulto(factory, pypAdmAsistCon);
            adult.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(adult);
            adult.jLabel3.setText("Consulta de Control");
            adult.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            controlp = new Controlprenatal(factory, pypAdmAsistCon);
            controlp.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(controlp);
            controlp.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            controlp = new Controlprenatal(factory, pypAdmAsistCon);
            controlp.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(controlp);
            controlp.jLabel3.setText("Consulta de Control");
            controlp.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            postparto = new Postparto(factory, pypAdmAsistCon);
            postparto.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(postparto);
            postparto.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            reciennacido = new RecienNacido(factory, pypAdmAsistCon);
            reciennacido.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(reciennacido);
            reciennacido.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            planificacion = new Planificacion(factory, pypAdmAsistCon);
            planificacion.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(planificacion);
            planificacion.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            planificacion = new Planificacion(factory, pypAdmAsistCon);
            planificacion.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(planificacion);
            planificacion.jLabel3.setText("Consulta de Control");
            planificacion.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            jovensano = new Jovensano(factory, pypAdmAsistCon);
            jovensano.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(jovensano);
            jovensano.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            jovensano = new Jovensano(factory, pypAdmAsistCon);
            jovensano.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(jovensano);
            jovensano.jLabel3.setText("Consulta de Control");
            jovensano.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            hipertenso = new Hipertenso(factory, pypAdmAsistCon);
            hipertenso.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(hipertenso);
            hipertenso.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            hipertenso = new Hipertenso(factory, pypAdmAsistCon);
            hipertenso.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(hipertenso);
            hipertenso.jLabel3.setText("Consulta de Control");
            hipertenso.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            cydesarrollo = new CYDesarrollo(factory, pypAdmAsistCon);
            cydesarrollo.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(cydesarrollo);
            cydesarrollo.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            cydesarrollo = new CYDesarrollo(factory, pypAdmAsistCon);
            cydesarrollo.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(cydesarrollo);
            cydesarrollo.jLabel3.setText("Consulta de Control");
            cydesarrollo.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 4 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            agudeza = new AgudezaV(factory, pypAdmAsistCon);
            agudeza.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(agudeza);
            agudeza.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7 && pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
            diabetes = new Diabetes(factory, pypAdmAsistCon);
            diabetes.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(diabetes);
            diabetes.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7 && pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
            diabetes = new Diabetes(factory, pypAdmAsistCon);
            diabetes.setBounds(0, 0, 745, 393);
            desktop.Contenedor_.removeAll();
            desktop.Contenedor_.add(diabetes);
            diabetes.jLabel3.setText("Consulta de Control");
            diabetes.setVisible(true);
            desktop.Contenedor_.validate();
            desktop.Contenedor_.repaint();
            this.dispose();
        }
    }

    private class hiloprograma extends Thread {

        Dialog form = null;

        public hiloprograma(Dialog form) {
            this.form = form;
        }

        @Override
        public void run() {
            try {
                cargarprograma();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "cargar programa " + e.getMessage(), Imprimir.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
            ((ListPacientes) form).dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
