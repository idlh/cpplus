package HC;

import java.awt.Color;
import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.Save;
import Clases.Funciones_AD;

/**
 *
 * @author Camilo
 */
public class AntecedentesP extends javax.swing.JPanel {

    public ginecogenerales gi = null;
    public ginecomac gimac = null;
    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    Save sav = new Save();
    Funciones_AD Funciones = new Funciones_AD();

    public AntecedentesP(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        if (gi == null) {
            gi = new ginecogenerales(pypAdmAsistCon);
        }
        if (gimac == null) {
            gimac = new ginecomac(pypAdmAsistCon);
        }
        jPanel24.setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));
        setPreferredSize(new java.awt.Dimension(558, 345));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Antecedentes personales");

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
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea1MouseReleased(evt);
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
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
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
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
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
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea2MouseReleased(evt);
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
                        .addGap(0, 378, Short.MAX_VALUE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
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
        jTextArea3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea3MouseReleased(evt);
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
                        .addGap(0, 378, Short.MAX_VALUE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
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
        jTextArea4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea4MouseReleased(evt);
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
                        .addGap(0, 392, Short.MAX_VALUE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
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
        jTextArea5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea5MouseReleased(evt);
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
                        .addGap(0, 330, Short.MAX_VALUE))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
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
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
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
        jTextArea6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea6MouseReleased(evt);
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
                        .addGap(0, 290, Short.MAX_VALUE))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
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
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
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
        jTextArea7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea7MouseReleased(evt);
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
                        .addGap(0, 385, Short.MAX_VALUE))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
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
        jTextArea8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea8MouseReleased(evt);
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
                        .addGap(0, 335, Short.MAX_VALUE))
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
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
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 334, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addContainerGap(177, Short.MAX_VALUE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Ginecobstetricos", jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        Adulto.jLabel4.setText("Generales");
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jPanel23.setBackground(new Color(255, 227, 255));
        Adulto.jLabel4.setText("Metodos Anticonceptivos");
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jPanel18.setBackground(new Color(125, 164, 222));
        Adulto.jLabel4.setText("...");
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jPanel23.setBackground(new Color(125, 164, 222));
        Adulto.jLabel4.setText("...");
    }//GEN-LAST:event_jLabel18MouseExited

    private void jTextArea1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseReleased
        jTextArea1.setSelectionStart(0);
        jTextArea1.setSelectionEnd(jTextArea1.getText().length());
    }//GEN-LAST:event_jTextArea1MouseReleased

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        jTextArea1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jTextArea2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseReleased
        jTextArea2.setSelectionStart(0);
        jTextArea2.setSelectionEnd(jTextArea2.getText().length());
    }//GEN-LAST:event_jTextArea2MouseReleased

    private void jTextArea2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyReleased
        jTextArea2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea2KeyReleased

    private void jTextArea3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea3MouseReleased
        jTextArea3.setSelectionStart(0);
        jTextArea3.setSelectionEnd(jTextArea3.getText().length());
    }//GEN-LAST:event_jTextArea3MouseReleased

    private void jTextArea3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea3KeyReleased
        jTextArea3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea3KeyReleased

    private void jTextArea4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea4MouseReleased
        jTextArea4.setSelectionStart(0);
        jTextArea4.setSelectionEnd(jTextArea4.getText().length());
    }//GEN-LAST:event_jTextArea4MouseReleased

    private void jTextArea4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea4KeyReleased
        jTextArea4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea4KeyReleased

    private void jTextArea5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea5MouseReleased
        jTextArea5.setSelectionStart(0);
        jTextArea5.setSelectionEnd(jTextArea5.getText().length());
    }//GEN-LAST:event_jTextArea5MouseReleased

    private void jTextArea5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea5KeyReleased
        jTextArea5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea5KeyReleased

    private void jTextArea6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea6MouseReleased
        jTextArea6.setSelectionStart(0);
        jTextArea6.setSelectionEnd(jTextArea6.getText().length());
    }//GEN-LAST:event_jTextArea6MouseReleased

    private void jTextArea6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea6KeyReleased
        jTextArea6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea6KeyReleased

    private void jTextArea7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea7MouseReleased
        jTextArea7.setSelectionStart(0);
        jTextArea7.setSelectionEnd(jTextArea7.getText().length());
    }//GEN-LAST:event_jTextArea7MouseReleased

    private void jTextArea7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea7KeyReleased
        jTextArea7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea7KeyReleased

    private void jTextArea8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea8MouseReleased
        jTextArea8.setSelectionStart(0);
        jTextArea8.setSelectionEnd(jTextArea8.getText().length());
    }//GEN-LAST:event_jTextArea8MouseReleased

    private void jTextArea8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea8KeyReleased
        jTextArea8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea8KeyReleased

    public void guardarantep() {
        gi.actuginecog();
        gimac.actginecomac();
        String q, w, e, r, t, y;
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
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
        act.actualizarantp(d, jTextArea1.getText().toUpperCase().toString(), jTextArea2.getText().toUpperCase().toString(),
                jTextArea3.getText().toUpperCase().toString(), jTextArea4.getText().toUpperCase().toString(),
                w, q, e, jTextArea5.getText().toUpperCase().toString(), r, t, y, jTextArea6.getText().toUpperCase().toString(),
                jTextArea7.getText().toUpperCase().toString(), jTextArea8.getText().toUpperCase().toString());
    }

    public void cargarancedentes() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(d));
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
        gi.cargarginecog();
        gimac.cargarginecom();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JCheckBox jCheckBox2;
    javax.swing.JCheckBox jCheckBox3;
    javax.swing.JCheckBox jCheckBox4;
    javax.swing.JCheckBox jCheckBox5;
    javax.swing.JCheckBox jCheckBox6;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel11;
    javax.swing.JPanel jPanel12;
    javax.swing.JPanel jPanel13;
    javax.swing.JPanel jPanel14;
    javax.swing.JPanel jPanel15;
    javax.swing.JPanel jPanel16;
    javax.swing.JPanel jPanel17;
    javax.swing.JPanel jPanel18;
    javax.swing.JPanel jPanel23;
    javax.swing.JPanel jPanel24;
    javax.swing.JPanel jPanel4;
    javax.swing.JScrollPane jScrollPane17;
    javax.swing.JScrollPane jScrollPane18;
    javax.swing.JScrollPane jScrollPane19;
    javax.swing.JScrollPane jScrollPane20;
    javax.swing.JScrollPane jScrollPane21;
    javax.swing.JScrollPane jScrollPane22;
    javax.swing.JScrollPane jScrollPane23;
    javax.swing.JScrollPane jScrollPane24;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JTextArea jTextArea1;
    javax.swing.JTextArea jTextArea2;
    javax.swing.JTextArea jTextArea3;
    javax.swing.JTextArea jTextArea4;
    javax.swing.JTextArea jTextArea5;
    javax.swing.JTextArea jTextArea6;
    javax.swing.JTextArea jTextArea7;
    javax.swing.JTextArea jTextArea8;
    // End of variables declaration//GEN-END:variables
}
