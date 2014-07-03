/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrativo.Panelconfig;

import Clases.Actualizar;
import Clases.FuncionesC;
import Clases.Funciones_AD;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class Rel4505 extends javax.swing.JPanel {

    String[] arrayEntidad;
    FuncionesC Funciones = new FuncionesC();
    Actualizar act = new Actualizar();
    Funciones_AD Funtions = new Funciones_AD();

    /**
     * Creates new form Rel4505
     */
    public Rel4505() {
        initComponents();
        actdescheck(jCheckBox1, jDateChooser1, jDateChooser2);
        actdescheck(jCheckBox2, jDateChooser3, jDateChooser4);
        CargarEntidad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(562, 345));
        setMinimumSize(new java.awt.Dimension(562, 345));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(125, 164, 222));
        jLabel1.setText("Generacion Archivo (4505)");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mensual");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jDateChooser2.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 164, 222));
        jLabel5.setText("Hasta:");

        jDateChooser1.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 164, 222));
        jLabel4.setText("Desde:");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Trimestral");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setFocusable(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(125, 164, 222));
        jLabel6.setText("Desde:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(125, 164, 222));
        jLabel7.setText("Hasta:");

        jDateChooser3.setFocusable(false);

        jDateChooser4.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/finalc2.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(125, 164, 222));
        jLabel8.setText("Entidad:");

        jComboBox1.setFocusable(false);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel8))
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        actdescheck(jCheckBox1, jDateChooser1, jDateChooser2);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        actdescheck(jCheckBox2, jDateChooser3, jDateChooser4);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        String ruta = System.getProperty("user.home") + "/Desktop";
        final String ln = System.getProperty("line.separator");
        String patron = "yyyy-MM-dd", fecini, fecfin;
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        if (jCheckBox1.isSelected() == true) {
            fecini = formato.format(jDateChooser1.getDate());
            fecfin = formato.format(jDateChooser2.getDate());
            Object datames[][] = Funtions.RetornarDatos(act.rel4505mes(jComboBox1.getSelectedItem().toString(), fecini, fecfin));
            Object dataparam[][] = Funtions.RetornarDatos(act.cargarparam());
            try {
                File archivo = new File(ruta, "Reporte4505 " + jComboBox1.getSelectedItem() + " Mensual.txt");
                archivo.createNewFile();
                System.out.println(archivo.getAbsolutePath());
                FileWriter escribir = new FileWriter(archivo, true);
                String apellido2, nombre2, etnia = "ND", gestacion = null, sifilis = null, htagesta = null, hipot = null, genero = null, escolaridad = null, sintomr = null, tuberculosis = null,
                        lepra = null, nutri = null, maltrato = null, abusos = null, infecciones = null, mental = null, cervix = null, seno = null;
                boolean valorv = false;
                for (int b = 0; b < datames.length; b++) {
                    if (datames[b][5].toString().equals("")) {
                        apellido2 = "NONE";
                    } else {
                        apellido2 = datames[b][5].toString();
                    }
                    if (datames[b][7].toString().equals("")) {
                        nombre2 = "NONE";
                    } else {
                        nombre2 = datames[b][7].toString();
                    }
                    genero = datames[b][9].toString();
                    if (datames[b][10].toString().equals("INDIGENA") || datames[b][11].toString().equals("INDIGENA")) {
                        etnia = "1";
                    } else {
                        if (datames[b][10].toString().equals("ROM") || datames[b][11].toString().equals("ROM")) {
                            etnia = "2";
                        } else {
                            if (datames[b][10].toString().equals("RAIZAL") || datames[b][11].toString().equals("RAIZAL")) {
                                etnia = "3";
                            } else {
                                if (datames[b][10].toString().equals("AFROCOLOMBIANO") || datames[b][11].toString().equals("AFROCOLOMBIANO")) {
                                    etnia = "5";
                                } else {
                                    if (datames[b][10].toString().equals("NO APLICA") || datames[b][11].toString().equals("NO APLICA")) {
                                        etnia = "6";
                                    }
                                }
                            }
                        }
                    }
                    escolaridad = datames[b][12].toString();
                    for (int i = 0; i < dataparam.length; i++) {
                        if (datames[b][9].toString().equals("M")) {
                            gestacion = "0";
                        } else {
                            if (datames[b][13].toString().equals("0")) {
                                gestacion = "2";
                            } else {
                                gestacion = "1";
                            }
                        }
                    }
                    //Sifilis
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("21")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                if (!datames[b][9].toString().equals("M")) {
                                    sifilis = dataparam[i][6].toString();
                                    break;
                                } else {
                                    sifilis = "0";
                                }
                            } else {
                                sifilis = "3";
                            }
                        } else {
                            sifilis = "0";
                        }
                    }
                    //Hipertencion por gestacion
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("22")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                if (!datames[b][9].toString().equals("M")) {
                                    htagesta = dataparam[i][6].toString();
                                    break;
                                } else {
                                    htagesta = "0";
                                }
                            } else {
                                htagesta = "2";
                            }
                        } else {
                            htagesta = "0";
                        }
                    }
                    //Hipotiroidismo
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("23")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                if (datames[b][1].toString().equals("10")) {
                                    hipot = dataparam[i][6].toString();
                                    break;
                                } else {
                                    hipot = "0";
                                }
                            } else {
                                hipot = "2";
                            }
                        } else {
                            hipot = "0";
                        }
                    }
                    //Sintomatico Respiratorio
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("24")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                sintomr = dataparam[i][6].toString();
                                break;
                            } else {
                                sintomr = "2";
                            }
                        } else {
                            sintomr = "2";
                        }
                    }
                    //tuberculosis
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("25")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                tuberculosis = dataparam[i][6].toString();
                                break;
                            } else {
                                tuberculosis = "2";
                            }
                        } else {
                            tuberculosis = "0";
                        }
                    }
                    //Lepra
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("26")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                lepra = dataparam[i][6].toString();
                                break;
                            } else {
                                lepra = "3";
                            }
                        } else {
                            lepra = "3";
                        }
                    }
                    //Obesidad o desnutricion
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("27")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                nutri = dataparam[i][6].toString();
                                break;
                            } else {
                                nutri = "3";
                            }
                        } else {
                            nutri = "3";
                        }
                    }
                    //Victima de maltrato
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("28")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                int año = 0;
                                String ed[] = datames[b][28].toString().split(" ");
                                String an = ed[0];
                                año = Integer.parseInt(an);
                                if (año < 18) {
                                    maltrato = dataparam[i][6].toString();
                                    break;
                                } else {
                                    if (!datames[b][9].toString().equals("M")) {
                                        maltrato = dataparam[i][6].toString();
                                        break;
                                    } else {
                                        maltrato = "0";
                                    }
                                }
                            } else {
                                maltrato = "3";
                            }
                        }
                    }
                    //Victima de violencia sexual
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("29")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                abusos = dataparam[i][6].toString();
                                break;
                            } else {
                                abusos = "2";
                            }
                        }
                    }
                    //Infecciones sexuales
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("30")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                infecciones = dataparam[i][6].toString();
                                break;
                            } else {
                                infecciones = "2";
                            }
                        }
                    }
                    //Enfermedad mental
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("31")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                mental = dataparam[i][6].toString();
                            } else {
                                mental = "7";
                            }
                        }
                    }
                    //Cancer de cervix
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("32")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                if (!datames[b][9].toString().equals("M")) {
                                    cervix = dataparam[i][6].toString();
                                } else {
                                    cervix = "0";
                                }
                            } else {
                                cervix = "2";
                            }
                        }
                    }
                    //Cancer de seno
                    for (int i = 0; i < dataparam.length; i++) {
                        if (dataparam[i][1].toString().equals("33")) {
                            if (datames[b][14].toString().equals(dataparam[i][5].toString()) || datames[b][15].toString().equals(dataparam[i][5].toString())
                                    || datames[b][16].toString().equals(dataparam[i][5].toString()) || datames[b][17].toString().equals(dataparam[i][5].toString())) {
                                seno = dataparam[i][6].toString();
                            } else {
                                seno = "2";
                            }
                        }
                    }
                    escribir.write(datames[b][0].toString() + "|1|999||||2|" + (b + 1) + "|051540381702|" + datames[b][2] + "|" + datames[b][3] + "|" + datames[b][4] + "|" + apellido2
                            + "|" + datames[b][6] + "|" + nombre2 + "|" + datames[b][8] + "|" + datames[b][9] + "|" + etnia + "|9999|" + escolaridad + "|" + gestacion + "|" + sifilis + "|"
                            + htagesta + "|" + hipot + "|" + sintomr + "|" + tuberculosis + "|" + lepra + "|" + nutri + "|" + maltrato + "|" + abusos + "|" + infecciones + "|" + mental + "|"
                            + cervix + "|" + seno + "|" + ln);
                }
                escribir.close();
            } catch (Exception e) { 
                JOptionPane.showMessageDialog(null, "Error creacion archivo 4505: " + e.getMessage(), Rel4505.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (jCheckBox2.isSelected() == true) {
            fecini = formato.format(jDateChooser3.getDate());
            fecfin = formato.format(jDateChooser4.getDate());
            Object datatri[][] = Funtions.RetornarDatos(act.rel4505tri(jComboBox1.getSelectedItem().toString(), fecini, fecfin));
            try {
                File archivo = new File(ruta, "Reporte4505 " + jComboBox1.getSelectedItem() + " Trimestral.txt");
                archivo.createNewFile();
                System.out.println(archivo.getAbsolutePath());
                FileWriter escribir = new FileWriter(archivo, true);
                for (int b = 0; b < datatri.length; b++) {
                    escribir.write("programa" + "|1|999||||" + ln);
                }
                escribir.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error creacion archivo 4505: " + e.getMessage(), Rel4505.class.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        modulo_pyp.Modulo_PyP.d.panelc.Cprincipal.removeAll();
        modulo_pyp.Modulo_PyP.d.panelc.Cprincipal.repaint();
    }//GEN-LAST:event_jButton6MouseReleased

    private void actdescheck(JCheckBox check, JDateChooser date1, JDateChooser date2) {
        if (check.isSelected() == false) {
            date1.setEnabled(false);
            date2.setEnabled(false);
        } else {
            date1.setEnabled(true);
            date2.setEnabled(true);
        }
    }

    private void CargarEntidad() {
        try {
            arrayEntidad = Funciones.llenarCombo("SELECT `id`, `nombre_entidad` FROM `database`.`info_entidades`;", arrayEntidad, jComboBox1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton6;
    javax.swing.JCheckBox jCheckBox1;
    javax.swing.JCheckBox jCheckBox2;
    javax.swing.JComboBox jComboBox1;
    com.toedter.calendar.JDateChooser jDateChooser1;
    com.toedter.calendar.JDateChooser jDateChooser2;
    com.toedter.calendar.JDateChooser jDateChooser3;
    com.toedter.calendar.JDateChooser jDateChooser4;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
