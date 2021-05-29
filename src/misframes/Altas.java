/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misframes;

import basededatos.MySqlConn;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import portadas.Menu;

/**
 *
 * @author Cynthia Maritza
 */
public class Altas extends javax.swing.JInternalFrame {

    public static int seleccionada;
    public Altas() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new PanelIm("src/imagenes/habitacion.jpg");
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSelHab = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jSpinnerTotalD = new javax.swing.JSpinner();
        jTextFieldCiudad = new javax.swing.JTextField();
        jSpinnerTotalP = new javax.swing.JSpinner();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonRecibo = new javax.swing.JButton();
        jDateChooserIngreso = new com.toedter.calendar.JDateChooser();
        jRadioButtonTriple = new javax.swing.JRadioButton();
        jRadioButtonSencilla = new javax.swing.JRadioButton();
        jRadioButtonDoble = new javax.swing.JRadioButton();
        jTextFieldSalidaD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Información de Huésped");

        jLabelNombre.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelNombre.setText("Nombre Completo:");

        jLabelCiudad.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelCiudad.setText("Ciudad de Origen:");

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Información de Habitación");

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel3.setText("Total de Personas:");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel4.setText("Tipo de Habitación:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setText("Estancia en el Hotel");

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel7.setText("Fecha de ingreso: ");

        jButtonSelHab.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonSelHab.setText("Seleccionar Habitación");
        jButtonSelHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelHabActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel8.setText("Fecha de salida:");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel9.setText("Total de días:");

        jTextFieldNombre.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldNombre.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jSpinnerTotalD.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jSpinnerTotalD.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerTotalD.setOpaque(false);

        jTextFieldCiudad.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldCiudad.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldCiudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jSpinnerTotalP.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jSpinnerTotalP.setOpaque(false);

        jButtonRegistrar.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonRecibo.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonRecibo.setText("Recibo");

        jDateChooserIngreso.setDateFormatString("yyyy-MM-dd");
        jDateChooserIngreso.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N

        buttonGroupTipo.add(jRadioButtonTriple);
        jRadioButtonTriple.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButtonTriple.setText("Triple");
        jRadioButtonTriple.setOpaque(false);
        jRadioButtonTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTripleActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonSencilla);
        jRadioButtonSencilla.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButtonSencilla.setText("Sencilla");
        jRadioButtonSencilla.setOpaque(false);
        jRadioButtonSencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSencillaActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonDoble);
        jRadioButtonDoble.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButtonDoble.setText("Doble");
        jRadioButtonDoble.setOpaque(false);
        jRadioButtonDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDobleActionPerformed(evt);
            }
        });

        jTextFieldSalidaD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSalidaDFocusGained(evt);
            }
        });
        jTextFieldSalidaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalidaDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel10.setText("Numero Habitacion: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCiudad)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonSencilla)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonTriple, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRecibo))
                            .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinnerTotalD, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(jTextFieldSalidaD)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jSpinnerTotalP))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSelHab)
                                .addGap(62, 62, 62)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButtonDoble, jRadioButtonSencilla, jRadioButtonTriple});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSpinnerTotalD, jSpinnerTotalP, jTextFieldCiudad, jTextFieldNombre});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonRecibo, jButtonRegistrar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCiudad)
                            .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonSencilla)
                            .addComponent(jRadioButtonDoble)
                            .addComponent(jRadioButtonTriple))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerTotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jButtonSelHab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jSpinnerTotalD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldSalidaD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonRegistrar)
                                    .addComponent(jButtonRecibo))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRadioButtonDoble, jRadioButtonSencilla, jRadioButtonTriple});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSpinnerTotalD, jSpinnerTotalP, jTextFieldCiudad, jTextFieldNombre});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonRecibo, jButtonRegistrar});

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

    private void jRadioButtonSencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSencillaActionPerformed
        // TODO add your handling code here:
        this.jSpinnerTotalP.setValue(1);
        this.jSpinnerTotalP.setModel(new SpinnerNumberModel(1, 1, 3, 1));
    }//GEN-LAST:event_jRadioButtonSencillaActionPerformed

    private void jRadioButtonDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDobleActionPerformed
        // TODO add your handling code here:
        this.jSpinnerTotalP.setValue(1);
        this.jSpinnerTotalP.setModel(new SpinnerNumberModel(1, 1, 4, 1));
    }//GEN-LAST:event_jRadioButtonDobleActionPerformed

    private void jRadioButtonTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTripleActionPerformed
        // TODO add your handling code here:
        this.jSpinnerTotalP.setValue(1);
        this.jSpinnerTotalP.setModel(new SpinnerNumberModel(1, 1, 5, 1));
    }//GEN-LAST:event_jRadioButtonTripleActionPerformed

    private void jTextFieldSalidaDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSalidaDFocusGained
        // TODO add your handling code here:
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = this.jDateChooserIngreso.getCalendar();
        cal.add(Calendar.DAY_OF_MONTH, (int) this.jSpinnerTotalD.getValue());
        Date modifiedDate = cal.getTime();
        String date = dFormat.format(modifiedDate);
        this.jTextFieldSalidaD.setText(date);
    }//GEN-LAST:event_jTextFieldSalidaDFocusGained

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        /*
        COSAS A RECUPERAR DESDE FUERA:
            -NUMERO DE HABITACION (numHab)
            -COSTO DE LA HABITACION (costoHab)
            -
        */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        float costoHab = 1000;
        String nombre, ciudad;
        int tipo = 0, totalPersonas, totalDias, numHab;
        float costoExtra = 0;
        String inicio, salida;
        nombre = this.jTextFieldNombre.getText();
        ciudad = this.jTextFieldCiudad.getText();
        numHab = 100;
        totalDias = (int) this.jSpinnerTotalD.getValue();
        totalPersonas = (int) this.jSpinnerTotalP.getValue();
        inicio = sdf.format(this.jDateChooserIngreso.getDate());
        
        if(this.jRadioButtonSencilla.isSelected())
            tipo = 1;
        else if(this.jRadioButtonDoble.isSelected())
            tipo = 2;
        else if(this.jRadioButtonTriple.isSelected())
            tipo = 3;
       
        salida=this.jTextFieldSalidaD.getText();
        
        costoExtra=(costoHab*0.30f)*(totalPersonas-tipo);
        String parte1 = "Insert into clientes (NAME, CIUDAD, HABITACION, DIAS, TOTPERSONAS, COSTOEXTRA, INGRESO, SALIDA) VALUES (";
        String parte2 = "'"+nombre+"','"+ciudad+"','"+numHab+"','"+totalDias+"','"+totalPersonas+"','"+costoExtra+"','"+inicio+"','"+salida+"')";
        String query = parte1+parte2;
        int j=Menu.conn.Update(query);
        System.out.println("Numero de registros afectados por la accion: "+j);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSelHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSelHabActionPerformed

    private void jTextFieldSalidaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalidaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalidaDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonRecibo;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSelHab;
    private com.toedter.calendar.JDateChooser jDateChooserIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonDoble;
    private javax.swing.JRadioButton jRadioButtonSencilla;
    private javax.swing.JRadioButton jRadioButtonTriple;
    private javax.swing.JSpinner jSpinnerTotalD;
    private javax.swing.JSpinner jSpinnerTotalP;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalidaD;
    // End of variables declaration//GEN-END:variables
    class PanelIm extends JPanel {

        private Image fondo;
        private String ruta;
        
        public PanelIm(String ruta){
            this.fondo = null;
            this.ruta = ruta;
        }
        @Override
        public void paint(Graphics g) {
            fondo = new ImageIcon(ruta).getImage();
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);

            setOpaque(false);
            super.paint(g);
        }
    }
}
