/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_adminde_juguetería;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author angel
 */
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    public Factura() {
        initComponents();

        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Utileria_Admin/Fondo2.JPG"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabel1.getWidth(),
                jLabel1.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLabel1.setIcon(iconoEscalado);

        ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/Utileria_Admin/mcqueen_Ju.JPG"));
        Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(jLabel4.getWidth(),
                jLabel4.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado1 = new ImageIcon(imgEscalada1);
        jLabel4.setIcon(iconoEscalado1);

        //----------------------------//
        ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Utileria_Admin/Spider-Man.JPG"));
        Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(jLabel5.getWidth(),
                jLabel5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        jLabel5.setIcon(iconoEscalado2);

        //----------------------------//
        ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Utileria_Admin/Link.PNG"));
        Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(jLabel3.getWidth(),
                jLabel3.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        jLabel3.setIcon(iconoEscalado3);

        //----------------------------//
        ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Utileria_Admin/Nerf.JPG"));
        Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(jLabel7.getWidth(),
                jLabel7.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
        jLabel7.setIcon(iconoEscalado4);

        //----------------------------//
        ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Utileria_Admin/Bowser.JPG"));
        Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(jLabel8.getWidth(),
                jLabel8.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
        jLabel8.setIcon(iconoEscalado5);

        //----------------------------//
        ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Utileria_Admin/Kirby.JPEG"));
        Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(jLabel6.getWidth(),
                jLabel6.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado6 = new ImageIcon(imgEscalada6);
        jLabel6.setIcon(iconoEscalado6);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Que desea compra???");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 100, 100));

        jLabel4.setText("jLabel3");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 100));

        jLabel5.setText("jLabel3");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 100, 100));

        jLabel6.setText("jLabel3");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 100, 100));

        jLabel7.setText("jLabel3");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, 100));

        jLabel8.setText("jLabel3");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 100, 100));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String url = "jdbc:mariadb://127.0.0.1:3306/admin_jugueteria";
        String usuario = "root";
        String contraseña = "1234";
        Connection conexion = null;

        Date fechaHoraActual = new Date();
        java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual.getTime());
        java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual.getTime());

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                String consultaSQL = "INSERT INTO administracion (ID, Nombre, Precio,fecha,hora) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Rayo McQueen");
                preparedStatement.setInt(3, 190);
                preparedStatement.setDate(4, fechaSQL);
                preparedStatement.setTime(5, horaSQL);

                // Ejecutar la consulta
                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa: Se han agregado " + filasAfectadas + " filas a la tabla.");
                } else {
                    System.out.println("No se ha podido insertar el registro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String url = "jdbc:mariadb://127.0.0.1:3306/admin_jugueteria";
        String usuario = "root";
        String contraseña = "1234";
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            Date fechaHoraActual = new Date();
            java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual.getTime());
            java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual.getTime());
            if (conexion != null) {
                String consultaSQL = "INSERT INTO administracion (ID, Nombre, Precio,fecha,hora) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                preparedStatement.setInt(1, 2);
                preparedStatement.setString(2, "Spider-Man 2");
                preparedStatement.setInt(3, 217);
                preparedStatement.setDate(4, fechaSQL);
                preparedStatement.setTime(5, horaSQL);

                // Ejecutar la consulta
                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa: Se han agregado " + filasAfectadas + " filas a la tabla.");
                } else {
                    System.out.println("No se ha podido insertar el registro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String url = "jdbc:mariadb://127.0.0.1:3306/admin_jugueteria";
        String usuario = "root";
        String contraseña = "1234";
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            Date fechaHoraActual = new Date();
            java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual.getTime());
            java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual.getTime());

            if (conexion != null) {
                String consultaSQL = "INSERT INTO administracion (ID, Nombre, Precio,fecha,hora) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                preparedStatement.setInt(1, 3);
                preparedStatement.setString(2, "Amiibo Link");
                preparedStatement.setInt(3, 335);
                preparedStatement.setDate(4, fechaSQL);
                preparedStatement.setTime(5, horaSQL);
                // Ejecutar la consulta
                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa: Se han agregado " + filasAfectadas + " filas a la tabla.");
                } else {
                    System.out.println("No se ha podido insertar el registro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String url = "jdbc:mariadb://127.0.0.1:3306/admin_jugueteria";
        String usuario = "root";
        String contraseña = "1234";
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            Date fechaHoraActual = new Date();
            java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual.getTime());
            java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual.getTime());

            if (conexion != null) {
                String consultaSQL = "INSERT INTO administracion (ID, Nombre, Precio,fecha,hora) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                preparedStatement.setInt(1, 6);
                preparedStatement.setString(2, "Kirby");
                preparedStatement.setInt(3, 300);
                preparedStatement.setDate(4, fechaSQL);
                preparedStatement.setTime(5, horaSQL);

                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa: Se han agregado " + filasAfectadas + " filas a la tabla.");
                } else {
                    System.out.println("No se ha podido insertar el registro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String url = "jdbc:mariadb://127.0.0.1:3306/admin_jugueteria";
        String usuario = "root";
        String contraseña = "1234";
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            Date fechaHoraActual = new Date();
            java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual.getTime());
            java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual.getTime());

            if (conexion != null) {
                String consultaSQL = "INSERT INTO administracion (ID, Nombre, Precio,fecha,hora) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                preparedStatement.setInt(1, 4);
                preparedStatement.setString(2, "Nerf");
                preparedStatement.setInt(3, 250);
                preparedStatement.setDate(4, fechaSQL);
                preparedStatement.setTime(5, horaSQL);

                // Ejecutar la consulta
                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa: Se han agregado " + filasAfectadas + " filas a la tabla.");
                } else {
                    System.out.println("No se ha podido insertar el registro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String url = "jdbc:mariadb://127.0.0.1:3306/admin_jugueteria";
        String usuario = "root";
        String contraseña = "1234";
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            Date fechaHoraActual = new Date();
            java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual.getTime());
            java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual.getTime());
            if (conexion != null) {
                String consultaSQL = "INSERT INTO administracion (ID, Nombre, Precio,fecha,hora) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                preparedStatement.setInt(1, 5);
                preparedStatement.setString(2, "Bowser");
                preparedStatement.setInt(3, 300);
                preparedStatement.setDate(4, fechaSQL);
                preparedStatement.setTime(5, horaSQL);
                // Ejecutar la consulta
                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa: Se han agregado " + filasAfectadas + " filas a la tabla.");
                } else {
                    System.out.println("No se ha podido insertar el registro.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu ver = new Menu();
        ver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
