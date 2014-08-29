package HC;

import Clases.Funciones_AD;
import Clases.Save;
import entity.PypAdmAsistCon;
import java.awt.Color;
import javax.persistence.EntityManagerFactory;
import Clases.Actualizar;
import Dialogos.HCDiag.Imprimir;
import java.awt.Event;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ActionMapUIResource;

/**
 *
 * @author Camilo
 */
public class RecienNacido extends javax.swing.JPanel {

    private final EntityManagerFactory factory;
    private final PypAdmAsistCon pypAdmAsistCon;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    MotivoC motivoc = null;
    AntecedentesP antecedentesp = null;
    Enfermedadac enfermedadac = null;
    Exploracionf exploracionf = null;
    public OrdenesM ordenesm = null;
    PruebasComple pruebascomple = null;
    DiagnosticosM diagnosticosm = null;
    Actualizar act = new Actualizar();
    String Estadofinal = "1";
    public String idhc;
    private final int usuario;

    public RecienNacido(EntityManagerFactory factory, PypAdmAsistCon pypAdmAsistCon, Integer usuario) {
        initComponents();
        this.factory = factory;
        this.pypAdmAsistCon = pypAdmAsistCon;
        this.usuario = usuario;
        jPanel4.setBackground(Color.white);
        jLabel9.setVisible(false);
        jLabel12.setVisible(false);
        if (pruebascomple == null) {
            pruebascomple = new PruebasComple(pypAdmAsistCon, usuario);
        }
        if (motivoc == null) {
            motivoc = new MotivoC(pypAdmAsistCon, usuario);
        }
        if (antecedentesp == null) {
            antecedentesp = new AntecedentesP(pypAdmAsistCon, usuario);
        }
        if (enfermedadac == null) {
            enfermedadac = new Enfermedadac(pypAdmAsistCon);
        }
        if (exploracionf == null) {
            exploracionf = new Exploracionf(pypAdmAsistCon, usuario);
        }
        if (diagnosticosm == null) {
            diagnosticosm = new DiagnosticosM(factory, pypAdmAsistCon);
        }
        if (ordenesm == null) {
            ordenesm = new OrdenesM(pypAdmAsistCon, usuario);
        }
        crearhc();
        bt();
        jButton1.setToolTipText("Salir (Ctrl+Q)");
        jButton2.setToolTipText("Imprimir (Crtl+P)");
        jButton3.setToolTipText("Guardar (Ctrl+G)");
        jButton4.setToolTipText("Finalziar (Crtl+F)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(745, 393));
        setMinimumSize(new java.awt.Dimension(745, 393));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(745, 393));
        jPanel1.setMinimumSize(new java.awt.Dimension(745, 393));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 393));

        jPanel4.setBackground(new java.awt.Color(125, 164, 222));
        jPanel4.setMaximumSize(new java.awt.Dimension(558, 345));
        jPanel4.setMinimumSize(new java.awt.Dimension(558, 345));
        jPanel4.setPreferredSize(new java.awt.Dimension(558, 345));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 227, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("  Motivo de Consulta");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 227, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Atencion del Recien Nacido");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 21, 134, 13);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CONSULTA DE PRIMERA VEZ POR MEDICINA GENERAL");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 2, 327, 15);

        jButton1.setBackground(new java.awt.Color(255, 227, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc2.png"))); // NOI18N
        jButton1.setToolTipText("Salir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salirc1.png"))); // NOI18N
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
        jPanel2.add(jButton1);
        jButton1.setBounds(700, 2, 38, 38);

        jButton2.setBackground(new java.awt.Color(255, 227, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/impc2.png"))); // NOI18N
        jButton2.setToolTipText("Imprimir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/impc1.png"))); // NOI18N
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
        jPanel2.add(jButton2);
        jButton2.setBounds(654, 2, 38, 38);

        jButton3.setBackground(new java.awt.Color(255, 227, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/savec2.png"))); // NOI18N
        jButton3.setToolTipText("Guardar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/savec1.png"))); // NOI18N
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
        jPanel2.add(jButton3);
        jButton3.setBounds(562, 2, 38, 38);

        jButton4.setBackground(new java.awt.Color(255, 227, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc2.png"))); // NOI18N
        jButton4.setToolTipText("Finalizar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc1.png"))); // NOI18N
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
        jPanel2.add(jButton4);
        jButton4.setBounds(608, 2, 38, 38);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Datos guardados Satisfactoriamente");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(294, 25, 250, 13);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Historia finalizada Correctamente");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(294, 25, 250, 13);

        jPanel11.setBackground(new java.awt.Color(255, 227, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("  Antecedentes Personales");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 227, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("  Enfermedad Actual");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 227, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("  Exploración Física");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(255, 227, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("  Pruebas Complementarias");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(255, 227, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("  Diagnostico Medico");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 227, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("  Ordenes Medicas");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(125, 164, 222));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 164, 222));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jLabel4.setText("Guardar");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jLabel4.setText("Finalizar");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jLabel4.setText("Imprimir");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel4.setText("Motivo de Consulta");
        jPanel9.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel4.setText("...");
        jPanel9.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel4.setText("Antecedentes Personales");
        jPanel11.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel4.setText("...");
        jPanel11.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel4.setText("Enfermedad Actual");
        jPanel12.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel4.setText("...");
        jPanel12.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel4.setText("Exploración Física");
        jPanel13.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel4.setText("...");
        jPanel13.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel4.setText("Pruebas Complementarias");
        jPanel14.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel4.setText("...");
        jPanel14.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel4.setText("Diagnostico Medico");
        jPanel16.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel4.setText("...");
        jPanel16.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel4.setText("Ordenes Medicas");
        jPanel17.setBackground(new Color(125, 164, 222));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel4.setText("...");
        jPanel17.setBackground(new Color(255, 227, 255));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jLabel4.setText("...");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jLabel4.setText("Salir");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.jPanel4.removeAll();
        motivoc.jLabel3.setText("Atencion del Recien Nacido");
        new Clases.Explode(jPanel4, motivoc).play();
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        this.jPanel4.removeAll();
        new Clases.Explode(jPanel4, antecedentesp).play();
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        this.jPanel4.removeAll();
        new Clases.Explode(jPanel4, enfermedadac).play();
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        this.jPanel4.removeAll();
        new Clases.Explode(jPanel4, exploracionf).play();
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        this.jPanel4.removeAll();
        new Clases.Explode(jPanel4, pruebascomple).play();
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        this.jPanel4.removeAll();
        new Clases.Explode(jPanel4, diagnosticosm).play();
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        this.jPanel4.removeAll();
        new Clases.Explode(jPanel4, ordenesm).play();
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        salir();
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        save();
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        finalizar();
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        imprimirhis();
    }//GEN-LAST:event_jButton2MouseReleased

    private void crearhc() {
        Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
        int b = Integer.parseInt(a[0][0].toString());
        if (b != 0) {
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
            idhc = (c[0][0].toString());
            Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
//            if (h[0][23].toString().equals("0")) {
            antecedentesp.cargarancedentes(idhc);
            enfermedadac.cargardatosenf(idhc);
            diagnosticosm.cargardx(idhc);
            ordenesm.cargarordenesm(idhc);
            motivoc.cargareventose(idhc);
            exploracionf.cargarexploracion(idhc);
            pruebascomple.cargarpruebas(idhc);
//            }
        }
        antecedentesp.cargarinfoante();
        antecedentesp.gi.cargarinfoanteg();
    }
    private Timer timer = new Timer();
    private int segundos = 5;

    class Contador extends TimerTask {

        @Override
        public void run() {
            segundos--;
            if (segundos == 0) {
                Detener();
                jLabel9.setVisible(false);
                jLabel12.setVisible(false);
            }
        }
    }

    public void Contar() {
        this.segundos = 5;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 600);
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void Detener() {
        timer.cancel();
    }

    public void imprimirhis() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        idhc = (c[0][0].toString());
        Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
        if (h[0][23].toString().equals("1")) {
            final Imprimir imp = new Imprimir((Frame) SwingUtilities.getWindowAncestor(this), true, idhc);
            imp.setLocationRelativeTo(null);
            imp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe finalizar para poder imprimir la historia");
        }
    }

    private void save() {
        if (Estadofinal.equals("1")) {
            Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b == 0) {
                sav.crearhcnueva(pypAdmAsistCon.getId().toString(), String.valueOf(usuario), String.valueOf(diagnosticosm.ciep));
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
                idhc = (c[0][0].toString());
                Date fecha = pypAdmAsistCon.getFecha();
                String patron = "yyyy-MM-dd", fc;
                SimpleDateFormat formato = new SimpleDateFormat(patron);
                fc = formato.format(fecha);
                sav.newagineco(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                sav.neweventose(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                sav.newexpf(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                sav.newrecien(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
                if (h[0][23].toString().equals("0")) {
                    motivoc.actualizardatos(idhc);
                    antecedentesp.guardarantep(idhc);
                    enfermedadac.actualizarenfac(idhc);
                    exploracionf.actexpf(idhc);
                    diagnosticosm.actdx(idhc);
                    ordenesm.actordenesm(idhc);
                    pruebascomple.actpruebasc(idhc);
                    Object poso[][] = Funciones.RetornarDatos(sav.recetam(idhc));
                    String cantiposo = poso[0][0].toString();
                    if (!cantiposo.equals("0")) {
                        sav.newreceta(idhc, String.valueOf(usuario), "1", "1");
                    }
                    jLabel9.setVisible(true);
                    Contar();
                }
            } else {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
                idhc = (c[0][0].toString());
                Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
//                if (h[0][23].toString().equals("0")) {
                motivoc.actualizardatos(idhc);
                antecedentesp.guardarantep(idhc);
                enfermedadac.actualizarenfac(idhc);
                exploracionf.actexpf(idhc);
                diagnosticosm.actdx(idhc);
                ordenesm.actordenesm(idhc);
                pruebascomple.actpruebasc(idhc);
                Object poso[][] = Funciones.RetornarDatos(sav.recetam(idhc));
                String cantiposo = poso[0][0].toString();
                if (!cantiposo.equals("0")) {
                    sav.newreceta(idhc, String.valueOf(usuario), "1", "1");
                }
                jLabel9.setVisible(true);
                Contar();
//                }
            }
            Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
            idhc = (c[0][0].toString());
            if (pypAdmAsistCon.getEstado().toString().equals("1")) {
                act.guardadohc(idhc, pypAdmAsistCon.getId().toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "La historia ya se encuentra finalizada");
        }
    }

    private void finalizar() {
        if (Estadofinal.equals("1")) {
            Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
            int b = Integer.parseInt(a[0][0].toString());
            if (b == 0) {
                sav.crearhcnueva(pypAdmAsistCon.getId().toString(), String.valueOf(usuario), String.valueOf(diagnosticosm.ciep));
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
                idhc = (c[0][0].toString());
                Date fecha = pypAdmAsistCon.getFecha();
                String patron = "yyyy-MM-dd", fc;
                SimpleDateFormat formato = new SimpleDateFormat(patron);
                fc = formato.format(fecha);
                sav.newagineco(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                sav.neweventose(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                sav.newexpf(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                sav.newrecien(idhc, pypAdmAsistCon.getIdControlPro().getIdProfesional().getId().toString(), fc);
                Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
                int id = Integer.parseInt(h[0][23].toString());
                if (id == 0) {
                    String mensaje = "¿Si finaliza la Historia no podra modificarla posteriormente? ";
                    int entrada = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar finalizacion", JOptionPane.YES_NO_OPTION);
                    if (entrada == 0) {
                        motivoc.actualizardatos(idhc);
                        antecedentesp.guardarantep(idhc);
                        enfermedadac.actualizarenfac(idhc);
                        exploracionf.actexpf(idhc);
                        diagnosticosm.actdx(idhc);
                        ordenesm.actordenesm(idhc);
                        pruebascomple.actpruebasc(idhc);
                        act.finalizarhc(idhc, pypAdmAsistCon.getId().toString());
                        Estadofinal = "2";
                        jLabel12.setVisible(true);
                        Contar();
                        Object poso[][] = Funciones.RetornarDatos(sav.recetam(idhc));
                        String cantiposo = poso[0][0].toString();
                        if (!cantiposo.equals("0")) {
                            sav.newreceta(idhc, String.valueOf(usuario), "1", "1");
                        }
                        imprimirhis();
                    }
                }
            } else {
                Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhcfinal(pypAdmAsistCon.getId().toString()));
                idhc = (c[0][0].toString());
                Object h[][] = Funciones.RetornarDatos(act.cargardatoshc(idhc));
                int id = Integer.parseInt(h[0][23].toString());
                if (id == 0) {
                    String mensaje = "¿Si finaliza la Historia no podra modificarla posteriormente? ";
                    int entrada = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar finalizacion", JOptionPane.YES_NO_OPTION);
                    if (entrada == 0) {
                        motivoc.actualizardatos(idhc);
                        antecedentesp.guardarantep(idhc);
                        enfermedadac.actualizarenfac(idhc);
                        exploracionf.actexpf(idhc);
                        diagnosticosm.actdx(idhc);
                        ordenesm.actordenesm(idhc);
                        pruebascomple.actpruebasc(idhc);
                        act.finalizarhc(idhc, pypAdmAsistCon.getId().toString());
                        Estadofinal = "2";
                        jLabel12.setVisible(true);
                        Contar();
                        Object poso[][] = Funciones.RetornarDatos(sav.recetam(idhc));
                        String cantiposo = poso[0][0].toString();
                        if (!cantiposo.equals("0")) {
                            sav.newreceta(idhc, String.valueOf(usuario), "1", "1");
                        }
                        imprimirhis();
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La historia ya se encuentra finalizada");
        }
    }

    private void salir() {
        Object a[][] = Funciones.RetornarDatos(sav.contarhc(pypAdmAsistCon.getId().toString()));
        int b = Integer.parseInt(a[0][0].toString());
        if (b == 0) {
            sav.validacionpacienteaten(pypAdmAsistCon.getId().toString(), "1");
        }
        modulo_pyp.Modulo_PyP.d.Contenedor_.removeAll();
        modulo_pyp.Modulo_PyP.d.Contenedor_.repaint();
    }

    private void bt() {
        //Atajo imprimir
        InputMap btoimp = new ComponentInputMap(jButton2);
        btoimp.put(KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK), jButton2);
        ActionMap mapimp = new ActionMapUIResource();
        mapimp.put(jButton2, impri());
        SwingUtilities.replaceUIActionMap(jButton2, mapimp);
        SwingUtilities.replaceUIInputMap(jButton2, JComponent.WHEN_IN_FOCUSED_WINDOW, btoimp);
        //Atajo Guardar
        InputMap btoguardar = new ComponentInputMap(jButton3);
        btoguardar.put(KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), jButton3);
        ActionMap mapguardar = new ActionMapUIResource();
        mapguardar.put(jButton3, guardar());
        SwingUtilities.replaceUIActionMap(jButton3, mapguardar);
        SwingUtilities.replaceUIInputMap(jButton3, JComponent.WHEN_IN_FOCUSED_WINDOW, btoguardar);
        //Atajo finalizar
        InputMap btofinal = new ComponentInputMap(jButton4);
        btofinal.put(KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK), jButton4);
        ActionMap mapfinal = new ActionMapUIResource();
        mapfinal.put(jButton4, finali());
        SwingUtilities.replaceUIActionMap(jButton4, mapfinal);
        SwingUtilities.replaceUIInputMap(jButton4, JComponent.WHEN_IN_FOCUSED_WINDOW, btofinal);
        //Atajo Salir
        InputMap btosalir = new ComponentInputMap(jButton1);
        btosalir.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK), jButton1);
        ActionMap mapsalir = new ActionMapUIResource();
        mapsalir.put(jButton1, sal());
        SwingUtilities.replaceUIActionMap(jButton1, mapsalir);
        SwingUtilities.replaceUIInputMap(jButton1, JComponent.WHEN_IN_FOCUSED_WINDOW, btosalir);
    }

    public AbstractAction impri() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimirhis();
            }
        };
    }

    public AbstractAction guardar() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        };
    }

    public AbstractAction finali() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalizar();
            }
        };
    }

    public AbstractAction sal() {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salir();
            }
        };
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
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
    javax.swing.JPanel jPanel16;
    javax.swing.JPanel jPanel17;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
