/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Oopassignment {

  public static Connection con() {
        String username = "root";
        String password = "root";
          
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopassignment?zeroDateTimeBehavior=CONVERT_TO_NULL",username,password);
          return conn;
          
      }catch(Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
      
      return null;
  }
}
