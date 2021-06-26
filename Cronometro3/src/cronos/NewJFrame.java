/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class NewJFrame extends javax.swing.JFrame {

    private Timer tiempo;
    private int centecimassegundos, segundos, minutos, horas;
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            centecimassegundos++;
            if (centecimassegundos == 100) {
                segundos++;
                centecimassegundos = 0;
            }
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            actualizaretiqueta();
        }
    };

    public NewJFrame() {
        initComponents();
        tiempo = new Timer(10, acciones);
        actualizaretiqueta();
    }
private void actualizaretiqueta(){
    String texto =(horas<=9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+(segundos<=9?"0":"")+segundos+":"+(centecimassegundos<=9?"0":"")+centecimassegundos;
    etiquetanumero.setText(texto);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetacrono = new javax.swing.JLabel();
        etquietatexto = new javax.swing.JLabel();
        etiquetanumero = new javax.swing.JLabel();
        botonempezar = new javax.swing.JButton();
        botondetener = new javax.swing.JButton();
        botonpausar = new javax.swing.JButton();
        etiquetafondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRONOMETRO");
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetacrono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetacrono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N
        panel.add(etiquetacrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 250, 190));

        etquietatexto.setBackground(new java.awt.Color(102, 102, 102));
        etquietatexto.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        etquietatexto.setForeground(new java.awt.Color(0, 204, 204));
        etquietatexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etquietatexto.setText("CRONOMETRO");
        panel.add(etquietatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 690, 70));

        etiquetanumero.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        etiquetanumero.setForeground(new java.awt.Color(0, 0, 0));
        etiquetanumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetanumero.setText("00:00:00:00");
        panel.add(etiquetanumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 590, 110));

        botonempezar.setBackground(new java.awt.Color(0, 204, 153));
        botonempezar.setForeground(new java.awt.Color(0, 0, 0));
        botonempezar.setText("EMPEZAR");
        botonempezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonempezarActionPerformed(evt);
            }
        });
        panel.add(botonempezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 140, 50));

        botondetener.setBackground(new java.awt.Color(0, 204, 153));
        botondetener.setForeground(new java.awt.Color(0, 0, 0));
        botondetener.setText("DETENER");
        botondetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondetenerActionPerformed(evt);
            }
        });
        panel.add(botondetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 160, 50));

        botonpausar.setBackground(new java.awt.Color(0, 204, 153));
        botonpausar.setForeground(new java.awt.Color(0, 0, 0));
        botonpausar.setText("PAUSAR");
        botonpausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpausarActionPerformed(evt);
            }
        });
        panel.add(botonpausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, 180, 50));

        etiquetafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/niña.jpg"))); // NOI18N
        panel.add(etiquetafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 675));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonempezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonempezarActionPerformed
        tiempo.start();
        botonempezar.setEnabled(false);
        botonempezar.setText("REANUDAR");
        botondetener.setEnabled(true);
        botonpausar.setEnabled(true);
     
    }//GEN-LAST:event_botonempezarActionPerformed

    private void botondetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondetenerActionPerformed
       
      if(tiempo.isRunning()){
          tiempo.stop();
          botonempezar.setEnabled(true);
      }
        botondetener.setEnabled(false);
        botonempezar.setText("COMENZAR");
        botonpausar.setEnabled(true);
        centecimassegundos=0;
        minutos=0;
        segundos=0;
        horas=0;
        
    }//GEN-LAST:event_botondetenerActionPerformed

    private void botonpausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpausarActionPerformed
        tiempo.stop();
         botondetener.setEnabled(true);
        botonempezar.setEnabled(true);
        botonpausar.setEnabled(false);
    }//GEN-LAST:event_botonpausarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botondetener;
    private javax.swing.JButton botonempezar;
    private javax.swing.JButton botonpausar;
    private javax.swing.JLabel etiquetacrono;
    private javax.swing.JLabel etiquetafondo;
    private javax.swing.JLabel etiquetanumero;
    private javax.swing.JLabel etquietatexto;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
