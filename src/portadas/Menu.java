
package portadas;

import basededatos.Habitacion;
import basededatos.MySqlConn;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import javax.swing.JPanel;
import misframes.Bajas;
import misframes.Altas;
import misframes.ConsultasGraficas;

public class Menu extends javax.swing.JFrame {

    public static MySqlConn conn;
    private ArrayList <Habitacion> habitaciones = new ArrayList();
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        conn= new MySqlConn(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new PanelIm("src/imagenes/menu.jpg");
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuSalida = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuCambios = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuRegistro.setText("Registro");
        jMenuRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRegistroMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuRegistro);

        jMenuSalida.setText("Salida");
        jMenuSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalida);

        jMenuConsultas.setText("Consultas");

        jMenuItem1.setText("Galería");
        jMenuConsultas.add(jMenuItem1);

        jMenuItem2.setText("Ingresos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem2);

        jMenuItem3.setText("(%) Ocupación por tipo de Habitación");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem3);

        jMenuItem4.setText("Gráfica sobre tipo de Habitaciones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem4);

        jMenuItem5.setText("(%) Ocupación del Hotel");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem5);

        jMenuItem6.setText("Costos de Habitaciones");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem6);

        jMenuItem7.setText("Consulta por Nombre");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem7);

        jMenuItem8.setText("Consultar Habitación");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem8);

        jMenuItem9.setText("Consulta por Piso");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem9);

        jMenuItem10.setText("Información sobre Huespedes");
        jMenuConsultas.add(jMenuItem10);

        jMenuItem11.setText("Consultar Empleados");
        jMenuConsultas.add(jMenuItem11);

        jMenuBar1.add(jMenuConsultas);

        jMenuCambios.setText("Cambios");
        jMenuBar1.add(jMenuCambios);

        jMenuSalir.setText("Salir del Programa");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked

        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRegistroMouseClicked
        // TODO add your handling code here:
        //this.removeAll();
        //this.jPanel1.repaint();
        this.repaint();
        //this.jPanel1.repaint();
        Altas altas = new Altas();
        this.jDesktopPane1.add(altas);
        try{
            altas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        altas.show();
    }//GEN-LAST:event_jMenuRegistroMouseClicked

    private void jMenuSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalidaMouseClicked
        // TODO add your handling code here:
        
        this.repaint();
        Bajas salida = new Bajas();
        this.jDesktopPane1.add(salida);
        try {
            salida.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        salida.show();
        
    }//GEN-LAST:event_jMenuSalidaMouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog(this, "Por favor, inserte el nombre del huesped que desea consultar: ");
        String query= "select * from clientes where NAME= "+"'"+nombre+"'";
        Menu.conn.Consult(query);
        try {
            String nom = Menu.conn.rs.getString(1);
            int hab = Menu.conn.rs.getInt(3);
            int piso = hab/100;
            JOptionPane.showMessageDialog(this,"Huesped: "+nom+"\nHabitación: "+hab+"\nPiso: "+piso,"Cliente encontrado.",PLAIN_MESSAGE);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog( null, "El cliente insertado no existe.", "Inserta otro nombre.", ERROR_MESSAGE); 
        }
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        int hab = 0;
        try{
            hab = Integer.parseInt(JOptionPane.showInputDialog(this, "Por favor, inserte número de habitación a consultar: "));
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog( null, "El formato de ingreso no es correcto (Debe de ser un número).", "Inserta otro número.", ERROR_MESSAGE); 
            return;
        }
        String query= "select * from clientes where HABITACION= "+"'"+hab+"'";
        Menu.conn.Consult(query);
        try {
            String nom = Menu.conn.rs.getString(1);
            JOptionPane.showMessageDialog(this,"Huesped que reside en la habitación: "+nom,"Cliente encontrado.",PLAIN_MESSAGE);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog( null, "La habitación que insertaste se encuentra desocupada.", "Inserta otro número.", ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Sencilla: $3000\nDoble: $5000\nTriple: $9000 ","Costos de Habitaciones.",PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        String ingreTotales=""; 
        
        try {
            FileReader entrada=new FileReader("ingresos.txt");
            int c=0;

            while(c!=-1) {
                c=entrada.read();
                char letra=(char)c;
                ingreTotales+=letra;
            }

                entrada.close();
                
          } catch (IOException e) {

            System.out.println("No se ha encontrado el archivo");
        }       
        
        JOptionPane.showMessageDialog(null, "El total de ingresos generados \n hasta el momento por el hotel es de: $"+ingreTotales);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        String piso="";
        String sencilla= "", doble= "", triple= "";
        String query="";
        int n = 0;
        
        while(!piso.equals("1") && !piso.equals("2")){
            piso= JOptionPane.showInputDialog(null,"¿Sobre cuál piso deseas consultar la disponibilidad  de habitaciones? ");
          
            if(!piso.equals("1") && !piso.equals("2"))
                 JOptionPane.showMessageDialog(this, "Dato incorrecto");
        }   
            
        if (piso.equals("1"))
            query = "select * from habitaciones where Habitacion <" + "'" + 200 + "' and disponible = " + "'" + 0 + "'";
            
         else    
             query = "select * from habitaciones where Habitacion >" + "'" + 200 + "' and disponible = " + "'" + 0 + "'";
         
        Menu.conn.Consult(query);
        
        try {
            Menu.conn.rs.last();
            n = Menu.conn.rs.getRow();
            Menu.conn.rs.first();
            
        } catch (Exception e) {
            System.out.println("Error #1...");
        }
        
        if (n != 0) {

            int tipohab;
            for (int i = 0; i < n; i++) {
      
                try{
                    tipohab = Menu.conn.rs.getInt(1);
                
                    if(tipohab==1)
                       sencilla+="  "+ Menu.conn.rs.getInt(2)+"  ,";
                    
                    if(tipohab==2)
                        doble+="  "+Menu.conn.rs.getInt(2)+"  ,";
                    
                    if(tipohab==3)
                        triple+="  "+Menu.conn.rs.getInt(2)+"  ,";
                    
                    Menu.conn.rs.next();
                } catch (Exception e){
                    System.out.println("Error #2...");
                }
            }
        }
        
        JOptionPane.showMessageDialog(this, "En el piso "+piso+ " están disponibles:\n"+
                "Sencillas: "+sencilla+"\n"+"Dobles: "+doble+"\n"+"Triples: "+triple);
        System.out.println("Sencilla  "+sencilla);
        System.out.println("doble   "+doble);
        System.out.println("triple   "+triple);
                
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        ConsultasGraficas consultas= new ConsultasGraficas(1);
        this.jDesktopPane1.add(consultas);
        try{
            consultas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultas.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        ConsultasGraficas consultas= new ConsultasGraficas(2);
        this.jDesktopPane1.add(consultas);
        try{
            consultas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultas.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        this.repaint();
        //this.jPanel1.repaint();
        ConsultasGraficas consultas= new ConsultasGraficas(3);
        this.jDesktopPane1.add(consultas);
        try{
            consultas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultas.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCambios;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuSalida;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
