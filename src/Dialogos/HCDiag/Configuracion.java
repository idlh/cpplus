/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos.HCDiag;

import Clases.Actualizar;
import Clases.Funciones_AD;
import Clases.Save;
import controller.PypAdmAsistConJpaController;
import entity.PypAdmAsistCon;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
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
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author Administrador
 */
public class Configuracion extends javax.swing.JDialog {

    Properties props = new Properties();
    private DefaultTableModel modelo;
    private EntityManagerFactory factory;
    private PypAdmAsistConJpaController paacjc;
    private final Object dato[] = null;
    private PypAdmAsistCon pypAdmAsistCon;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    Actualizar act = new Actualizar();

    /**
     * Creates new form logconfiguracion
     */
    public Configuracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ParametrosBD();
        ModeloListadoPaciente();
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

    private void ModeloListadoPaciente() {
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
        asistCon = paacjc.listPypAdmAsistConAten();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(642, 302));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(642, 302));
        jPanel1.setMinimumSize(new java.awt.Dimension(642, 302));

        jPanel2.setBackground(new java.awt.Color(125, 164, 222));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Asignación de Historias");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(125, 164, 222));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBackground(new java.awt.Color(125, 164, 222));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Del Paciente"));
        jPanel6.setOpaque(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Nombre:");

        jLabel29.setMaximumSize(new java.awt.Dimension(234, 14));
        jLabel29.setMinimumSize(new java.awt.Dimension(234, 14));
        jLabel29.setPreferredSize(new java.awt.Dimension(234, 14));

        jLabel30.setMaximumSize(new java.awt.Dimension(188, 14));
        jLabel30.setMinimumSize(new java.awt.Dimension(188, 14));
        jLabel30.setPreferredSize(new java.awt.Dimension(188, 14));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Documento:");

        jLabel32.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel32.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel32.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Entidad:");

        jLabel34.setMaximumSize(new java.awt.Dimension(234, 14));
        jLabel34.setMinimumSize(new java.awt.Dimension(234, 14));
        jLabel34.setPreferredSize(new java.awt.Dimension(234, 14));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Edad:");

        jLabel36.setMaximumSize(new java.awt.Dimension(90, 14));
        jLabel36.setMinimumSize(new java.awt.Dimension(90, 14));
        jLabel36.setPreferredSize(new java.awt.Dimension(90, 14));

        jSeparator3.setForeground(new java.awt.Color(125, 164, 222));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Programa:");

        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel38.setMaximumSize(new java.awt.Dimension(234, 28));
        jLabel38.setMinimumSize(new java.awt.Dimension(234, 28));
        jLabel38.setPreferredSize(new java.awt.Dimension(234, 28));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Tipo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc1.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc2.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        if (jTable1.getSelectedRow() != -1) {
            pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            jLabel29.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getNombre1() + " "
                    + pypAdmAsistCon.getIdAgend().getIdPaciente().getNombre2() + " "
                    + pypAdmAsistCon.getIdAgend().getIdPaciente().getApellido1() + " "
                    + pypAdmAsistCon.getIdAgend().getIdPaciente().getApellido2());
            jLabel32.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getTipoDoc());
            jLabel30.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getNumDoc());
            jLabel34.setText(pypAdmAsistCon.getIdAgend().getIdPaciente().getContratante().getNombreEntidad());
            jLabel38.setText("<html><p>" + pypAdmAsistCon.getIdAgend().getIdPrograma().getNombre() + "</p></html>");
            Date fechap = null;
            Date fechaa = pypAdmAsistCon.getIdAgend().getIdPaciente().getFechaNacimiento();
            String patron = "dd-MM-yyyy";
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            String fc = formato.format(fechaa);
            try {
                fechap = new SimpleDateFormat("dd-MM-yyyy").parse(fc);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "fecha0001 " + e.getMessage().toString(), ListPacientes.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
            Calendar fechaNacimiento = Calendar.getInstance();
            Calendar fechaActual = Calendar.getInstance();
            fechaNacimiento.setTime(fechap);
            int año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
            int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
            if (mes < 0 || (mes == 0 && dia < 0)) {
                año--;
            }
            jLabel36.setText(String.valueOf(año + " AÑOS"));
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
                jLabel40.setText("Consulta de control".toUpperCase());
            } else {
                jLabel40.setText("Consulta por primera vez".toUpperCase());
            }
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        pypAdmAsistCon = (PypAdmAsistCon) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        String d;
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 4) {
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
            d = (c[0][0].toString());
        } else {
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridvisual(pypAdmAsistCon.getId().toString()));
            d = (c[0][0].toString());
        }
        String mensaje = "¿Desea habilitar historia a otro profesional? ";
        int entrada = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar finalizacion", JOptionPane.YES_NO_OPTION);
        if (entrada == 0) {
            if (pypAdmAsistCon.getEstado().toString().equals("3")) {
                if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 4) {
                    act.cambioestadohc(d, pypAdmAsistCon.getId().toString());
                } else {
                    act.cambioestadovisual(d, pypAdmAsistCon.getId().toString());
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_jButton2MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Configuracion dialog = new Configuracion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel28;
    javax.swing.JLabel jLabel29;
    javax.swing.JLabel jLabel30;
    javax.swing.JLabel jLabel31;
    javax.swing.JLabel jLabel32;
    javax.swing.JLabel jLabel33;
    javax.swing.JLabel jLabel34;
    javax.swing.JLabel jLabel35;
    javax.swing.JLabel jLabel36;
    javax.swing.JLabel jLabel37;
    javax.swing.JLabel jLabel38;
    javax.swing.JLabel jLabel39;
    javax.swing.JLabel jLabel40;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel6;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator3;
    javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
