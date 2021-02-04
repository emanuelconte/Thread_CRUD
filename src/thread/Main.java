
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Main extends javax.swing.JFrame {
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Main() {
        initComponents();
        //ListaPessoa = new ArrayList();
        setLocationRelativeTo(null);
        defaultSystem();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_sexo = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        label_nome = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        label_dataNasc = new javax.swing.JLabel();
        c_dataNasc = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        c_email = new javax.swing.JTextField();
        label_peso = new javax.swing.JLabel();
        c_peso = new javax.swing.JTextField();
        label_altura = new javax.swing.JLabel();
        c_altura = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        chb_masc = new javax.swing.JRadioButton();
        label_sexo = new javax.swing.JLabel();
        chb_fem = new javax.swing.JRadioButton();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        l_imc = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        label_id = new javax.swing.JLabel();
        c_id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        pessoasL = new javax.swing.JList<>();
        c_imc = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_nome.setText("Nome:");

        label_dataNasc.setText("Data de Nascimento:");

        label_email.setText("Email:");

        c_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_emailActionPerformed(evt);
            }
        });

        label_peso.setText("Peso:");

        label_altura.setText("Altura(cm):");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        grupo_sexo.add(chb_masc);
        chb_masc.setText("Masculino");

        label_sexo.setText("Sexo:");

        grupo_sexo.add(chb_fem);
        chb_fem.setText("Feminino");

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        l_imc.setText("IMC:");

        btn_excluir.setText("Excluir");
        btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_excluirMouseClicked(evt);
            }
        });

        label_id.setText("ID:");

        pessoasL.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pessoasLValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(pessoasL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(label_email)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label_id)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label_nome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label_dataNasc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label_sexo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chb_masc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(chb_fem))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label_altura)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btn_cancelar))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(label_peso)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(l_imc)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c_imc)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_id)
                    .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_dataNasc)
                    .addComponent(c_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_sexo)
                    .addComponent(chb_masc)
                    .addComponent(chb_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email)
                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_altura)
                    .addComponent(c_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_imc)
                    .addComponent(label_peso)
                    .addComponent(c_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_emailActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        Pessoa novaPessoa = getPessoa();
        if (isEdit) {
            PessoaRepository.editar(novaPessoa);
        } else {
            PessoaRepository.salva(novaPessoa);
        }
        c_imc.setText(String.format("%.2f",novaPessoa.getImc()));
        atualizaLista();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private Pessoa getPessoa() {
        String sexo = getSexo();
        final String nome = c_nome.getText();
        final String dataNasc = c_dataNasc.getText();
        final String email = c_email.getText();
        final Float peso = Float.valueOf(c_peso.getText());
        final int altura = Integer.valueOf(c_altura.getText());
        
        try {
            if (isEdit) {
                pessoaSelecionada.setNome(nome);
                pessoaSelecionada.setDataNasc(dataNasc);
                pessoaSelecionada.setEmail(email);
                pessoaSelecionada.setPeso(peso);
                pessoaSelecionada.setAltura(altura);
                pessoaSelecionada.setSexo(sexo);
                return pessoaSelecionada;
            }
            return new Pessoa(nome, dataNasc, email, peso, altura, sexo);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private String getSexo() {
        if(chb_masc.isSelected())
            return "Masculino";
        if(chb_fem.isSelected())
            return "Feminino";
        return "Nao Informado";
    }
    
    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        setSystem();
        isEdit = false;
        pessoaSelecionada = null;
        btn_salvar.setText("Salvar");
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        defaultSystem();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void pessoasLValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pessoasLValueChanged
        String selectedValue = pessoasL.getSelectedValue();
        btn_excluir.setEnabled(selectedValue != null);
        
        setSystem();
        isEdit = true;
        
        if (selectedValue == null)
            return;
        
        String id = selectedValue.split("-")[0].trim();
        
        pessoaSelecionada = PessoaRepository.busca(Long.valueOf(id));
        if(pessoaSelecionada == null) {
            return;
        }
        
        c_id.setText(String.valueOf(pessoaSelecionada.getId()));
        c_nome.setText(pessoaSelecionada.getNome());
        c_email.setText(pessoaSelecionada.getEmail());
        c_dataNasc.setText(pessoaSelecionada.getDataNasc());
        c_peso.setText(String.valueOf(pessoaSelecionada.getPeso()));
        c_altura.setText(String.valueOf(pessoaSelecionada.getAltura()));
        c_imc.setText(String.format("%.2f",pessoaSelecionada.getImc()));
        
        switch (pessoaSelecionada.getSexo()) {
            case "Masculino":
                chb_masc.setSelected(true);
                break;
            case "Feminino":
                chb_fem.setSelected(true);
                break;
            default:
                chb_fem.setSelected(false);
                chb_masc.setSelected(false);
                break;
        }
        
        btn_salvar.setText("Editar");
    }//GEN-LAST:event_pessoasLValueChanged

    private void btn_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_excluirMouseClicked
        PessoaRepository.excluir(pessoaSelecionada.getId());
        atualizaLista();
    }//GEN-LAST:event_btn_excluirMouseClicked
    
    private void defaultSystem(){
        atualizaLista();
        
        c_id.setText("");
        c_nome.setText("");
        c_email.setText("");
        c_dataNasc.setText("");
        c_peso.setText("");
        c_altura.setText("");
        
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        chb_masc.setEnabled(false);
        chb_fem.setEnabled(false);
        
        c_id.setEnabled(false);
        c_nome.setEnabled(false);
        c_email.setEnabled(false);
        c_dataNasc.setEnabled(false);
        c_altura.setEnabled(false);
        c_peso.setEnabled(false);
        c_imc.setEnabled(false);        
    }

    private void atualizaLista() {
        DefaultListModel lista = new DefaultListModel();
        PessoaRepository.todos().forEach((pessoa) -> {
            lista.addElement(pessoa);
        });
        pessoasL.setModel(lista);
    }
    
    private void setSystem(){        
        c_id.setText("");
        c_nome.setText("");
        c_email.setText("");
        c_dataNasc.setText("");
        c_peso.setText("");
        c_altura.setText("");
        c_imc.setText("");
        
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        chb_masc.setEnabled(true);
        chb_fem.setEnabled(true);
        
        c_nome.setEnabled(true);
        c_email.setEnabled(true);
        c_dataNasc.setEnabled(true);
        c_altura.setEnabled(true);
        c_peso.setEnabled(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private Pessoa pessoaSelecionada;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField c_altura;
    private javax.swing.JTextField c_dataNasc;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_id;
    private javax.swing.JTextField c_imc;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_peso;
    private javax.swing.JRadioButton chb_fem;
    private javax.swing.JRadioButton chb_masc;
    private javax.swing.ButtonGroup grupo_sexo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l_imc;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_dataNasc;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_peso;
    private javax.swing.JLabel label_sexo;
    private javax.swing.JList<String> pessoasL;
    // End of variables declaration//GEN-END:variables

    private boolean isEdit = false;
}
