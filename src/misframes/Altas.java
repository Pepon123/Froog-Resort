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
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
    private static int tipo;
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
        jTextFieldHabitacion = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setText("Información de Huésped");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 25, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelNombre.setText("Nombre Completo:");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, -1, -1));

        jLabelCiudad.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelCiudad.setText("Ciudad de Origen:");
        jPanel1.add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Información de Habitación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 183, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel3.setText("Total de Personas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 313, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel4.setText("Tipo de Habitación:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 232, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 405, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 25, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setText("Estancia en el Hotel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 405, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel7.setText("Fecha de ingreso: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 502, -1, -1));

        jButtonSelHab.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonSelHab.setText("Seleccionar Habitación");
        jButtonSelHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelHabActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSelHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 355, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel8.setText("Fecha de salida:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 550, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel9.setText("Total de días:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 454, -1, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldNombre.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 74, 305, 34));

        jSpinnerTotalD.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jSpinnerTotalD.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jSpinnerTotalD.setOpaque(false);
        jPanel1.add(jSpinnerTotalD, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 454, 305, -1));

        jTextFieldCiudad.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldCiudad.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldCiudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 115, 305, 34));

        jSpinnerTotalP.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jSpinnerTotalP.setOpaque(false);
        jPanel1.add(jSpinnerTotalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 314, 305, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 596, -1, -1));

        jButtonRecibo.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonRecibo.setText("Recibo");
        jPanel1.add(jButtonRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 596, 107, -1));

        jDateChooserIngreso.setDateFormatString("yyyy-MM-dd");
        jDateChooserIngreso.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jPanel1.add(jDateChooserIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 499, 305, 35));

        buttonGroupTipo.add(jRadioButtonTriple);
        jRadioButtonTriple.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButtonTriple.setText("Triple");
        jRadioButtonTriple.setOpaque(false);
        jRadioButtonTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTripleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonTriple, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 267, 91, -1));

        buttonGroupTipo.add(jRadioButtonSencilla);
        jRadioButtonSencilla.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButtonSencilla.setText("Sencilla");
        jRadioButtonSencilla.setOpaque(false);
        jRadioButtonSencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSencillaActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonSencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 267, -1, -1));

        buttonGroupTipo.add(jRadioButtonDoble);
        jRadioButtonDoble.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jRadioButtonDoble.setText("Doble");
        jRadioButtonDoble.setOpaque(false);
        jRadioButtonDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDobleActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 267, 91, -1));

        jTextFieldSalidaD.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jTextFieldSalidaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalidaDActionPerformed(evt);
            }
        });
        jTextFieldSalidaD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSalidaDFocusGained(evt);
            }
        });
        jPanel1.add(jTextFieldSalidaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 547, 305, 27));

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabel10.setText("Numero Habitacion: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 359, -1, -1));

        jTextFieldHabitacion.setEditable(false);
        jTextFieldHabitacion.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jPanel1.add(jTextFieldHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 70, 30));

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
        tipo=1;
    }//GEN-LAST:event_jRadioButtonSencillaActionPerformed

    private void jRadioButtonDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDobleActionPerformed
        // TODO add your handling code here:
        this.jSpinnerTotalP.setValue(1);
        this.jSpinnerTotalP.setModel(new SpinnerNumberModel(1, 1, 4, 1));
        tipo=2;
    }//GEN-LAST:event_jRadioButtonDobleActionPerformed

    private void jRadioButtonTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTripleActionPerformed
        // TODO add your handling code here:
        this.jSpinnerTotalP.setValue(1);
        this.jSpinnerTotalP.setModel(new SpinnerNumberModel(1, 1, 5, 1));
        tipo=3;
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
        int totalPersonas, totalDias;
        float costoExtra = 0;
        String inicio, salida;
        nombre = this.jTextFieldNombre.getText();
        ciudad = this.jTextFieldCiudad.getText();
        totalDias = (int) this.jSpinnerTotalD.getValue();
        totalPersonas = (int) this.jSpinnerTotalP.getValue();
        inicio = sdf.format(this.jDateChooserIngreso.getDate());
        
       
        salida=this.jTextFieldSalidaD.getText();
        
        costoExtra=(costoHab*0.30f)*(totalPersonas-tipo);
        String parte1 = "Insert into clientes (NAME, CIUDAD, HABITACION, DIAS, TOTPERSONAS, COSTOEXTRA, INGRESO, SALIDA) VALUES (";
        String parte2 = "'"+nombre+"','"+ciudad+"','"+seleccionada+"','"+totalDias+"','"+totalPersonas+"','"+costoExtra+"','"+inicio+"','"+salida+"')";
        String query = parte1+parte2;
        int j=Menu.conn.Update(query);
        
        System.out.println("Numero de registros afectados por la accion: "+j);
        
        String query2="Update habitaciones set DISPONIBLE= '1' where HABITACION = "+ seleccionada;
        Menu.conn.Update(query2);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSelHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelHabActionPerformed
        // TODO add your handling code here:
        String query = "select * from habitaciones where tipo = " + "'" + tipo + "' and disponible = " + "'" + 0 + "'";
        Menu.conn.Consult(query);
        int n = 0;
        try {
            Menu.conn.rs.last();
            n = Menu.conn.rs.getRow();
            Menu.conn.rs.first();
        } catch (Exception e) {
            System.out.println("Error #1...");
        }
        if (n != 0) {
            this.repaint();
            EsquemaPisos pisos = new EsquemaPisos(tipo);
            Menu.jDesktopPane1.add(pisos);
            pisos.toFront();
            pisos.show();
            pisos.pack();
        }else{
            JOptionPane.showMessageDialog(this,"No hay habitaciones disponibles");
        }

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
    public static javax.swing.JTextField jTextFieldHabitacion;
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
