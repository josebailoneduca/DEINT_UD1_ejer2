/*
 * LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 * Lista de paquetes:
 */
package ud1_ejer2;

import java.awt.Dimension;

/**
 * Ventana principal del ejercicio UD1-2
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //ATRIBUTOS DE CLASE
    /**
     * Ventana de ingreso
     */
    VentanaIngreso vIn;
    
    
    
    /**
     * Creates new form Ejer2VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnIngresaCantidad = new javax.swing.JButton();
        lbInfEuros = new javax.swing.JLabel();
        lbOutEuros = new javax.swing.JLabel();
        lbInfPts = new javax.swing.JLabel();
        lbOutPts = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Euros a Pesetas");
        setAutoRequestFocus(false);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 400));

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Conversor de Euros a Pesetas");

        btnIngresaCantidad.setText("Ingresa Cantidad");
        btnIngresaCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresaCantidadActionPerformed(evt);
            }
        });

        lbInfEuros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbInfEuros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfEuros.setText("Euros:");

        lbOutEuros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbInfPts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbInfPts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfPts.setText("Pesetas:");

        lbOutPts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIngresaCantidad)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbInfEuros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(lbOutEuros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInfPts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbOutPts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitulo)
                .addGap(66, 66, 66)
                .addComponent(btnIngresaCantidad)
                .addGap(18, 18, 18)
                .addComponent(lbInfEuros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbOutEuros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbInfPts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbOutPts, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    /**
     * Accion realizada tras pulsar el boton de Ingresa Cantidad
     * Limpia las etiquetas y abre un dialogo que pide la introduccion de la cantidad
     * 
     * @param evt Evento recibido
     */
    private void btnIngresaCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresaCantidadActionPerformed
        //crea la ventana de ingreso si aun no ha sido creada
        if (this.vIn==null)
            this.vIn = new VentanaIngreso(this, true);
        //configuracion inicial de la venta 
        this.lbOutEuros.setText("");
        this.lbOutPts.setText("");
        this.lbEstado.setText("");
        this.vIn.setLocationRelativeTo(this);
        //visualizacion de la ventana
        this.vIn.setVisible(true);
    }//GEN-LAST:event_btnIngresaCantidadActionPerformed

    
    
    /**
     * Calcula la conversion y gestiona la actualizacion de las etiquetas con la informacion
     * @param euros Euros a convertir
     */
    public void convertir(String textoEuros){
        this.vIn.setVisible(false);
        try {
            // conversion
            double euros = Double.parseDouble(textoEuros);
            double pesetas = euros*166.386;
            
            //actualizacion de etiquetas
            this.lbOutEuros.setText(""+euros);
            this.lbOutPts.setText(""+pesetas);
        } catch (NumberFormatException e) {
            //aviso de valor incorrecto
            this.lbEstado.setText("Cantidad erronea "+textoEuros);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               VentanaPrincipal ventanaPrincipal =  new VentanaPrincipal();
               ventanaPrincipal.setSize(new Dimension(300, 400));
               ventanaPrincipal.setLocationRelativeTo(null);
               ventanaPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresaCantidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbInfEuros;
    private javax.swing.JLabel lbInfPts;
    private javax.swing.JLabel lbOutEuros;
    private javax.swing.JLabel lbOutPts;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
