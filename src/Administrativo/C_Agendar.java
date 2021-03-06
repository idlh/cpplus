/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo;

import Controladores.InfoPacienteJpaController;
import Controladores.PypAdmAgendJpaController;
import Entidades.InfoPaciente;
import Entidades.PypAdmProgramas;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author IdlhDeveloper
 */
public class C_Agendar extends javax.swing.JPanel {

    public Dialogos.A_Administrador_Usuarios AU = new Dialogos.A_Administrador_Usuarios(null, true);
    InfoPacienteJpaController Control_Paciente = new InfoPacienteJpaController();
    PypAdmAgendJpaController Agenda = new PypAdmAgendJpaController();
    Clases.Funciones_AD Funciones = new Clases.Funciones_AD();
    Clases.Declaraciones_AD Declaraciones = new Clases.Declaraciones_AD();
    Dialogos.A_Programas Programas = new Dialogos.A_Programas(null, true);
    public Dialogos.A_Administrador_Usuarios U = new Dialogos.A_Administrador_Usuarios(null, true);
    Dialogos.A_Pacientes Pacientes = new Dialogos.A_Pacientes(null, true);
    InfoPaciente paciente = null;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PyP_PersisPU");
    int verify = 0;
    int validar = 0;
    public PypAdmProgramas programa = null;

    /**
     * Creates new form C_Agendar
     */
    public C_Agendar() {
        initComponents();
        jTextField1.setDocument(new Clases.SoloNumeros());
        jLabel18.setVisible(false);
        jPanel6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(138, 207, 244));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Atención Administrativa");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 160, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clip_board.png"))); // NOI18N
        jLabel2.setText("Agendar Pacientes");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 22, 280, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 750, 50);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 50, 750, 10);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setToolTipText("Recuerde ingrese la hora en formato HH:mm (24 Horas)");
        jFormattedTextField3.setMinimumSize(new java.awt.Dimension(22, 20));
        jFormattedTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jFormattedTextField3);
        jFormattedTextField3.setBounds(350, 160, 40, 20);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Identificación:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 80, 20);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 100, 110, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        jLabel4.setToolTipText("Encuentra un programa");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 120, 34, 30);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 363, 750, 10);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Programa:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 130, 80, 20);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 130, 430, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        jLabel6.setToolTipText("Encuentra un usuario");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 92, 34, 30);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 160, 80, 20);

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Escolaridad:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 160, 60, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jLabel9.setToolTipText("Cerrar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(530, 320, 40, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar-big.png"))); // NOI18N
        jLabel10.setToolTipText("Guardar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(430, 320, 44, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/reload-limpiar.png"))); // NOI18N
        jLabel11.setToolTipText("Limpiar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(480, 320, 40, 40);

        jPanel5.setLayout(null);

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Paciente Seleccionado:");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(11, 3, 110, 14);

        jLabel13.setMaximumSize(new java.awt.Dimension(130, 14));
        jLabel13.setMinimumSize(new java.awt.Dimension(130, 14));
        jLabel13.setPreferredSize(new java.awt.Dimension(130, 14));
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 20, 460, 14);

        jLabel14.setMaximumSize(new java.awt.Dimension(130, 14));
        jLabel14.setMinimumSize(new java.awt.Dimension(130, 14));
        jLabel14.setPreferredSize(new java.awt.Dimension(130, 14));
        jPanel5.add(jLabel14);
        jLabel14.setBounds(10, 37, 90, 14);

        jLabel17.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel17.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel17.setPreferredSize(new java.awt.Dimension(40, 14));
        jPanel5.add(jLabel17);
        jLabel17.setBounds(120, 37, 70, 14);

        jLabel20.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel20.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel20.setPreferredSize(new java.awt.Dimension(40, 14));
        jPanel5.add(jLabel20);
        jLabel20.setBounds(200, 37, 70, 14);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(280, 62, 470, 56);

        jCalendar1.setFocusable(false);
        jPanel1.add(jCalendar1);
        jCalendar1.setBounds(110, 160, 184, 153);

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alert.png"))); // NOI18N
        jLabel15.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel15.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel15.setPreferredSize(new java.awt.Dimension(40, 14));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 340, 270, 14);

        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/okey.png"))); // NOI18N
        jLabel16.setText("El Registro fue guardado con exito.");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 340, 210, 16);

        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("¿ lo creamos ? haz clic aquí.");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel18);
        jLabel18.setBounds(280, 340, 150, 14);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bulb.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel19MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel19);
        jLabel19.setBounds(230, 61, 30, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 313, 294, 10);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alert.png"))); // NOI18N
        jLabel21.setText("Aviso normatívo:");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(20, 10, 140, 16);

        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel22);
        jLabel22.setBounds(20, 30, 360, 80);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(350, 190, 390, 120);

        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Hora:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(310, 160, 40, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Preescolar", "Básica Primaria", "Básica Secundaria", "Media Académica o Clásica", "Media Técnica", "Normalista", "Técnica Profesional", "Tecnológia", "Profesional", "Especialización", "Maestría", "Doctorado", "Ninguno" }));
        jComboBox1.setSelectedIndex(12);
        jComboBox1.setFocusable(false);
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(480, 160, 150, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField3KeyReleased
        if (!jFormattedTextField3.getText().equals("  :  ")) {
            jLabel15.setText("");
            jLabel15.setVisible(false);
        }
    }//GEN-LAST:event_jFormattedTextField3KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (!jTextField1.getText().isEmpty()) {
            jLabel15.setText("");
            jLabel15.setVisible(false);
            jLabel18.setVisible(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Search();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jPanel5.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jTextField1.requestFocusInWindow();
    }//GEN-LAST:event_formComponentShown

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
        jLabel15.setVisible(false);
        jLabel18.setVisible(false);
        U.show();
    }//GEN-LAST:event_jLabel18MouseReleased

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        Save();
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        Limpiar();
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        Limpiar();
        Clases.Declaraciones_AD.CContenedor.area.remove(Clases.Declaraciones_AD.CContenedor.area.getSelectedComponent());
    }//GEN-LAST:event_jLabel9MouseReleased

    private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseReleased
        Pacientes.CrearModelo();
        Pacientes.cargar_pacientes();
        Pacientes.show();
    }//GEN-LAST:event_jLabel19MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        Search();
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        if (verify == 1) {
            Programas.show();
        } else {
            jLabel15.setVisible(true);
            jLabel15.setText("Por favor realiza una busqueda");
            jTextField1.requestFocusInWindow();
        }
    }//GEN-LAST:event_jLabel4MouseReleased
    public void validar_programa() {
        String[] v = jLabel20.getText().split(" ");
        if ((programa.getId() == 2) && (getInteger(v[0]) > 10)
                && (v[1].toString().equals("Años"))) {
            validar = 0;
            jPanel6.setVisible(true);
            CDM10A();
        } else if ((programa.getId() == 1) && ((getInteger(v[0]) < 10)
                || (getInteger(v[0]) > 29)) && (v[1].toString().equals("Años"))) {
            validar = 0;
            jPanel6.setVisible(true);
            DTCD10_29A();
        } else if ((programa.getId() == 8 || programa.getId() == 9 || programa.getId() == 11)
                && paciente.getGenero().toString().equals("M")) {
            validar = 0;
            jPanel6.setVisible(true);
            ProgramasFemeninos();
        } else if ((programa.getId() == 3) && (getInteger(v[0]) < 45)
                && (v[1].toString().equals("Años"))) {
            validar = 0;
            jPanel6.setVisible(true);
            MayoriaEdad();
        } else {
            validar = 1;
            jPanel6.setVisible(false);
        }
    }

    private int getInteger(String i) {
        int inT = Integer.parseInt(i);
        return inT;
    }
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("http://192.168.1.102/Documentos/Normas_PYP/RESOLUCION%20NUMERO%20412%20DE%202000.pdf"));
            } catch (IOException ex) {
                Logger.getLogger(C_Agendar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(C_Agendar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel22MouseClicked
    private void CDM10A() {  //DETECCIÓN TEMPRANA DE LAS ALTERACIONES DEL CRECIMIENTO Y DESARROLLO (MENORES DE 10 AÑOS)
        String s = "<html><b><font color='red'>Resolución 412 de 200 Articulo 9</font>"
                + "</b> Deteccion temprana de alteraciones del crecimiento y desarrollo solo Menores de 10 años <br> <a href=''>Clic Aquí</a></html>";
        jLabel22.setText("<html>\n"
                + "<div style=\"width:355;\">" + s + "</div>\n"
                + "\n"
                + "</html>");
    }

    private void DTCD10_29A() {  //DETECCIÓN TEMPRANA DE LAS ALTERACIONES DEL DESARROLLO DEL JOVEN (10-29 AÑOS)
        String s = "<html><b><font color='red'>Resolución 412 de 200 Articulo 9</font>"
                + "</b> Detección temprana de las alteraciones del desarrollo del joven solo personas entre (10 - 29 Años) <br> <a href=''>Clic Aquí</a></html>";
        jLabel22.setText("<html>\n"
                + "<div style=\"width:355;\">" + s + "</div>\n"
                + "\n"
                + "</html>");
    }

    private void ProgramasFemeninos() {
        String s = "<html><b><font color='red'>Error en Asignación del programa <br></font>"
                + "</b> Este programa solo puede ser asignado a pacientes femeninos.";
        jLabel22.setText("<html>\n"
                + "<div style=\"width:355;\">" + s + "</div>\n"
                + "\n"
                + "</html>");
    }

    private void MayoriaEdad() {
        String s = "<html><b><font color='red'>Error en Asignación del programa <br></font>"
                + "</b> El paciente no cuenta con la mayoria de edad.";
        jLabel22.setText("<html>\n"
                + "<div style=\"width:355;\">" + s + "</div>\n"
                + "\n"
                + "</html>");
    }

    private void Limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField3.setText(null);
        jLabel13.setText("");
        jLabel14.setText("");
        jPanel5.setVisible(false);
        jLabel15.setText("");
        jLabel15.setVisible(false);
        paciente = null;
        verify = 0;
        jPanel6.setVisible(false);
        jComboBox1.setSelectedIndex(0);
    }

    private void Search() {
        try {
            jLabel18.setVisible(false);
            jLabel15.setText("");
            jLabel15.setVisible(false);
            if (!jTextField1.getText().isEmpty()) {
                Object e = Control_Paciente.get_pacienteByID_(jTextField1.getText());
                if (!e.toString().equals("0")) {
                    paciente = (InfoPaciente) e;
                    jLabel13.setText("" + paciente.getNombre1() + " " + paciente.getNombre2() + " " + paciente.getApellido1() + " " + paciente.getApellido2());
                    jLabel14.setText("" + paciente.getNumDoc());
                    jLabel17.setText("" + Funciones.Format_Fecha_GUION(paciente.getFechaNacimiento()));
                    Query Q = Edad(paciente.getFechaNacimiento());
                    jLabel20.setText("" + Q.getSingleResult());
                    jPanel5.setVisible(true);
                    verify = 1;
                } else {
//                    jTextField1.requestFocusInWindow();
//                    Limpiar();
//                    jLabel15.setVisible(true);
//                    jLabel15.setText("No existe un usuario asociado a esta identificación");
//                    jLabel18.setVisible(true);                    
                    U.show();
                }
            } else {
                jLabel15.setText("Por favor ingrese un numero de identificacion");
                jTextField1.requestFocusInWindow();
                jLabel15.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public Query Edad(Date edad) {
        Query q = null;
        EntityManager em = emf.createEntityManager();
        String dd = Funciones.Format_Fecha_GUION(edad);
        String Consulta = "SELECT calc_edad('" + dd + "');";
        q = em.createNativeQuery(Consulta);
        return q;
    }

    private void Save() {
        try {
            if (verify == 1 && !jTextField1.getText().isEmpty()) {
                if (!jTextField2.getText().isEmpty()) {
                    if (Funciones.Validar_CampoHora(jFormattedTextField3.getText()) == true) {
                        if (validar == 1) {
                            Declaraciones.RAgendas.setIdPaciente(paciente);
                            Declaraciones.RAgendas.setIdPrograma(programa);
                            Declaraciones.RAgendas.setFecha(Funciones.stringToDate(Funciones.getFecha_Jcalendar(jCalendar1)));
                            Declaraciones.RAgendas.setHora(Funciones.getHora(jFormattedTextField3.getText()));
                            Declaraciones.RAgendas.setEscolaridad((short) (jComboBox1.getSelectedIndex() + 1));
                            Declaraciones.RAgendas.setEstado('1');
                            Agenda.create(Declaraciones.RAgendas);
                            jLabel16.setVisible(true);
                            Contar();
                        } else {
                            jLabel15.setText("El usuario no cumple con los requisitos del programa");
                            jLabel15.setVisible(true);
                        }
                    } else {
                        jLabel15.setText("Por favor ingrese una hora válida");
                        jLabel15.setVisible(true);
                    }
                } else {
                    jLabel15.setText("Por favor consulte un programa");
                    jLabel15.setVisible(true);
                }
            } else {
                jLabel15.setText("Por favor consulte un usuario");
                jLabel15.setVisible(true);
                jTextField1.requestFocusInWindow();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private Timer timer = new Timer();
    private int segundos = 5;

    class Contador extends TimerTask {

        @Override
        public void run() {
            segundos--;
            if (segundos == 0) {
                Detener();
                jLabel16.setVisible(false);
                Limpiar();
                jTextField1.requestFocusInWindow();
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
