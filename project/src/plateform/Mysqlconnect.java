package plateform;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Mysqlconnect {
    Connection conn=null;
    public static Connection connectdb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/projetDesign","root","");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
