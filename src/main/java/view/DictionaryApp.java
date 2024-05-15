package view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;
import model.DictionaryModel;
import model.LinkList;
import model.Node;

public class DictionaryApp extends javax.swing.JFrame {

    DictionaryModel model = new DictionaryModel();
    
    LinkList list[] = new LinkList[100];
    LinkList listDe[] = new LinkList[100];
    private final ArrayList<String> searchHistory = new ArrayList<>();
    private String currentFilePath = "datatest.txt";
    public String e = new String(), t = new String(), m = new String(), ex = new String();
    DefaultListModel<String> modelList_Suggested = new DefaultListModel<>();
    public String[] options = {"Có", "Không"};

    public String getCurrentFilePath() {
        return currentFilePath;
    }
    public DictionaryApp() {
        initComponents();   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        if (checkEmpty(list)) {
            list = model.readFile(currentFilePath, false);
        }
        
        Font font = new Font("Segoe UI", Font.BOLD, 20);
        UIManager.put("OptionPane.messageFont", font);
        TextArea_data.setLineWrap(true);
        TextArea_data.setWrapStyleWord(true);  
        menu.add(panel);
        menu_History.add(panel_History);
        
        listData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_Data = new javax.swing.JList<>();
        menu = new javax.swing.JPopupMenu();
        panel_History = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_History = new javax.swing.JList<>();
        menu_History = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelTraCuu = new javax.swing.JLabel();
        tF_Infor = new javax.swing.JTextField();
        btn_TraCuu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Edit = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Manager = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea_data = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_Infor = new javax.swing.JList<>();
        btn_History = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItem_Exit = new javax.swing.JMenuItem();
        menu_AboutMe = new javax.swing.JMenu();
        menuItem_UserManual = new javax.swing.JMenuItem();
        menuItem_Infor = new javax.swing.JMenuItem();

        panel.setAlignmentX(0.0F);
        panel.setAlignmentY(0.0F);
        panel.setPreferredSize(new java.awt.Dimension(310, 229));

        jScrollPane3.setAlignmentX(0.0F);
        jScrollPane3.setAlignmentY(0.0F);

        list_Data.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        list_Data.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_DataValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(list_Data);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menu.setFocusable(false);

        list_History.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        list_History.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_HistoryValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list_History);

        javax.swing.GroupLayout panel_HistoryLayout = new javax.swing.GroupLayout(panel_History);
        panel_History.setLayout(panel_HistoryLayout);
        panel_HistoryLayout.setHorizontalGroup(
            panel_HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_HistoryLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_HistoryLayout.setVerticalGroup(
            panel_HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tự điển");
        setBackground(new java.awt.Color(51, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(850, 604));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 1500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelName.setText("TỰ ĐIỂN ANH - VIỆT");
        jPanel2.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, 60));

        labelTraCuu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTraCuu.setText("Nhập từ cần tra cứu");
        jPanel2.add(labelTraCuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 72, -1, 40));

        tF_Infor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tF_Infor.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tF_Infor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tF_InforKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tF_InforKeyReleased(evt);
            }
        });
        jPanel2.add(tF_Infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 310, 40));

        btn_TraCuu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_TraCuu.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\search.png"));
        btn_TraCuu.setText("Tra cứu");
        btn_TraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TraCuuActionPerformed(evt);
            }
        });
        jPanel2.add(btn_TraCuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 150, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1520, -1));

        btn_Edit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Edit.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\update.png"));
        btn_Edit.setText("Chỉnh sửa");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 180, 40));

        btn_Exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Exit.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\exit.png"));
        btn_Exit.setText("Thoát");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 110, 160, 40));

        btn_Manager.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Manager.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\setting.png"));
        btn_Manager.setText("Quản lý");
        btn_Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ManagerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 160, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 1000));

        TextArea_data.setEditable(false);
        TextArea_data.setColumns(20);
        TextArea_data.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TextArea_data.setRows(5);
        TextArea_data.setMinimumSize(new java.awt.Dimension(1500, 1500));
        jScrollPane2.setViewportView(TextArea_data);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1128, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 1130, 720));

        list_Infor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        list_Infor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        list_Infor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gợi ý:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_Infor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_InforValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(list_Infor);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 310, 720));

        btn_History.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_History.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\history.png"));
        btn_History.setText("Lịch sử");
        btn_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistoryActionPerformed(evt);
            }
        });
        jPanel2.add(btn_History, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 180, 40));

        jMenu1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\file.png"));
        jMenu1.setText("Tài liệu");
        jMenu1.add(jSeparator3);

        menuItem_Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItem_Exit.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\close.png"));
        menuItem_Exit.setText("Thoát");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_Exit);

        jMenuBar1.add(jMenu1);

        menu_AboutMe.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\infor.png"));
        menu_AboutMe.setText("Thông tin");
        menu_AboutMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_AboutMeActionPerformed(evt);
            }
        });

        menuItem_UserManual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItem_UserManual.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\help.png"));
        menuItem_UserManual.setText("Hướng dẫn sử dụng");
        menuItem_UserManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_UserManualActionPerformed(evt);
            }
        });
        menu_AboutMe.add(menuItem_UserManual);

        menuItem_Infor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItem_Infor.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\infor.png"));
        menuItem_Infor.setText("Thông tin phần mềm");
        menuItem_Infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_InforActionPerformed(evt);
            }
        });
        menu_AboutMe.add(menuItem_Infor);

        jMenuBar1.add(menu_AboutMe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TraCuuActionPerformed
        searchWord();
    }//GEN-LAST:event_btn_TraCuuActionPerformed

    private void menu_AboutMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_AboutMeActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Quản lý tự điển version 1.0!");
    }//GEN-LAST:event_menu_AboutMeActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        Exit();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void menuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ExitActionPerformed
        Exit();
    }//GEN-LAST:event_menuItem_ExitActionPerformed

    private void menuItem_UserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UserManualActionPerformed
        JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                + "1. Tra cứu từ: Nhập từ tiếng Anh vào trong thanh tìm kiếm sau đó nhấn nút Tra cứu.\n"
                + "2. Quản lý tự điển: chọn vào nút đó để chuyển sang giao diện quản lý thông tin từ vựng.\n"
                + "3. Lịch sử: Hiển thị từ đã tra cứu.\n"
                + "4. Chỉnh sửa: Chuyển qua giao diện để chỉnh sửa thông tin từ.\n"
                + "5. Thoát: Đóng chương trình.\n\n"
                + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_UserManualActionPerformed

    private void menuItem_InforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_InforActionPerformed
        JOptionPane.showMessageDialog(this, "Phiên bản phần mềm: \n" + "Quản lý tự điển version 1.0!", "Phiên bản", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_InforActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        frameTransferToEdit();
    }//GEN-LAST:event_btn_EditActionPerformed

    // Phương thức chuyển đổi frame không mất dữ liệu
    public void openForm(String english, String type, String meaning, String example, LinkList[] li,  LinkList[] l, DictionaryManager dictionaryManager) {
        for (int i = 0; i < 100; i++) {
            if(li[i] != null) {
                list[i] = new LinkList(li[i]);
            } 
            
            if(l[i] != null) {
                listDe[i] = new LinkList(l[i]);
            }
        }        
        e = new String(english);
        t = new String(type);
        m = new String(meaning);
        ex = new String(example);
        
        
        
        this.listData();
        this.setVisible(true);
    }
    
    //    Phương thức kiểm tra list có chứa dữ liệu hay không
    public boolean checkEmpty(LinkList[] l) {
        for (int i = 0; i < 100; i++) {
            if (l[i] != null) {
                return false;
            }
        }
        return true;
    }
    
    private void btn_ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ManagerActionPerformed
        frameTransfer();
    }//GEN-LAST:event_btn_ManagerActionPerformed
    
    //  Phương thức chuyển đổi frame
    public void frameTransfer() {      
        DictionaryManager manager = new DictionaryManager();
        DictionaryApp app = new DictionaryApp();
        this.setVisible(false);
        manager.openForm(e, t, m, ex, list, listDe, app);
    }
    
    public void frameTransferToEdit() {
        DictionaryManager manager = new DictionaryManager();
        DictionaryApp app = new DictionaryApp();
        int i=model.hashFunction(model.formatter(tF_Infor.getText()));
        this.setVisible(false);
        manager.setWrite();
        manager.openform(model.formatter(tF_Infor.getText()),list, listDe, app,i);
    }
    
    // Phương thức lấy từ đang tìm để gợi ý   
    private void tF_InforKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tF_InforKeyReleased
        showSuggested();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            menu.setVisible(false);
        }
    }//GEN-LAST:event_tF_InforKeyReleased
    // Phương thức chọn từ trong danh sách gợi ý hiển thị dữ liệu
    private void list_DataValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_DataValueChanged
        if (!evt.getValueIsAdjusting()) { // Đảm bảo sự kiện chỉ được kích hoạt một lần
            String selectedWord = (String) list_Data.getSelectedValue();
            if (selectedWord != null) {
                displayWordInfo(selectedWord);
                tF_Infor.setText(selectedWord);
                addToSearchHistory(selectedWord);
                menu.setVisible(false);
            }
        }
    }//GEN-LAST:event_list_DataValueChanged
    // Phương thức chọn từ trong danh sách từ đã tra cứu hiển thị dữ liệu
    private void list_HistoryValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_HistoryValueChanged
        if (!evt.getValueIsAdjusting()) { // Đảm bảo sự kiện chỉ được kích hoạt một lần
            String selectedWord = (String) list_History.getSelectedValue();
            if (selectedWord != null) {
                displayWordInfo(selectedWord);
                tF_Infor.setText(selectedWord);
                addToSearchHistory(selectedWord);
                menu_History.setVisible(false);
            }
        }
    }//GEN-LAST:event_list_HistoryValueChanged

    private void tF_InforKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tF_InforKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchWord();
        }
    }//GEN-LAST:event_tF_InforKeyPressed

    private void list_InforValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_InforValueChanged
        if (!evt.getValueIsAdjusting()) { // Đảm bảo sự kiện chỉ được kích hoạt một lần
            String selectedWord = (String) list_Infor.getSelectedValue();
            if (selectedWord != null) {
                displayWordInfo(selectedWord);
                tF_Infor.setText(selectedWord);
                addToSearchHistory(selectedWord);
            }
        }
    }//GEN-LAST:event_list_InforValueChanged

    private void btn_HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistoryActionPerformed
        menu_History.show(btn_History,0, btn_History.getHeight());
    }//GEN-LAST:event_btn_HistoryActionPerformed
    // Phương thức tìm kiếm từ đang nhập
    public void searchWord() {
        String selectedWord = tF_Infor.getText().trim().toLowerCase();
        if (selectedWord.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ cần tra vào ô nhập liệu!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }       
        displayWordInfo(model.formatter(selectedWord));
        showSearchHistory();
    }
    
    // Phương thức chọn từ trong danh sách hiển thị dữ liệu
    public void displayWordInfo(String selectedWord) {
        int bucket = model.hashFunction(selectedWord);
        if (list[bucket] != null) {
            Node result = list[bucket].searchNode(selectedWord);
            if (result != null) {
                String info = result.getData();
                TextArea_data.setText(info); 
                addToSearchHistory(selectedWord);
                showSearchHistory();
            }
            else {
                int option = JOptionPane.showConfirmDialog(null, "Từ \"" + selectedWord + "\" không có trong từ điển. Bạn có muốn thêm nó không?", "Thêm từ mới", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    frameTransferToEdit();
                }
                tF_Infor.setText("");
            }
        }
    }

     // Phương thức để thêm từ khóa tìm kiếm vào lịch sử
    public void addToSearchHistory(String keyword) {
        if (searchHistory.contains(keyword)) {
            searchHistory.remove(keyword);
        }
        searchHistory.add(0,keyword);
    }

    // Phương thức để hiển thị lịch sử tìm kiếm
    public void showSearchHistory() {
        DefaultListModel<String> modelList_History = new DefaultListModel<>();
        for (String keyword : searchHistory) {
            modelList_History.addElement(keyword);
        }
        list_History.setModel(modelList_History);
    }
    
    public void showSuggested() {
        String input = tF_Infor.getText().trim().toLowerCase();
        if (input.isEmpty()) {
            list_Data.setModel(new DefaultListModel<>());
            menu.setVisible(false); // Ẩn danh sách từ đề xuất
            return;
        }

        menu.show(tF_Infor, 0, tF_Infor.getHeight());
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

        list_Data.setModel(modelList);
        list_Data.setVisibleRowCount(Math.min(modelList.getSize(), 5));
    }
    
    public void listData() {
        list_Infor.setModel(modelList_Suggested);
        modelList_Suggested.clear();

        for (int i = 0; i < 100; i++) {
            if (list[i] != null) {
                Node currentNode = list[i].getHead();
                while (currentNode != null) {
                    modelList_Suggested.addElement(currentNode.getValue().getEnglish());
                    currentNode = currentNode.getNext();
                }
            }

            list_Infor.setModel(modelList_Suggested);
        }
    }
    // Phương thức chọn thoát
    private void Exit() {        
        int choice = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn thoát?", "WARNING",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (choice == JOptionPane.YES_OPTION) {
            // Có
            System.exit(0);
        } else {
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
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea_data;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_History;
    private javax.swing.JButton btn_Manager;
    private javax.swing.JButton btn_TraCuu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelTraCuu;
    private javax.swing.JList<String> list_Data;
    private javax.swing.JList<String> list_History;
    private javax.swing.JList<String> list_Infor;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_Infor;
    private javax.swing.JMenuItem menuItem_UserManual;
    private javax.swing.JMenu menu_AboutMe;
    private javax.swing.JPopupMenu menu_History;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_History;
    private javax.swing.JTextField tF_Infor;
    // End of variables declaration//GEN-END:variables
}
