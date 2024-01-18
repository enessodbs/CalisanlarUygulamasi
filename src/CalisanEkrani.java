
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author eneso
 */
public class CalisanEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    CalisanIslemleri islemler = new CalisanIslemleri();

    /**
     * Creates new form CalisanEkrani
     */
    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) calisan_tablosu.getModel();
        calisanGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisan_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        dep_alani = new javax.swing.JTextField();
        maas_alani = new javax.swing.JTextField();
        calisanEkle = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        calisan_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "soyad", "departman", "maas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisan_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisan_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisan_tablosu);
        if (calisan_tablosu.getColumnModel().getColumnCount() > 0) {
            calisan_tablosu.getColumnModel().getColumn(0).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(1).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(2).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(3).setResizable(false);
            calisan_tablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad :");

        jLabel2.setText("Soyad :");

        jLabel3.setText("Departman :");

        jLabel4.setText("Maa� :");

        calisanEkle.setText("Yeni �al��an Ekle");
        calisanEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanEkleActionPerformed(evt);
            }
        });

        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setText(" ");

        guncelle.setText("�al��an G�ncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("�al��an Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(arama_cubugu)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(message, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ad_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(soyad_alani)
                                    .addComponent(dep_alani)
                                    .addComponent(maas_alani))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calisanEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calisanEkle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dep_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guncelle)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maas_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil))
                .addGap(18, 18, 18)
                .addComponent(message)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        calisan_tablosu.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased

        String ara = arama_cubugu.getText();

        dinamikAra(ara);


    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void calisanEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanEkleActionPerformed

        message.setText("");
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String departman = dep_alani.getText();
        String maas = maas_alani.getText();

        islemler.calisanEkle(ad, soyad, departman, maas);

        calisanGoruntule();
        message.setText("Yeni �al��an Ba�ar�yla Eklendi!");

    }//GEN-LAST:event_calisanEkleActionPerformed

    private void calisan_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisan_tablosuMouseClicked

        int selectedRow = calisan_tablosu.getSelectedRow();

        ad_alani.setText((String) model.getValueAt(selectedRow, 1));
        soyad_alani.setText((String) model.getValueAt(selectedRow, 2));
        dep_alani.setText((String) model.getValueAt(selectedRow, 3));
        maas_alani.setText((String) model.getValueAt(selectedRow, 4));

    }//GEN-LAST:event_calisan_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        message.setText("");

        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String departman = dep_alani.getText();
        String maas = maas_alani.getText();

        int selectedRow = calisan_tablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                message.setText("�al��anlar Tablosu Bo�!");
            } else {
                message.setText("L�tfen G�ncellenecek �al��an� Se�iniz!");
            }

        } else {

            int id = (int) model.getValueAt(selectedRow, 0);

            islemler.calisanGuncelle(id, ad, soyad, departman, maas);

            calisanGoruntule();
            message.setText("�al��an Ba�ar�yla G�ncellendi!");
        }
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        
       message.setText("");
       
       int selectedRow = calisan_tablosu.getSelectedRow();
       
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                message.setText("�al��an Tablosu Bo�!");
            }else{
                message.setText("Silinecek Bir �al��an Se�iniz!");
            }
        }else{
            int id = (int) model.getValueAt(selectedRow, 0);
            
            islemler.calisanSil(id);
            calisanGoruntule();
            message.setText("�al��an Ba�ar�yla Silindi!");
        }
        
    }//GEN-LAST:event_silActionPerformed

    /**
     * @param args the command line arguments
     */
    public void calisanGoruntule() {

        model.setRowCount(0);

        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();

        calisanlar = islemler.calisanlariGetir();

        if (calisanlar != null) {
            for (Calisan calisan : calisanlar) {
                Object[] eklenecek = {calisan.getId(), calisan.getAd(), calisan.getSoyad(), calisan.getDepartman(), calisan.getMaas()};

                model.addRow(eklenecek);
            }

        }
    }

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
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calisanEkle;
    private javax.swing.JTable calisan_tablosu;
    private javax.swing.JTextField dep_alani;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maas_alani;
    private javax.swing.JLabel message;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    // End of variables declaration//GEN-END:variables
}