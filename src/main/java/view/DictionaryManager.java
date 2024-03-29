package view;



import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

import model.Data;
import model.DictionaryModel;
import model.LinkList;

public class DictionaryManager extends javax.swing.JFrame {

    DictionaryModel model = new DictionaryModel();
    public String currentFilePath = "datatest.txt";
    
    public DictionaryManager() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Gọi phương thức để load dữ liệu khi ứng dụng được khởi động
        loadDataFromFile(currentFilePath);
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
        setPreferredSize(new java.awt.Dimension(863, 605));
        setSize(new java.awt.Dimension(850, 604));

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

        table_Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bucket", "Tiếng Anh", "Loại từ", "Nghĩa", "Ví dụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Data);

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

        jMenu6.setText("Tài liệu");

        menuItem_Save.setText("Lưu");
        menuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SaveActionPerformed(evt);
            }
        });
        jMenu6.add(menuItem_Save);
        jMenu6.add(jSeparator2);

        menuItem_Exit.setText("Thoát");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        jMenu6.add(menuItem_Exit);

        jMenuBar3.add(jMenu6);

        jMenu7.setText("Thông tin");

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
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tF_TViDu, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_ViDu)
                                .addGap(379, 379, 379))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tF_tiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_LoaiTu)
                                    .addComponent(cbb_Loaitu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_TiengAnh)
                                .addGap(332, 332, 332)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tF_TiengViet, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_TiengViet))))
                .addGap(44, 44, 44)
                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Return))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_TiengAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_TiengViet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_LoaiTu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbb_Loaitu)
                            .addComponent(tF_tiengAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(label_ViDu))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tF_TiengViet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(tF_TViDu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    chức năng thêm từ
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
       String tiengAnh = tF_tiengAnh.getText();
        String loaiTu = cbb_Loaitu.getSelectedItem().toString();
        String tiengViet = tF_TiengViet.getText();
        String viDu = tF_TViDu.getText();

        if (tiengAnh.isEmpty() || loaiTu.isEmpty() || tiengViet.isEmpty() || viDu.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Data newData = new Data(tiengAnh, loaiTu, tiengViet, viDu + "-false");

        // Tính toán chỉ số bucket dựa trên tiếng Anh
        int bucketIndex = model.hashFunction(tiengAnh);

        // Thêm dữ liệu mới vào danh sách tại vị trí 0 của bucket tương ứng
        model.table[bucketIndex].insertAt(newData, 0);

        // Hiển thị thông báo sau khi thêm dữ liệu vào danh sách
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được thêm vào danh sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_AddActionPerformed

//chức năng chọn vào một dòng trên bảng rồi lấy dữ liệu
    public void table_DataMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // Lấy chỉ số của dòng được chọn
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Đảm bảo có dòng được chọn
            // Lấy dữ liệu từ dòng được chọn và cập nhật lên các JTextField
            DefaultTableModel model = (DefaultTableModel) table_Data.getModel();
            tF_tiengAnh.setText(model.getValueAt(selectedRow, 1).toString());
            cbb_Loaitu.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
            tF_TiengViet.setText(model.getValueAt(selectedRow, 3).toString());
            tF_TViDu.setText(model.getValueAt(selectedRow, 4).toString());
        }
    }
    
    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
//        int selectedRow = table_Data.getSelectedRow();   
//        // Lấy thông tin từ các JTextField
//        String tiengAnh = tF_tiengAnh.getText();
//        String loaiTu = cbb_Loaitu.getSelectedItem().toString();
//        String tiengViet = tF_TiengViet.getText();
//        String viDu = tF_TViDu.getText();
//
//        // Kiểm tra xem các trường dữ liệu có trống không
//        if (tiengAnh.isEmpty() || loaiTu.isEmpty() || tiengViet.isEmpty() || viDu.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
//        data.setValueAt(tiengAnh, selectedRow, 1);
//        data.setValueAt(loaiTu, selectedRow, 2);
//        data.setValueAt(tiengViet, selectedRow, 3);
//        data.setValueAt(viDu, selectedRow, 4);
//
//        // Cập nhật thông tin từ trong DictionaryModel
//        model.updateWord(tiengAnh, loaiTu, tiengViet, viDu + "-false");
//
//        JOptionPane.showMessageDialog(null, "Dữ liệu đã được cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String[] options = {"Có", "Không"};
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xóa dòng này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
                String selectedWord = data.getValueAt(selectedRow, 1).toString(); // Lấy từ tiếng Anh của dòng được chọn

                // Lấy trạng thái từ từ dòng được chọn
                String isActiveString = data.getValueAt(selectedRow, 4).toString();
                boolean isActive = Boolean.parseBoolean(isActiveString);

                // Kiểm tra và gọi phương thức delete từ LinkList trong model
                if (!isActive) {
                    // Thay đổi trạng thái thành true
                    data.setValueAt(true, selectedRow, 4);
                    int bucketIndex = model.hashFunction(selectedWord); // Sử dụng từ tiếng Anh để tìm bucket
                    model.table[bucketIndex].delete(selectedWord); // Gọi phương thức delete từ LinkList trong model và truyền từ tiếng Anh cần xóa
                }

                  try {
                        File file = new File("datatest.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;
                        String input = "";
                        while ((line = reader.readLine()) != null) {
                            if (line.contains(selectedWord)) {
                                line = line.replace("-false", "-true");
                            }
                            input += line + '\n';
                        }
                        reader.close();
                        FileWriter writer = new FileWriter(file);
                        writer.write(input);
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi cập nhật dữ liệu trong tệp tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                
                // Xóa dòng khỏi bảng
                data.removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Dữ liệu đã được xóa khỏi bảng và trạng thái của từ đã được thay đổi!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        String[] options = {"Có", "Không"};
        int choice = JOptionPane.showOptionDialog(null, "Chưa lưu dữ liệu! Bạn có chắc chắn muốn thoát?", "WARNING",
              JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            WindowEvent windowClosing = new WindowEvent((Window)evt.getSource(), WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClosing);
        }
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnActionPerformed
        DictionaryApp dictionaryApp = new DictionaryApp();
        dictionaryApp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ReturnActionPerformed

    private void menuItem_UserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UserManualActionPerformed
        JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                 + "1. Thêm từ mới: Nhập từ tiếng Anh, loại từ, nghĩa tiếng Việt và ví dụ, sau đó nhấn nút Thêm từ.\n"
                 + "2. Cập nhật từ: Chọn một dòng trong bảng, nhấn nút cập nhật từ để hiển thị thông tin và thay đổi\nthông tin và nhấn nút Lưu để cập nhật lại thông tin từ vựng.\n"
                 + "3. Xóa từ: Chọn một dòng trong bảng và nhấn nút Xóa từ.\n"
                 + "4. Reload: Xóa thông tin đang nhập trên các ô nhập liệu.\n"
                 + "5. Thoát: Đóng chương trình.\n\n"
                 + "Chú ý: Bạn cần lưu dữ liệu sau mỗi lần thêm, cập nhật hoặc xóa từ."
                 + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_UserManualActionPerformed

    private void menuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ExitActionPerformed
        String[] options = {"Có", "Không"};
        int choice = JOptionPane.showOptionDialog(null, "Chưa lưu dữ liệu! Bạn có chắc chắn muốn thoát?", "WARNING",
              JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (choice == JOptionPane.YES_OPTION) {
            // Có
            System.exit(0);
        } else {
            // Không
            // Close the window without exiting the program
            WindowEvent windowClosing = new WindowEvent((Window)evt.getSource(), WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClosing);
        }
    }//GEN-LAST:event_menuItem_ExitActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        tF_tiengAnh.setText("");
        cbb_Loaitu.setSelectedIndex(0);
        tF_TiengViet.setText("");
        tF_TViDu.setText("");
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
            String tiengAnh = data.getValueAt(selectedRow, 1).toString();
            String loaiTu = data.getValueAt(selectedRow, 2).toString();
            String tiengViet = data.getValueAt(selectedRow, 3).toString();
            String viDu = data.getValueAt(selectedRow, 4).toString();

            tF_tiengAnh.setText(tiengAnh);
            cbb_Loaitu.setSelectedItem(loaiTu);
            tF_TiengViet.setText(tiengViet);
            tF_TViDu.setText(viDu);
        } else {
            // Hiển thị thông báo nếu không có hàng nào được chọn
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để cập nhật!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void menuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SaveActionPerformed
        saveToFile();
    }//GEN-LAST:event_menuItem_SaveActionPerformed

    private void saveToFile() {
        File file = new File("datatest.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, false); // Mở file để ghi đè nội dung
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Ghi lại toàn bộ dữ liệu từ bảng vào tệp tin
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 1; j < model.getColumnCount() - 1; j++) { // -1 để loại bỏ cột trạng thái
                    bufferedWriter.write(model.getValueAt(i, j).toString());
                    bufferedWriter.write("-");
                }
                // Ghi trạng thái của từ (true/false)
                bufferedWriter.write(model.getValueAt(i, model.getColumnCount() - 1).toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Dữ liệu đã được lưu lại vào tệp tin!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi lưu dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }  
    


//    Chức năng load dữ liệu từ file lưu trữ lên
    public void loadDataFromFile(String filePath) {
        DefaultTableModel tableModel = (DefaultTableModel) table_Data.getModel();
        tableModel.setRowCount(0); // Xóa dữ liệu cũ trước khi load dữ liệu mới

        DictionaryModel dictionaryModel = new DictionaryModel(); // Khởi tạo một đối tượng DictionaryModel
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split("-");
                if (rowData.length >= 5) { // Kiểm tra xem dòng có đúng định dạng dữ liệu hay không
                    String isActiveString = rowData[4]; // Trạng thái từ
                    boolean isActive = Boolean.parseBoolean(isActiveString);
                    if (!isActive) { // Chỉ thêm dòng có trạng thái là false vào bảng
                        int bucket = dictionaryModel.hashFunction(rowData[0]); // Số bucket
                        Object[] row = new Object[rowData.length + 1];
                        row[0] = bucket;
                        System.arraycopy(rowData, 0, row, 1, rowData.length);
                        tableModel.addRow(row);
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đọc dữ liệu từ tệp tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
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
