package view;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

import model.Data;
import model.DictionaryModel;
import model.LinkList;
import model.Node;

public class DictionaryManager extends javax.swing.JFrame {

    DictionaryModel model = new DictionaryModel();
    public String currentFilePath = "datatest.txt";
    DefaultTableModel tableModel;
    
    public LinkList[] list = model.readFile(currentFilePath);
    
    public DictionaryManager() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableModel = (DefaultTableModel) table_Data.getModel();
        setLocationRelativeTo(null);
        
        table_Data.getTableHeader().setFont(new Font("Arial",Font.BOLD,16));
        table_Data.getTableHeader().setOpaque(false);
        table_Data.getTableHeader().setForeground(Color.red);
      
        tableModel.setRowCount(0);
        loadDataFromFile(list);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_TiengAnh = new javax.swing.JLabel();
        label_LoaiTu = new javax.swing.JLabel();
        label_TiengViet = new javax.swing.JLabel();
        tF_TiengViet = new javax.swing.JTextField();
        label_ViDu = new javax.swing.JLabel();
        tF_TViDu = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        btn_Return = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Data = new javax.swing.JTable();
        tF_tiengAnh = new javax.swing.JTextField();
        btn_Delete = new javax.swing.JButton();
        cbb_Loaitu = new javax.swing.JComboBox<>();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        menuItem_Save = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItem_Exit = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuItem_UserManual = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tự điển");
        setBackground(new java.awt.Color(102, 255, 204));
        setMinimumSize(new java.awt.Dimension(850, 604));
        setSize(new java.awt.Dimension(850, 604));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 605));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ TỰ ĐIỂN");

        label_TiengAnh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_TiengAnh.setText("Từ tiếng Anh :");

        label_LoaiTu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_LoaiTu.setText("Loại từ :");

        label_TiengViet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_TiengViet.setText("Nghĩa tiếng Việt :");

        label_ViDu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_ViDu.setText("Ví dụ : ");

        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Save.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\save.png"));
        btn_Save.setText("Lưu");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Return.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Return.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\back.png"));
        btn_Return.setAlignmentY(0.0F);
        btn_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnActionPerformed(evt);
            }
        });

        btn_Add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Add.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\add.png"));
        btn_Add.setText("Thêm từ");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Update.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\update.png"));
        btn_Update.setText("Cập nhật");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_reload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reload.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\reload.png"));
        btn_reload.setText("Đặt lại");
        btn_reload.setToolTipText("");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Exit.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\exit.png"));
        btn_Exit.setText("Thoát");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        table_Data.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        table_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bucket", "Tiếng Anh", "Loại từ", "Nghĩa", "Ví dụ"
            }
        ));
        table_Data.setRowHeight(25);
        table_Data.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Data);
        if (table_Data.getColumnModel().getColumnCount() > 0) {
            table_Data.getColumnModel().getColumn(0).setMinWidth(70);
            table_Data.getColumnModel().getColumn(0).setMaxWidth(70);
            table_Data.getColumnModel().getColumn(1).setMinWidth(140);
            table_Data.getColumnModel().getColumn(1).setMaxWidth(140);
            table_Data.getColumnModel().getColumn(2).setMinWidth(140);
            table_Data.getColumnModel().getColumn(2).setMaxWidth(140);
            table_Data.getColumnModel().getColumn(3).setMinWidth(200);
            table_Data.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        tF_tiengAnh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Delete.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\delete.png"));
        btn_Delete.setText("Xóa từ");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        cbb_Loaitu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh từ", "Động Từ", "Tính từ", "Trạng từ" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(label_TiengAnh)
                        .addGap(120, 120, 120)
                        .addComponent(label_LoaiTu)
                        .addGap(158, 158, 158)
                        .addComponent(label_TiengViet))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(tF_TViDu, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tF_tiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_ViDu))
                                .addGap(33, 33, 33)
                                .addComponent(cbb_Loaitu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(tF_TiengViet, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_TiengAnh)
                    .addComponent(label_LoaiTu)
                    .addComponent(label_TiengViet))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tF_tiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label_ViDu))
                    .addComponent(cbb_Loaitu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tF_TiengViet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(tF_TViDu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu6.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\file.png"));
        jMenu6.setText("Tài liệu");

        menuItem_Save.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\save.png"));
        menuItem_Save.setText("Lưu");
        menuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SaveActionPerformed(evt);
            }
        });
        jMenu6.add(menuItem_Save);
        jMenu6.add(jSeparator2);

        menuItem_Exit.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\close.png"));
        menuItem_Exit.setText("Thoát");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        jMenu6.add(menuItem_Exit);

        jMenuBar3.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\infor.png"));
        jMenu7.setText("Thông tin");

        menuItem_UserManual.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\help.png"));
        menuItem_UserManual.setText("Hướng dẫn sử dụng");
        menuItem_UserManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_UserManualActionPerformed(evt);
            }
        });
        jMenu7.add(menuItem_UserManual);

        jMenuBar3.add(jMenu7);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    chức năng thêm từ       
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        String english = tF_tiengAnh.getText();
        String type = cbb_Loaitu.getSelectedItem().toString();
        String meaning = tF_TiengViet.getText();
        String example = tF_TViDu.getText();

        if (english.isEmpty() || type.isEmpty() || meaning.isEmpty() || example.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Tính chỉ số bucket dựa trên tiếng Anh
        int bucket = model.hashFunction(english);  
        Node searchResult = list[bucket].search(english);
        
        if (searchResult != null && !searchResult.getValue().isActive()) { // Từ đã tồn tại trong danh sách và trạng thái false
            int dialogResult = JOptionPane.showConfirmDialog(null, "Từ '" + english + "' đã tồn tại trong danh sách. Bạn có muốn cập nhật thông tin không?", "Xác nhận cập nhật", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                // Cập nhật thông tin từ đã tồn tại
                Data word = new Data(english, type, meaning, example);
                list[bucket].delete(english);
                list[bucket].addToHead(word);
                tableModel.setRowCount(0);
                loadDataFromFile(list);
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (searchResult != null && searchResult.getValue().isActive()) { // Từ đã tồn tại trong danh sách và trạng thái true
            int dialogResult = JOptionPane.showConfirmDialog(null, "Từ '" + english + "' đã từng tồn tại. Bạn có muốn khôi phục dữ liệu không?", "Xác nhận khôi phục", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                searchResult.getValue().setActive(false);
                tableModel.setRowCount(0);
                loadDataFromFile(list);
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được khôi phục!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } 
        }  else {
            Data word = new Data(english, type, meaning, example);
            // Kiểm tra xem bucketIndex có hợp lệ không
            if (bucket >= 0 && bucket < model.getSIZE()) {

                list[bucket].addToHead(word);
                tableModel.setRowCount(0);
                loadDataFromFile(list);

                JOptionPane.showMessageDialog(null, "Dữ liệu đã được thêm vào danh sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Chỉ số bucket không hợp lệ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        int selectedRow = table_Data.getSelectedRow();   
        // Lấy thông tin từ các JTextField
        String english = tF_tiengAnh.getText();
        String type = cbb_Loaitu.getSelectedItem().toString();
        String meaning = tF_TiengViet.getText();
        String example = tF_TViDu.getText();

        if (english.isEmpty() || type.isEmpty() || meaning.isEmpty() || example.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int bucket = model.hashFunction(english);
        Data word = new Data(english, type, meaning, example);
        list[bucket].delete(word.getEnglish());
        list[bucket].addToHead(word);
        tableModel.setRowCount(0);
        loadDataFromFile(list);
        
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String[] options = {"Có", "Không"};
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xóa dòng này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
                String selectedWord = data.getValueAt(selectedRow, 1).toString();

                int bucket = model.hashFunction(selectedWord);
                if (list[bucket] != null) {
                    Node result = list[bucket].search(selectedWord);
                    if (result != null && !result.getValue().isActive()) {
                        result.getValue().setActive(true);
                    }
                }
                btn_reloadActionPerformed(evt);
                // Xóa dòng khỏi bảng
                data.removeRow(selectedRow);
                tableModel.setRowCount(0);
                loadDataFromFile(list);
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được xóa khỏi bảng và trạng thái của từ đã được thay đổi!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        Exit();
    }//GEN-LAST:event_btn_ExitActionPerformed

    public void close(){
        this.setVisible(false);
    }
    private void btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnActionPerformed
        DictionaryApp dictionaryApp = new DictionaryApp();
        DictionaryManager dictionaryManager = new DictionaryManager();
        
        String english = tF_tiengAnh.getText();
        String type = cbb_Loaitu.getSelectedItem().toString();
        String meaning = tF_TiengViet.getText();
        String example = tF_TViDu.getText();
        this.close();
        dictionaryApp.openForm(english, type, meaning, example, list, dictionaryManager);
    }//GEN-LAST:event_btn_ReturnActionPerformed

    public void openForm(String english, String type, String meaning, String example, LinkList[] l, DictionaryApp dictionaryApp) {
        tF_tiengAnh.setText(english);
        cbb_Loaitu.setSelectedItem(type);
        tF_TiengViet.setText(meaning);
        tF_TViDu.setText(example);
        
        for (int i = 0; i < 100; i++) {
            if(l[i] != null) {
                list[i] = new LinkList(l[i]);
            }
        }
        
        dictionaryApp.setVisible(false);
        this.setVisible(true);
        tableModel.setRowCount(0);
        loadDataFromFile(list);
    }
    
    private void menuItem_UserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UserManualActionPerformed
        JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                 + "1. Thêm từ mới: Nhập từ tiếng Anh, loại từ, nghĩa tiếng Việt và ví dụ, sau đó nhấn nút Thêm từ.\n"
                 + "2. Cập nhật từ: Chọn một dòng trong bảng, nhấn nút cập nhật từ để hiển thị thông tin và thay đổi\nthông tin và nhấn nút Lưu để cập nhật lại thông tin từ vựng.\n"
                 + "3. Xóa từ: Chọn một dòng trong bảng và nhấn nút Xóa từ.\n"
                 + "4. Reload: Xóa thông tin đang nhập trên các ô nhập liệu và load lại dữ liệu.\n"
                 + "5. Lưu: Lưu lại dữ liệu sau khi thêm, cập nhập hoặc xóa từ.\n"
                 + "6. Thoát: Đóng chương trình.\n\n"
                 + "Chú ý: Bạn cần lưu dữ liệu trước khi thoát ứng dụng sau các thao tác thêm, cập nhật hoặc xóa từ."
                 + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_UserManualActionPerformed

    private void menuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ExitActionPerformed
        Exit();
    }//GEN-LAST:event_menuItem_ExitActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        tF_tiengAnh.setText("");
        cbb_Loaitu.setSelectedIndex(0);
        tF_TiengViet.setText("");
        tF_TViDu.setText("");
        tableModel.setRowCount(0);
        loadDataFromFile(list);
        System.out.println("Danh sách từ điển sau khi nhập:");
        model.printDictionary();
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) {
            tF_tiengAnh.setEditable(true);
            cbb_Loaitu.setEditable(true);
            tF_TiengViet.setEditable(true);
            tF_TViDu.setEditable(true);
        } else {
            // Hiển thị thông báo nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để cập nhật!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void menuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SaveActionPerformed
        model.writeFile(list);
    }//GEN-LAST:event_menuItem_SaveActionPerformed
    
//chức năng chọn vào một dòng trên bảng rồi lấy dữ liệu
    private void table_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DataMouseClicked
        tF_tiengAnh.setEditable(false);
        cbb_Loaitu.setEditable(false);
        tF_TiengViet.setEditable(false);
        tF_TViDu.setEditable(false);
        
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Đảm bảo có dòng được chọn
            // Lấy dữ liệu từ dòng được chọn và cập nhật lên các JTextField
           // DefaultTableModel tableModel = (DefaultTableModel) table_Data.getModel();
            tF_tiengAnh.setText(tableModel.getValueAt(selectedRow, 1).toString());
            cbb_Loaitu.setSelectedItem(tableModel.getValueAt(selectedRow, 2).toString());
            tF_TiengViet.setText(tableModel.getValueAt(selectedRow, 3).toString());
            tF_TViDu.setText(tableModel.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_table_DataMouseClicked

//    kiểm tra trạng thái của từ
    public boolean isWordActive(String word) {
        // Tìm kiếm từ trong danh sách và kiểm tra trạng thái của nó
        int bucket = model.hashFunction(word);
        if (list[bucket] != null) {
            Node result = list[bucket].search(word);
            if (result != null) {
                return result.getValue().isActive();
            }
        }
        return false;
    }
    
    //    Chức năng load dữ liệu từ file lưu trữ lên
    public void loadDataFromFile(LinkList[] list) {           
        for (int i = 0; i < 100; i++) {
            if (list[i] != null) {
                Node currentNode = list[i].getHead();
                while (currentNode != null) {
                    if (!currentNode.getValue().isActive()) {
                        tableModel.addRow(new Object[] {
                            i, currentNode.getValue().getEnglish(), currentNode.getValue().getType(), currentNode.getValue().getMeaning(), currentNode.getValue().getExample()
                        });
                    }
                    currentNode = currentNode.getNext();
                }
            }
        }
    }
    
    //    Chức năng load dữ liệu từ file lưu trữ lên
    public void deletedWords(LinkList[] list) {           
        for (int i = 0; i < 100; i++) {
            if (list[i] != null) {
                Node currentNode = list[i].getHead();
                while (currentNode != null) {
                    if (currentNode.getValue().isActive()) {
                        tableModel.addRow(new Object[] {
                            i, currentNode.getValue().getEnglish(), currentNode.getValue().getType(), currentNode.getValue().getMeaning(), currentNode.getValue().getExample()
                        });
                    }
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    private void Exit() {
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
            java.util.logging.Logger.getLogger(DictionaryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Return;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Update;
    public javax.swing.JButton btn_reload;
    private javax.swing.JComboBox<String> cbb_Loaitu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel label_LoaiTu;
    private javax.swing.JLabel label_TiengAnh;
    private javax.swing.JLabel label_TiengViet;
    private javax.swing.JLabel label_ViDu;
    private javax.swing.JMenuItem menuItem_Exit;
    public javax.swing.JMenuItem menuItem_Save;
    private javax.swing.JMenuItem menuItem_UserManual;
    public javax.swing.JTextField tF_TViDu;
    public javax.swing.JTextField tF_TiengViet;
    public javax.swing.JTextField tF_tiengAnh;
    private javax.swing.JTable table_Data;
    // End of variables declaration//GEN-END:variables
}
