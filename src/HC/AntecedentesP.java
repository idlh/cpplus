package HC;

import java.awt.Color;
import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.Save;
import Clases.Funciones_AD;
import java.awt.event.KeyEvent;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import Clases.CargarordenesM;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Dialogos.HCDiag.Rexamenes;
import com.toedter.calendar.JDateChooser;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Camilo
 */
public class AntecedentesP extends javax.swing.JPanel {

    public ginecogenerales gi = null;
    public ginecomac gimac = null;
    public Obstetricos obs = null;
    public Gestacionac gesta = null;
    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    Save sav = new Save();
    Funciones_AD Funciones = new Funciones_AD();
    private DefaultTableModel modelo, modelo2, modelo3;
    CargarordenesM tab = new CargarordenesM();
    String idparametro;
    private final int usuario;

    public AntecedentesP(PypAdmAsistCon pypAdmAsistCon, Integer usuario) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        this.usuario = usuario;
        if (gi == null) {
            gi = new ginecogenerales(pypAdmAsistCon);
        }
        if (gimac == null) {
            gimac = new ginecomac(pypAdmAsistCon);
        }
        jPanel24.setBackground(Color.white);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 9) {
            jPanel19.setVisible(false);
            jPanel20.setVisible(false);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            if (obs == null) {
                obs = new Obstetricos(pypAdmAsistCon, usuario);
            }
            if (gesta == null) {
                gesta = new Gestacionac(pypAdmAsistCon, usuario);
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 11) {
            jTabbedPane1.remove(jPanel2);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 10) {
            jTabbedPane1.remove(jPanel5);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 2) {
            jTabbedPane1.remove(jPanel7);
        }
        tabla();
        tabla2();
        tabla3();
        jTabbedPane1.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaantemedi = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaanteprocedimiento = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaanteexamen = new javax.swing.JTable();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clip_board.png"))); // NOI18N
        jMenuItem1.setText("Revisar Examen");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));
        setPreferredSize(new java.awt.Dimension(558, 345));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Antecedentes personales");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFocusable(false);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Alergias a medicamentos");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("No se encuentran datos");
        jTextArea1.setSelectionEnd(0);
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
        jScrollPane17.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Alergias", jPanel15);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Ingresos previos y cirugías");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("No se encuentran datos");
        jTextArea2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea2FocusGained(evt);
            }
        });
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea2KeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 388, Short.MAX_VALUE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresos", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Traumatismos y accidentes");

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("No se encuentran datos");
        jTextArea3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea3FocusGained(evt);
            }
        });
        jTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea3KeyReleased(evt);
            }
        });
        jScrollPane19.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 388, Short.MAX_VALUE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Traumatismos", jPanel4);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Tratamientos habituales");

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("No se encuentran datos");
        jTextArea4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea4FocusGained(evt);
            }
        });
        jTextArea4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea4KeyReleased(evt);
            }
        });
        jScrollPane20.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 402, Short.MAX_VALUE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tratamientos", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Antecedentes patológicos");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox1.setText("HTA");
        jCheckBox1.setFocusable(false);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox2.setText("DM");
        jCheckBox2.setFocusable(false);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox3.setText("DISLIPIDEMIA");
        jCheckBox3.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Observacion:");

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("Ninguno");
        jTextArea5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea5FocusGained(evt);
            }
        });
        jTextArea5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea5KeyReleased(evt);
            }
        });
        jScrollPane21.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 340, Short.MAX_VALUE))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Patológicos", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Hábitos Tóxicos");

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox4.setText("Tabaco");
        jCheckBox4.setFocusable(false);

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox5.setText("Alcohol");
        jCheckBox5.setFocusable(false);

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox6.setText("Drogas de abuso");
        jCheckBox6.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Otros:");

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setText("Ninguno");
        jTextArea6.setToolTipText("");
        jTextArea6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea6FocusGained(evt);
            }
        });
        jTextArea6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea6KeyReleased(evt);
            }
        });
        jScrollPane22.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox6))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 300, Short.MAX_VALUE))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hábitos", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Situación basal (crónicos)");

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setText("No se encuentran datos");
        jTextArea7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea7FocusGained(evt);
            }
        });
        jTextArea7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea7KeyReleased(evt);
            }
        });
        jScrollPane23.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 395, Short.MAX_VALUE))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Situación Basal", jPanel14);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setFocusable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Antecedentes Familiares de Interes");

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setText("No se encuentran datos");
        jTextArea8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea8FocusGained(evt);
            }
        });
        jTextArea8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea8KeyReleased(evt);
            }
        });
        jScrollPane24.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 345, Short.MAX_VALUE))
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Familiares", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setFocusable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Antecedentes Ginecobstetricos");

        jPanel18.setBackground(new java.awt.Color(125, 164, 222));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Generales");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(125, 164, 222));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Métodos Anticonceptivos");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(255, 204, 204));
        jPanel24.setMaximumSize(new java.awt.Dimension(334, 246));
        jPanel24.setMinimumSize(new java.awt.Dimension(334, 246));
        jPanel24.setPreferredSize(new java.awt.Dimension(334, 246));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(125, 164, 222));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Obstetricos");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(125, 164, 222));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Gestación Actual");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel15MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Ginecobstetricos", jPanel17);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descripción último embarazo y parto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jLabel16.setText("Via de terminación del parto:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espontáneo", "Cesárea", "Forceps", "Espátula" }));
        jComboBox1.setFocusable(false);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel17.setText("Edad gestacional al momento del parto:");

        jLabel19.setText("Vacunacion TD/TT/SR:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Completa", "Incompleta", "Sin carnet" }));
        jComboBox2.setSelectedIndex(2);
        jComboBox2.setFocusable(false);

        jLabel20.setText("AgSPH en CPN:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Positivo", "Negativo", "No realizado" }));
        jComboBox3.setSelectedIndex(2);
        jComboBox3.setFocusable(false);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Positivo", "Negativo", "No realizado" }));
        jComboBox4.setSelectedIndex(2);
        jComboBox4.setFocusable(false);

        jLabel21.setText("VIH en CPN:");

        jLabel22.setText("VDRL 3 trimestre o periparto:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reactiva", "No reactiva", "No realizado" }));
        jComboBox5.setSelectedIndex(2);
        jComboBox5.setFocusable(false);

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Parto traumatico");
        jCheckBox7.setFocusable(false);

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Hospitalizacion posparto");
        jCheckBox8.setFocusable(false);

        jLabel23.setText("Feto:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vivo", "Muerto" }));
        jComboBox6.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 84, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox8)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Parto", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Antecedentes Perinatología", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Sufrimiento fetal");
        jCheckBox9.setFocusable(false);

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Incompatibilidad con Grupo o Rh");
        jCheckBox10.setFocusable(false);

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Icteria Neonatal");
        jCheckBox11.setFocusable(false);

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Parto Prolongado");
        jCheckBox12.setFocusable(false);

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("Patologías Maternas durante CPN");
        jCheckBox13.setFocusable(false);

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("Parto Traumático");
        jCheckBox14.setFocusable(false);

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("Requirió Hospitalización Posparto");
        jCheckBox15.setFocusable(false);

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setText("Otros");
        jCheckBox16.setFocusable(false);

        jLabel24.setText("Peso al nacer:");

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel25.setText("Kg");

        jLabel26.setText("Talla al nacer:");

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel27.setText("Cm");

        jLabel28.setText("EG en el parto:");

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel29.setText("Semanas");

        jLabel30.setText("Via terminacion parto:");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espontáneo", "Cesárea", "Forceps", "Espátula" }));
        jComboBox8.setFocusable(false);

        jLabel31.setText("Hemoclasificación:");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));
        jComboBox9.setSelectedIndex(1);
        jComboBox9.setFocusable(false);

        jLabel32.setText("VDRL Materno:");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reactivo", "No reactivo", "No se realizó" }));
        jComboBox10.setFocusable(false);

        jLabel33.setText("TSH Neonatal:");

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel34.setText("mU/ml");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox14)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jCheckBox10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perinatología", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Antecedentes Perinatología", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setText("Sufrimiento fetal");
        jCheckBox17.setFocusable(false);

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setText("Incompatibilidad con Grupo o Rh");
        jCheckBox18.setFocusable(false);

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setText("Icteria Neonatal");
        jCheckBox19.setFocusable(false);

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setText("Parto Prolongado");
        jCheckBox20.setFocusable(false);

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setText("Patologías Maternas durante CPN");
        jCheckBox21.setFocusable(false);

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setText("Parto Traumático");
        jCheckBox22.setFocusable(false);

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setText("Requirió Hospitalización Posparto");
        jCheckBox23.setFocusable(false);

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setText("Otros");
        jCheckBox24.setFocusable(false);

        jLabel35.setText("Peso al nacer:");

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jLabel36.setText("Kg");

        jLabel37.setText("Talla al nacer:");

        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jLabel38.setText("Cm");

        jLabel39.setText("EG en el parto:");

        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jLabel40.setText("Semanas");

        jLabel41.setText("Via terminacion parto:");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espontáneo", "Cesárea", "Forceps", "Espátula" }));
        jComboBox11.setFocusable(false);

        jLabel42.setText("Hemoclasificación:");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));
        jComboBox12.setSelectedIndex(1);
        jComboBox12.setFocusable(false);

        jLabel43.setText("VDRL Materno:");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reactivo", "No reactivo", "No se realizó" }));
        jComboBox13.setFocusable(false);

        jLabel44.setText("TSH Neonatal:");

        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jLabel45.setText("mU/ml");

        jLabel46.setText("Lugar Nacimiento:");

        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
        });

        jLabel47.setText("Alimentacion:");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Lactancia materna exclusiva", "Mixta", "Complementaria" }));
        jComboBox7.setFocusable(false);

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setText("Embarazo deseado");
        jCheckBox25.setFocusable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel46))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox13, 0, 1, Short.MAX_VALUE)
                                    .addComponent(jTextField10)))
                            .addComponent(jCheckBox25)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox22)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel46)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox25))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perinatología", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setFocusable(false);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tablaantemedi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaantemedi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaantemedi.setFocusable(false);
        jScrollPane2.setViewportView(tablaantemedi);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Medicamentos", new javax.swing.ImageIcon(getClass().getResource("/Recursos/1389649412_Capsule.png")), jPanel10); // NOI18N

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        tablaanteprocedimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaanteprocedimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaanteprocedimiento.setFocusable(false);
        jScrollPane1.setViewportView(tablaanteprocedimiento);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Procedimietos", new javax.swing.ImageIcon(getClass().getResource("/Recursos/paraclinicos.png")), jPanel21); // NOI18N

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setFocusable(false);

        tablaanteexamen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaanteexamen.setComponentPopupMenu(jPopupMenu1);
        tablaanteexamen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaanteexamen.setFocusable(false);
        jScrollPane3.setViewportView(tablaanteexamen);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("R. Examenes", new javax.swing.ImageIcon(getClass().getResource("/Recursos/analysis.png")), jPanel22); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Procedimientos");
        jTabbedPane2.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Ordenes", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        this.jPanel24.removeAll();
        new Clases.Explode(jPanel24, gi).play();
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
        this.jPanel24.removeAll();
        new Clases.Explode(jPanel24, gimac).play();
    }//GEN-LAST:event_jLabel18MouseReleased

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jPanel18.setBackground(new Color(255, 227, 255));
        darayuda("Generales");
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jPanel23.setBackground(new Color(255, 227, 255));
        darayuda("Metodos Anticonceptivos");
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jPanel18.setBackground(new Color(125, 164, 222));
        retornarayuda();
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jPanel23.setBackground(new Color(125, 164, 222));
        retornarayuda();
    }//GEN-LAST:event_jLabel18MouseExited

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        jTextArea1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jTextArea2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyReleased
        jTextArea2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea2KeyReleased

    private void jTextArea3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea3KeyReleased
        jTextArea3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea3KeyReleased

    private void jTextArea4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea4KeyReleased
        jTextArea4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea4KeyReleased

    private void jTextArea5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea5KeyReleased
        jTextArea5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea5KeyReleased

    private void jTextArea6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea6KeyReleased
        jTextArea6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea6KeyReleased

    private void jTextArea7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea7KeyReleased
        jTextArea7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea7KeyReleased

    private void jTextArea8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea8KeyReleased
        jTextArea8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea8KeyReleased

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        jTextArea1.selectAll();
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea2FocusGained
        jTextArea2.selectAll();
    }//GEN-LAST:event_jTextArea2FocusGained

    private void jTextArea3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea3FocusGained
        jTextArea3.selectAll();
    }//GEN-LAST:event_jTextArea3FocusGained

    private void jTextArea4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea4FocusGained
        jTextArea4.selectAll();
    }//GEN-LAST:event_jTextArea4FocusGained

    private void jTextArea5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea5FocusGained
        jTextArea5.selectAll();
    }//GEN-LAST:event_jTextArea5FocusGained

    private void jTextArea6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea6FocusGained
        jTextArea6.selectAll();
    }//GEN-LAST:event_jTextArea6FocusGained

    private void jTextArea7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea7FocusGained
        jTextArea7.selectAll();
    }//GEN-LAST:event_jTextArea7FocusGained

    private void jTextArea8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea8FocusGained
        jTextArea8.selectAll();
    }//GEN-LAST:event_jTextArea8FocusGained

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        this.jPanel24.removeAll();
        new Clases.Explode(jPanel24, obs).play();
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jPanel19.setBackground(new Color(255, 227, 255));
        Controlprenatal.jLabel4.setText("Obstetricos");
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jPanel19.setBackground(new Color(125, 164, 222));
        Controlprenatal.jLabel4.setText("...");
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jPanel20.setBackground(new Color(125, 164, 222));
        Controlprenatal.jLabel4.setText("...");
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jPanel20.setBackground(new Color(255, 227, 255));
        Controlprenatal.jLabel4.setText("Gestación Actual");
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseReleased
        this.jPanel24.removeAll();
        new Clases.Explode(jPanel24, gesta).play();
    }//GEN-LAST:event_jLabel15MouseReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField1.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && jTextField2.getText().contains(".") || jTextField2.getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') || jTextField2.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jTextField3.selectAll();
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        jTextField4.selectAll();
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        jTextField5.selectAll();
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && jTextField3.getText().contains(".") || jTextField3.getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') || jTextField3.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField4.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && jTextField5.getText().contains(".") || jTextField5.getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') || jTextField5.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        jTextField6.selectAll();
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && jTextField6.getText().contains(".") || jTextField6.getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') || jTextField6.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        jTextField7.selectAll();
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField8.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && jTextField7.getText().contains(".") || jTextField7.getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') || jTextField7.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        jTextField8.selectAll();
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField9.requestFocus();
        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField8.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        jTextField9.selectAll();
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && jTextField9.getText().contains(".") || jTextField9.getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') || jTextField9.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField10.requestFocus();
        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        jTextField10.selectAll();
    }//GEN-LAST:event_jTextField10FocusGained

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        final Rexamenes exam = new Rexamenes((Frame) SwingUtilities.getWindowAncestor(this), true);
        Object dataparam[][] = Funciones.RetornarDatos(act.cargarparam());
        for (int i = 0; i < dataparam.length; i++) {
            if (tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 1).toString().equals(dataparam[i][5].toString())) {
                //El 1 difirencia cuando es un resultado de una fecha (iria en el valor adicional a la hora de la configuarcion del parametro)
                if (dataparam[i][6].toString().equals("1")) {
                    exam.jComboBox1.removeAllItems();
                    idparametro = dataparam[i][1].toString();
                    switch (Integer.parseInt(dataparam[i][1].toString())) {
                        case 85:
                            exam.jComboBox1.addItem("NEGATIVO");
                            exam.jComboBox1.addItem("POSITIVO");
                            break;
                        case 87:
                            exam.jComboBox1.addItem("NO REACTIVA");
                            exam.jComboBox1.addItem("REACTIVA");
                            break;
                        case 89:
                            exam.jComboBox1.addItem("NEGATIVO");
                            exam.jComboBox1.addItem("POSITIVO");
                            break;
                        case 91:
                            exam.jComboBox1.addItem("NORMAL");
                            exam.jComboBox1.addItem("ANORMAL");
                            break;
                        case 100:
                            exam.jComboBox1.addItem("NEGATIVO PARA NEOPLASTIA");
                            exam.jComboBox1.addItem("INFECCION POR VPH");
                            exam.jComboBox1.addItem("NIC DE BAJO GRADO - NIC I");
                            exam.jComboBox1.addItem("NIC DE ALTO GRADO: NIC II - NIC III");
                            exam.jComboBox1.addItem("NEOPLASTIA MICROINFILTRANTE: ESCAMOCELULAR O ADENOCARCINOMA");
                            exam.jComboBox1.addItem("NEOPLASTIA INFILTRANTE: ESCAMOCELULAR O ADENOCARCINOMA");
                            break;
                        case 103:
                            exam.jComboBox1.addItem("NECESIDAD DE NUEVO ESTUDIO IMAGENOLOGICO");
                            exam.jComboBox1.addItem("NEGATIVO");
                            exam.jComboBox1.addItem("HALLAZGOS BENIGNOS");
                            exam.jComboBox1.addItem("PROBABLEMENTE BENIGNO");
                            exam.jComboBox1.addItem("ANORMALIDAD SOSPECHOSA");
                            exam.jComboBox1.addItem("ALTAMENTE SOSPECHOSO DE MALIGNIDAD");
                            exam.jComboBox1.addItem("MALIGNIDAD POR BIOPSIA CONOCIDA");
                            break;
                        case 107:
                            exam.jComboBox1.addItem("BENIGNA");
                            exam.jComboBox1.addItem("ATIPICA (INDETERMINADA)");
                            exam.jComboBox1.addItem("MALIGNIDAD SOSPECHOSA/PROBABLE");
                            exam.jComboBox1.addItem("MALIGNA");
                            exam.jComboBox1.addItem("NO SATISFACTORIA");
                            break;
                        case 110:
                        case 113:
                        case 115:
                            exam.jComboBox1.setEnabled(false);
                            exam.jTextArea1.addKeyListener(new KeyListener() {

                                @Override
                                public void keyTyped(KeyEvent e) {
                                    char car = e.getKeyChar();
                                    if ((car < '0' || car > '9') && ((car != '.') && (car != ','))) {
                                        e.consume();
                                    } else {
                                        if ((car < '0' || car > '9') && ((exam.jTextArea1.getText().contains(".")) || exam.jTextArea1.getText().contains(","))) {
                                            e.consume();
                                        } else {
                                            if (exam.jTextArea1.getText().length() >= 5) {
                                                e.consume();
                                            }
                                        }
                                    }
                                }

                                @Override
                                public void keyPressed(KeyEvent e) {
                                }

                                @Override
                                public void keyReleased(KeyEvent e) {
                                }
                            });
                            break;
                        case 119:
                            exam.jComboBox1.addItem("NO");
                            exam.jComboBox1.addItem("NEGATIVA");
                            exam.jComboBox1.addItem("POSITIVA");
                            break;
                    }
                }
            }
        }

        exam.jLabel3.setText("<html>\n"
                + "<div style=\"width:376;\">" + String.valueOf(tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 2)) + "\n"
                + "</div>\n"
                + "\n"
                + "</html>");

        if (!idparametro.equals("110") && !idparametro.equals("113") && !idparametro.equals("115")) {
            if (tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 7) == null) {
                exam.jComboBox1.setSelectedIndex(-1);
            } else {
                exam.jComboBox1.setSelectedIndex(Integer.parseInt(String.valueOf(tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 7))));
            }
        } else {
            exam.jComboBox1.setSelectedIndex(-1);
        }
        if (tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 8) == null) {
            exam.jTextArea1.setText("");
        } else {
            exam.jTextArea1.setText(String.valueOf(tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 8)));
        }
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        if (tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 6) == null) {
            exam.jDateChooser1.setDate(null);
        } else {
            try {
                exam.jDateChooser1.setDate(formato2.parse(String.valueOf(tablaanteexamen.getValueAt(tablaanteexamen.getSelectedRow(), 6))));
            } catch (ParseException ex) {
                Logger.getLogger(AntecedentesP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        exam.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (exam.jDateChooser1.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "El campo fecha no puede estar vacio o debe ingresar un dato correcto");
                } else {
                    if (!idparametro.equals("110") && !idparametro.equals("113") && !idparametro.equals("115")) {
                        if (exam.jComboBox1.getSelectedIndex() > -1) {
                            String fecha;
                            String patron = "dd/MM/yyyy";
                            SimpleDateFormat formato = new SimpleDateFormat(patron);
                            fecha = formato.format(exam.jDateChooser1.getDate());
                            tablaanteexamen.setValueAt(fecha, tablaanteexamen.getSelectedRow(), 6);
                            tablaanteexamen.setValueAt(exam.jComboBox1.getSelectedIndex() + 1, tablaanteexamen.getSelectedRow(), 7);
                            tablaanteexamen.setValueAt(exam.jTextArea1.getText().toUpperCase(), tablaanteexamen.getSelectedRow(), 8);
                            tablaanteexamen.setValueAt("3", tablaanteexamen.getSelectedRow(), 4);
                            exam.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar un valor adecuado para el resultado");
                        }
                    } else {
                        String fecha;
                        String patron = "dd/MM/yyyy";
                        SimpleDateFormat formato = new SimpleDateFormat(patron);
                        fecha = formato.format(exam.jDateChooser1.getDate());
                        tablaanteexamen.setValueAt(fecha, tablaanteexamen.getSelectedRow(), 6);
                        tablaanteexamen.setValueAt(0, tablaanteexamen.getSelectedRow(), 7);
                        tablaanteexamen.setValueAt(exam.jTextArea1.getText().toUpperCase(), tablaanteexamen.getSelectedRow(), 8);
                        tablaanteexamen.setValueAt("3", tablaanteexamen.getSelectedRow(), 4);
                        exam.dispose();
                    }
                }
            }
        });
        exam.setLocationRelativeTo(null);
        exam.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MouseReleased

    public void guardarantep(String idhc) {
        gi.actuginecog(idhc);
        gimac.actginecomac(idhc);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            obs.guardarobste(idhc);
            gesta.guardgestaactual(idhc);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
            String v, b, n, m, ñ, f, g, j, k;
            v = String.valueOf(jComboBox1.getSelectedIndex());
            if (jTextField1.getText().toString().equals("")) {
                b = "0";
            } else {
                b = jTextField1.getText().toString();
            }
            n = String.valueOf(jComboBox2.getSelectedIndex());
            m = String.valueOf(jComboBox3.getSelectedIndex());
            ñ = String.valueOf(jComboBox4.getSelectedIndex());
            f = String.valueOf(jComboBox5.getSelectedIndex());
            g = String.valueOf(jComboBox6.getSelectedIndex());
            if (jCheckBox7.isSelected() == false) {
                j = "0";
            } else {
                j = "1";
            }
            if (jCheckBox8.isSelected() == false) {
                k = "0";
            } else {
                k = "1";
            }
            act.posparto(idhc, v, b, n, m, ñ, f, g, j, k, usuario);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
            String c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
            float n1, n2, n3;
            if (jCheckBox10.isSelected() == false) {
                c1 = "0";
            } else {
                c1 = "1";
            }
            if (jCheckBox9.isSelected() == false) {
                c2 = "0";
            } else {
                c2 = "1";
            }
            if (jCheckBox11.isSelected() == false) {
                c3 = "0";
            } else {
                c3 = "1";
            }
            if (jCheckBox13.isSelected() == false) {
                c4 = "0";
            } else {
                c4 = "1";
            }
            if (jCheckBox12.isSelected() == false) {
                c5 = "0";
            } else {
                c5 = "1";
            }
            if (jCheckBox14.isSelected() == false) {
                c6 = "0";
            } else {
                c6 = "1";
            }
            if (jCheckBox15.isSelected() == false) {
                c7 = "0";
            } else {
                c7 = "1";
            }
            if (jCheckBox16.isSelected() == false) {
                c8 = "0";
            } else {
                c8 = "1";
            }
            if (jTextField4.getText().toString().equals("")) {
                c9 = "98";
            } else {
                c9 = jTextField4.getText().toString();
            }
            if (jTextField2.getText().equals("")) {
                n1 = 0;
            } else {
                n1 = Float.parseFloat(jTextField2.getText().toString());
            }
            if (jTextField3.getText().equals("")) {
                n2 = 0;
            } else {
                n2 = Float.parseFloat(jTextField3.getText().toString());
            }
            if (jTextField5.getText().equals("")) {
                n3 = 0;
            } else {
                n3 = Float.parseFloat(jTextField5.getText().toString());
            }
            c10 = String.valueOf(jComboBox8.getSelectedIndex());
            c11 = String.valueOf(jComboBox9.getSelectedIndex());
            c12 = String.valueOf(jComboBox10.getSelectedIndex());
            act.actrecien(idhc, c1, c2, c3, c4, c5, c6, c7, c8, n1, n2, c9, n3, c10, c11, c12, usuario);
        }
        String q, w, e, r, t, y;
        if (jCheckBox1.isSelected() == true) {//hta
            q = "1";
        } else {
            q = "0";
        }
        if (jCheckBox2.isSelected() == true) {//dm
            w = "1";
        } else {
            w = "0";
        }
        if (jCheckBox3.isSelected() == true) {//disp
            e = "1";
        } else {
            e = "0";
        }
        if (jCheckBox4.isSelected() == true) {//tabaco
            r = "1";
        } else {
            r = "0";
        }
        if (jCheckBox5.isSelected() == true) {//alcohol
            t = "1";
        } else {
            t = "0";
        }
        if (jCheckBox6.isSelected() == true) {//droga
            y = "1";
        } else {
            y = "0";
        }
        Object cont[][] = Funciones.RetornarDatos(act.contarantecedente(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        if (cont[0][0].toString().equals("0")) {
            sav.newinfoante(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString(), jTextArea1.getText().toUpperCase(), jTextArea2.getText().toUpperCase(),
                    jTextArea3.getText().toUpperCase(), jTextArea4.getText().toUpperCase(),
                    w, q, e, jTextArea5.getText().toUpperCase(), r, t, y, jTextArea6.getText().toUpperCase(),
                    jTextArea7.getText().toUpperCase(), jTextArea8.getText().toUpperCase());
        } else {
            act.actinfoante(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString(), jTextArea1.getText().toUpperCase(), jTextArea2.getText().toUpperCase(),
                    jTextArea3.getText().toUpperCase(), jTextArea4.getText().toUpperCase(),
                    w, q, e, jTextArea5.getText().toUpperCase(), r, t, y, jTextArea6.getText().toUpperCase(),
                    jTextArea7.getText().toUpperCase(), jTextArea8.getText().toUpperCase());
        }
        act.actualizarantp(idhc, jTextArea1.getText().toUpperCase(), jTextArea2.getText().toUpperCase(),
                jTextArea3.getText().toUpperCase(), jTextArea4.getText().toUpperCase(),
                w, q, e, jTextArea5.getText().toUpperCase(), r, t, y, jTextArea6.getText().toUpperCase(),
                jTextArea7.getText().toUpperCase(), jTextArea8.getText().toUpperCase(), String.valueOf(usuario));
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            actcrecimiento(idhc);
        }
        nuevoexamen();
    }

    public void cargarancedentes(String idhc) {
        Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
        Object car[][] = Funciones.RetornarDatos(act.contarantecedente(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        if (car[0][0].toString().equals("0")) {
            if (h[0][2].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea1.setText(h[0][2].toString());
                jTextArea1.setSelectionStart(0);
                jTextArea1.setSelectionEnd(jTextArea1.getText().length());
            } else {
                jTextArea1.setText(h[0][2].toString());
                jTextArea1.setForeground(Color.BLACK);
            }
            if (h[0][3].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea2.setText(h[0][3].toString());
                jTextArea2.setSelectionStart(0);
                jTextArea2.setSelectionEnd(jTextArea2.getText().length());
            } else {
                jTextArea2.setText(h[0][3].toString());
                jTextArea2.setForeground(Color.BLACK);
            }
            if (h[0][4].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea3.setText(h[0][4].toString());
                jTextArea3.setSelectionStart(0);
                jTextArea3.setSelectionEnd(jTextArea3.getText().length());
            } else {
                jTextArea3.setText(h[0][4].toString());
                jTextArea3.setForeground(Color.BLACK);
            }
            if (h[0][5].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea4.setText(h[0][5].toString());
                jTextArea4.setSelectionStart(0);
                jTextArea4.setSelectionEnd(jTextArea4.getText().length());
            } else {
                jTextArea4.setText(h[0][5].toString());
                jTextArea4.setForeground(Color.BLACK);
            }
            if (h[0][6].toString().equals("0")) {
                jCheckBox2.setSelected(false);
            } else {
                jCheckBox2.setSelected(true);
            }
            if (h[0][7].toString().equals("0")) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            if (h[0][8].toString().equals("0")) {
                jCheckBox3.setSelected(false);
            } else {
                jCheckBox3.setSelected(true);
            }
            if (h[0][9].toString().equals("NINGUNO")) {
                jTextArea5.setText(h[0][9].toString());
                jTextArea5.setSelectionStart(0);
                jTextArea5.setSelectionEnd(jTextArea5.getText().length());
            } else {
                jTextArea5.setText(h[0][9].toString());
                jTextArea5.setForeground(Color.BLACK);
            }
            if (h[0][10].toString().equals("0")) {
                jCheckBox4.setSelected(false);
            } else {
                jCheckBox4.setSelected(true);
            }
            if (h[0][11].toString().equals("0")) {
                jCheckBox5.setSelected(false);
            } else {
                jCheckBox5.setSelected(true);
            }
            if (h[0][12].toString().equals("0")) {
                jCheckBox6.setSelected(false);
            } else {
                jCheckBox6.setSelected(true);
            }
            if (h[0][13].toString().equals("NINGUNO")) {
                jTextArea6.setText(h[0][13].toString());
                jTextArea6.setSelectionStart(0);
                jTextArea6.setSelectionEnd(jTextArea6.getText().length());
            } else {
                jTextArea6.setText(h[0][13].toString());
                jTextArea6.setForeground(Color.BLACK);
            }
            if (h[0][14].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea7.setText(h[0][14].toString());
                jTextArea7.setSelectionStart(0);
                jTextArea7.setSelectionEnd(jTextArea7.getText().length());
            } else {
                jTextArea7.setText(h[0][14].toString());
                jTextArea7.setForeground(Color.BLACK);
            }
            if (h[0][15].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea8.setText(h[0][15].toString());
                jTextArea8.setSelectionStart(0);
                jTextArea8.setSelectionEnd(jTextArea8.getText().length());
            } else {
                jTextArea8.setText(h[0][15].toString());
                jTextArea8.setForeground(Color.BLACK);
            }
        } else {
            cargarinfoante();
        }
        gi.cargarginecog(idhc);
        gimac.cargarginecom(idhc);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            obs.cargarobstetricos(idhc);
            gesta.cargargesta(idhc);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
            Object part[][] = Funciones.RetornarDatos(act.cargarpostparto(idhc));
            jComboBox1.setSelectedIndex(Integer.parseInt(part[0][8].toString()));
            jComboBox2.setSelectedIndex(Integer.parseInt(part[0][10].toString()));
            jComboBox3.setSelectedIndex(Integer.parseInt(part[0][11].toString()));
            jComboBox4.setSelectedIndex(Integer.parseInt(part[0][12].toString()));
            jComboBox5.setSelectedIndex(Integer.parseInt(part[0][13].toString()));
            jComboBox6.setSelectedIndex(Integer.parseInt(part[0][14].toString()));
            jTextField1.setText(part[0][9].toString());
            if (part[0][15].toString().equals("0")) {
                jCheckBox7.setSelected(false);
            } else {
                jCheckBox7.setSelected(true);
            }
            if (part[0][16].toString().equals("0")) {
                jCheckBox8.setSelected(false);
            } else {
                jCheckBox8.setSelected(true);
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
            Object recien[][] = Funciones.RetornarDatos(act.cargarrecien(idhc));
            if (recien[0][8].toString().endsWith("0")) {
                jCheckBox10.setSelected(false);
            } else {
                jCheckBox10.setSelected(true);
            }
            if (recien[0][9].toString().endsWith("0")) {
                jCheckBox9.setSelected(false);
            } else {
                jCheckBox9.setSelected(true);
            }
            if (recien[0][10].toString().endsWith("0")) {
                jCheckBox11.setSelected(false);
            } else {
                jCheckBox11.setSelected(true);
            }
            if (recien[0][11].toString().endsWith("0")) {
                jCheckBox13.setSelected(false);
            } else {
                jCheckBox13.setSelected(true);
            }
            if (recien[0][12].toString().endsWith("0")) {
                jCheckBox12.setSelected(false);
            } else {
                jCheckBox12.setSelected(true);
            }
            if (recien[0][13].toString().endsWith("0")) {
                jCheckBox14.setSelected(false);
            } else {
                jCheckBox14.setSelected(true);
            }
            if (recien[0][14].toString().endsWith("0")) {
                jCheckBox15.setSelected(false);
            } else {
                jCheckBox15.setSelected(true);
            }
            if (recien[0][15].toString().endsWith("0")) {
                jCheckBox16.setSelected(false);
            } else {
                jCheckBox16.setSelected(true);
            }
            jTextField2.setText(recien[0][16].toString());
            jTextField3.setText(recien[0][17].toString());
            jTextField4.setText(recien[0][18].toString());
            jTextField5.setText(recien[0][19].toString());
            jComboBox8.setSelectedIndex(Integer.parseInt(recien[0][20].toString()));
            jComboBox9.setSelectedIndex(Integer.parseInt(recien[0][21].toString()));
            jComboBox10.setSelectedIndex(Integer.parseInt(recien[0][22].toString()));
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            cargarcrecimiento(idhc);
        }
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
            case 7:
                HC.Diabetes.jLabel4.setText("...");
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
            case 7:
                HC.Diabetes.jLabel4.setText(texto);
                break;
        }
    }

    public void actcrecimiento(String idhc) {
        String c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15;
        float n1, n2, n3;
        if (jCheckBox18.isSelected() == false) {
            c1 = "0";
        } else {
            c1 = "1";
        }
        if (jCheckBox17.isSelected() == false) {
            c2 = "0";
        } else {
            c2 = "1";
        }
        if (jCheckBox19.isSelected() == false) {
            c3 = "0";
        } else {
            c3 = "1";
        }
        if (jCheckBox21.isSelected() == false) {
            c4 = "0";
        } else {
            c4 = "1";
        }
        if (jCheckBox20.isSelected() == false) {
            c5 = "0";
        } else {
            c5 = "1";
        }
        if (jCheckBox22.isSelected() == false) {
            c6 = "0";
        } else {
            c6 = "1";
        }
        if (jCheckBox23.isSelected() == false) {
            c7 = "0";
        } else {
            c7 = "1";
        }
        if (jCheckBox24.isSelected() == false) {
            c8 = "0";
        } else {
            c8 = "1";
        }
        if (jTextField8.getText().toString().equals("")) {
            c9 = "99";
        } else {
            c9 = jTextField8.getText().toString();
        }
        if (jTextField6.getText().equals("")) {
            n1 = 0;
        } else {
            n1 = Float.parseFloat(jTextField6.getText().toString());
        }
        if (jTextField7.getText().equals("")) {
            n2 = 0;
        } else {
            n2 = Float.parseFloat(jTextField7.getText().toString());
        }
        if (jTextField9.getText().equals("")) {
            n3 = 0;
        } else {
            n3 = Float.parseFloat(jTextField9.getText().toUpperCase().toString());
        }
        c10 = String.valueOf(jComboBox11.getSelectedIndex());
        c11 = String.valueOf(jComboBox12.getSelectedIndex());
        c12 = String.valueOf(jComboBox13.getSelectedIndex());
        if (jTextField10.getText().equals("")) {
            c13 = "N/A";
        } else {
            c13 = jTextField10.getText().toUpperCase().toString();
        }
        c14 = String.valueOf(jComboBox7.getSelectedIndex());
        if (jCheckBox25.isSelected() == false) {
            c15 = "0";
        } else {
            c15 = "1";
        }
        act.actcrecimiento(idhc, c1, c2, c3, c4, c5, c6, c7, c8, n1, n2, c9, n3, c10, c11, c12, c14, c13, c15, usuario);
    }

    public void cargarcrecimiento(String idhc) {
        Object pypdata[][] = Funciones.RetornarDatos(act.cargarcrecimiento(idhc));
        if (pypdata[0][8].toString().equals("0")) {
            jCheckBox18.setSelected(false);
        } else {
            jCheckBox18.setSelected(true);
        }
        if (pypdata[0][9].toString().equals("0")) {
            jCheckBox17.setSelected(false);
        } else {
            jCheckBox17.setSelected(true);
        }
        if (pypdata[0][10].toString().equals("0")) {
            jCheckBox19.setSelected(false);
        } else {
            jCheckBox19.setSelected(true);
        }
        if (pypdata[0][11].toString().equals("0")) {
            jCheckBox21.setSelected(false);
        } else {
            jCheckBox21.setSelected(true);
        }
        if (pypdata[0][12].toString().equals("0")) {
            jCheckBox20.setSelected(false);
        } else {
            jCheckBox20.setSelected(true);
        }
        if (pypdata[0][13].toString().equals("0")) {
            jCheckBox22.setSelected(false);
        } else {
            jCheckBox22.setSelected(true);
        }
        if (pypdata[0][14].toString().equals("0")) {
            jCheckBox23.setSelected(false);
        } else {
            jCheckBox23.setSelected(true);
        }
        if (pypdata[0][15].toString().equals("0")) {
            jCheckBox24.setSelected(false);
        } else {
            jCheckBox24.setSelected(true);
        }
        if (pypdata[0][25].toString().equals("0")) {
            jCheckBox25.setSelected(false);
        } else {
            jCheckBox25.setSelected(true);
        }
        jTextField6.setText(pypdata[0][16].toString());
        jTextField7.setText(pypdata[0][17].toString());
        jTextField8.setText(pypdata[0][18].toString());
        jTextField9.setText(pypdata[0][19].toString());
        jComboBox11.setSelectedIndex(Integer.parseInt(pypdata[0][20].toString()));
        jComboBox12.setSelectedIndex(Integer.parseInt(pypdata[0][21].toString()));
        jComboBox13.setSelectedIndex(Integer.parseInt(pypdata[0][22].toString()));
        jComboBox7.setSelectedIndex(Integer.parseInt(pypdata[0][23].toString()));
        jTextField10.setText(pypdata[0][24].toString());
    }

    public void cargarinfoante() {
        Object car[][] = Funciones.RetornarDatos(act.contarantecedente(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        if (car[0][0].toString().equals("1")) {
            Object dante[][] = Funciones.RetornarDatos(act.cargarante(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
            if (dante[0][2].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea1.setText(dante[0][2].toString());
                jTextArea1.setSelectionStart(0);
                jTextArea1.setSelectionEnd(jTextArea1.getText().length());
            } else {
                jTextArea1.setText(dante[0][2].toString());
                jTextArea1.setForeground(Color.BLACK);
            }
            if (dante[0][3].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea2.setText(dante[0][3].toString());
                jTextArea2.setSelectionStart(0);
                jTextArea2.setSelectionEnd(jTextArea2.getText().length());
            } else {
                jTextArea2.setText(dante[0][3].toString());
                jTextArea2.setForeground(Color.BLACK);
            }
            if (dante[0][4].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea3.setText(dante[0][4].toString());
                jTextArea3.setSelectionStart(0);
                jTextArea3.setSelectionEnd(jTextArea3.getText().length());
            } else {
                jTextArea3.setText(dante[0][4].toString());
                jTextArea3.setForeground(Color.BLACK);
            }
            if (dante[0][5].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea4.setText(dante[0][5].toString());
                jTextArea4.setSelectionStart(0);
                jTextArea4.setSelectionEnd(jTextArea4.getText().length());
            } else {
                jTextArea4.setText(dante[0][5].toString());
                jTextArea4.setForeground(Color.BLACK);
            }
            if (dante[0][6].toString().equals("false")) {
                jCheckBox2.setSelected(false);
            } else {
                jCheckBox2.setSelected(true);
            }
            if (dante[0][7].toString().equals("false")) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            if (dante[0][8].toString().equals("false")) {
                jCheckBox3.setSelected(false);
            } else {
                jCheckBox3.setSelected(true);
            }
            if (dante[0][9].toString().equals("NINGUNO")) {
                jTextArea5.setText(dante[0][9].toString());
                jTextArea5.setSelectionStart(0);
                jTextArea5.setSelectionEnd(jTextArea5.getText().length());
            } else {
                jTextArea5.setText(dante[0][9].toString());
                jTextArea5.setForeground(Color.BLACK);
            }
            if (dante[0][10].toString().equals("false")) {
                jCheckBox4.setSelected(false);
            } else {
                jCheckBox4.setSelected(true);
            }
            if (dante[0][11].toString().equals("false")) {
                jCheckBox5.setSelected(false);
            } else {
                jCheckBox5.setSelected(true);
            }
            if (dante[0][12].toString().equals("false")) {
                jCheckBox6.setSelected(false);
            } else {
                jCheckBox6.setSelected(true);
            }
            if (dante[0][13].toString().equals("NINGUNO")) {
                jTextArea6.setText(dante[0][13].toString());
                jTextArea6.setSelectionStart(0);
                jTextArea6.setSelectionEnd(jTextArea6.getText().length());
            } else {
                jTextArea6.setText(dante[0][13].toString());
                jTextArea6.setForeground(Color.BLACK);
            }
            if (dante[0][14].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea7.setText(dante[0][14].toString());
                jTextArea7.setSelectionStart(0);
                jTextArea7.setSelectionEnd(jTextArea7.getText().length());
            } else {
                jTextArea7.setText(dante[0][14].toString());
                jTextArea7.setForeground(Color.BLACK);
            }
            if (dante[0][15].toString().equals("NO SE ENCUENTRAN DATOS")) {
                jTextArea8.setText(dante[0][15].toString());
                jTextArea8.setSelectionStart(0);
                jTextArea8.setSelectionEnd(jTextArea8.getText().length());
            } else {
                jTextArea8.setText(dante[0][15].toString());
                jTextArea8.setForeground(Color.BLACK);
            }
        }
    }

    public void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Id", "Codigo", "Procedimiento", "Categoria", "Estado"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
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
        tablaanteprocedimiento.setModel(modelo);
    }

    private void tabla() {
        try {
            getModelo();
            tablaanteprocedimiento.getTableHeader().setReorderingAllowed(false);
            tablaanteprocedimiento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(tablaanteprocedimiento, new int[]{0, 1, 3, 4});
            Funciones_AD.setSizeColumnas(tablaanteprocedimiento, new int[]{1}, new int[]{385});
            tab.cargaranteparaclinico(modelo, pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), AntecedentesP.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getModelomedi() {
        modelo2 = new DefaultTableModel(
                null, new String[]{"Id", "Medicamento"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false
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
        tablaantemedi.setModel(modelo2);
    }

    private void tabla2() {
        try {
            getModelomedi();
            tablaantemedi.getTableHeader().setReorderingAllowed(false);
            tablaantemedi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(tablaantemedi, new int[]{0});
            Funciones_AD.setSizeColumnas(tablaantemedi, new int[]{1}, new int[]{385});
            tab.cargarantemedicamento(modelo2, pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), AntecedentesP.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getModeloexam() {
        modelo3 = new DefaultTableModel(
                null, new String[]{"Id", "Codigo", "Examen", "Categoria", "Estado", "idprocedi", "fecha", "resultado", "observaciones"}) {
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
        tablaanteexamen.setModel(modelo3);
    }

    private void tabla3() {
        try {
            getModeloexam();
            tablaanteexamen.getTableHeader().setReorderingAllowed(false);
            tablaanteexamen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            Funciones_AD.setOcultarColumnas(tablaanteexamen, new int[]{0, 1, 3, 4, 5, 6, 7, 8});
            Funciones_AD.setSizeColumnas(tablaanteexamen, new int[]{2}, new int[]{385});
            tab.cargaranteexamen(modelo3, pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), AntecedentesP.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void nuevoexamen() {
        for (int i = 0; i < modelo3.getRowCount(); i++) {
            Object datap[][] = Funciones.RetornarDatos(act.conteoexamen(tablaanteexamen.getValueAt(i, 5).toString()));
            if (datap[0][0].toString().equals("0")) {
                if (tablaanteexamen.getValueAt(i, 4).toString().equals("3")) {
                    String fecha[] = modelo3.getValueAt(i, 6).toString().split("/");
                    String ad = (fecha[2] + "-" + fecha[1] + "-" + fecha[0]);
                    modelo3.setValueAt("2", i, 4);
                    sav.newrelexamen(modelo3.getValueAt(i, 5).toString(), ad, modelo3.getValueAt(i, 7).toString(), modelo3.getValueAt(i, 8).toString(), usuario);
                }
            } else {
                if (tablaanteexamen.getValueAt(i, 4).toString().equals("3")) {
                    String fecha[] = modelo3.getValueAt(i, 6).toString().split("/");
                    String ad = (fecha[2] + "-" + fecha[1] + "-" + fecha[0]);
                    modelo3.setValueAt("2", i, 4);
                    act.actrexamen(modelo3.getValueAt(i, 5).toString(), ad, modelo3.getValueAt(i, 7).toString(), modelo3.getValueAt(i, 8).toString(), usuario);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JCheckBox jCheckBox10;
    javax.swing.JCheckBox jCheckBox11;
    javax.swing.JCheckBox jCheckBox12;
    javax.swing.JCheckBox jCheckBox13;
    javax.swing.JCheckBox jCheckBox14;
    javax.swing.JCheckBox jCheckBox15;
    javax.swing.JCheckBox jCheckBox16;
    javax.swing.JCheckBox jCheckBox17;
    javax.swing.JCheckBox jCheckBox18;
    javax.swing.JCheckBox jCheckBox19;
    javax.swing.JCheckBox jCheckBox2;
    javax.swing.JCheckBox jCheckBox20;
    javax.swing.JCheckBox jCheckBox21;
    javax.swing.JCheckBox jCheckBox22;
    javax.swing.JCheckBox jCheckBox23;
    javax.swing.JCheckBox jCheckBox24;
    javax.swing.JCheckBox jCheckBox25;
    javax.swing.JCheckBox jCheckBox3;
    javax.swing.JCheckBox jCheckBox4;
    javax.swing.JCheckBox jCheckBox5;
    javax.swing.JCheckBox jCheckBox6;
    javax.swing.JCheckBox jCheckBox7;
    javax.swing.JCheckBox jCheckBox8;
    javax.swing.JCheckBox jCheckBox9;
    javax.swing.JComboBox jComboBox1;
    javax.swing.JComboBox jComboBox10;
    javax.swing.JComboBox jComboBox11;
    javax.swing.JComboBox jComboBox12;
    javax.swing.JComboBox jComboBox13;
    javax.swing.JComboBox jComboBox2;
    javax.swing.JComboBox jComboBox3;
    javax.swing.JComboBox jComboBox4;
    javax.swing.JComboBox jComboBox5;
    javax.swing.JComboBox jComboBox6;
    javax.swing.JComboBox jComboBox7;
    javax.swing.JComboBox jComboBox8;
    javax.swing.JComboBox jComboBox9;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel19;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JLabel jLabel22;
    javax.swing.JLabel jLabel23;
    javax.swing.JLabel jLabel24;
    javax.swing.JLabel jLabel25;
    javax.swing.JLabel jLabel26;
    javax.swing.JLabel jLabel27;
    javax.swing.JLabel jLabel28;
    javax.swing.JLabel jLabel29;
    javax.swing.JLabel jLabel3;
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
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel40;
    javax.swing.JLabel jLabel41;
    javax.swing.JLabel jLabel42;
    javax.swing.JLabel jLabel43;
    javax.swing.JLabel jLabel44;
    javax.swing.JLabel jLabel45;
    javax.swing.JLabel jLabel46;
    javax.swing.JLabel jLabel47;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel10;
    javax.swing.JPanel jPanel11;
    javax.swing.JPanel jPanel12;
    javax.swing.JPanel jPanel13;
    javax.swing.JPanel jPanel14;
    javax.swing.JPanel jPanel15;
    javax.swing.JPanel jPanel16;
    javax.swing.JPanel jPanel17;
    javax.swing.JPanel jPanel18;
    javax.swing.JPanel jPanel19;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel20;
    javax.swing.JPanel jPanel21;
    javax.swing.JPanel jPanel22;
    javax.swing.JPanel jPanel23;
    javax.swing.JPanel jPanel24;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JPanel jPanel6;
    javax.swing.JPanel jPanel7;
    javax.swing.JPanel jPanel8;
    javax.swing.JPanel jPanel9;
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane17;
    javax.swing.JScrollPane jScrollPane18;
    javax.swing.JScrollPane jScrollPane19;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane20;
    javax.swing.JScrollPane jScrollPane21;
    javax.swing.JScrollPane jScrollPane22;
    javax.swing.JScrollPane jScrollPane23;
    javax.swing.JScrollPane jScrollPane24;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JTabbedPane jTabbedPane2;
    javax.swing.JTextArea jTextArea1;
    javax.swing.JTextArea jTextArea2;
    javax.swing.JTextArea jTextArea3;
    javax.swing.JTextArea jTextArea4;
    javax.swing.JTextArea jTextArea5;
    javax.swing.JTextArea jTextArea6;
    javax.swing.JTextArea jTextArea7;
    javax.swing.JTextArea jTextArea8;
    javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField10;
    javax.swing.JTextField jTextField2;
    javax.swing.JTextField jTextField3;
    javax.swing.JTextField jTextField4;
    javax.swing.JTextField jTextField5;
    javax.swing.JTextField jTextField6;
    javax.swing.JTextField jTextField7;
    javax.swing.JTextField jTextField8;
    javax.swing.JTextField jTextField9;
    javax.swing.JTable tablaanteexamen;
    javax.swing.JTable tablaantemedi;
    javax.swing.JTable tablaanteprocedimiento;
    // End of variables declaration//GEN-END:variables
}
