package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

import model.Data;
import model.DictionaryModel;
import model.LinkList;
import model.Node;

public class DictionaryManager extends javax.swing.JFrame {
  
    DictionaryApp app = new DictionaryApp();
    DictionaryModel model = new DictionaryModel();
    DefaultTableModel tableModel;
    public String[] options = {"Có", "Không"}, options1 = {"Khôi phục", "Thêm mới"};
    
    public LinkList[] list = model.readFile(app.getCurrentFilePath(), false);
    public LinkList[] listDeleted = model.readFile("test.txt", true);
    public LinkList[] listFW = new LinkList[100];
    
    public DictionaryManager() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableModel = (DefaultTableModel) table_Data.getModel();
        setLocationRelativeTo(null);
        
        
        Font font = new Font("Segoe UI", Font.BOLD, 20);
        UIManager.put("OptionPane.messageFont", font);
        table_Data.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,24));
        table_Data.getTableHeader().setOpaque(false);
        table_Data.getTableHeader().setForeground(Color.black);
     
        btn_ListData.setVisible(false);
    
        menuSearch.add(panelSearch);
        
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
        menuSearch = new javax.swing.JPopupMenu();
        panelSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSearch = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
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
        btn_DeletedWords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Data = new javax.swing.JTable();
        tF_tiengAnh = new javax.swing.JTextField();
        btn_Delete = new javax.swing.JButton();
        cbb_Loaitu = new javax.swing.JComboBox<>();
        btn_ListData = new javax.swing.JButton();
        btn_recover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_Name = new javax.swing.JLabel();
        lb_search = new javax.swing.JLabel();
        tF_search = new javax.swing.JTextField();
        btn_FavoriteWords = new javax.swing.JButton();
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

        listSearch.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        listSearch.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSearchValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listSearch);

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tự điển");
        setBackground(new java.awt.Color(102, 255, 204));
        setMinimumSize(new java.awt.Dimension(850, 604));
        setSize(new java.awt.Dimension(850, 604));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1531, 964));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 605));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 1510, -1));

        label_TiengAnh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_TiengAnh.setText("Từ tiếng Anh :");
        jPanel2.add(label_TiengAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        label_LoaiTu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_LoaiTu.setText("Loại từ :");
        jPanel2.add(label_LoaiTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        label_TiengViet.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_TiengViet.setText("Nghĩa tiếng Việt :");
        jPanel2.add(label_TiengViet, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        tF_TiengViet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.add(tF_TiengViet, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 340, 50));

        label_ViDu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_ViDu.setText("Ví dụ : ");
        jPanel2.add(label_ViDu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        tF_TViDu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.add(tF_TViDu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 870, 50));

        btn_Save.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Save.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\save.png"));
        btn_Save.setText("Lưu");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 120, 50));

        btn_Return.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Return.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\back.png"));
        btn_Return.setAlignmentY(0.0F);
        btn_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReturnActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 20, 36, 36));

        btn_Add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Add.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\add.png"));
        btn_Add.setText("Thêm từ");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 210, 40));

        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Update.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\update.png"));
        btn_Update.setText("Cập nhật");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 180, 40));

        btn_reload.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_reload.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\reload.png"));
        btn_reload.setText("Đặt lại");
        btn_reload.setToolTipText("");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 150, 40));

        btn_DeletedWords.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_DeletedWords.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\listdeletedwords.png"));
        btn_DeletedWords.setText("Từ đã xóa");
        btn_DeletedWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletedWordsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_DeletedWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 290, 220, 40));

        table_Data.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        table_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tiếng Anh", "Loại từ", "Nghĩa", "Ví dụ"
            }
        ));
        table_Data.setRowHeight(30);
        table_Data.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Data);
        if (table_Data.getColumnModel().getColumnCount() > 0) {
            table_Data.getColumnModel().getColumn(0).setMinWidth(150);
            table_Data.getColumnModel().getColumn(0).setMaxWidth(150);
            table_Data.getColumnModel().getColumn(1).setMinWidth(160);
            table_Data.getColumnModel().getColumn(1).setMaxWidth(160);
            table_Data.getColumnModel().getColumn(2).setMinWidth(200);
            table_Data.getColumnModel().getColumn(2).setMaxWidth(200);
            table_Data.getColumnModel().getColumn(3).setMinWidth(380);
            table_Data.getColumnModel().getColumn(3).setMaxWidth(380);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 1400, 520));

        tF_tiengAnh.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel2.add(tF_tiengAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 250, 50));

        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Delete.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\delete.png"));
        btn_Delete.setText("Xóa từ");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 180, 40));

        cbb_Loaitu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbb_Loaitu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh từ", "Động từ", "Tính từ", "Trạng từ", "Đại từ", "Giới từ", "Thán từ", "Liên từ", "Từ hạn định" }));
        jPanel2.add(cbb_Loaitu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 220, 50));

        btn_ListData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_ListData.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\listData.png"));
        btn_ListData.setText("Danh sách từ");
        btn_ListData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListDataActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ListData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 290, 220, 40));

        btn_recover.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_recover.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\recover.png"));
        btn_recover.setText("Khôi phục");
        btn_recover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recoverActionPerformed(evt);
            }
        });
        jPanel2.add(btn_recover, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 210, 40));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        label_Name.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        label_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Name.setText("QUẢN LÝ TỰ ĐIỂN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 70));

        lb_search.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_search.setText("Tìm kiếm:");
        jPanel2.add(lb_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, -1));

        tF_search.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tF_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tF_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tF_searchKeyReleased(evt);
            }
        });
        jPanel2.add(tF_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 390, 40));

        btn_FavoriteWords.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_FavoriteWords.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\listdeletedwords.png"));
        btn_FavoriteWords.setText("Từ yêu thích");
        btn_FavoriteWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FavoriteWordsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_FavoriteWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 290, 220, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1531, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Phương thức thêm từ
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        String english = model.formatter(tF_tiengAnh.getText());
        String type = cbb_Loaitu.getSelectedItem().toString();
        String meaning = tF_TiengViet.getText();
        String example = tF_TViDu.getText();

        if (english.isEmpty() || type.isEmpty() || meaning.isEmpty() || example.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int bucket = model.hashFunction(english);
        Node searchResult = list[bucket].searchNode(english);
        Node searchResultDe = listDeleted[bucket].searchNode(english);

        if (searchResult != null) { // Từ đã tồn tại trong danh sách
            int dialogResult = JOptionPane.showOptionDialog(null, "Từ '" + english + "' đã tồn tại trong danh sách. Bạn có muốn cập nhật thông tin không?", "Xác nhận cập nhật"
                    , JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            
            if (dialogResult == JOptionPane.YES_OPTION) {
                // Cập nhật thông tin từ đã tồn tại
                Data word = new Data(english, type, meaning, example);
                update(word);
            }
        } else if (searchResultDe != null) { // Từ đã tồn tại trong danh sách từ đã xóa
            int dialogResult = JOptionPane.showOptionDialog(null, "Từ '" + english + "' đã từng tồn tại. Bạn có muốn khôi phục dữ liệu không?", "Xác nhận khôi phục"
                    , JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options1, options1[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                recover(searchResultDe);
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được khôi phục!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Data word = new Data(english, type, meaning, example);
                add(word, list);
                listDeleted[bucket].deleteNode(english);
            }
        } else {
            Data word = new Data(english, type, meaning, example);
            add(word, list);
        }
        reloadData();
        tableModel.setRowCount(0);
        loadDataFromFile(list);
    }//GEN-LAST:event_btn_AddActionPerformed
    // Phương thức cập nhật dữ liệu từ
    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        int selectedRow = table_Data.getSelectedRow();   
        String english = model.formatter(tF_tiengAnh.getText());
        String type = cbb_Loaitu.getSelectedItem().toString();
        String meaning = tF_TiengViet.getText();
        String example = tF_TViDu.getText();

        if (english.isEmpty() || type.isEmpty() || meaning.isEmpty() || example.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Data word = new Data(english, type, meaning, example);
        update(word);
    }//GEN-LAST:event_btn_SaveActionPerformed
    //    Phương thức xóa mềm khi trạng thái falsevaf xóa từ vĩnh viễn khi true
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        delete();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    // Phương thức chuyển sang danh sách từ đã xóa
    private void btn_DeletedWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletedWordsActionPerformed
        tableModel.setRowCount(0); // Lấy danh sách các từ đã bị xóa từ model
        deletedWords(listDeleted); // Đưa danh sách các từ đã bị xóa lên bảng
        label_Name.setText("QUẢN LÝ TỪ ĐÃ XÓA");
        table_Data.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        btn_DeletedWords.setVisible(false);
        btn_ListData.setVisible(true);
        btn_Add.setVisible(false);
        btn_recover.setVisible(true);
//        System.out.println("Danh sách từ điển sau khi nhập:");
//        model.printDictionary(model.listDeleted);
    }//GEN-LAST:event_btn_DeletedWordsActionPerformed

    public void close(){
        this.setVisible(false);
    }
    
    // Phương thức quay lại frame mẹ
    private void btn_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReturnActionPerformed
        DictionaryManager manager = new DictionaryManager();       
        String english = model.formatter(tF_tiengAnh.getText());
        String type = cbb_Loaitu.getSelectedItem().toString();
        String meaning = tF_TiengViet.getText();
        String example = tF_TViDu.getText();
        this.close();
        app.openForm(english, type, meaning, example, list, listDeleted, manager);
    }//GEN-LAST:event_btn_ReturnActionPerformed

    public void openForm(String english, String type, String meaning, String example, LinkList[] l, LinkList[] lDe, DictionaryApp dictionaryApp) {
        tF_tiengAnh.setText(english);
        cbb_Loaitu.setSelectedItem(type);
        tF_TiengViet.setText(meaning);
        tF_TViDu.setText(example);
        
        for (int i = 0; i < 100; i++) {
            if(l[i] != null) {
                list[i] = new LinkList(l[i]);
            }
            
            if(lDe[i] != null) {
                listDeleted[i] = new LinkList(lDe[i]);
            }
        }
        
        dictionaryApp.setVisible(false);
        this.setVisible(true);
        tableModel.setRowCount(0);
        loadDataFromFile(list);
    }
    
    public void openform(String english, LinkList[] l, LinkList[] lDe, DictionaryApp app, int k) {
        app.setVisible(false);
        this.setVisible(true);

        for (int i = 0; i < 100; i++) {
            if (l[i] != null) {
                list[i] = new LinkList(l[i]);
            }
            
            if(lDe[i] != null) {
                listDeleted[i] = new LinkList(lDe[i]);
            }
        }
        if (list[k] != null) {
            Node cNode = list[k].searchNode(english);
            if (cNode != null) {
                cbb_Loaitu.setSelectedItem(cNode.getValue().getType());
                tF_TiengViet.setText(cNode.getValue().getMeaning());
                tF_TViDu.setText(cNode.getValue().getExample());
            }
        }
        tF_tiengAnh.setText(english);
        tableModel.setRowCount(0);
        loadDataFromFile(list);

    }
    
    private void menuItem_UserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UserManualActionPerformed
        
        JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                 + "1. Thêm từ: Nhập từ tiếng Anh, loại từ, nghĩa tiếng Việt và ví dụ, sau đó nhấn nút Thêm từ.\n"
                 + "2. Cập nhật: Chọn một dòng trong bảng, nhấn nút \"Cập nhật\" cho phép cập nhật và thay đổi\nthông tin và nhấn nút Lưu để cập nhật lại thông tin từ vựng.\n"
                 + "3. Xóa từ: Chọn một dòng trong bảng và nhấn nút \"Xóa\" để xóa mềm.\nNếu muốn xóa vĩnh viễn thì chuyển qua \"Từ đã xóa\" để xóa vĩnh viễn từ.\n"
                 + "4. Đặt lại: Xóa thông tin đang nhập trên các ô nhập liệu và tải lại dữ liệu.\n"
                 + "5. Khôi phục: Chọn một hoặc nhiều từ đã xóa để khôi phục lại dữ liệu đã xóa.\n"
                 + "6. Tìm kiếm: Nhập từ cần tìm vào ô và nhấn phím Enter để tìm kiếm.\n"
                 + "7. Lưu: Lưu lại dữ liệu sau khi thêm, cập nhập hoặc xóa từ.\n"
                 + "8. Thoát: Đóng chương trình.\n\n"
                 + "Chú ý: Bạn nên lưu dữ liệu trước khi thoát ứng dụng sau các thao tác thêm, cập nhật hoặc xóa từ."
                 + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_UserManualActionPerformed

    private void menuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ExitActionPerformed
        Exit();
    }//GEN-LAST:event_menuItem_ExitActionPerformed
    // Phương thức load lại dữ liệu từ dslk
    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        reloadData();
        tableModel.setRowCount(0);
        loadDataFromFile(list);
//        Kiểm tra bảng băm lưu trữ
        System.out.println("Danh sách từ điển sau khi nhập:");
        model.printDictionary(list);
    }//GEN-LAST:event_btn_reloadActionPerformed
 
    public void reloadData() {
        tF_tiengAnh.setText("");
        cbb_Loaitu.setSelectedIndex(0);
        tF_TiengViet.setText("");
        tF_TViDu.setText("");
        tF_tiengAnh.setEditable(true);
        cbb_Loaitu.setEditable(true);
        tF_TiengViet.setEditable(true);
        tF_TViDu.setEditable(true);
    }
// Phương thức chọn tù cần cập nhật đưa lên lại các trường
    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) {
            tF_tiengAnh.setEditable(true);
            cbb_Loaitu.setEditable(true);
            tF_TiengViet.setEditable(true);
            tF_TViDu.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để cập nhật!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed
    // Phương thức ghi dữ liệu vào file
    private void menuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SaveActionPerformed
        model.writeFile(list, app.getCurrentFilePath());
        model.writeFile(model.listDeleted, "test.txt");
    }//GEN-LAST:event_menuItem_SaveActionPerformed
    
    //Phương thức chọn vào một dòng trên bảng rồi lấy dữ liệu, nếu đang ở từ đã xóa hỏi có muốn khôi phục hayy không
    private void table_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DataMouseClicked
        tF_tiengAnh.setEditable(false);
        cbb_Loaitu.setEditable(false);
        tF_TiengViet.setEditable(false);
        tF_TViDu.setEditable(false);
        
        int selectedRow = table_Data.getSelectedRow();
                   
         if (selectedRow != -1) {
            tF_tiengAnh.setText(tableModel.getValueAt(selectedRow, 1).toString());
            tF_TiengViet.setText(tableModel.getValueAt(selectedRow, 3).toString());
            tF_TViDu.setText(tableModel.getValueAt(selectedRow, 4).toString());

            // Clear combobox and add unique values from the table
            cbb_Loaitu.removeAllItems();
            HashSet<String> uniqueTypes = new HashSet<>();
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                uniqueTypes.add(tableModel.getValueAt(i, 2).toString());
            }
            for (String type : uniqueTypes) {
                cbb_Loaitu.addItem(type);
            }

            // Select the type of the selected row
            cbb_Loaitu.setSelectedItem(tableModel.getValueAt(selectedRow, 2).toString());
        }
    }//GEN-LAST:event_table_DataMouseClicked

    private void btn_ListDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListDataActionPerformed
        btn_ListData.setVisible(false);
        btn_DeletedWords.setVisible(true);
        btn_Add.setVisible(true);
        btn_recover.setVisible(false);
        tableModel.setRowCount(0);
        loadDataFromFile(list);
        table_Data.setSelectionMode(0);
        label_Name.setText("QUẢN LÝ TỰ ĐIỂN");
    }//GEN-LAST:event_btn_ListDataActionPerformed

//    private void btn_recoverActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        int selectedRow = table_Data.getSelectedRow();
//        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
//            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn khôi phục dữ liệu này?", "Xác nhận khôi phục", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
//            if (dialogResult == JOptionPane.YES_OPTION) {
//                DefaultTableModel data = (DefaultTableModel) table_Data.getModel();
//                String selectedWord = data.getValueAt(selectedRow, 1).toString();
//                int bucket = model.hashFunction(selectedWord);
//                Node result = listDeleted[bucket].searchNode(selectedWord);
//                if (model.listDeleted[bucket] != null) {   
//                    restore();
//                    tableModel.setRowCount(0);
//                    deletedWords(listDeleted);
//                }
//            }
//        }
//    }      
    private void btn_recoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recoverActionPerformed
        int row[] = table_Data.getSelectedRows();
        if (row.length >= 0) {
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn khôi phục dữ liệu này?", "Xác nhận khôi phục", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                for (int i = 0; i < row.length; i++) {
                    String tu = table_Data.getValueAt(row[i], 1).toString();
                    Node node = listDeleted[model.hashFunction(tu)].searchNode(tu);
                    recover(node);
                }
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được khôi phục!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            tableModel.setRowCount(0);
            deletedWords(listDeleted);
        }
    }//GEN-LAST:event_btn_recoverActionPerformed

   
    
    private void tF_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tF_searchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchData(tF_search.getText());
        }
    }//GEN-LAST:event_tF_searchKeyPressed
 
    private void btn_FavoriteWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FavoriteWordsActionPerformed
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn thêm từ này vào danh sách yêu thích?", "Xác nhận thêm từ vào danh sách yêu thích", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                String selectedWord = table_Data.getValueAt(selectedRow, 1).toString();
                int bucket = model.hashFunction(selectedWord);
                Node result = list[bucket].searchNode(selectedWord);
                listFW[bucket].addToHead(result.getValue());
                model.writeFile(listFW, "favoriteWords.txt");
                reloadData();
                JOptionPane.showMessageDialog(null, "Từ đã được thêm vào danh sách yêu thích!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một từ từ danh sách để thêm vào danh sách yêu thích!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
        tableModel.setRowCount(0);
        loadDataFromFile(listFW);
        model.printDictionary(listFW);
    }//GEN-LAST:event_btn_FavoriteWordsActionPerformed

    private void tF_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tF_searchKeyReleased
        showSuggested();
    }//GEN-LAST:event_tF_searchKeyReleased

    private void listSearchValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSearchValueChanged
        if (!evt.getValueIsAdjusting()) { // Đảm bảo sự kiện chỉ được kích hoạt một lần
            String selectedWord = (String) listSearch.getSelectedValue();
            if (selectedWord != null) {
                searchData(selectedWord);
                tF_search.setText("");
                menuSearch.setVisible(false);
            }
        }
    }//GEN-LAST:event_listSearchValueChanged

    public void add(Data word, LinkList[] list) {       
        int bucket = model.hashFunction(model.formatter(tF_tiengAnh.getText()));
        if (bucket >= 0 && bucket < model.getSIZE()) {
            list[bucket].addToHead(word);
            tableModel.setRowCount(0);
            loadDataFromFile(list);
            reloadData();
            JOptionPane.showMessageDialog(null, "Dữ liệu đã được thêm vào danh sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chỉ số bucket không hợp lệ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    public void update(Data word) {       
        int bucket = model.hashFunction(model.formatter(tF_tiengAnh.getText()));
        list[bucket].deleteNode(word.getEnglish());
        list[bucket].addToHead(word);
        tableModel.setRowCount(0);
        loadDataFromFile(list);
        reloadData();
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    
    public void delete() {
        int selectedRow = table_Data.getSelectedRow();
        if (selectedRow != -1) {
            int dialogResult = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xóa từ này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (dialogResult == JOptionPane.YES_OPTION) {
                String selectedWord = tableModel.getValueAt(selectedRow, 1).toString();
                int bucket = model.hashFunction(selectedWord);
                if (list[bucket] != null) {
                    Node result = list[bucket].searchNode(selectedWord);
                    if (result != null) {
                        // Nếu chưa bị xóa, thực hiện xóa từ khỏi bảng chính và thêm vào bảng các từ đã xóa
                        list[bucket].deleteNode(selectedWord);
                        model.listDeleted[bucket].addToTail(result.getValue());
                        JOptionPane.showMessageDialog(null, "Từ đã được thêm vào danh sách các từ đã xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        tableModel.setRowCount(0);
                        loadDataFromFile(list);
                        reloadData();
//                        System.out.println("Danh sách từ điển sau khi nhập:");
//                        model.printDictionary(model.listDeleted);
                        return;
                    } 
                } 
                if (listDeleted[bucket] != null) {
                    Node resultDe = listDeleted[bucket].searchNode(selectedWord);
                    if (resultDe != null) {
                        listDeleted[bucket].deleteNode(selectedWord);
                        JOptionPane.showMessageDialog(null, "Từ đã được xóa vĩnh viễn!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        tableModel.setRowCount(0);
                        deletedWords(model.listDeleted);
                        reloadData();
                        return;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn từ để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void searchData(String word) {
        String selectedWord = model.formatter(word);

        if (selectedWord.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ cần tra vào ô nhập liệu!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        tableModel.setRowCount(0);
        int bucket = model.hashFunction(selectedWord);
        if (list[bucket] != null) {
            Node result = list[bucket].searchNode(selectedWord);
            if (result != null) {
                tF_search.setText("");
                tableModel.addRow(new Object[] {
                    bucket, result.getValue().getEnglish(), result.getValue().getType(), result.getValue().getMeaning(), result.getValue().getExample()
                });
            } else {
                loadDataFromFile(list);
                int option = JOptionPane.showConfirmDialog(null, "Từ \"" + selectedWord + "\" không có trong từ điển. Bạn có muốn thêm nó không?", "Thêm từ mới", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    tF_tiengAnh.setText(selectedWord);
                }
                tF_search.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy từ \"" + selectedWord + "\" trong từ điển!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void recover(Node result) {
        String selectedWord = result.getValue().getEnglish();
        int bucket = model.hashFunction(selectedWord);
        result = model.listDeleted[bucket].searchNode(selectedWord);
        model.listDeleted[bucket].deleteNode(selectedWord);
        list[bucket].addToTail(result.getValue());
    }

    public void restore() {
        int row[] = table_Data.getSelectedRows();
        if (row.length >= 0) {
            int result = JOptionPane.showConfirmDialog(this, "Khôi phục từ đang chọn?", "Yes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                for (int i = 0; i < row.length; i++) {
                    System.out.println(row[i]);
                    String tu = table_Data.getValueAt(row[i], 1).toString();
                    System.out.println(tu);
                    //int i = t.hash(tu);
                    Node node = listDeleted[model.hashFunction(tu)].searchNode(tu);
                    recover(node);
                }
            }
        }
    }
    
    public void setWrite() {
         tF_tiengAnh.setEditable(true);
         cbb_Loaitu.setEditable(true);
         tF_TiengViet.setEditable(true);
         tF_TViDu.setEditable(true);
    } 
    
    public void showSuggested() {
        String input = tF_search.getText().trim().toLowerCase();
        if (input.isEmpty()) {
            listSearch.setModel(new DefaultListModel<>());
            menuSearch.setVisible(false); // Ẩn danh sách từ đề xuất
            return;
        }

        menuSearch.show(tF_search, 0, tF_search.getHeight());
        tF_search.requestFocusInWindow();
        DefaultListModel<String> modelList = new DefaultListModel<>();
        for (int i = 0; i < 100; i++) {
            if (list[i] != null) {
                Node currentNode = list[i].getHead();
                while (currentNode != null) {
                    String englishWord = currentNode.getValue().getEnglish().toLowerCase();
                    if (englishWord.startsWith(input)) {
                        modelList.addElement(model.formatter(englishWord));
                    }
                    currentNode = currentNode.getNext();
                }
            }
        }

        listSearch.setModel(modelList);
        listSearch.setVisibleRowCount(Math.min(modelList.getSize(), 5));
    }
    
    //    Phương thức load dữ liệu từ file lưu trữ
    public void loadDataFromFile(LinkList[] list) {   
        int k = 1;
        for (int i = 0; i < 100; i++) {
            if (list[i] != null) {
                Node currentNode = list[i].getHead();
                while (currentNode != null) {
                    tableModel.addRow(new Object[] {
                        k, currentNode.getValue().getEnglish(), currentNode.getValue().getType(), currentNode.getValue().getMeaning(), currentNode.getValue().getExample()
                    });
                    currentNode = currentNode.getNext();
                    k++;
                }
            }
        }
    }
    //    Phương thức load dữ liệu từ đã xóa trong file lưu trữ
    public void deletedWords(LinkList[] li) {           
        int k = 1;
        for (int i = 0; i < 100; i++) {
            if (li[i] != null) {
                Node currentNode = li[i].getHead();
                while (currentNode != null) {
                    tableModel.addRow(new Object[] {
                        k, currentNode.getValue().getEnglish(), currentNode.getValue().getType(), currentNode.getValue().getMeaning(), currentNode.getValue().getExample()
                    });
                    currentNode = currentNode.getNext();
                    k++; 
                }
            }
        }
    }


    private void Exit() {
        int choice = JOptionPane.showOptionDialog(null, "Bạn có muốn lưu lại dữ liệu trước khi thoát?", "Chưa lưu dữ liệu!",
              JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (choice == JOptionPane.YES_OPTION) {
            // Có
            model.writeFile(list, app.getCurrentFilePath());
            model.writeFile(model.listDeleted, "test.txt");
        } 
        System.exit(0);
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
    private javax.swing.JButton btn_DeletedWords;
    private javax.swing.JButton btn_FavoriteWords;
    private javax.swing.JButton btn_ListData;
    private javax.swing.JButton btn_Return;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_recover;
    public javax.swing.JButton btn_reload;
    private javax.swing.JComboBox<String> cbb_Loaitu;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel label_LoaiTu;
    private javax.swing.JLabel label_Name;
    private javax.swing.JLabel label_TiengAnh;
    private javax.swing.JLabel label_TiengViet;
    private javax.swing.JLabel label_ViDu;
    private javax.swing.JLabel lb_search;
    private javax.swing.JList<String> listSearch;
    private javax.swing.JMenuItem menuItem_Exit;
    public javax.swing.JMenuItem menuItem_Save;
    private javax.swing.JMenuItem menuItem_UserManual;
    private javax.swing.JPopupMenu menuSearch;
    private javax.swing.JPanel panelSearch;
    public javax.swing.JTextField tF_TViDu;
    public javax.swing.JTextField tF_TiengViet;
    private javax.swing.JTextField tF_search;
    public javax.swing.JTextField tF_tiengAnh;
    private javax.swing.JTable table_Data;
    // End of variables declaration//GEN-END:variables
}
