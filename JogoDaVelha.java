
package jogos;

import javax.swing.JOptionPane;

public class JogoDaVelha extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = true;
    
    int NumeroDeVitoriaDoJogador1 = 0;
    int NumeroDeVitoriaDoJogador2 = 0;
    int NumeroDeVitoriaDaVelha = 0;
    
    public JogoDaVelha() {
        initComponents();
    }
    
    public void JogadorAtivo(){
        
        if (Jogador1Ativo == true){
            Jogador1Ativo = false;
            Jogador2Ativo = true;
            
        } else{
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }
        
        JogadorVencedor("X");
        JogadorVencedor("O");
        
    }
    
    public void JogadorVencedor(String Jogador){
        
        if (B1.getText().equals(Jogador) &&
                B2.getText().equals(Jogador) &&
                B3.getText().equals(Jogador)) {
        if (B1.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if (B4.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B6.getText().equals(Jogador)) {
        if (B4.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if (B7.getText().equals(Jogador) &&
                B8.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
        if (B7.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        
        if (B1.getText().equals(Jogador) &&
                B4.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
        if (B1.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if (B2.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B8.getText().equals(Jogador)) {
        if (B2.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if (B3.getText().equals(Jogador) &&
                B6.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
        if (B3.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if (B1.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
        if (B1.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if (B3.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
        if (B3.getText().equals("X"))
            Vencedor ("Jogador 1");
         else 
            Vencedor ("Jogador 2");
        }
        if ( !B1.getText().equals("") &&
                !B2.getText().equals("") &&
                !B3.getText().equals("") &&
                !B4.getText().equals("") &&
                !B5.getText().equals("") &&
                !B6.getText().equals("") &&
                !B7.getText().equals("") &&
                !B8.getText().equals("") &&
                !B9.getText().equals("")) {
        Vencedor ("Empate");
    }
                
    }
    
    public void Vencedor(String JogadorVencedor) {
        
        if (JogadorVencedor.equals("Jogador 1")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Jogador 1 Venceu");
            NumeroDeVitoriaDoJogador1++;
            NumeroDeVitoriasDoJogador1.setText("Número de vitórias: "+NumeroDeVitoriaDoJogador1);
            LimparCampos();
            
        }
        if (JogadorVencedor.equals("Jogador 2")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Jogador 2 Venceu");
            NumeroDeVitoriaDoJogador2++;
            NumeroDeVitoriasDoJogador2.setText("Número de vitórias: "+NumeroDeVitoriaDoJogador2);
            LimparCampos();
        }
        if (JogadorVencedor.equals("Empate")) {
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Deu Velha!");
            NumeroDeVitoriaDaVelha++;
            NumeroDeVitoriasDaVelha.setText("Número de vitórias: "+NumeroDeVitoriaDaVelha);
            LimparCampos();
    }
    }
    public void LimparCampos() {
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        
        Jogador1Ativo = true;
        Jogador2Ativo = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        NumeroDeVitoriasDaVelha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        B1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do jogo"));

        jLabel1.setText("Jogador 1 (x)");

        NumeroDeVitoriasDoJogador1.setText("Número de vitórias: 0");

        jLabel3.setText("Jogador 2 (o)");

        NumeroDeVitoriasDoJogador2.setText("Número de vitórias: 0");

        jLabel5.setText("Velha (empate)");

        NumeroDeVitoriasDaVelha.setText("Número de vitórias: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NumeroDeVitoriasDoJogador1)
                            .addComponent(jLabel3)
                            .addComponent(NumeroDeVitoriasDoJogador2)
                            .addComponent(jLabel5)
                            .addComponent(NumeroDeVitoriasDaVelha))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDoJogador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDoJogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDaVelha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        if (Jogador1Ativo == true) {
            if (B1.getText().equals("")) {
                B1.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B1.getText().equals("")) {
                B1.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B2.getText().equals("")) {
                B2.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B2.getText().equals("")) {
                B2.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B3.getText().equals("")) {
                B3.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B3.getText().equals("")) {
                B3.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B4.getText().equals("")) {
                B4.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B4.getText().equals("")) {
                B4.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B5.getText().equals("")) {
                B5.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B5.getText().equals("")) {
                B5.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B6.getText().equals("")) {
                B6.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B6.getText().equals("")) {
                B6.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B7.getText().equals("")) {
                B7.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B7.getText().equals("")) {
                B7.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B8.getText().equals("")) {
                B8.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B8.getText().equals("")) {
                B8.setText("O");
                JogadorAtivo();
            }
        }
        
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        
        if (Jogador1Ativo == true) {
            if (B9.getText().equals("")) {
                B9.setText("X");
                JogadorAtivo();
            }
        }
        else {
            if (B9.getText().equals("")) {
                B9.setText("O");
                JogadorAtivo();
            }
        }

    }//GEN-LAST:event_B9ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel NumeroDeVitoriasDaVelha;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador1;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
