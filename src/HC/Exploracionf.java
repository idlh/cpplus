package HC;

import java.awt.Color;
import java.awt.event.KeyEvent;
import entity.PypAdmAsistCon;
import Clases.Actualizar;
import Clases.Funciones_AD;
import Clases.FuncionesC;
import Clases.Save;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import Clases.CargarordenesM;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camilo
 */
public class Exploracionf extends javax.swing.JPanel {

    private final PypAdmAsistCon pypAdmAsistCon;
    Actualizar act = new Actualizar();
    Save sav = new Save();
    Funciones_AD Funciones = new Funciones_AD();
    CargarordenesM tab = new CargarordenesM();
    FuncionesC FuncionesC = new FuncionesC();
    private DefaultTableModel modelo;

    public Exploracionf(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        jTextField10.setEditable(false);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 9) {
            jTabbedPane1.remove(jPanel2);
            jTabbedPane2.remove(jPanel18);
            jLabel64.setVisible(false);
        } else {
            jLabel21.setVisible(false);
            tabla();
            if (jTabbedPane1.getSelectedComponent() == jPanel1) {
                jTabbedPane2.setSelectedComponent(jPanel18);
            }
            jTextField21.setEditable(false);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 11 && pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 10
                && pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 2) {
            jTabbedPane1.remove(jPanel4);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11 || pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10
                || pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            selectApgar();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 1) {
            jTabbedPane1.remove(jPanel5);
        } else {
            if (jCheckBox4.isSelected() == false) {
                jDateChooser2.setEnabled(false);
            } else {
                jDateChooser2.setEnabled(true);
            }
            if (jCheckBox7.isSelected() == false) {
                jDateChooser3.setEnabled(false);
                jCheckBox8.setEnabled(false);
                jCheckBox9.setEnabled(false);
                jCheckBox10.setEnabled(false);
            } else {
                jDateChooser3.setEnabled(true);
                jCheckBox8.setEnabled(true);
                jCheckBox9.setEnabled(true);
                jCheckBox10.setEnabled(true);
            }
            if (pypAdmAsistCon.getIdAgend().getIdPaciente().getGenero().toString().equals("F")) {
                jLabel36.setText("Desarrollo Mamario:");
                jComboBox7.addItem("Estadio 1 (S1)");
                jComboBox7.addItem("Estadio 2 (S2)");
                jComboBox7.addItem("Estadio 3 (S3)");
                jComboBox7.addItem("Estadio 4 (S4)");
                jComboBox7.addItem("Estadio 5 (S5)");
                jComboBox8.addItem("Estadio 1 (P1)");
                jComboBox8.addItem("Estadio 2 (P2)");
                jComboBox8.addItem("Estadio 3 (P3)");
                jComboBox8.addItem("Estadio 4 (P4)");
                jComboBox8.addItem("Estadio 5 (P5)");
            } else {
                jLabel36.setText("Desarrollo Genital:");
                jComboBox7.addItem("Estadio 1 (G1)");
                jComboBox7.addItem("Estadio 2 (G2)");
                jComboBox7.addItem("Estadio 3 (G3)");
                jComboBox7.addItem("Estadio 4 (G4)");
                jComboBox7.addItem("Estadio 5 (G5)");
                jComboBox8.addItem("Estadio 1 (P1)");
                jComboBox8.addItem("Estadio 2 (P2)");
                jComboBox8.addItem("Estadio 3 (P3)");
                jComboBox8.addItem("Estadio 4 (P4)");
                jComboBox8.addItem("Estadio 5 (P5)");
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 6) {
            jTabbedPane1.remove(jPanel8);
            if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 7) {
                jTabbedPane1.remove(jPanel15);
            }
        } else {
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
                jTabbedPane1.remove(jPanel15);
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 7) {
            jTabbedPane1.remove(jPanel19);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 2) {
            jTabbedPane1.remove(jPanel10);
            jTabbedPane1.remove(jPanel17);
        } else {
            if (modulo_pyp.Modulo_PyP.d.listPacientes.año <= 5) {
                jTabbedPane1.remove(jPanel17);
                jTextField19.setEditable(false);
                jTextField14.setText(String.valueOf(modulo_pyp.Modulo_PyP.d.listPacientes.edad));
                jTextField14.setEditable(false);
            } else {
                jTabbedPane1.remove(jPanel10);
                jTextField20.setText(String.valueOf(modulo_pyp.Modulo_PyP.d.listPacientes.año));
                jTextField20.setEditable(false);
            }

        }
        jTabbedPane1.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        jTabbedPane2.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() != 5) {
            jTabbedPane1.remove(jPanel12);
            jTabbedPane2.remove(jPanel14);
        } else {
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("1")) {
                jTabbedPane1.remove(jPanel12);
                jTabbedPane2.remove(jPanel14);
            }
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

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jCheckBox21 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jLabel61 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox32 = new javax.swing.JCheckBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel60 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));
        setPreferredSize(new java.awt.Dimension(558, 345));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Exploración Física");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFocusTraversalPolicyProvider(true);
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(550, 168));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(550, 168));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 168));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel14.setText("M");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(131, 87, 20, 14);

        jLabel15.setText("°C");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(131, 62, 30, 14);

        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
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
        jPanel1.add(jTextField7);
        jTextField7.setBounds(37, 59, 90, 20);

        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
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
        jPanel1.add(jTextField8);
        jTextField8.setBounds(37, 84, 90, 20);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(37, 8, 90, 20);

        jLabel8.setText("TaS:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 11, 22, 14);

        jLabel16.setText("Talla:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 87, 30, 14);

        jLabel9.setText("resp/m");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(131, 37, 40, 14);

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
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
        jPanel1.add(jTextField4);
        jTextField4.setBounds(37, 34, 90, 20);

        jLabel2.setText("mmHg");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(131, 11, 30, 14);

        jLabel10.setText("FR:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 37, 17, 14);

        jLabel17.setText("T:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 62, 10, 14);

        jLabel11.setText("FC:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(181, 37, 17, 14);

        jLabel18.setText("Kg");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(321, 62, 30, 14);

        jLabel19.setText("Peso:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(181, 62, 27, 14);

        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
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
        jPanel1.add(jTextField9);
        jTextField9.setBounds(225, 59, 90, 20);

        jLabel12.setText("TaD:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(181, 11, 23, 14);

        jLabel20.setText("IMC:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(181, 87, 30, 14);

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
        jPanel1.add(jTextField2);
        jTextField2.setBounds(225, 8, 90, 20);

        jLabel4.setText("mmHg");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(319, 11, 30, 14);

        jLabel13.setText("ppm");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(319, 37, 40, 14);

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(225, 34, 90, 20);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField10);
        jTextField10.setBounds(225, 84, 90, 20);

        jLabel5.setText("Otros:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(365, 0, 39, 14);

        jTextPane1.setColumns(20);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTextPane1.setLineWrap(true);
        jTextPane1.setRows(5);
        jTextPane1.setText("Ninguno");
        jTextPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextPane1FocusGained(evt);
            }
        });
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane1KeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(365, 17, 166, 87);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("...");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(181, 110, 134, 14);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Debe ingresar la edad gestacional en la pestaña 'Gestacion Actual' para calcular el IMC");
        jPanel1.add(jLabel64);
        jLabel64.setBounds(10, 110, 520, 14);

        jTabbedPane1.addTab("Constantes", jPanel1);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("No se encuentran datos relevantes");
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
        jScrollPane2.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Aspecto general", jScrollPane2);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("No se encuentran datos relevantes");
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
        jScrollPane3.setViewportView(jTextArea2);

        jTabbedPane1.addTab("Neurologico y cara", jScrollPane3);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("No se encuentran datos relevantes");
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
        jScrollPane4.setViewportView(jTextArea3);

        jTabbedPane1.addTab("Cardiovascular", jScrollPane4);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("No se encuentran datos relevantes");
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
        jScrollPane5.setViewportView(jTextArea4);

        jTabbedPane1.addTab("Respiratorio", jScrollPane5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("FPP:");

        jDateChooser1.setFocusable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EG confiable por"));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("FUM");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Eco < 20 Sem");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel23.setText("EG:");

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

        jLabel24.setText("Altura Uterina:");

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

        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jLabel25.setText("Mov. Fetales:");

        jLabel26.setText("FCF:");

        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jLabel30.setText("Semanas");

        jLabel31.setText("Cm");

        jLabel32.setText("Movimientos");

        jLabel33.setText("ppm");

        jLabel34.setText("Presentacion:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cefalica", "Pelviana", "Transversa" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Fe");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.setFocusable(false);

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Folatos");
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.setFocusable(false);

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Calcio");
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox6.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6)
                    .addComponent(jTextField12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel30)
                            .addComponent(jLabel34)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel31)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel32)
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel33)
                            .addComponent(jCheckBox6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestación actual", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Color de piel:");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todo Azul", "Extremidades Azules", "Normal" }));
        jComboBox2.setFocusable(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Frecuencia cardiaca:");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "Menos de 100", "Mas de 100" }));
        jComboBox3.setFocusable(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("<html><p>Reflejos e irritabilidad:</p></html>");

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin respuesta a estimulación", "Mueca/Llanto débil al ser estimulado", "Estornudos/Tos/Pataleo al ser estimulado" }));
        jComboBox4.setFocusable(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel27.setText("Tono muscular:");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Alguna flexión", "Movimiento activo" }));
        jComboBox5.setFocusable(false);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ausente", "Débil o irregular", "Fuerte" }));
        jComboBox6.setFocusable(false);
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel28.setText("Respiración:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel29.setText("Resultado:");

        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox6, 0, 1, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel29))
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Apgar", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(545, 111));
        jPanel5.setMinimumSize(new java.awt.Dimension(545, 111));
        jPanel5.setPreferredSize(new java.awt.Dimension(545, 111));

        jLabel36.setText("Desarrollo Mamario:");

        jComboBox7.setFocusable(false);

        jLabel37.setText("Desarrollo Vello Pubiano:");

        jComboBox8.setFocusable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valoracion visual"));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Valoracion visual");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.setFocusable(false);
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseReleased(evt);
            }
        });

        jLabel38.setText("Fecha:");

        jDateChooser2.setFocusable(false);
        jDateChooser2.setMaxSelectableDate(new java.util.Date(253370786462000L));
        jDateChooser2.setMaximumSize(new java.awt.Dimension(95, 20));
        jDateChooser2.setMinimumSize(new java.awt.Dimension(95, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jCheckBox4)
                .addComponent(jLabel38))
            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valoracion Oral"));

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Valoracion Oral");
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox7.setFocusable(false);
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseReleased(evt);
            }
        });

        jLabel39.setText("Fecha:");

        jDateChooser3.setFocusable(false);
        jDateChooser3.setMaximumSize(new java.awt.Dimension(95, 20));
        jDateChooser3.setMinimumSize(new java.awt.Dimension(95, 20));

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Control placa");
        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox8.setFocusable(false);

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Fluor");
        jCheckBox9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox9.setFocusable(false);

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Sellantes");
        jCheckBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox10.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox10)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox7)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, 0, 145, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Tanner", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setFocusable(false);
        jPanel8.setMaximumSize(new java.awt.Dimension(545, 80));
        jPanel8.setMinimumSize(new java.awt.Dimension(545, 80));
        jPanel8.setPreferredSize(new java.awt.Dimension(545, 80));

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("HTA");
        jCheckBox11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox11.setFocusable(false);
        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseReleased(evt);
            }
        });
        jCheckBox11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCheckBox11ComponentShown(evt);
            }
        });

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("DM1");
        jCheckBox12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox12.setFocusable(false);
        jCheckBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox12MouseReleased(evt);
            }
        });
        jCheckBox12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCheckBox12ComponentShown(evt);
            }
        });

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("DM2");
        jCheckBox13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox13.setFocusable(false);
        jCheckBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox13MouseReleased(evt);
            }
        });
        jCheckBox13.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCheckBox13ComponentShown(evt);
            }
        });

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("Dislipidemia");
        jCheckBox14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox14.setFocusable(false);
        jCheckBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox14MouseReleased(evt);
            }
        });
        jCheckBox14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCheckBox14ComponentShown(evt);
            }
        });

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("Controlado");
        jCheckBox15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox15.setFocusable(false);

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setText("Controlado");
        jCheckBox16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox16.setFocusable(false);

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setText("Controlado");
        jCheckBox17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox17.setFocusable(false);

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setText("Controlado");
        jCheckBox18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox18.setFocusable(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Evaluacion Cardiovascular"));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Pre HTA", "1", "2" }));
        jComboBox9.setFocusable(false);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Bajo: < 10 %", "Moderado: 10 - 20 %", "Alto: > 20 %", "Muy Alto" }));
        jComboBox10.setFocusable(false);

        jLabel40.setText("Estadío:");

        jLabel41.setText("Riesgo Cardiovascular:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18))
                .addGap(6, 6, 6)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox11)
                        .addGap(7, 7, 7)
                        .addComponent(jCheckBox12)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox13)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBox15)
                        .addGap(7, 7, 7)
                        .addComponent(jCheckBox16)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox17)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox18))))
        );

        jTabbedPane1.addTab("HTA", jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 227, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Table.png"))); // NOI18N
        jLabel42.setText("Cargar tablas de ayuda");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.setFocusable(false);
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel42MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel47.setText("Meses:");

        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jLabel48.setText("Motricidad gruesa:");

        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });

        jLabel49.setText("Motricidad fina adaptativa:");

        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField16KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });

        jLabel50.setText("Audicion y lenguaje:");

        jTextField17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField17FocusGained(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField17KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField17KeyTyped(evt);
            }
        });

        jLabel51.setText("Personal social:");

        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField18FocusGained(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField18KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });

        jLabel52.setText("Total:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Valoracion CYD", null, jPanel10, "Valoracion Crecimiento y Desarrollo");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setText("Metodo anterior:");

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setText("Satisfacción");
        jCheckBox21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox21.setFocusable(false);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Efectos"));

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setText("Cambios de comportamiento");
        jCheckBox20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox20.setFocusable(false);

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setText("Trastornos menstruales");
        jCheckBox19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox19.setFocusable(false);

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setText("Cefaleas");
        jCheckBox22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox22.setFocusable(false);

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setText("Mareos");
        jCheckBox23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox23.setFocusable(false);

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setText("Manchas en la piel");
        jCheckBox24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox24.setFocusable(false);

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setText("Molestia en las mamas");
        jCheckBox25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox25.setFocusable(false);

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setText("Edemas");
        jCheckBox26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox26.setFocusable(false);

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setText("Varices");
        jCheckBox27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox27.setFocusable(false);

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setText("Expulsión dispositivo");
        jCheckBox28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox28.setFocusable(false);

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setText("Dolor bajo vientre");
        jCheckBox29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox29.setFocusable(false);

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setText("Flujo vaginal");
        jCheckBox30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox30.setFocusable(false);

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setText("Sintomas urinarios");
        jCheckBox31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox31.setFocusable(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox28, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jCheckBox24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox31)))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MAC", jPanel12);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setText("Observaciones");

        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea12.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea12.setLineWrap(true);
        jTextArea12.setRows(5);
        jTextArea12.setText("Ninguna");
        jTextArea12.setPreferredSize(new java.awt.Dimension(164, 90));
        jTextArea12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea12FocusGained(evt);
            }
        });
        jTextArea12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea12KeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(jTextArea12);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tratamiento"));
        jPanel16.setPreferredSize(new java.awt.Dimension(233, 130));

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setText("Cumple dieta");
        jCheckBox37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox37.setFocusable(false);

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setText("Cumple ejercicio");
        jCheckBox36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox36.setFocusable(false);

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setText("Efectos secundarios");
        jCheckBox34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox34.setFocusable(false);

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setText("Conoce y toma bien su tratamiento");
        jCheckBox33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox33.setFocusable(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCheckBox37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox33))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tratamiento", jPanel15);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setText("Edad:");

        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea10.setLineWrap(true);
        jTextArea10.setRows(5);
        jScrollPane1.setViewportView(jTextArea10);

        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea13.setLineWrap(true);
        jTextArea13.setRows(5);
        jScrollPane14.setViewportView(jTextArea13);

        jTextArea14.setColumns(20);
        jTextArea14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea14.setLineWrap(true);
        jTextArea14.setRows(5);
        jScrollPane15.setViewportView(jTextArea14);

        jTextArea15.setColumns(20);
        jTextArea15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea15.setLineWrap(true);
        jTextArea15.setRows(5);
        jScrollPane16.setViewportView(jTextArea15);

        jLabel54.setText("Motricidad gruesa:");

        jLabel55.setText("Motricidad fino adaptiva:");

        jLabel56.setText("Desarrollo lenguaje:");

        jLabel57.setText("Personal social:");

        jPanel20.setBackground(new java.awt.Color(255, 227, 255));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Table.png"))); // NOI18N
        jLabel65.setText("Cargar tablas de ayuda");
        jLabel65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel65.setFocusable(false);
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel65MouseReleased(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel65MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel65MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel53)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addGap(2, 2, 2)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        jTabbedPane1.addTab("Valoracion CYD", jPanel17);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setText("Controlado");
        jCheckBox35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox35.setFocusable(false);

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setText("Controlado");
        jCheckBox38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox38.setFocusable(false);

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setText("Dislipidemia");
        jCheckBox39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox39.setFocusable(false);
        jCheckBox39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox39MouseReleased(evt);
            }
        });

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setText("DM2");
        jCheckBox40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox40.setFocusable(false);
        jCheckBox40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox40MouseReleased(evt);
            }
        });

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setText("DM1");
        jCheckBox41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox41.setFocusable(false);
        jCheckBox41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox41MouseReleased(evt);
            }
        });

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setText("HTA");
        jCheckBox42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox42.setFocusable(false);
        jCheckBox42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox42MouseReleased(evt);
            }
        });

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setText("Controlado");
        jCheckBox43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox43.setFocusable(false);

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setText("Controlado");
        jCheckBox44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox44.setFocusable(false);

        jLabel61.setText("Glucometría:");

        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField22FocusLost(evt);
            }
        });
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField22KeyTyped(evt);
            }
        });

        jLabel62.setText("mg/dL");

        jLabel63.setText("Tratamiento:");

        jTextArea16.setColumns(20);
        jTextArea16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea16.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea16.setLineWrap(true);
        jTextArea16.setRows(5);
        jTextArea16.setText("Ninguno");
        jTextArea16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea16FocusGained(evt);
            }
        });
        jTextArea16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea16KeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(jTextArea16);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox39))
                .addGap(30, 30, 30)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jCheckBox35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jCheckBox38)
                            .addGap(51, 51, 51)
                            .addComponent(jLabel61)))
                    .addComponent(jCheckBox43)
                    .addComponent(jCheckBox44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTextField22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel62))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jCheckBox42)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox41)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox40)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox39))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox38)
                            .addComponent(jLabel61)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox35)
                                    .addComponent(jLabel63))
                                .addGap(5, 5, 5)
                                .addComponent(jCheckBox43)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox44)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addContainerGap())))))
        );

        jTabbedPane1.addTab("DM", jPanel19);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setText("Controlado");
        jCheckBox35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox35.setFocusable(false);

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setText("Controlado");
        jCheckBox38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox38.setFocusable(false);

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setText("Dislipidemia");
        jCheckBox39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox39.setFocusable(false);
        jCheckBox39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox39MouseReleased(evt);
            }
        });

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setText("DM2");
        jCheckBox40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox40.setFocusable(false);
        jCheckBox40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox40MouseReleased(evt);
            }
        });

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setText("DM1");
        jCheckBox41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox41.setFocusable(false);
        jCheckBox41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox41MouseReleased(evt);
            }
        });

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setText("HTA");
        jCheckBox42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox42.setFocusable(false);
        jCheckBox42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox42MouseReleased(evt);
            }
        });

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setText("Controlado");
        jCheckBox43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox43.setFocusable(false);

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setText("Controlado");
        jCheckBox44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox44.setFocusable(false);

        jLabel61.setText("Glucometría:");

        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
        });
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField22KeyTyped(evt);
            }
        });

        jLabel62.setText("mg/dL");

        jLabel63.setText("Tratamiento:");

        jTextArea16.setColumns(20);
        jTextArea16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea16.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea16.setLineWrap(true);
        jTextArea16.setRows(5);
        jTextArea16.setText("Ninguno");
        jTextArea16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea16FocusGained(evt);
            }
        });
        jTextArea16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea16KeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(jTextArea16);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox39))
                .addGap(30, 30, 30)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jCheckBox35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jCheckBox38)
                            .addGap(51, 51, 51)
                            .addComponent(jLabel61)))
                    .addComponent(jCheckBox43)
                    .addComponent(jCheckBox44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jTextField22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel62))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jCheckBox42)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox41)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox40)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox39))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox38)
                            .addComponent(jLabel61)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox35)
                                    .addComponent(jLabel63))
                                .addGap(5, 5, 5)
                                .addComponent(jCheckBox43)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox44)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addContainerGap())))))
        );

        jTabbedPane1.addTab("DM", jPanel19);

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setFocusable(false);
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(550, 183));

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("No se encuentran datos relevantes");
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
        jScrollPane6.setViewportView(jTextArea5);

        jTabbedPane2.addTab("Gastrointestinal", jScrollPane6);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setText("No se encuentran datos relevantes");
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
        jScrollPane7.setViewportView(jTextArea6);

        jTabbedPane2.addTab("Genitourinario", jScrollPane7);

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setText("No se encuentran datos relevantes");
        jTextArea7.setToolTipText("");
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
        jScrollPane8.setViewportView(jTextArea7);

        jTabbedPane2.addTab("Hematoinfeccioso", jScrollPane8);

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setText("No se encuentran datos relevantes");
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
        jScrollPane9.setViewportView(jTextArea8);

        jTabbedPane2.addTab("Endocrino", jScrollPane9);

        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea9.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea9.setLineWrap(true);
        jTextArea9.setRows(5);
        jTextArea9.setText("No se encuentran datos relevantes");
        jTextArea9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea9FocusGained(evt);
            }
        });
        jTextArea9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea9KeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(jTextArea9);

        jTabbedPane2.addTab("Osteomuscular y Piel", jScrollPane10);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setText("Citologia:");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No aplica", "Normal", "Anormal", " " }));
        jComboBox11.setFocusable(false);

        jLabel45.setText("Fecha:");

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setText("Riesgo productivo");
        jCheckBox32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox32.setFocusable(false);

        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea11.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea11.setLineWrap(true);
        jTextArea11.setRows(5);
        jTextArea11.setText("No se encuentran datos relevantes");
        jTextArea11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea11FocusGained(evt);
            }
        });
        jTextArea11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea11KeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(jTextArea11);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox32)
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Descripción", jPanel14);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel58.setText("Ganancia mes:");

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(57, 148, 69));

        jLabel59.setText("Kg");

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
        jTable1.setFocusable(false);
        jScrollPane17.setViewportView(jTable1);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel60.setText("Controles anteriores:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59))
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nutricional", jPanel18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField1.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField2.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField5.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField9.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField8.requestFocus();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            if (!jTextField9.getText().equals("") && modulo_pyp.Modulo_PyP.d.listPacientes.controlp.peso != 0) {
                float pes = Float.parseFloat(jTextField9.getText()) - modulo_pyp.Modulo_PyP.d.listPacientes.controlp.peso;
                BigDecimal value = new BigDecimal(pes).setScale(2, BigDecimal.ROUND_HALF_UP);
                jTextField21.setText(String.valueOf(value));
                if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0 && !jTextField3.getText().equals("")) {
                    calcularimcembarazo();
                }
            }
        } else {
            if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0) {
                calcularimc();
            }
        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextPane1.requestFocus();
        }
    }//GEN-LAST:event_jTextField8KeyReleased

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

    private void jTextArea9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea9KeyReleased
        jTextArea9.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea9KeyReleased

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.selectAll();
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        jTextField4.selectAll();
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        jTextField5.selectAll();
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        jTextField7.selectAll();
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        jTextField9.selectAll();
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        jTextField8.selectAll();
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPane1FocusGained
        jTextPane1.selectAll();
    }//GEN-LAST:event_jTextPane1FocusGained

    private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased
        jTextPane1.setForeground(Color.black);
    }//GEN-LAST:event_jTextPane1KeyReleased

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

    private void jTextArea9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea9FocusGained
        jTextArea9.selectAll();
    }//GEN-LAST:event_jTextArea9FocusGained

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

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField3.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField6.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField11.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField12.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField6.requestFocus();
        }
        if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0 && !jTextField3.getText().equals("")) {
            calcularimcembarazo();
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField11.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField12.requestFocus();
        }
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jTextField3.selectAll();
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        jTextField6.selectAll();
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        jTextField11.selectAll();
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        jTextField12.selectAll();
    }//GEN-LAST:event_jTextField12FocusGained

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        selectApgar();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        selectApgar();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        selectApgar();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        selectApgar();
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        selectApgar();
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jCheckBox4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseReleased
        if (jCheckBox4.isSelected() == true) {
            jDateChooser2.setEnabled(true);
        } else {
            jDateChooser2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox4MouseReleased

    private void jCheckBox7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseReleased
        if (jCheckBox7.isSelected() == false) {
            jDateChooser3.setEnabled(false);
            jCheckBox8.setEnabled(false);
            jCheckBox9.setEnabled(false);
            jCheckBox10.setEnabled(false);
            jCheckBox8.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox10.setSelected(false);
            jDateChooser3.setDate(null);
        } else {
            jDateChooser3.setEnabled(true);
            jCheckBox8.setEnabled(true);
            jCheckBox9.setEnabled(true);
            jCheckBox10.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox7MouseReleased

    private void jCheckBox11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox11MouseReleased
        if (jCheckBox11.isSelected() == true) {
            jCheckBox15.setEnabled(true);
        } else {
            jCheckBox15.setSelected(false);
            jCheckBox15.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox11MouseReleased

    private void jCheckBox12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox12MouseReleased
        if (jCheckBox12.isSelected() == false) {
            jCheckBox16.setSelected(false);
            jCheckBox16.setEnabled(false);
        } else {
            jCheckBox16.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox12MouseReleased

    private void jCheckBox13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox13MouseReleased
        if (jCheckBox13.isSelected() == false) {
            jCheckBox17.setSelected(false);
            jCheckBox17.setEnabled(false);
        } else {
            jCheckBox17.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox13MouseReleased

    private void jCheckBox14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox14MouseReleased
        if (jCheckBox14.isSelected() == false) {
            jCheckBox18.setSelected(false);
            jCheckBox18.setEnabled(false);
        } else {
            jCheckBox18.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox14MouseReleased

    private void jCheckBox11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCheckBox11ComponentShown
        if (jCheckBox11.isSelected() == true) {
            jCheckBox15.setEnabled(true);
        } else {
            jCheckBox15.setSelected(false);
            jCheckBox15.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox11ComponentShown

    private void jCheckBox12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCheckBox12ComponentShown
        if (jCheckBox12.isSelected() == false) {
            jCheckBox16.setSelected(false);
            jCheckBox16.setEnabled(false);
        } else {
            jCheckBox16.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox12ComponentShown

    private void jCheckBox13ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCheckBox13ComponentShown
        if (jCheckBox13.isSelected() == false) {
            jCheckBox17.setSelected(false);
            jCheckBox17.setEnabled(false);
        } else {
            jCheckBox17.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox13ComponentShown

    private void jCheckBox14ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCheckBox14ComponentShown
        if (jCheckBox14.isSelected() == false) {
            jCheckBox18.setSelected(false);
            jCheckBox18.setEnabled(false);
        } else {
            jCheckBox18.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox14ComponentShown

    private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
        jPanel11.setBackground(new Color(125, 164, 222));
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            HC.CYDesarrollo.jLabel4.setText("Tablas Ayuda");
        }
    }//GEN-LAST:event_jLabel42MouseEntered

    private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
        jPanel11.setBackground(new Color(255, 227, 255));
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            HC.CYDesarrollo.jLabel4.setText("...");
        }
    }//GEN-LAST:event_jLabel42MouseExited

    private void jLabel42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseReleased
        String clipa = getClass().getResource("/Recursos/Tablasayudavaloracion.pdf").getFile();
        try {
            File path = new File(clipa);
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel42MouseReleased

    private void jTabbedPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseReleased
        if (jTabbedPane1.getSelectedComponent() == jPanel12) {
            jTabbedPane2.setSelectedComponent(jPanel14);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            if (jTabbedPane1.getSelectedComponent() == jPanel1) {
                jTabbedPane2.setSelectedComponent(jPanel18);
            }
        }
    }//GEN-LAST:event_jTabbedPane1MouseReleased

    private void jTextArea11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea11KeyReleased
        jTextArea11.setForeground(Color.black);
    }//GEN-LAST:event_jTextArea11KeyReleased

    private void jTextArea11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea11FocusGained
        jTextArea11.selectAll();
    }//GEN-LAST:event_jTextArea11FocusGained

    private void jTextArea12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea12KeyReleased
        jTextArea12.setForeground(Color.black);
    }//GEN-LAST:event_jTextArea12KeyReleased

    private void jTextArea12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea12FocusGained
        jTextArea12.selectAll();
    }//GEN-LAST:event_jTextArea12FocusGained

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField15.requestFocus();
        }
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField16.requestFocus();
        }
        calcularEAD();
    }//GEN-LAST:event_jTextField15KeyReleased

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField15KeyTyped

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        jTextField14.selectAll();
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        jTextField15.selectAll();
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField17.requestFocus();
        }
        calcularEAD();
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        jTextField16.selectAll();
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTextField17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField18.requestFocus();
        }
        calcularEAD();
    }//GEN-LAST:event_jTextField17KeyReleased

    private void jTextField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField17KeyTyped

    private void jTextField17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField17FocusGained
        jTextField17.selectAll();
    }//GEN-LAST:event_jTextField17FocusGained

    private void jTextField18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyReleased
        calcularEAD();
    }//GEN-LAST:event_jTextField18KeyReleased

    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField18KeyTyped

    private void jTextField18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusGained
        jTextField18.selectAll();
    }//GEN-LAST:event_jTextField18FocusGained

    private void jCheckBox39MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox39MouseReleased
        if (jCheckBox39.isSelected() == true) {
            jCheckBox44.setEnabled(true);
        } else {
            jCheckBox44.setSelected(false);
            jCheckBox44.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox39MouseReleased

    private void jCheckBox40MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox40MouseReleased
        if (jCheckBox40.isSelected() == true) {
            jCheckBox43.setEnabled(true);
        } else {
            jCheckBox43.setSelected(false);
            jCheckBox43.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox40MouseReleased

    private void jCheckBox41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox41MouseReleased
        if (jCheckBox41.isSelected() == true) {
            jCheckBox35.setEnabled(true);
        } else {
            jCheckBox35.setSelected(false);
            jCheckBox35.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox41MouseReleased

    private void jCheckBox42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox42MouseReleased
        if (jCheckBox42.isSelected() == true) {
            jCheckBox38.setEnabled(true);
        } else {
            jCheckBox38.setSelected(false);
            jCheckBox38.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox42MouseReleased

    private void jTextArea16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea16FocusGained
        jTextArea16.selectAll();
    }//GEN-LAST:event_jTextArea16FocusGained

    private void jTextField22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusGained
        jTextArea16.selectAll();
    }//GEN-LAST:event_jTextField22FocusGained

    private void jTextArea16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea16KeyReleased
        jTextArea16.setForeground(Color.black);
    }//GEN-LAST:event_jTextArea16KeyReleased

    private void jTextField22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (((javax.swing.JTextField) evt.getSource()).getText().contains(".") || ((javax.swing.JTextField) evt.getSource()).getText().contains(",")) || ((javax.swing.JTextField) evt.getSource()).getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField22KeyTyped

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        if (((javax.swing.JTextField) evt.getSource()).getText().contains(",")) {
            ((javax.swing.JTextField) evt.getSource()).setText(FuncionesC.FormatDecimal(((javax.swing.JTextField) evt.getSource()).getText()));
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (((javax.swing.JTextField) evt.getSource()).getText().contains(",")) {
            ((javax.swing.JTextField) evt.getSource()).setText(FuncionesC.FormatDecimal(((javax.swing.JTextField) evt.getSource()).getText()));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        if (((javax.swing.JTextField) evt.getSource()).getText().contains(",")) {
            ((javax.swing.JTextField) evt.getSource()).setText(FuncionesC.FormatDecimal(((javax.swing.JTextField) evt.getSource()).getText()));
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            if (!jTextField9.getText().equals("") && modulo_pyp.Modulo_PyP.d.listPacientes.controlp.peso != 0) {
                float pes = Float.parseFloat(jTextField9.getText()) - modulo_pyp.Modulo_PyP.d.listPacientes.controlp.peso;
                BigDecimal value = new BigDecimal(pes).setScale(2, BigDecimal.ROUND_HALF_UP);
                jTextField21.setText(String.valueOf(value));
                if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0 && !jTextField3.getText().equals("")) {
                    calcularimcembarazo();
                }
            }
        } else {
            if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0) {
                calcularimc();
            }
        }
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        if (((javax.swing.JTextField) evt.getSource()).getText().contains(",")) {
            ((javax.swing.JTextField) evt.getSource()).setText(FuncionesC.FormatDecimal(((javax.swing.JTextField) evt.getSource()).getText()));
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            if (!jTextField9.getText().equals("") && modulo_pyp.Modulo_PyP.d.listPacientes.controlp.peso != 0) {
                float pes = Float.parseFloat(jTextField9.getText()) - modulo_pyp.Modulo_PyP.d.listPacientes.controlp.peso;
                BigDecimal value = new BigDecimal(pes).setScale(2, BigDecimal.ROUND_HALF_UP);
                jTextField21.setText(String.valueOf(value));
                if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0 && !jTextField3.getText().equals("")) {
                    calcularimcembarazo();
                }
            }
        } else {
            if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0) {
                calcularimc();
            }
        }
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusLost
         if (((javax.swing.JTextField) evt.getSource()).getText().contains(",")) {
            ((javax.swing.JTextField) evt.getSource()).setText(FuncionesC.FormatDecimal(((javax.swing.JTextField) evt.getSource()).getText()));
        }
    }//GEN-LAST:event_jTextField22FocusLost

    private void jLabel65MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseReleased
        String clipa = getClass().getResource("/Recursos/Tablasayudavaloracion.pdf").getFile();
        try {
            File path = new File(clipa);
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel65MouseReleased

    private void jLabel65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseEntered
        jPanel20.setBackground(new Color(125, 164, 222));
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            HC.CYDesarrollo.jLabel4.setText("Tablas Ayuda");
        }
    }//GEN-LAST:event_jLabel65MouseEntered

    private void jLabel65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseExited
        jPanel20.setBackground(new Color(255, 227, 255));
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            HC.CYDesarrollo.jLabel4.setText("...");
        }
    }//GEN-LAST:event_jLabel65MouseExited

    public void actexpf() {
        int tas, tad, fc, talla;
        float fr, temp, peso, imc;
        if (jTextField1.getText().equals("")) {
            tas = 0;
        } else {
            tas = Integer.parseInt(jTextField1.getText().toString());
        }
        if (jTextField2.getText().equals("")) {
            tad = 0;
        } else {
            tad = Integer.parseInt(jTextField2.getText().toString());
        }
        if (jTextField4.getText().equals("")) {
            fr = 0;
        } else {
            fr = Float.parseFloat(jTextField4.getText().toString());
        }
        if (jTextField5.getText().equals("")) {
            fc = 0;
        } else {
            fc = Integer.parseInt(jTextField5.getText().toString());
        }
        if (jTextField7.getText().equals("")) {
            temp = 0;
        } else {
            temp = Float.parseFloat(jTextField7.getText().toString());
        }
        if (jTextField8.getText().equals("")) {
            talla = 0;
        } else {
            talla = (int) Float.parseFloat(String.valueOf(Float.parseFloat(jTextField8.getText()) * 100));
        }
        if (jTextField9.getText().equals("")) {
            peso = 0;
        } else {
            peso = Float.parseFloat(jTextField9.getText().toString());
        }
        if (jTextField10.getText().equals("")) {
            imc = 0;
        } else {
            imc = Float.parseFloat(jTextField10.getText().toString());
        }
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        act.actexploracion(d, tas, tad, fr, fc, temp, talla, peso, imc,
                jTextPane1.getText().toUpperCase().toString(), jTextArea1.getText().toUpperCase().toString(),
                jTextArea2.getText().toUpperCase().toString(), jTextArea3.getText().toUpperCase().toString(),
                jTextArea4.getText().toUpperCase().toString(), jTextArea5.getText().toUpperCase().toString(),
                jTextArea6.getText().toUpperCase().toString(), jTextArea7.getText().toUpperCase().toString(),
                jTextArea8.getText().toUpperCase().toString(), jTextArea9.getText().toUpperCase().toString());
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            Date fpp = jDateChooser1.getDate();
            String fppu, q, w, e, r, t, y, u, i, o, p;
            String patron = "yyyy-MM-dd";
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            if (fpp != null) {
                fppu = formato.format(fpp);
            } else {
                fppu = "1845-01-01";
            }
            if (jCheckBox1.isSelected() == true) {
                q = "1";
            } else {
                q = "0";
            }
            if (jCheckBox2.isSelected() == true) {
                w = "1";
            } else {
                w = "0";
            }
            if (jCheckBox3.isSelected() == true) {
                e = "1";
            } else {
                e = "0";
            }
            if (jCheckBox5.isSelected() == true) {
                r = "1";
            } else {
                r = "0";
            }
            if (jCheckBox6.isSelected() == true) {
                t = "1";
            } else {
                t = "0";
            }
            if (jTextField3.getText().equals("")) {
                u = "0";
            } else {
                u = jTextField3.getText().toString();
            }
            if (jTextField6.getText().equals("")) {
                i = "0";
            } else {
                i = jTextField6.getText().toString();
            }
            if (jTextField11.getText().equals("")) {
                o = "0";
            } else {
                o = jTextField11.getText().toString();
            }
            if (jTextField12.getText().equals("")) {
                p = "0";
            } else {
                p = jTextField12.getText().toString();
            }
            y = String.valueOf(jComboBox1.getSelectedIndex());
            act.actgestafinal(d, fppu, q, w, u, i, o, p, y, e, r, t);
            guardarcontrolm();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
            String v, b, n, m, g, ñ;
            v = String.valueOf(jComboBox2.getSelectedIndex());
            b = String.valueOf(jComboBox3.getSelectedIndex());
            n = String.valueOf(jComboBox4.getSelectedIndex());
            m = String.valueOf(jComboBox5.getSelectedIndex());
            g = String.valueOf(jComboBox6.getSelectedIndex());
            ñ = jLabel35.getText().toString();
            act.apgarparto(d, v, b, n, m, g, ñ);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
            String v, b, n, m, g, ñ;
            v = String.valueOf(jComboBox2.getSelectedIndex());
            b = String.valueOf(jComboBox3.getSelectedIndex());
            n = String.valueOf(jComboBox4.getSelectedIndex());
            m = String.valueOf(jComboBox5.getSelectedIndex());
            g = String.valueOf(jComboBox6.getSelectedIndex());
            ñ = jLabel35.getText().toString();
            act.apgarrecien(d, v, b, n, m, g, ñ);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
            tanner();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
            acthta();
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
                guardarhtacontrol();
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            actvaloracion();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
                actcontrolplani();
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7) {
            actdm();
        }
    }

    public void cargarexploracion() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object h[][] = Funciones.RetornarDatos(act.cargarexploracion(d));
        if (h[0][2].toString().equals("0")) {
            jTextField1.setText("");
        } else {
            jTextField1.setText(h[0][2].toString());
        }
        if (h[0][3].toString().equals("0")) {
            jTextField2.setText("");
        } else {
            jTextField2.setText(h[0][3].toString());
        }
        if (h[0][4].toString().equals("0.0")) {
            jTextField4.setText("");
        } else {
            jTextField4.setText(h[0][4].toString());
        }
        if (h[0][5].toString().equals("0")) {
            jTextField5.setText("");
        } else {
            jTextField5.setText(h[0][5].toString());
        }
        if (h[0][6].toString().equals("0.0")) {
            jTextField7.setText("");
        } else {
            jTextField7.setText(h[0][6].toString());
        }
        if (h[0][7].toString().equals("0")) {
            jTextField8.setText("");
        } else {
            float imcmetro = Float.valueOf(h[0][7].toString()) / 100;
            jTextField8.setText(String.valueOf(imcmetro));
        }
        if (h[0][8].toString().equals("0.0")) {
            jTextField9.setText("");
        } else {
            jTextField9.setText(h[0][8].toString());
        }
        if (h[0][9].toString().equals("0.0")) {
            jTextField10.setText("");
        } else {
            jTextField10.setText(String.valueOf(h[0][9].toString()));
        }
        jTextPane1.setText(h[0][10].toString());
        if (h[0][11].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea1.setText(h[0][11].toString());
        } else {
            jTextArea1.setText(h[0][11].toString());
            jTextArea1.setForeground(Color.BLACK);
        }
        if (h[0][12].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea2.setText(h[0][12].toString());
        } else {
            jTextArea2.setText(h[0][12].toString());
            jTextArea2.setForeground(Color.BLACK);
        }
        if (h[0][13].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea3.setText(h[0][13].toString());
        } else {
            jTextArea3.setText(h[0][13].toString());
            jTextArea3.setForeground(Color.BLACK);
        }
        if (h[0][14].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea4.setText(h[0][14].toString());
        } else {
            jTextArea4.setText(h[0][14].toString());
            jTextArea4.setForeground(Color.BLACK);
        }
        if (h[0][15].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea5.setText(h[0][15].toString());
        } else {
            jTextArea5.setText(h[0][15].toString());
            jTextArea5.setForeground(Color.BLACK);
        }
        if (h[0][16].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea6.setText(h[0][16].toString());
        } else {
            jTextArea6.setText(h[0][16].toString());
            jTextArea6.setForeground(Color.BLACK);
        }
        if (h[0][17].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea7.setText(h[0][17].toString());
        } else {
            jTextArea7.setText(h[0][17].toString());
            jTextArea7.setForeground(Color.BLACK);
        }
        if (h[0][18].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea8.setText(h[0][18].toString());
        } else {
            jTextArea8.setText(h[0][18].toString());
            jTextArea8.setForeground(Color.BLACK);
        }
        if (h[0][19].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea9.setText(h[0][19].toString());
        } else {
            jTextArea9.setText(h[0][19].toString());
            jTextArea9.setForeground(Color.BLACK);
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 9) {
            Object dato[][] = Funciones.RetornarDatos(act.cargargesta(d));
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fecha = formato.parse(dato[0][16].toString());
                if (dato[0][16].toString().equals("01/01/1845")) {
                    jDateChooser1.setDate(null);
                } else {
                    jDateChooser1.setDate(fecha);
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir la fecha fpp " + e.getMessage());
            }
            if (dato[0][17].toString().equals("false")) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            if (dato[0][18].toString().equals("false")) {
                jCheckBox2.setSelected(false);
            } else {
                jCheckBox2.setSelected(true);
            }
            jTextField3.setText(dato[0][19].toString());
            jTextField6.setText(dato[0][20].toString());
            jTextField11.setText(dato[0][21].toString());
            jTextField12.setText(dato[0][22].toString());
            jComboBox1.setSelectedIndex(Integer.parseInt(dato[0][23].toString()));
            if (dato[0][24].toString().equals("false")) {
                jCheckBox3.setSelected(false);
            } else {
                jCheckBox3.setSelected(true);
            }
            if (dato[0][25].toString().equals("false")) {
                jCheckBox5.setSelected(false);
            } else {
                jCheckBox5.setSelected(true);
            }
            if (dato[0][26].toString().equals("false")) {
                jCheckBox6.setSelected(false);
            } else {
                jCheckBox6.setSelected(true);
            }
            Object awq[][] = Funciones.RetornarDatos(act.cargargananciam(d));
            jTextField21.setText(awq[0][3].toString());
        }
        if (!jTextField9.getText().equals("0.0") && !jTextField8.getText().equals("0")) {
            if (!jTextField8.getText().equals("") && Float.parseFloat(jTextField8.getText()) > 0) {
                calcularimc();
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 11) {
            Object part[][] = Funciones.RetornarDatos(act.cargarpostparto(d));
            jComboBox2.setSelectedIndex(Integer.parseInt(part[0][2].toString()));
            jComboBox3.setSelectedIndex(Integer.parseInt(part[0][3].toString()));
            jComboBox4.setSelectedIndex(Integer.parseInt(part[0][4].toString()));
            jComboBox5.setSelectedIndex(Integer.parseInt(part[0][5].toString()));
            jComboBox6.setSelectedIndex(Integer.parseInt(part[0][6].toString()));
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 10) {
            Object recien[][] = Funciones.RetornarDatos(act.cargarrecien(d));
            jComboBox2.setSelectedIndex(Integer.parseInt(recien[0][2].toString()));
            jComboBox3.setSelectedIndex(Integer.parseInt(recien[0][3].toString()));
            jComboBox4.setSelectedIndex(Integer.parseInt(recien[0][4].toString()));
            jComboBox5.setSelectedIndex(Integer.parseInt(recien[0][5].toString()));
            jComboBox6.setSelectedIndex(Integer.parseInt(recien[0][6].toString()));
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 1) {
            cargartanner();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 6) {
            cargarhta();
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
                cargarhtacontrol();
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 2) {
            cargarvaloracion();
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 5) {
            if (pypAdmAsistCon.getPrimeraVez().toString().equals("0")) {
                cargarcontrolplani();
            }
        }
        if (pypAdmAsistCon.getIdAgend().getIdPrograma().getId() == 7) {
            cargardm();
        }
    }

    private void selectApgar() {
        if (jComboBox2.getSelectedIndex() != -1 && jComboBox3.getSelectedIndex() != -1 && jComboBox4.getSelectedIndex() != -1
                && jComboBox5.getSelectedIndex() != -1 && jComboBox6.getSelectedIndex() != -1) {
            int apgar = 0;
            switch (jComboBox2.getSelectedIndex()) {
                case 1:
                    apgar = apgar + 1;
                    break;
                case 2:
                    apgar = apgar + 2;
            }
            switch (jComboBox3.getSelectedIndex()) {
                case 1:
                    apgar = apgar + 1;
                    break;
                case 2:
                    apgar = apgar + 2;
            }
            switch (jComboBox4.getSelectedIndex()) {
                case 1:
                    apgar = apgar + 1;
                    break;
                case 2:
                    apgar = apgar + 2;
            }
            switch (jComboBox5.getSelectedIndex()) {
                case 1:
                    apgar = apgar + 1;
                    break;
                case 2:
                    apgar = apgar + 2;
            }
            switch (jComboBox6.getSelectedIndex()) {
                case 1:
                    apgar = apgar + 1;
                    break;
                case 2:
                    apgar = apgar + 2;
            }
            jLabel35.setText(String.valueOf(apgar));
        } else {
            jLabel35.setText("");
        }

    }

    public void tanner() {
        String va1, va2, va3, va4, va5, va6, va7, fc1, fc2;
        va1 = String.valueOf(jComboBox7.getSelectedIndex());
        va2 = String.valueOf(jComboBox8.getSelectedIndex());
        String patron = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        Date fc1p = jDateChooser2.getDate();
        Date fc2p = jDateChooser3.getDate();
        if (fc1p != null) {
            fc1 = formato.format(fc1p);
        } else {
            fc1 = "1845-01-01";
        }
        if (fc2p != null) {
            fc2 = formato.format(fc2p);
        } else {
            fc2 = "1845-01-01";
        }
        if (jCheckBox4.isSelected() == false) {
            va3 = "0";
        } else {
            va3 = "1";
        }
        if (jCheckBox7.isSelected() == false) {
            va4 = "0";
        } else {
            va4 = "1";
        }
        if (jCheckBox8.isSelected() == false) {
            va5 = "0";
        } else {
            va5 = "1";
        }
        if (jCheckBox9.isSelected() == false) {
            va6 = "0";
        } else {
            va6 = "1";
        }
        if (jCheckBox10.isSelected() == false) {
            va7 = "0";
        } else {
            va7 = "1";
        }
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        act.actjoven(d, va1, va2, va3, fc1, va4, fc2, va5, va7, va6);
    }

    public void cargartanner() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object pypdata[][] = Funciones.RetornarDatos(act.cargarjoven(d));
        jComboBox7.setSelectedIndex(Integer.parseInt(pypdata[0][2].toString()));
        jComboBox8.setSelectedIndex(Integer.parseInt(pypdata[0][3].toString()));
        if (pypdata[0][4].toString().equals("0")) {
            jCheckBox4.setSelected(false);
        } else {
            jCheckBox4.setSelected(true);
            jDateChooser2.setEnabled(true);
        }
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formato.parse(pypdata[0][5].toString());
            if (pypdata[0][5].toString().equals("01/01/1845")) {
                jDateChooser2.setDate(null);
            } else {
                jDateChooser2.setDate(fecha);
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha valoracion visual " + e.getMessage());
        }
        if (pypdata[0][6].toString().equals("false")) {
            jCheckBox7.setSelected(false);
        } else {
            jCheckBox7.setSelected(true);
            jDateChooser3.setEnabled(true);
            jCheckBox8.setEnabled(true);
            jCheckBox9.setEnabled(true);
            jCheckBox10.setEnabled(true);
        }
        try {
            Date fecha2 = formato.parse(pypdata[0][7].toString());
            if (pypdata[0][7].toString().equals("01/01/0001")) {
                jDateChooser3.setDate(null);
            } else {
                jDateChooser3.setDate(fecha2);
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha valoracion odontologica " + e.getMessage());
        }
        if (pypdata[0][8].toString().equals("false")) {
            jCheckBox8.setSelected(false);
        } else {
            jCheckBox8.setSelected(true);
        }
        if (pypdata[0][10].toString().equals("false")) {
            jCheckBox9.setSelected(false);
        } else {
            jCheckBox9.setSelected(true);
        }
        if (pypdata[0][9].toString().equals("false")) {
            jCheckBox10.setSelected(false);
        } else {
            jCheckBox10.setSelected(true);
        }
    }

    public void acthta() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        String var1, var2, var3, var4, var5, var6, var7, var8, var9, var10;
        if (jCheckBox11.isSelected() == false) {
            var1 = "0";
        } else {
            var1 = "1";
        }
        if (jCheckBox15.isSelected() == false) {
            var2 = "0";
        } else {
            var2 = "1";
        }
        if (jCheckBox12.isSelected() == false) {
            var3 = "0";
        } else {
            var3 = "1";
        }
        if (jCheckBox16.isSelected() == false) {
            var4 = "0";
        } else {
            var4 = "1";
        }
        if (jCheckBox13.isSelected() == false) {
            var5 = "0";
        } else {
            var5 = "1";
        }
        if (jCheckBox17.isSelected() == false) {
            var6 = "0";
        } else {
            var6 = "1";
        }
        if (jCheckBox14.isSelected() == false) {
            var7 = "0";
        } else {
            var7 = "1";
        }
        if (jCheckBox18.isSelected() == false) {
            var8 = "0";
        } else {
            var8 = "1";
        }
        var9 = String.valueOf(jComboBox9.getSelectedIndex());
        var10 = String.valueOf(jComboBox10.getSelectedIndex());
        act.acthta(d, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    public void cargarhta() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object pypdata[][] = Funciones.RetornarDatos(act.cargarhta(d));
        if (pypdata[0][2].toString().equals("0")) {
            jCheckBox11.setSelected(false);
            jCheckBox15.setEnabled(false);
        } else {
            jCheckBox11.setSelected(true);
            jCheckBox15.setEnabled(true);
        }
        if (pypdata[0][3].toString().equals("0")) {
            jCheckBox15.setSelected(false);
        } else {
            jCheckBox15.setSelected(true);
        }
        if (pypdata[0][4].toString().equals("0")) {
            jCheckBox12.setSelected(false);
            jCheckBox16.setEnabled(false);
        } else {
            jCheckBox12.setSelected(true);
            jCheckBox15.setEnabled(true);
        }
        if (pypdata[0][5].toString().equals("0")) {
            jCheckBox16.setSelected(false);
        } else {
            jCheckBox16.setSelected(true);
        }
        if (pypdata[0][6].toString().equals("0")) {
            jCheckBox13.setSelected(false);
            jCheckBox17.setEnabled(false);
        } else {
            jCheckBox13.setSelected(true);
            jCheckBox17.setEnabled(false);
        }
        if (pypdata[0][7].toString().equals("0")) {
            jCheckBox17.setSelected(false);
        } else {
            jCheckBox17.setSelected(true);
        }
        if (pypdata[0][8].toString().equals("0")) {
            jCheckBox14.setSelected(false);
            jCheckBox18.setEnabled(false);
        } else {
            jCheckBox14.setSelected(true);
            jCheckBox18.setEnabled(true);
        }
        if (pypdata[0][9].toString().equals("0")) {
            jCheckBox18.setSelected(false);
        } else {
            jCheckBox18.setSelected(true);
        }
        jComboBox9.setSelectedIndex(Integer.parseInt(pypdata[0][10].toString()));
        jComboBox10.setSelectedIndex(Integer.parseInt(pypdata[0][11].toString()));
    }

    public void actvaloracion() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        String va1, va2, va3, va4, va5, va6;
        if (modulo_pyp.Modulo_PyP.d.listPacientes.año <= 5) {
            va1 = jTextField14.getText();
            va2 = jTextField15.getText();
            va3 = jTextField16.getText();
            va4 = jTextField17.getText();
            va5 = jTextField18.getText();
            va6 = jTextField19.getText();
            act.actvaloracion(d, va1, va2, va3, va4, va5, va6);
        } else {
            va1 = jTextField20.getText();
            va2 = jTextArea10.getText();
            va3 = jTextArea13.getText();
            va4 = jTextArea15.getText();
            va5 = jTextArea14.getText();
            act.actvaloracionaños(d, va1, va2, va3, va4, va5);
        }
        String var1, var2, var3, var4, var5, var6;
        var1 = String.valueOf(jComboBox2.getSelectedIndex());
        var2 = String.valueOf(jComboBox3.getSelectedIndex());
        var3 = String.valueOf(jComboBox4.getSelectedIndex());
        var4 = String.valueOf(jComboBox5.getSelectedIndex());
        var5 = String.valueOf(jComboBox6.getSelectedIndex());
        var6 = jLabel35.getText().toString();
        act.actcrecimientoapgar(d, var1, var2, var3, var4, var5, var6);
    }

    public void cargarvaloracion() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object pypdata[][] = Funciones.RetornarDatos(act.cargarcrecimiento(d));
        if (modulo_pyp.Modulo_PyP.d.listPacientes.año <= 5) {
            Object pypdatameses[][] = Funciones.RetornarDatos(act.cargarmeses(d));
            jTextField14.setText(pypdatameses[0][2].toString());
            jTextField15.setText(pypdatameses[0][3].toString());
            jTextField16.setText(pypdatameses[0][4].toString());
            jTextField17.setText(pypdatameses[0][5].toString());
            jTextField18.setText(pypdatameses[0][6].toString());
            jTextField19.setText(pypdatameses[0][7].toString());
        } else {
            Object pypdatameses[][] = Funciones.RetornarDatos(act.cargaraños(d));
            jTextField20.setText(pypdatameses[0][2].toString());
            jTextArea10.setText(pypdatameses[0][3].toString());
            jTextArea13.setText(pypdatameses[0][4].toString());
            jTextArea15.setText(pypdatameses[0][5].toString());
            jTextArea14.setText(pypdatameses[0][6].toString());
        }
        jComboBox2.setSelectedIndex(Integer.parseInt(pypdata[0][2].toString()));
        jComboBox3.setSelectedIndex(Integer.parseInt(pypdata[0][3].toString()));
        jComboBox4.setSelectedIndex(Integer.parseInt(pypdata[0][4].toString()));
        jComboBox5.setSelectedIndex(Integer.parseInt(pypdata[0][5].toString()));
        jComboBox6.setSelectedIndex(Integer.parseInt(pypdata[0][6].toString()));
    }

    private void calcularimc() {
        jLabel64.setVisible(false);
        jLabel21.setVisible(true);
        if (!jTextField9.getText().equals("") && !jTextField8.getText().equals("")) {
            float imc = 0;
            String im = null, imcnetro = jTextField8.getText();
            imc = ((Float.parseFloat(jTextField9.getText()) / ((Float.parseFloat(imcnetro)
                    * Float.parseFloat(imcnetro)) / 100) * 100) / 100) / 100;
            BigDecimal value = new BigDecimal(imc).setScale(2, BigDecimal.ROUND_HALF_UP);
            im = String.valueOf(value);
            if (imc < 16) {
                jTextField10.setForeground(Color.red);
                jLabel21.setText("Delgadez severa");
                jLabel21.setForeground(Color.red);
            } else {
                if (imc >= 16 && imc < 17) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Delgadez moderada");
                    jLabel21.setForeground(Color.red);
                } else {
                    if (imc >= 17 && imc <= 18.49) {
                        jTextField10.setForeground(Color.red);
                        jLabel21.setText("Delgadez aceptable");
                        jLabel21.setForeground(Color.red);
                    }
                    if (imc >= 18.50 && imc < 19) {
                        jTextField10.setForeground(Color.red);
                        jLabel21.setText("Infrapeso");
                        jLabel21.setForeground(Color.red);
                    } else {
                        if (imc >= 19 && imc < 25) {
                            jTextField10.setForeground(new Color(0, 153, 204));
                            jLabel21.setText("Normal");
                            jLabel21.setForeground(new Color(0, 153, 204));
                        } else {
                            if (imc >= 25 && imc < 30) {
                                jTextField10.setForeground(new Color(255, 102, 51));
                                jLabel21.setText("Sobrepeso");
                                jLabel21.setForeground(new Color(255, 102, 51));
                            } else {
                                if (imc == 30) {
                                    jTextField10.setForeground(Color.red);
                                    jLabel21.setText("Obesidad");
                                    jLabel21.setForeground(Color.RED);
                                } else {
                                    if (imc > 30 && imc < 35) {
                                        jTextField10.setForeground(Color.red);
                                        jLabel21.setText("Obeso tipo I");
                                        jLabel21.setForeground(Color.red);
                                    } else {
                                        if (imc >= 35 && imc < 40) {
                                            jTextField10.setForeground(Color.red);
                                            jLabel21.setText("Obeso tipo II");
                                            jLabel21.setForeground(Color.red);
                                        } else {
                                            if (imc > 40) {
                                                jTextField10.setForeground(Color.red);
                                                jLabel21.setText("Obeso tipo III");
                                                jLabel21.setForeground(Color.red);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            jTextField10.setText(im);
        }
    }

    private void calcularimcembarazo() {
        jLabel64.setVisible(false);
        jLabel21.setVisible(true);
        if (!jTextField9.getText().equals("") && !jTextField8.getText().equals("")) {
            float imc = 0;
            String im = null, imcnetro = jTextField8.getText();
            imc = ((Float.parseFloat(jTextField9.getText()) / ((Float.parseFloat(imcnetro)
                    * Float.parseFloat(imcnetro)) / 100) * 100) / 100) / 100;
            BigDecimal value = new BigDecimal(imc).setScale(2, BigDecimal.ROUND_HALF_UP);
            im = String.valueOf(value);
            if (!jTextField3.getText().equals("")) {
                if (imc < 20 && Integer.parseInt(jTextField3.getText()) < 10) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 20 && imc < 26) && Integer.parseInt(jTextField3.getText()) < 10) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 26 && imc < 31) && Integer.parseInt(jTextField3.getText()) < 10) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 31 && Integer.parseInt(jTextField3.getText()) < 10) {
                                jTextField10.setForeground(Color.red);//
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
                if (imc < 20.5 && (Integer.parseInt(jTextField3.getText()) >= 10 && Integer.parseInt(jTextField3.getText()) < 15)) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 20.5 && imc < 26.5) && (Integer.parseInt(jTextField3.getText()) >= 10 && Integer.parseInt(jTextField3.getText()) < 15)) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 26.5 && imc < 31.5) && (Integer.parseInt(jTextField3.getText()) >= 10 && Integer.parseInt(jTextField3.getText()) < 15)) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 31.5 && (Integer.parseInt(jTextField3.getText()) >= 10 && Integer.parseInt(jTextField3.getText()) < 15)) {
                                jTextField10.setForeground(Color.red);
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
                if (imc < 21 && (Integer.parseInt(jTextField3.getText()) >= 15 && Integer.parseInt(jTextField3.getText()) < 20)) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 21 && imc < 27) && (Integer.parseInt(jTextField3.getText()) >= 15 && Integer.parseInt(jTextField3.getText()) < 20)) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 27 && imc < 32) && (Integer.parseInt(jTextField3.getText()) >= 15 && Integer.parseInt(jTextField3.getText()) < 20)) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 32 && (Integer.parseInt(jTextField3.getText()) >= 15 && Integer.parseInt(jTextField3.getText()) < 20)) {
                                jTextField10.setForeground(Color.red);
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
                if (imc < 21.5 && (Integer.parseInt(jTextField3.getText()) >= 20 && Integer.parseInt(jTextField3.getText()) < 25)) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 21.5 && imc < 27.5) && (Integer.parseInt(jTextField3.getText()) >= 20 && Integer.parseInt(jTextField3.getText()) < 25)) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 27.5 && imc < 32.5) && (Integer.parseInt(jTextField3.getText()) >= 20 && Integer.parseInt(jTextField3.getText()) < 25)) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 32.5 && (Integer.parseInt(jTextField3.getText()) >= 20 && Integer.parseInt(jTextField3.getText()) < 25)) {
                                jTextField10.setForeground(Color.red);
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
                if (imc < 22.5 && (Integer.parseInt(jTextField3.getText()) >= 25 && Integer.parseInt(jTextField3.getText()) < 30)) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 22.5 && imc < 28.5) && (Integer.parseInt(jTextField3.getText()) >= 25 && Integer.parseInt(jTextField3.getText()) < 30)) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 28.5 && imc < 33.5) && (Integer.parseInt(jTextField3.getText()) >= 25 && Integer.parseInt(jTextField3.getText()) < 30)) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 33.5 && (Integer.parseInt(jTextField3.getText()) >= 25 && Integer.parseInt(jTextField3.getText()) < 30)) {
                                jTextField10.setForeground(Color.red);
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
                if (imc < 23.5 && (Integer.parseInt(jTextField3.getText()) >= 30 && Integer.parseInt(jTextField3.getText()) < 35)) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 23.5 && imc < 29.5) && (Integer.parseInt(jTextField3.getText()) >= 30 && Integer.parseInt(jTextField3.getText()) < 35)) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 29.5 && imc < 34.5) && (Integer.parseInt(jTextField3.getText()) >= 30 && Integer.parseInt(jTextField3.getText()) < 35)) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 34.5 && (Integer.parseInt(jTextField3.getText()) >= 30 && Integer.parseInt(jTextField3.getText()) < 35)) {
                                jTextField10.setForeground(Color.red);
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
                if (imc < 24.5 && (Integer.parseInt(jTextField3.getText()) >= 35 && Integer.parseInt(jTextField3.getText()) < 40)) {
                    jTextField10.setForeground(Color.red);
                    jLabel21.setText("Enflaquecida");
                    jLabel21.setForeground(Color.red);
                } else {
                    if ((imc >= 24.5 && imc < 30.5) && (Integer.parseInt(jTextField3.getText()) >= 35 && Integer.parseInt(jTextField3.getText()) < 40)) {
                        jTextField10.setForeground(new Color(0, 153, 204));
                        jLabel21.setText("Normal");
                        jLabel21.setForeground(new Color(0, 153, 204));
                    } else {
                        if ((imc >= 30.5 && imc < 35.5) && (Integer.parseInt(jTextField3.getText()) >= 35 && Integer.parseInt(jTextField3.getText()) < 40)) {
                            jTextField10.setForeground(new Color(255, 102, 51));
                            jLabel21.setText("Sobrepeso");
                            jLabel21.setForeground(new Color(255, 102, 51));
                        } else {
                            if (imc >= 35.5 && (Integer.parseInt(jTextField3.getText()) >= 35 && Integer.parseInt(jTextField3.getText()) < 40)) {
                                jTextField10.setForeground(Color.red);
                                jLabel21.setText("Obesidad");
                                jLabel21.setForeground(Color.RED);
                            }
                        }
                    }
                }
            }
            jTextField10.setText(im);
        }
    }

    private void actcontrolplani() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object dat[][] = Funciones.RetornarDatos(sav.selectidplanifica(d));
        String va1, va2, va3, va4, va5, va6, va7, va8, va9, va10, va11, va12, va13, va14, va15, va16, va17, va18;
        va1 = jTextField13.getText().toUpperCase();
        if (jCheckBox21.isSelected() == false) {
            va2 = "0";
        } else {
            va2 = "1";
        }
        if (jCheckBox20.isSelected() == false) {
            va3 = "0";
        } else {
            va3 = "1";
        }
        if (jCheckBox19.isSelected() == false) {
            va4 = "0";
        } else {
            va4 = "1";
        }
        if (jCheckBox25.isSelected() == false) {
            va5 = "0";
        } else {
            va5 = "1";
        }
        if (jCheckBox24.isSelected() == false) {
            va6 = "0";
        } else {
            va6 = "1";
        }
        if (jCheckBox29.isSelected() == false) {
            va7 = "0";
        } else {
            va7 = "1";
        }
        if (jCheckBox28.isSelected() == false) {
            va8 = "0";
        } else {
            va8 = "1";
        }
        if (jCheckBox26.isSelected() == false) {
            va9 = "0";
        } else {
            va9 = "1";
        }
        if (jCheckBox27.isSelected() == false) {
            va10 = "0";
        } else {
            va10 = "1";
        }
        if (jCheckBox23.isSelected() == false) {
            va11 = "0";
        } else {
            va11 = "1";
        }
        if (jCheckBox22.isSelected() == false) {
            va12 = "0";
        } else {
            va12 = "1";
        }
        if (jCheckBox30.isSelected() == false) {
            va13 = "0";
        } else {
            va13 = "1";
        }
        if (jCheckBox31.isSelected() == false) {
            va14 = "0";
        } else {
            va14 = "1";
        }
        va15 = String.valueOf(jComboBox11.getSelectedIndex());
        String patron = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        Date fc1p = jDateChooser4.getDate();
        if (fc1p != null) {
            va16 = formato.format(fc1p);
        } else {
            va16 = "1845-01-01";
        }
        if (jCheckBox32.isSelected() == false) {
            va17 = "0";
        } else {
            va17 = "1";
        }
        va18 = jTextArea11.getText().toUpperCase();
        act.actcontrolplanif(dat[0][0].toString(), va1, va2, va3, va4, va5, va6, va7, va8, va9, va10, va11, va12, va13, va14, va15, va16, va17, va18);
    }

    private void cargarcontrolplani() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object datapyp[][] = Funciones.RetornarDatos(act.cargarcontrolplani(d));
        if (datapyp[0][2].toString().equals("")) {
            jTextField13.setText("");
        } else {
            jTextField13.setText(datapyp[0][2].toString());
        }
        if (datapyp[0][3].toString().equals("0")) {
            jCheckBox21.setSelected(false);
        } else {
            jCheckBox21.setSelected(true);
        }
        if (datapyp[0][4].toString().equals("0")) {
            jCheckBox20.setSelected(false);
        } else {
            jCheckBox20.setSelected(true);
        }
        if (datapyp[0][5].toString().equals("0")) {
            jCheckBox19.setSelected(false);
        } else {
            jCheckBox19.setSelected(true);
        }
        if (datapyp[0][6].toString().equals("0")) {
            jCheckBox25.setSelected(false);
        } else {
            jCheckBox25.setSelected(true);
        }
        if (datapyp[0][7].toString().equals("0")) {
            jCheckBox24.setSelected(false);
        } else {
            jCheckBox24.setSelected(true);
        }
        if (datapyp[0][8].toString().equals("0")) {
            jCheckBox29.setSelected(false);
        } else {
            jCheckBox29.setSelected(true);
        }
        if (datapyp[0][9].toString().equals("0")) {
            jCheckBox28.setSelected(false);
        } else {
            jCheckBox28.setSelected(true);
        }
        if (datapyp[0][10].toString().equals("0")) {
            jCheckBox26.setSelected(false);
        } else {
            jCheckBox26.setSelected(true);
        }
        if (datapyp[0][11].toString().equals("0")) {
            jCheckBox27.setSelected(false);
        } else {
            jCheckBox27.setSelected(true);
        }
        if (datapyp[0][12].toString().equals("0")) {
            jCheckBox23.setSelected(false);
        } else {
            jCheckBox23.setSelected(true);
        }
        if (datapyp[0][13].toString().equals("0")) {
            jCheckBox22.setSelected(false);
        } else {
            jCheckBox22.setSelected(true);
        }
        if (datapyp[0][14].toString().equals("0")) {
            jCheckBox30.setSelected(false);
        } else {
            jCheckBox20.setSelected(true);
        }
        if (datapyp[0][15].toString().equals("0")) {
            jCheckBox31.setSelected(false);
        } else {
            jCheckBox31.setSelected(true);
        }
        jComboBox11.setSelectedIndex(Integer.parseInt(datapyp[0][16].toString()));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formato.parse(datapyp[0][17].toString());
            if (datapyp[0][17].toString().equals("01/01/1845")) {
                jDateChooser4.setDate(null);
            } else {
                jDateChooser4.setDate(fecha);
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir la fecha de citologia " + e.getMessage());
        }
        if (datapyp[0][18].toString().equals("0")) {
            jCheckBox32.setSelected(false);
        } else {
            jCheckBox32.setSelected(true);
        }
        if (!datapyp[0][19].toString().equals("NO SE ENCUENTRAN DATOS RELEVANTES")) {
            jTextArea11.setText(datapyp[0][19].toString());
            jTextArea11.setForeground(Color.black);
        } else {
            jTextArea11.setText(datapyp[0][19].toString());
        }
    }

    private void guardarhtacontrol() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object data[][] = Funciones.RetornarDatos(sav.selectidhta(d));
        String vr1, vr2, vr3, vr4;
        if (jCheckBox37.isSelected() == false) {
            vr1 = "0";
        } else {
            vr1 = "1";
        }
        if (jCheckBox36.isSelected() == false) {
            vr2 = "0";
        } else {
            vr2 = "1";
        }
        if (jCheckBox34.isSelected() == false) {
            vr3 = "0";
        } else {
            vr3 = "1";
        }
        if (jCheckBox33.isSelected() == false) {
            vr4 = "0";
        } else {
            vr4 = "1";
        }
        act.acthtacontrol(data[0][0].toString(), vr1, vr2, vr3, vr4, jTextArea12.getText().toUpperCase().toString());
    }

    private void cargarhtacontrol() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object pypdata[][] = Funciones.RetornarDatos(act.cargarhtacontrol(d));
        if (pypdata[0][2].toString().equals("0")) {
            jCheckBox37.setSelected(false);
        } else {
            jCheckBox37.setSelected(true);
        }
        if (pypdata[0][3].toString().equals("0")) {
            jCheckBox36.setSelected(false);
        } else {
            jCheckBox36.setSelected(true);
        }
        if (pypdata[0][4].toString().equals("0")) {
            jCheckBox34.setSelected(false);
        } else {
            jCheckBox34.setSelected(true);
        }
        if (pypdata[0][5].toString().equals("0")) {
            jCheckBox33.setSelected(false);
        } else {
            jCheckBox33.setSelected(true);
        }
        if (pypdata[0][6].toString().equals("NINGUNA")) {
            jTextArea12.setText(pypdata[0][6].toString());
        } else {
            jTextArea12.setText(pypdata[0][6].toString());
            jTextArea12.setForeground(Color.black);
        }
    }

    private void calcularEAD() {
        if (!jTextField15.getText().equals("") && !jTextField16.getText().equals("")
                && !jTextField17.getText().equals("") && !jTextField18.getText().equals("")) {
            int EAD = 0, mg, mfa, la, ps;
            mg = Integer.parseInt(jTextField15.getText());
            mfa = Integer.parseInt(jTextField16.getText());
            la = Integer.parseInt(jTextField17.getText());
            ps = Integer.parseInt(jTextField18.getText());
            EAD = mg + mfa + la + ps;
            jTextField19.setText(String.valueOf(EAD));
        } else {
            jTextField19.setText("");
        }
    }

    public
            void getModelo() {
        modelo = new DefaultTableModel(
                null, new String[]{"Fecha", "Peso", "IMC", "Ganancia", "Numero de control"}) {
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

        jTable1.setModel(modelo);
    }

    private void tabla() {
        try {
            getModelo();
            jTable1.getTableHeader().setReorderingAllowed(false);
            jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tab.cargarcontrolp(modelo, pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString());
            Funciones_AD.setSizeColumnas(jTable1, new int[]{0, 1, 2, 3, 4}, new int[]{100, 100, 100, 100, 130});
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage().toString(), ProcedimientosI.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void guardarcontrolm() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString()), gan;
        Date fecha = pypAdmAsistCon.getFecha();
        String patron = "yyyy-MM-dd ";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        String fc = formato.format(fecha);
        Object dat[][] = Funciones.RetornarDatos(act.cargarcantidadcontrol(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        int control = Integer.parseInt(dat[0][0].toString());
        String cont = String.valueOf(control + 1);
        if (jTextField21.getText().equals("")) {
            gan = "0";
        } else {
            gan = jTextField21.getText();
        }
        act.controlmaterno(d, fc, gan, cont);
    }

    private void actdm() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        String var1, var2, var3, var4, var5, var6, var7, var8, var9, var10;
        if (jCheckBox42.isSelected() == false) {
            var1 = "0";
        } else {
            var1 = "1";
        }
        if (jCheckBox38.isSelected() == false) {
            var2 = "0";
        } else {
            var2 = "1";
        }
        if (jCheckBox41.isSelected() == false) {
            var3 = "0";
        } else {
            var3 = "1";
        }
        if (jCheckBox35.isSelected() == false) {
            var4 = "0";
        } else {
            var4 = "1";
        }
        if (jCheckBox40.isSelected() == false) {
            var5 = "0";
        } else {
            var5 = "1";
        }
        if (jCheckBox43.isSelected() == false) {
            var6 = "0";
        } else {
            var6 = "1";
        }
        if (jCheckBox39.isSelected() == false) {
            var7 = "0";
        } else {
            var7 = "1";
        }
        if (jCheckBox44.isSelected() == false) {
            var8 = "0";
        } else {
            var8 = "1";
        }
        String vr1, vr2, vr3, vr4;
        if (jCheckBox37.isSelected() == false) {
            vr1 = "0";
        } else {
            vr1 = "1";
        }
        if (jCheckBox36.isSelected() == false) {
            vr2 = "0";
        } else {
            vr2 = "1";
        }
        if (jCheckBox34.isSelected() == false) {
            vr3 = "0";
        } else {
            vr3 = "1";
        }
        if (jCheckBox33.isSelected() == false) {
            vr4 = "0";
        } else {
            vr4 = "1";
        }
        if (jTextField22.getText() == null) {
            var9 = "0";
        } else {
            var9 = jTextField22.getText();
        }
        var10 = jTextArea16.getText().toUpperCase();
        act.actdm(d, var1, var2, var3, var4, var5, var6, var7, var8, vr1, vr2, vr3, vr4, jTextArea12.getText().toUpperCase(), var9, var10);
    }

    private void cargardm() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object pypdata[][] = Funciones.RetornarDatos(act.cargardm(d));
        if (pypdata[0][2].toString().equals("0")) {
            jCheckBox42.setSelected(false);
            jCheckBox38.setEnabled(false);
        } else {
            jCheckBox42.setSelected(true);
            jCheckBox38.setEnabled(true);
        }
        if (pypdata[0][3].toString().equals("0")) {
            jCheckBox38.setSelected(false);
        } else {
            jCheckBox38.setSelected(true);
        }
        if (pypdata[0][4].toString().equals("0")) {
            jCheckBox41.setSelected(false);
            jCheckBox35.setEnabled(false);
        } else {
            jCheckBox41.setSelected(true);
            jCheckBox35.setEnabled(true);
        }
        if (pypdata[0][5].toString().equals("0")) {
            jCheckBox35.setSelected(false);
        } else {
            jCheckBox35.setSelected(true);
        }
        if (pypdata[0][6].toString().equals("0")) {
            jCheckBox40.setSelected(false);
            jCheckBox43.setEnabled(false);
        } else {
            jCheckBox40.setSelected(true);
            jCheckBox43.setEnabled(true);
        }
        if (pypdata[0][7].toString().equals("0")) {
            jCheckBox43.setSelected(false);
        } else {
            jCheckBox43.setSelected(true);
        }
        if (pypdata[0][8].toString().equals("0")) {
            jCheckBox39.setSelected(false);
            jCheckBox44.setEnabled(false);
        } else {
            jCheckBox39.setSelected(true);
            jCheckBox44.setEnabled(true);
        }
        if (pypdata[0][9].toString().equals("0")) {
            jCheckBox44.setSelected(false);
        } else {
            jCheckBox44.setSelected(true);
        }
        if (pypdata[0][10].toString().equals("0")) {
            jCheckBox37.setSelected(false);
        } else {
            jCheckBox37.setSelected(true);
        }
        if (pypdata[0][11].toString().equals("0")) {
            jCheckBox36.setSelected(false);
        } else {
            jCheckBox36.setSelected(true);
        }
        if (pypdata[0][12].toString().equals("0")) {
            jCheckBox34.setSelected(false);
        } else {
            jCheckBox34.setSelected(true);
        }
        if (pypdata[0][15].toString().equals("0")) {
            jCheckBox33.setSelected(false);
        } else {
            jCheckBox33.setSelected(true);
        }
        if (pypdata[0][16].toString().equals("NINGUNA")) {
            jTextArea12.setText(pypdata[0][16].toString());
        } else {
            jTextArea12.setText(pypdata[0][16].toString());
            jTextArea12.setForeground(Color.black);
        }
        jTextField22.setText(pypdata[0][13].toString());
        if (!pypdata[0][14].toString().equals("NINGUNO")) {
            jTextArea16.setForeground(Color.black);
            jTextArea16.setText(pypdata[0][14].toString());
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
    javax.swing.JCheckBox jCheckBox26;
    javax.swing.JCheckBox jCheckBox27;
    javax.swing.JCheckBox jCheckBox28;
    javax.swing.JCheckBox jCheckBox29;
    javax.swing.JCheckBox jCheckBox3;
    javax.swing.JCheckBox jCheckBox30;
    javax.swing.JCheckBox jCheckBox31;
    javax.swing.JCheckBox jCheckBox32;
    javax.swing.JCheckBox jCheckBox33;
    javax.swing.JCheckBox jCheckBox34;
    javax.swing.JCheckBox jCheckBox35;
    javax.swing.JCheckBox jCheckBox36;
    javax.swing.JCheckBox jCheckBox37;
    javax.swing.JCheckBox jCheckBox38;
    javax.swing.JCheckBox jCheckBox39;
    javax.swing.JCheckBox jCheckBox4;
    javax.swing.JCheckBox jCheckBox40;
    javax.swing.JCheckBox jCheckBox41;
    javax.swing.JCheckBox jCheckBox42;
    javax.swing.JCheckBox jCheckBox43;
    javax.swing.JCheckBox jCheckBox44;
    javax.swing.JCheckBox jCheckBox5;
    javax.swing.JCheckBox jCheckBox6;
    javax.swing.JCheckBox jCheckBox7;
    javax.swing.JCheckBox jCheckBox8;
    javax.swing.JCheckBox jCheckBox9;
    javax.swing.JComboBox jComboBox1;
    javax.swing.JComboBox jComboBox10;
    javax.swing.JComboBox jComboBox11;
    javax.swing.JComboBox jComboBox2;
    javax.swing.JComboBox jComboBox3;
    javax.swing.JComboBox jComboBox4;
    javax.swing.JComboBox jComboBox5;
    javax.swing.JComboBox jComboBox6;
    javax.swing.JComboBox jComboBox7;
    javax.swing.JComboBox jComboBox8;
    javax.swing.JComboBox jComboBox9;
    com.toedter.calendar.JDateChooser jDateChooser1;
    com.toedter.calendar.JDateChooser jDateChooser2;
    com.toedter.calendar.JDateChooser jDateChooser3;
    com.toedter.calendar.JDateChooser jDateChooser4;
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
    javax.swing.JLabel jLabel48;
    javax.swing.JLabel jLabel49;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel50;
    javax.swing.JLabel jLabel51;
    javax.swing.JLabel jLabel52;
    javax.swing.JLabel jLabel53;
    javax.swing.JLabel jLabel54;
    javax.swing.JLabel jLabel55;
    javax.swing.JLabel jLabel56;
    javax.swing.JLabel jLabel57;
    javax.swing.JLabel jLabel58;
    javax.swing.JLabel jLabel59;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel60;
    javax.swing.JLabel jLabel61;
    javax.swing.JLabel jLabel62;
    javax.swing.JLabel jLabel63;
    javax.swing.JLabel jLabel64;
    javax.swing.JLabel jLabel65;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
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
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JPanel jPanel6;
    javax.swing.JPanel jPanel7;
    javax.swing.JPanel jPanel8;
    javax.swing.JPanel jPanel9;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane10;
    javax.swing.JScrollPane jScrollPane11;
    javax.swing.JScrollPane jScrollPane12;
    javax.swing.JScrollPane jScrollPane13;
    javax.swing.JScrollPane jScrollPane14;
    javax.swing.JScrollPane jScrollPane15;
    javax.swing.JScrollPane jScrollPane16;
    javax.swing.JScrollPane jScrollPane17;
    javax.swing.JScrollPane jScrollPane18;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JScrollPane jScrollPane5;
    javax.swing.JScrollPane jScrollPane6;
    javax.swing.JScrollPane jScrollPane7;
    javax.swing.JScrollPane jScrollPane8;
    javax.swing.JScrollPane jScrollPane9;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JTabbedPane jTabbedPane2;
    javax.swing.JTable jTable1;
    javax.swing.JTextArea jTextArea1;
    javax.swing.JTextArea jTextArea10;
    javax.swing.JTextArea jTextArea11;
    javax.swing.JTextArea jTextArea12;
    javax.swing.JTextArea jTextArea13;
    javax.swing.JTextArea jTextArea14;
    javax.swing.JTextArea jTextArea15;
    javax.swing.JTextArea jTextArea16;
    javax.swing.JTextArea jTextArea2;
    javax.swing.JTextArea jTextArea3;
    javax.swing.JTextArea jTextArea4;
    javax.swing.JTextArea jTextArea5;
    javax.swing.JTextArea jTextArea6;
    javax.swing.JTextArea jTextArea7;
    javax.swing.JTextArea jTextArea8;
    javax.swing.JTextArea jTextArea9;
    javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField10;
    javax.swing.JTextField jTextField11;
    javax.swing.JTextField jTextField12;
    javax.swing.JTextField jTextField13;
    javax.swing.JTextField jTextField14;
    javax.swing.JTextField jTextField15;
    javax.swing.JTextField jTextField16;
    javax.swing.JTextField jTextField17;
    javax.swing.JTextField jTextField18;
    javax.swing.JTextField jTextField19;
    javax.swing.JTextField jTextField2;
    javax.swing.JTextField jTextField20;
    javax.swing.JTextField jTextField21;
    javax.swing.JTextField jTextField22;
    javax.swing.JTextField jTextField3;
    javax.swing.JTextField jTextField4;
    javax.swing.JTextField jTextField5;
    javax.swing.JTextField jTextField6;
    javax.swing.JTextField jTextField7;
    javax.swing.JTextField jTextField8;
    javax.swing.JTextField jTextField9;
    javax.swing.JTextArea jTextPane1;
    // End of variables declaration//GEN-END:variables
}
