
package mangaarchive.vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import mangaarchive.bd.*;
import mangaarchive.controlador.*;
import mangaarchive.modelo.*;

public class Main extends javax.swing.JFrame {

    MangaDTO manga = new MangaDTO();
    RegistroManga registroManga = new RegistroManga();
    RegistroAutor registroAutor = new RegistroAutor();
    RegistroDemografia registroDemografia = new RegistroDemografia();
    RegistroTipoGenero registroTipoGenero = new RegistroTipoGenero();
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null); //CENTRA LA VENTANA
        
        
        RellenarComboBox("nacionalidad", "pais", cboCountry);
        cboCountry.setSelectedItem("Japón"); //Japón default
        
        RellenarComboBox("demografia", "nombre", cboDemo);
        RellenarComboBox("tipo_genero", "nombre", cboGenre);
        mostrarManga();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mangaLabel = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        demographicLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        mangaAddButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboDemo = new javax.swing.JComboBox<>();
        mangaLabel1 = new javax.swing.JLabel();
        mangaLabel2 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        mangaLabel3 = new javax.swing.JLabel();
        cboCountry = new javax.swing.JComboBox<>();
        txtManga = new javax.swing.JTextField();
        cboGenre = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManga = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        clearButton2 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        clearButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        clearButton4 = new javax.swing.JButton();
        clearButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANGA ARCHIVE");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mangaLabel.setText("Manga:");
        jPanel1.add(mangaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 59, -1, -1));

        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 157, -1));

        authorLabel.setText("Autor:");
        jPanel1.add(authorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 102, -1, -1));

        demographicLabel.setText("Demografia:");
        jPanel1.add(demographicLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        priceLabel.setText("Precio:");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 157, -1));

        mangaAddButton.setText("Ingresar");
        mangaAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangaAddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(mangaAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 80, -1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel1.setText("MANGA ARCHIVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 12, -1, -1));

        cboDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDemoActionPerformed(evt);
            }
        });
        jPanel1.add(cboDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 160, -1));

        mangaLabel1.setText("Año:");
        jPanel1.add(mangaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        mangaLabel2.setText("País:");
        jPanel1.add(mangaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 157, -1));

        mangaLabel3.setText("Genero:");
        jPanel1.add(mangaLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        cboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCountryActionPerformed(evt);
            }
        });
        jPanel1.add(cboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 157, -1));

        txtManga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMangaActionPerformed(evt);
            }
        });
        jPanel1.add(txtManga, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 56, 157, -1));

        cboGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenreActionPerformed(evt);
            }
        });
        jPanel1.add(cboGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 137, 157, -1));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, 20));

        tblManga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Precio", "Autor", "Demografia"
            }
        ));
        jScrollPane1.setViewportView(tblManga);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        clearButton2.setText("Modificar");
        clearButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton2ActionPerformed(evt);
            }
        });

        clearButton.setText("Eliminar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar(evt);
            }
        });

        clearButton3.setText("Buscar");
        clearButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton3ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        clearButton4.setText("Ver tomos");
        clearButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton4ActionPerformed(evt);
            }
        });

        clearButton5.setText("Filtros");
        clearButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(clearButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton2)
                    .addComponent(clearButton)
                    .addComponent(clearButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton4)
                    .addComponent(clearButton5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void btnEliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar
        /*
        manga = registroManga.buscarPorId(Integer.parseInt(this.txtxId.getText()));
        if(manga.getId()!=0){
            if(registroManga.eliminarManga(Integer.parseInt(this.txtxId.getText()))){
                JOptionPane.showMessageDialog(rootPane, "manga eliminado","Comprobacion de datos",JOptionPane.INFORMATION_MESSAGE);
                mostrarManga();
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se eliminó manga de la BD", "Comprobación de Datos", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Manga no existe", "Comprobación de Datos", JOptionPane.ERROR_MESSAGE); 
        }
        */
    }//GEN-LAST:event_btnEliminar

    private void mangaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangaAddButtonActionPerformed

        if(!this.txtAuthor.getText().isBlank()){
            if(!this.txtPrice.getText().isBlank()){
                manga = registroManga.buscarPorId(Integer.parseInt(this.txtxId.getText()));
                if(manga.getId()==0){
                    manga.setId(Integer.parseInt(this.txtxId.getText()));
                    manga.setTitulo(this.txtAuthor.getText());
                    manga.setPrecio(Integer.parseInt(this.txtPrice.getText()));
                    manga.setAutorID(this.cboAuthor.getSelectedItem());
                    manga.setDemografiaID(Integer.parseInt(this.cboDemo.getSelectedItem().toString().substring(0,1)));
                    if(registroManga.addManga(manga)){
                        JOptionPane.showMessageDialog(rootPane, "Manga agregado con exito!!!","Comprobacion de Datos",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "No se agrego manga a la BD","Comprobacion de Datos",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "MANGA YA EXISTE!!!", "Comprobación de Datos", JOptionPane.ERROR_MESSAGE); 
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Precio es obligatorio", "Comprobación de Datos", JOptionPane.ERROR_MESSAGE); 
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Titulo es obligatorio", "Comprobación de Datos", JOptionPane.ERROR_MESSAGE); 
        }
        mostrarManga();
    }//GEN-LAST:event_mangaAddButtonActionPerformed

    private void clearButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButton2ActionPerformed

    private void clearButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void clearButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButton4ActionPerformed

    private void clearButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButton5ActionPerformed

    private void cboDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDemoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDemoActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void cboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCountryActionPerformed

    private void txtMangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMangaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMangaActionPerformed

    private void cboGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGenreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JComboBox<String> cboCountry;
    private javax.swing.JComboBox<String> cboDemo;
    private javax.swing.JComboBox<String> cboGenre;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearButton2;
    private javax.swing.JButton clearButton3;
    private javax.swing.JButton clearButton4;
    private javax.swing.JButton clearButton5;
    private javax.swing.JLabel demographicLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mangaAddButton;
    private javax.swing.JLabel mangaLabel;
    private javax.swing.JLabel mangaLabel1;
    private javax.swing.JLabel mangaLabel2;
    private javax.swing.JLabel mangaLabel3;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTable tblManga;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtManga;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void mostrarManga(){
        int id, precio, autor_id, demografia_id;
        String titulo, nombreAutor, nombreDemografia;
        
        DefaultTableModel modelo = (DefaultTableModel) this.tblManga.getModel();
        modelo.setRowCount(0);
        ArrayList<MangaDTO> lista = registroManga.listarManga();
        for (MangaDTO tmp : lista) {
            id = tmp.getId();
            titulo = tmp.getTitulo();
            precio = tmp.getPrecio();
            autor_id = tmp.getAutorID();
            nombreAutor = registroAutor.buscarPorId(autor_id).getNombre();
            demografia_id = tmp.getDemografiaID();
            nombreDemografia = registroDemografia.buscarPorId(demografia_id).getNombre();
            modelo.addRow(new Object[]{id,titulo,precio,nombreAutor,nombreDemografia});
        }
    }
    
    private void RellenarComboBox(String tabla, String valor, JComboBox combo)
    {
        String query = "SELECT " + valor + " FROM " + tabla;
        
        try (Connection conectar = new Conexion().conectar();
             PreparedStatement stmt = conectar.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }

        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}