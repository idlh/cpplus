package HC;

import Clases.Funciones_AD;
import java.io.File;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import Entidades.PypAdmAsistCon;
//import Entidades.InfoPaciente;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import HC.Adulto;

public class PruebasComple extends javax.swing.JPanel {
    private final String tipoAyudaDiag[]={"LABORATORIO","IMAGEN","ENDOSCOPIA","ANATOMIA PATOLOGICA","ELECTROGRAMAS","ESTUDIOS ALERGOLÓGICOS"};
    private javax.swing.JFileChooser jFileChooser1;
    public DefaultTableModel modeloAyudDiag,modDestroyAyudDiag;
//    public PypAdmAsistCon infoadmision =null;
    private final Object dato[] = null;
    private final String s = System.getProperty("file.separator");
    public PruebasComple() {
        initComponents();
        TablaAyudDiag();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablaconte = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(558, 345));
        setMinimumSize(new java.awt.Dimension(558, 345));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Pruebas Complementarias");

        jLabel1.setText("Hallazgos");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Adjuntar documentos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/masc2.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Tablaconte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tablaconte.setFocusable(false);
        Tablaconte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TablaconteMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Tablaconte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private String ReturnPathdiagHelpSaveFile(String tipo){
            Calendar ahoraCal = Calendar.getInstance();
            ahoraCal.setTime(Adulto.pypAdmAsistCon.getFecha());
            String year =String.valueOf(ahoraCal.get(Calendar.YEAR));
            String month =String.valueOf(ahoraCal.get(Calendar.MONTH));
            return Adulto.pypAdmAsistCon.getIdAgend().getIdPaciente().getNumDoc()+s+year+s+month+s+Adulto.pypAdmAsistCon.getId()+s+tipo;
        }
    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
         jFileChooser1 = new JFileChooser();
         FileNameExtensionFilter filter= new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
         jFileChooser1.setMultiSelectionEnabled(false);
         jFileChooser1.setFileFilter(filter);
         int result = jFileChooser1.showOpenDialog(null);
         File file = null;
         if(result == JFileChooser.APPROVE_OPTION){
            String seleccion = (String) JOptionPane.showInputDialog(this,"Tipo de Archivo Adjunto","Mensaje",
                JOptionPane.QUESTION_MESSAGE,null,tipoAyudaDiag,"LABORATORIO");
            file = jFileChooser1.getSelectedFile();
            jTextField1.setText(file.getAbsolutePath());
            ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Recursos/Delete16x16.png"));
            ImageIcon icon2 = new javax.swing.ImageIcon(getClass().getResource("/Recursos/download.png"));
            int indexRow = Tablaconte.getRowCount();
            if(modeloAyudDiag.getRowCount()==0){
                modeloAyudDiag.addRow(dato);
                modeloAyudDiag.setValueAt(file.getName(), indexRow, 2);
                modeloAyudDiag.setValueAt(new JLabel(icon), indexRow, 0);
                modeloAyudDiag.setValueAt(new JLabel(icon2), indexRow, 1);
                modeloAyudDiag.setValueAt(file, indexRow, 3);
                modeloAyudDiag.setValueAt(seleccion, indexRow, 4);
                modeloAyudDiag.setValueAt(ReturnPathdiagHelpSaveFile(seleccion), indexRow, 5);
                modeloAyudDiag.setValueAt("0", indexRow, 6);//identifica que aun no ha sido guardado en la bd
            }else{
                Boolean exist=null;
                for(int i =0;i<modeloAyudDiag.getRowCount();i++){
                    if(((String)modeloAyudDiag.getValueAt(i, 2)).equals(file.getName())){
                        exist = true;
                        break;
                    }else{
                        exist = false;
                    }
                }
                if(!exist){
                    modeloAyudDiag.addRow(dato);
                    modeloAyudDiag.setValueAt(file.getName(), indexRow, 2);
                    modeloAyudDiag.setValueAt(new JLabel(icon), indexRow, 0);
                    modeloAyudDiag.setValueAt(new JLabel(icon2), indexRow, 1);
                    modeloAyudDiag.setValueAt(file, indexRow, 3);
                    modeloAyudDiag.setValueAt(seleccion, indexRow, 4);
                    modeloAyudDiag.setValueAt(ReturnPathdiagHelpSaveFile(seleccion), indexRow, 5); 
                    modeloAyudDiag.setValueAt("0", indexRow, 6);//identifica que aun no ha sido guardado en la bd
                }
            }
        }
    }//GEN-LAST:event_jButton1MouseReleased

    private void TablaconteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaconteMouseReleased
         if(SwingUtilities.isLeftMouseButton(evt)){
            if(Tablaconte.columnAtPoint(evt.getPoint())==0) {
               int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este archivo de forma permanente?"
                       ,"Eliminar archivo",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
               if(confirmar==JOptionPane.YES_OPTION){
                    int row = Tablaconte.rowAtPoint(evt.getPoint());
                    modDestroyAyudDiag.addRow(new Object[] {modeloAyudDiag.getValueAt(row, 0)
                            ,modeloAyudDiag.getValueAt(row, 1),modeloAyudDiag.getValueAt(row, 2),modeloAyudDiag.getValueAt(row, 3)
                            ,modeloAyudDiag.getValueAt(row, 4),modeloAyudDiag.getValueAt(row, 5),modeloAyudDiag.getValueAt(row, 6)});
                    modeloAyudDiag.removeRow(row);
                    jTextField1.setText(null);
               } 
            }else if(Tablaconte.columnAtPoint(evt.getPoint())==1){
                //verificar existencia del archivo en la bd o en la clase entidad
                    if(((String)Tablaconte.getValueAt(Tablaconte.rowAtPoint(evt.getPoint()), 6))
                            .equals("1")){
                            String path2 = (String)modeloAyudDiag.getValueAt(Tablaconte.rowAtPoint(evt.getPoint()), 5)
                                    +s+(String)modeloAyudDiag.getValueAt(Tablaconte.rowAtPoint(evt.getPoint()), 2);
                            Funciones_AD.fileDownload(path2);
                    }
            }
        }
    }//GEN-LAST:event_TablaconteMouseReleased
    private DefaultTableModel getModAyudaDiag(){
            try {
                return (new DefaultTableModel(
                null, new String [] {"imagen","iamgen2","archivo","file","tipo","ruta","bd"}){
                Class[] types = new Class [] {
                     javax.swing.JLabel.class,
                     javax.swing.JLabel.class,
                     java.lang.String.class,
                     java.io.File.class,
                     java.lang.String.class,
                     java.lang.String.class,
                     java.lang.String.class
                };

                boolean[] canEdit = new boolean [] {
                false,false,false,false,false,false,false
                };
                @Override
                public Class getColumnClass(int columnIndex) {
                   return types [columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int colIndex){
                   return canEdit [colIndex];
                }
            });
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "10071:\n"+ex.getMessage(), PruebasComple.class.getName(), JOptionPane.INFORMATION_MESSAGE);
                return null;
            }
        }
        private void TablaAyudDiag(){
        try {
           modeloAyudDiag = getModAyudaDiag();
           modDestroyAyudDiag = getModAyudaDiag();
           Tablaconte.setModel(modeloAyudDiag);
           Tablaconte.getTableHeader().setReorderingAllowed(false);
           Tablaconte.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           Funciones_AD.setSizeColumnas(Tablaconte, new int[]{0,1,2}, new int[]{20,20,330});
           Funciones_AD.setOcultarColumnas(Tablaconte,new int[]{3,5,6});
           Tablaconte.setDefaultRenderer(Object.class, new Clases.IconCellRenderer());
           Tablaconte.setTableHeader(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "10052:\n"+ex.getMessage(), PruebasComple.class.getName(), JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable Tablaconte;
    javax.swing.JButton jButton1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTextArea jTextArea1;
    javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
