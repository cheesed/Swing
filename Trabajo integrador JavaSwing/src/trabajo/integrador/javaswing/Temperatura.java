/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajo.integrador.javaswing;

import javax.swing.JOptionPane;

/**
 *
 * @author Info7
 */
public class Temperatura extends javax.swing.JFrame {

    /**
     * Creates new form Temperatura
     */
    public Temperatura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboMedia = new javax.swing.ButtonGroup();
        cboMedida = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JTextField();
        cmdConvertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optCelsius = new javax.swing.JCheckBox();
        optFahrenheit = new javax.swing.JCheckBox();
        optKelvin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));

        jLabel1.setText("De grados");

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        jLabel2.setText("Temperatura es");

        cmdConvertir.setText("Convertir");
        cmdConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirActionPerformed(evt);
            }
        });

        jLabel3.setText("Convertir a grados");

        jLabel4.setText("Temperatura");

        cboMedia.add(optCelsius);
        optCelsius.setText("Celsius");

        cboMedia.add(optFahrenheit);
        optFahrenheit.setText("Fahrenheit");

        cboMedia.add(optKelvin);
        optKelvin.setText("Kelvin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(cboMedida, 0, 191, Short.MAX_VALUE)
                        .addComponent(txtTemp)
                        .addComponent(lblResultado)
                        .addComponent(cmdConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(optCelsius)
                    .addComponent(optFahrenheit)
                    .addComponent(optKelvin))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(optCelsius)))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(optFahrenheit)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(optKelvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdConvertir)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirActionPerformed
        String resultado = null;
        double temp=0;
        Conversora convertir= new Conversora();
        if(txtTemp.getText().length()!=0){
            temp=Double.parseDouble(txtTemp.getText());
            if (cboMedida.getSelectedItem().toString().equals("Celsius")&&
                    optFahrenheit.isSelected()){
                resultado=String.valueOf(convertir.CelsiusToFahrenheit(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Celsius")&&
                    optKelvin.isSelected()){
                resultado=String.valueOf(convertir.CelsiusToKelvin(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")&&
                    optCelsius.isSelected()){
                resultado=String.valueOf(convertir.FahrenheitToCelsius(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")&&
                    optKelvin.isSelected()){
                resultado=String.valueOf(convertir.FahrenheitToKelvin(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Kelvin")&&
                    optCelsius.isSelected()){
                resultado=String.valueOf(convertir.KelvinToCelsius(temp));
            }
            if (cboMedida.getSelectedItem().toString().equals("Kelvin")&&
                    optFahrenheit.isSelected()){
                resultado=String.valueOf(convertir.KelvinToFahrenheit(temp));
            }
            lblResultado.setText(resultado);   
        }
        else{
            JOptionPane.showMessageDialog(null,"debe ingresar un valor de temperatura");
        } 
    }//GEN-LAST:event_cmdConvertirActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        
    }//GEN-LAST:event_txtTempActionPerformed

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
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup cboMedia;
    private javax.swing.JComboBox<String> cboMedida;
    private javax.swing.JButton cmdConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lblResultado;
    private javax.swing.JCheckBox optCelsius;
    private javax.swing.JCheckBox optFahrenheit;
    private javax.swing.JCheckBox optKelvin;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}