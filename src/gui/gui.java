/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author squoz
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import fis11_rmi.Variables;
import fis11_rmi.IRemoteSolve;
import java.awt.Color;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class gui extends javax.swing.JFrame {

    private Registry registry = null;
    private IRemoteSolve remoteServer = null;

    public gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldServerName = new javax.swing.JTextField();
        jLabelY = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonSolve = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldServerAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldServerPort = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FIS RMI");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Вариант.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 276);

        jTextFieldServerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldServerName.setText("calc");
        getContentPane().add(jTextFieldServerName);
        jTextFieldServerName.setBounds(410, 390, 180, 32);

        jLabelY.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelY.setText("Y =");
        getContentPane().add(jLabelY);
        jLabelY.setBounds(190, 320, 220, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("X =");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 290, 30, 17);

        jTextFieldX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldX);
        jTextFieldX.setBounds(40, 290, 90, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("A =");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 290, 30, 17);

        jTextFieldA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldA);
        jTextFieldA.setBounds(270, 290, 90, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Имя:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 390, 38, 17);

        jButtonSolve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSolve.setText("Решить");
        jButtonSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSolve);
        jButtonSolve.setBounds(20, 350, 220, 30);

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setText("Очистить");
        jButtonClear.setMaximumSize(new java.awt.Dimension(87, 25));
        jButtonClear.setMinimumSize(new java.awt.Dimension(87, 25));
        jButtonClear.setPreferredSize(new java.awt.Dimension(87, 25));
        jButtonClear.setRequestFocusEnabled(false);
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear);
        jButtonClear.setBounds(370, 350, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("B =");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 290, 30, 17);

        jTextFieldB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldB);
        jTextFieldB.setBounds(490, 290, 90, 32);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Адрес сервера:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 395, 130, 15);

        jTextFieldServerAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldServerAddress.setText("localhost");
        getContentPane().add(jTextFieldServerAddress);
        jTextFieldServerAddress.setBounds(130, 390, 110, 32);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Порт:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 390, 46, 17);

        jTextFieldServerPort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldServerPort.setText("1100");
        getContentPane().add(jTextFieldServerPort);
        jTextFieldServerPort.setBounds(300, 390, 60, 32);

        setSize(new java.awt.Dimension(617, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolveActionPerformed
        try {

            int port = IRemoteSolve.PORT;
            String name = IRemoteSolve.SERVICE_NAME;
            String address = "localhost";
            if (registry == null || remoteServer == null) {
                System.out.println("Подключение...");
                registry = LocateRegistry.getRegistry(address, port);
                //ystem.out.println("Подключение2...");
                remoteServer = (IRemoteSolve) registry.lookup(name);
                System.out.println("Подключено к //" + address + ":" + port + "/" + name);
            }

            double a = Double.parseDouble(jTextFieldA.getText());
            double b = Double.parseDouble(jTextFieldB.getText());
            double x = Double.parseDouble(jTextFieldX.getText());
            Variables data = new Variables(a, b, x);
            data = (Variables) remoteServer.getData(data);

            jLabelY.setText(String.format("Ответ: Y = %.3f", data.getY()));

        } catch (NumberFormatException | NotBoundException | RemoteException e) {
            jLabelY.setText("Ошибка");
            jLabelY.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButtonSolveActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldA.setText("");
        jTextFieldB.setText("");
        jTextFieldX.setText("");
        jLabelY.setText("Ответ: Y = ");
        jLabelY.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonClearActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSolve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelY;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldServerAddress;
    private javax.swing.JTextField jTextFieldServerName;
    private javax.swing.JTextField jTextFieldServerPort;
    private javax.swing.JTextField jTextFieldX;
    // End of variables declaration//GEN-END:variables
}
