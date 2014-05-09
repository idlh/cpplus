package HC;

import java.awt.event.KeyEvent;
import Clases.Actualizar;
import Clases.Funciones_AD;
import Clases.Save;
import entity.PypAdmAsistCon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class ginecogenerales extends javax.swing.JPanel {

    private final PypAdmAsistCon pypAdmAsistCon;
    Funciones_AD Funciones = new Funciones_AD();
    Save sav = new Save();
    Actualizar act = new Actualizar();

    public ginecogenerales(PypAdmAsistCon pypAdmAsistCon) {
        initComponents();
        this.pypAdmAsistCon = pypAdmAsistCon;
        if (pypAdmAsistCon.getIdAgend().getIdPaciente().getGenero().toString().equals("M")) {
            jDateChooser1.setEnabled(false);
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField10.setEnabled(false);
            jTextField7.setEnabled(false);
            jDateChooser2.setEnabled(false);
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

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField10 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(334, 246));
        setMinimumSize(new java.awt.Dimension(334, 246));
        setPreferredSize(new java.awt.Dimension(334, 246));
        setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setText("FUM:");
        add(jLabel8);
        jLabel8.setBounds(10, 44, 24, 11);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setText("Gestas:");
        add(jLabel1);
        jLabel1.setBounds(10, 70, 38, 11);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setText("Partos:");
        add(jLabel4);
        jLabel4.setBounds(10, 95, 29, 11);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setText("Abortos:");
        add(jLabel5);
        jLabel5.setBounds(10, 120, 43, 11);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setText("Cesareas:");
        add(jLabel7);
        jLabel7.setBounds(10, 145, 50, 11);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("Vaginales:");
        add(jLabel6);
        jLabel6.setBounds(10, 170, 50, 11);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("FUP:");
        add(jLabel2);
        jLabel2.setBounds(10, 196, 22, 11);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel9.setText("Generales");
        add(jLabel9);
        jLabel9.setBounds(10, 11, 50, 11);

        jDateChooser1.setFocusable(false);
        add(jDateChooser1);
        jDateChooser1.setBounds(64, 40, 95, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        add(jTextField1);
        jTextField1.setBounds(64, 66, 95, 19);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        add(jTextField2);
        jTextField2.setBounds(64, 91, 95, 19);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        add(jTextField3);
        jTextField3.setBounds(64, 116, 95, 19);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        add(jTextField4);
        jTextField4.setBounds(64, 141, 95, 19);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        add(jTextField5);
        jTextField5.setBounds(64, 166, 95, 19);

        jDateChooser2.setFocusable(false);
        add(jDateChooser2);
        jDateChooser2.setBounds(64, 192, 95, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("Ciclos:");
        add(jLabel3);
        jLabel3.setBounds(164, 44, 80, 11);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel10.setText("Menarquia:");
        add(jLabel10);
        jLabel10.setBounds(164, 70, 94, 11);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        add(jTextField7);
        jTextField7.setBounds(262, 66, 72, 19);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel11.setText("Edad incio vida sexual:");
        add(jLabel11);
        jLabel11.setBounds(164, 95, 94, 11);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField9.setMaximumSize(new java.awt.Dimension(72, 19));
        jTextField9.setMinimumSize(new java.awt.Dimension(72, 19));
        jTextField9.setPreferredSize(new java.awt.Dimension(72, 19));
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        add(jTextField9);
        jTextField9.setBounds(262, 91, 72, 19);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel12.setText("Relaciones con:");
        add(jLabel12);
        jLabel12.setBounds(164, 120, 94, 11);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombres", "Mujeres", "Ambos" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        add(jComboBox1);
        jComboBox1.setBounds(262, 116, 72, 19);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox1.setText("Vida sexual activa");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);
        add(jCheckBox1);
        jCheckBox1.setBounds(164, 140, 101, 21);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox2.setText("Pareja sexual estable");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);
        add(jCheckBox2);
        jCheckBox2.setBounds(164, 165, 113, 21);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jCheckBox3.setText("Uso preservativo");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.setFocusable(false);
        add(jCheckBox3);
        jCheckBox3.setBounds(164, 191, 97, 21);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField10.setMaximumSize(new java.awt.Dimension(72, 19));
        jTextField10.setMinimumSize(new java.awt.Dimension(72, 19));
        jTextField10.setName(""); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(72, 19));
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        add(jTextField10);
        jTextField10.setBounds(262, 41, 72, 19);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

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

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField10.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField9.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField1.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField2.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField3.getText().length() >= 2) {
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
        if ((car < '0' || car > '9') || jTextField5.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') || jTextField9.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.selectAll();
    }//GEN-LAST:event_jTextField1FocusGained

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

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        jTextField10.selectAll();
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        jTextField7.selectAll();
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        jTextField9.selectAll();
    }//GEN-LAST:event_jTextField9FocusGained

    public void actuginecog() {
        String q, w, e, r;
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
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
        r = String.valueOf(jComboBox1.getSelectedIndex());
        Date fuma = jDateChooser1.getDate();
        Date fupa = jDateChooser2.getDate();
        String fum, fup;
        String patron = "yyyy-MM-dd";
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        if (fuma != null) {
            fum = formato.format(fuma);
        } else {
            fum = "0001-01-01";
        }
        if (fupa != null) {
            fup = formato.format(fupa);
        } else {
            fup = "0001-01-01";
        }
        Object cont[][] = Funciones.RetornarDatos(act.contarginecog(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        if (cont[0][0].toString().equals("0")) {
            sav.newginecog(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString(),
                    fum, jTextField10.getText().toUpperCase(), jTextField1.getText().toUpperCase(),
                    jTextField2.getText().toUpperCase(), jTextField3.getText().toUpperCase(),
                    jTextField4.getText().toUpperCase(), jTextField5.getText().toUpperCase(), fup,
                    jTextField7.getText().toUpperCase(), jTextField9.getText().toUpperCase(), q, r, w, e);
        } else {
            act.actualizarginecoginfo(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString(),
                    fum, jTextField10.getText().toUpperCase(), jTextField1.getText().toUpperCase(),
                    jTextField2.getText().toUpperCase(), jTextField3.getText().toUpperCase(),
                    jTextField4.getText().toUpperCase(), jTextField5.getText().toUpperCase(), fup,
                    jTextField7.getText().toUpperCase(), jTextField9.getText().toUpperCase(), q, r, w, e);
        }
        act.actualizarginecog(d, fum, jTextField10.getText().toUpperCase(), jTextField1.getText().toUpperCase(),
                jTextField2.getText().toUpperCase(), jTextField3.getText().toUpperCase(),
                jTextField4.getText().toUpperCase(), jTextField5.getText().toUpperCase(), fup,
                jTextField7.getText().toUpperCase(), jTextField9.getText().toUpperCase(), q, r, w, e);
    }

    public void cargarginecog() {
        Object c[][] = Funciones.RetornarDatos(sav.seleccionaridhc(pypAdmAsistCon.getId().toString()));
        String d = (c[0][0].toString());
        Object h[][] = Funciones.RetornarDatos(act.cargarantecedentesg(d));
        Object car[][] = Funciones.RetornarDatos(act.contarginecog(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        if (car[0][0].toString().equals("0")) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fecha = formato.parse(h[0][2].toString());
                if (h[0][2].toString().equals("01/01/0001")) {
                    jDateChooser1.setDate(null);
                } else {
                    jDateChooser1.setDate(fecha);
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir la fecha fum " + e.getMessage());
            }
            jTextField10.setText(h[0][3].toString());
            jTextField1.setText(h[0][4].toString());
            jTextField2.setText(h[0][5].toString());
            jTextField3.setText(h[0][6].toString());
            jTextField4.setText(h[0][7].toString());
            jTextField5.setText(h[0][8].toString());
            try {
                Date fechafup = formato.parse(h[0][9].toString());
                if (h[0][9].toString().equals("01/01/0001")) {
                    jDateChooser2.setDate(null);
                } else {
                    jDateChooser2.setDate(fechafup);
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir la fecha fup " + e.getMessage().toString());
            }
            jTextField7.setText(h[0][10].toString());
            jTextField9.setText(h[0][11].toString());
            if (h[0][12].toString().equals("0")) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            if (h[0][14].toString().equals("0")) {
                jCheckBox2.setSelected(false);
            } else {
                jCheckBox2.setSelected(true);
            }
            if (h[0][15].toString().equals("0")) {
                jCheckBox3.setSelected(false);
            } else {
                jCheckBox3.setSelected(true);
            }
            if (h[0][14].toString().equals("0")) {
                jComboBox1.setSelectedIndex(0);
            } else {
                if (h[0][14].toString().equals("1")) {
                    jComboBox1.setSelectedIndex(1);
                } else {
                    jComboBox1.setSelectedIndex(2);
                }
            }
        } else {
            cargarinfoanteg();
        }
    }

    public void cargarinfoanteg() {
        Object car[][] = Funciones.RetornarDatos(act.contarginecog(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
        if (car[0][0].toString().equals("1")) {
            Object h[][] = Funciones.RetornarDatos(act.cargaranteg(pypAdmAsistCon.getIdAgend().getIdPaciente().getId().toString()));
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fecha = formato.parse(h[0][2].toString());
                if (h[0][2].toString().equals("01/01/0001")) {
                    jDateChooser1.setDate(null);
                } else {
                    jDateChooser1.setDate(fecha);
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir la fecha fum " + e.getMessage());
            }
            jTextField10.setText(h[0][3].toString());
            jTextField1.setText(h[0][4].toString());
            jTextField2.setText(h[0][5].toString());
            jTextField3.setText(h[0][6].toString());
            jTextField4.setText(h[0][7].toString());
            jTextField5.setText(h[0][8].toString());
            try {
                Date fechafup = formato.parse(h[0][9].toString());
                if (h[0][9].toString().equals("01/01/0001")) {
                    jDateChooser2.setDate(null);
                } else {
                    jDateChooser2.setDate(fechafup);
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir la fecha fup " + e.getMessage().toString());
            }
            jTextField7.setText(h[0][10].toString());
            jTextField9.setText(h[0][11].toString());
            if (h[0][12].toString().equals("0")) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            if (h[0][14].toString().equals("0")) {
                jCheckBox2.setSelected(false);
            } else {
                jCheckBox2.setSelected(true);
            }
            if (h[0][15].toString().equals("0")) {
                jCheckBox3.setSelected(false);
            } else {
                jCheckBox3.setSelected(true);
            }
            if (h[0][14].toString().equals("0")) {
                jComboBox1.setSelectedIndex(0);
            } else {
                if (h[0][14].toString().equals("1")) {
                    jComboBox1.setSelectedIndex(1);
                } else {
                    jComboBox1.setSelectedIndex(2);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JCheckBox jCheckBox2;
    javax.swing.JCheckBox jCheckBox3;
    javax.swing.JComboBox jComboBox1;
    com.toedter.calendar.JDateChooser jDateChooser1;
    com.toedter.calendar.JDateChooser jDateChooser2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField10;
    javax.swing.JTextField jTextField2;
    javax.swing.JTextField jTextField3;
    javax.swing.JTextField jTextField4;
    javax.swing.JTextField jTextField5;
    javax.swing.JTextField jTextField7;
    javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
