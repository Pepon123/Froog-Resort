/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package portadas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
        Connection aux=null;
        public Connection conexion(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                aux=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return aux;
        }
}
