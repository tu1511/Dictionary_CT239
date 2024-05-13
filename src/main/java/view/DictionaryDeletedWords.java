package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DictionaryModel;
import model.LinkList;
import model.Node;

public class DictionaryDeletedWords extends javax.swing.JFrame {

    DictionaryModel model = new DictionaryModel();
    public String currentFilePath = "datatest.txt";
    DefaultTableModel tableModel;
    
//    public LinkList[] list = model.readFile(currentFilePath);
    public LinkList[] list = new LinkList[100];
    LinkList l[] = new LinkList[100];
    public DictionaryDeletedWords() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableModel = (DefaultTableModel) table_Data.getModel();
        setLocationRelativeTo(null);
        
        table_Data.getTableHeader().setFont(new Font("Arial",Font.BOLD,16));
        table_Data.getTableHeader().setOpaque(false);
        table_Data.getTableHeader().setForeground(Color.red);
        
        setResizable(false);
        
        tableModel.setRowCount(0);
        deletedWords(list);
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
        btn_Return = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        btn_recover = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_Reload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Data = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_Save = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1531, 964));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1531, 964));
        jPanel1.setPreferredSize(new java.awt.Dimension(1531, 964));

        btn_Return.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\back.png"));
        btn_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DANH SÁCH TỪ ĐÃ XÓA");

        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\exit.png"));
        btn_close.setText("Thoát");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_recover.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_recover.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\recover.png"));
        btn_recover.setText("Khôi phục");
        btn_recover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recoverActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\delete.png"));
        btn_delete.setText("Xóa");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_Reload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Reload.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\reload.png"));
        btn_Reload.setText("Đặt lại");
        btn_Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReloadActionPerformed(evt);
            }
        });

        table_Data.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        table_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bucket", "Tiếng Anh", "Loại từ", "Nghĩa", "Ví dụ"
            }
        ));
        table_Data.setRowHeight(30);
        table_Data.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_Data.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Data);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_recover, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(540, 540, 540)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(699, 699, 699)
                        .addComponent(btn_Reload, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_recover, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Reload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\file.png"));
        jMenu1.setText("Tài liệu");

        btn_Save.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\save.png"));
        btn_Save.setText("Lưu");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jMenu1.add(btn_Save);
        jMenu1.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\close.png"));
        jMenuItem2.setText("Thoát");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\infor.png"));
        jMenu2.setText("Thông tin");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\help.png"));
        jMenuItem3.setText("Hướng dẫn sử dụng");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String e = new String(), t = new String(), m = new String(), ex = new String();
    
    public void openForm2(String english, String type, String meaning, String example, LinkList[] li, DictionaryManager dictionaryManager) {
        for (int i = 0; i < 100; i++) {
            if(li[i] != null) {
                l[i] = new LinkList(li[i]);
             
            }
        }
        e = new String(english);
        t = new String(type);
        m = new String(meaning);
        ex = new String(example);           
        this.setVisible(true);
    }
    //    Phương thức quay lại frame mẹ
    private void btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnActionPerformed
        DictionaryDeletedWords dictionaryDeletedWords = new DictionaryDeletedWords();
        DictionaryManager dictionaryManager = new DictionaryManager();
        this.setVisible(false);    
//        dictionaryManager.openForm1(e, t, m, ex, l, dictionaryDeletedWords);
    }//GEN-LAST:event_btn_ReturnActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        Exit();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Exit();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    //    Phương thức ghi dữ liệu vào file lưu trữ
    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
//        model.writeFile(list);
    }//GEN-LAST:event_btn_SaveActionPerformed
    //    Phương thức xóa mềm khi trạng thái falsevaf xóa từ vĩnh viễn khi true
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String[] options = {"Có", "Không"};
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xóa từ này vĩnh viễn?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
                String selectedWord = data.getValueAt(selectedRow, 1).toString();

                int bucket = model.hashFunction(selectedWord);
                if (list[bucket] != null) {
                    Node result = list[bucket].searchNode(selectedWord);
                    if (result != null ) {
                        list[bucket].deleteNode(selectedWord);
                    }
                }
                data.removeRow(selectedRow);
                tableModel.setRowCount(0);
                deletedWords(list);
                
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được xóa vĩnh viễn!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed
    //    Phương thức khôi phục dữ liệu
    private void btn_recoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recoverActionPerformed
        String[] options = {"Có", "Không"};
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn khôi phục dữ liệu này?", "Xác nhận khôi phục", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
                String selectedWord = data.getValueAt(selectedRow, 1).toString();
                int bucket = model.hashFunction(selectedWord);
                if (list[bucket] != null) {
                    Node result = list[bucket].searchNode(selectedWord);
                    if (result != null ) {
//                        result.getValue().setActive(false);
                        System.out.println(result.getValue());
//                        System.out.println("Danh sách từ điển sau khi nhập:");
//                         for (int i = 0; i < list.length; i++) {
//                            System.out.println("Bucket " + i + ":");
//                            list[i].print();
//                            System.out.println();
//                        }
                    }
                }
//                data.removeRow(selectedRow);
                tableModel.setRowCount(0);
                deletedWords(list);
                
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được khôi phục!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dữ liệu để khôi phục!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_recoverActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                + "1. Khôi phục: Chọn từ và nhấn vào \"Khôi phục\" để khôi phục dữ liệu.\n"
                + "2. Xóa: Chọn từ và nhấn vào \"Xóa\" để xóa vĩnh viễn dữ liệu của từ đã chọn.\n"
                + "3. Thoát: Đóng chương trình.\n\n"
                + "Chú ý: Bạn cần lưu dữ liệu sau mỗi lần khôi phục hoặc xóa từ."
                + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReloadActionPerformed
        tableModel.setRowCount(0);
        loadDataFromFileFalse(list);
    }//GEN-LAST:event_btn_ReloadActionPerformed

    private void table_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DataMouseClicked
    

     
    }//GEN-LAST:event_table_DataMouseClicked

    //    Phương thức load dữ liệu từ file lưu trữ
    public void deletedWords(LinkList[] li) {           
        for (int i = 0; i < 100; i++) {
            if (li[i] != null) {
                Node currentNode = li[i].getHead();
                while (currentNode != null) {
               
                        tableModel.addRow(new Object[] {
                            i, currentNode.getValue().getEnglish(), currentNode.getValue().getType(), currentNode.getValue().getMeaning(), currentNode.getValue().getExample()
                        });
                    currentNode = currentNode.getNext();
                }
            }
        }
    }
    
    
    public void loadDataFromFileFalse(LinkList[] list) {           
        for (int i = 0; i < 100; i++) {
            if (list[i] != null) {
                Node currentNode = list[i].getHead();
                while (currentNode != null) {
                    
                        tableModel.addRow(new Object[] {
                            i, currentNode.getValue().getEnglish(), currentNode.getValue().getType(), currentNode.getValue().getMeaning(), currentNode.getValue().getExample()
                        });
                    
                    currentNode = currentNode.getNext();
                }
            }
        }
    }
    
    public void Exit() {
        String[] options = {"Có", "Không"};
        int choice = JOptionPane.showOptionDialog(null, "Chưa lưu dữ liệu! Bạn có chắc chắn muốn thoát?", "WARNING",
              JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (choice == JOptionPane.YES_OPTION) {
            // Có
            System.exit(0);
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
            java.util.logging.Logger.getLogger(DictionaryDeletedWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryDeletedWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryDeletedWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryDeletedWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryDeletedWords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reload;
    private javax.swing.JButton btn_Return;
    private javax.swing.JMenuItem btn_Save;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_recover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable table_Data;
    // End of variables declaration//GEN-END:variables

}
