package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.DictionaryModel;
import model.LinkList;
import model.Node;

public class DictionaryApp extends javax.swing.JFrame {

    DictionaryModel model = new DictionaryModel();

    private List<String> dictionary = new ArrayList<>();
    private final String currentFilePath = "datatest.txt";
    private List<String> recentSearches = new ArrayList<>();

    public String getCurrentFilePath() {
        return currentFilePath;
    }

    public DictionaryApp() {

        initComponents();
        btn_Manager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DictionaryManager secondFrame = new DictionaryManager(); // Tạo một instance mới của SecondFrame
                secondFrame.setVisible(true); // Hiển thị SecondFrame
                dispose(); // Đóng FirstFrame
            }

        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Listen for changes in tF_Infor
        tF_Infor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateSuggestions();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateSuggestions();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelTraCuu = new javax.swing.JLabel();
        tF_Infor = new javax.swing.JTextField();
        btn_TraCuu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_History = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Manager = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea_data = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Infor = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItem_Exit = new javax.swing.JMenuItem();
        menu_AboutMe = new javax.swing.JMenu();
        menuItem_UserManual = new javax.swing.JMenuItem();
        menuItem_Infor = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý tự điển");
        setBackground(new java.awt.Color(51, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(850, 604));
        setPreferredSize(new java.awt.Dimension(850, 604));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(829, 571));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelName.setText("TỰ ĐIỂN ANH - VIỆT");

        labelTraCuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTraCuu.setText("Nhập từ cần tra cứu");

        tF_Infor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tF_Infor.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tF_Infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tF_InforActionPerformed(evt);
            }
        });

        btn_TraCuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_TraCuu.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\search.png"));
        btn_TraCuu.setText("Tra cứu");
        btn_TraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TraCuuActionPerformed(evt);
            }
        });

        btn_History.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_History.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\history.png"));
        btn_History.setText("Lịch sử");
        btn_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistoryActionPerformed(evt);
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

        btn_Manager.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Manager.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\setting.png"));
        btn_Manager.setText("Quản lý");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextArea_data.setEditable(false);
        TextArea_data.setColumns(20);
        TextArea_data.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TextArea_data.setRows(5);
        jScrollPane2.setViewportView(TextArea_data);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        jList_Infor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList_Infor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList_InforValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList_Infor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(labelName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelTraCuu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tF_Infor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_TraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_History, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(labelTraCuu)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tF_Infor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btn_TraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_History, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\file.png"));
        jMenu1.setText("Tài liệu");
        jMenu1.add(jSeparator3);

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

        menuItem_UserManual.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\help.png"));
        menuItem_UserManual.setText("Hướng dẫn sử dụng");
        menuItem_UserManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_UserManualActionPerformed(evt);
            }
        });
        menu_AboutMe.add(menuItem_UserManual);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TraCuuActionPerformed
        searchWord();
    }//GEN-LAST:event_btn_TraCuuActionPerformed

    private void performSearch(String keyword) {
        // Thêm từ tìm kiếm mới vào danh sách
        recentSearches.add(keyword);

        // Cập nhật hiển thị trong jScrollPane1
      //  updateRecentSearches();
    }

//    private void updateRecentSearches() {
//        // Tạo một StringBuilder để xây dựng nội dung cần hiển thị
//        StringBuilder sb = new StringBuilder();
//
//        // Duyệt qua danh sách các từ đã tìm kiếm gần đây và thêm chúng vào StringBuilder
//        for (String search : recentSearches) {
//            sb.append(search).append("\n"); // Thêm từ và một dòng xuống mới
//        }
//
//        // Đảm bảo textArea_recentSearches là một JTextArea và hiển thị nội dung
//        if (textArea_recentSearches instanceof JTextArea) {
//            JTextArea textArea = (JTextArea) textArea_recentSearches;
//            textArea.setText(sb.toString());
//            textArea.setCaretPosition(0); // Đặt con trỏ về đầu dòng
//        } else {
//            System.err.println("textArea_recentSearches không phải là một JTextArea.");
//        }
//    }


    private void updateSuggestions() {
        String input = tF_Infor.getText().trim().toLowerCase();
        
        // Kiểm tra xem nếu JTextField trống thì không cần đề xuất từ
        if (input.isEmpty()) {
            jList_Infor.setModel(new DefaultListModel<>()); // Xóa danh sách từ hiện tại
            return;
        }
        
        DefaultListModel<String> modelList = new DefaultListModel<>();

        // Đọc dữ liệu từ tệp và thêm vào modelList nếu từ bắt đầu bằng input và có trạng thái -false
        try (BufferedReader reader = new BufferedReader(new FileReader(currentFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("-false")) {
                    String englishWord = getEnglishWord(line); // Lấy từ tiếng Anh từ chuỗi
                    if (englishWord.toLowerCase().startsWith(input)) {
                        modelList.addElement(englishWord);
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        jList_Infor.setModel(modelList);
        jList_Infor.setVisibleRowCount(Math.min(modelList.getSize(), 5)); // Hiển thị tối đa 5 hàng
    }

    // Phương thức để lấy từ tiếng Anh từ chuỗi có định dạng "từ - mô tả"
    private String getEnglishWord(String input) {
        int dashIndex = input.indexOf('-');
        if (dashIndex != -1) {
            return input.substring(0, dashIndex).trim();
        }
        return input.trim(); // Trả về toàn bộ chuỗi nếu không có dấu gạch ngang
    }

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
                + "2. Quản lý tự điển: chọn vào nút đó để chuyển sang giao diện điều chỉnh thông tin từ vựng.\n"
                + "3. Thoát: Đóng chương trình.\n\n"
                + "Chú ý: Bạn cần lưu dữ liệu sau mỗi lần thêm, cập nhật hoặc xóa từ."
                + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_UserManualActionPerformed

    private void menuItem_InforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_InforActionPerformed
        JOptionPane.showMessageDialog(this, "Phiên bản phần mềm: \n" + "Quản lý tự điển version 1.0!", "Phiên bản", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_InforActionPerformed

    private void jList_InforValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_InforValueChanged
        if (!evt.getValueIsAdjusting()) { // Đảm bảo sự kiện chỉ được kích hoạt một lần
            // Lấy phần tử được chọn trong JList
            String selectedWord = (String) jList_Infor.getSelectedValue();
            if (selectedWord != null) {
                // Hiển thị thông tin của từ được chọn trong JTextArea
                displayWordInfo(selectedWord);
            }
        }
    }//GEN-LAST:event_jList_InforValueChanged

    private void tF_InforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tF_InforActionPerformed
        searchWord();
    }//GEN-LAST:event_tF_InforActionPerformed

    private void btn_HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistoryActionPerformed
//        DefaultListModel<String> historyModel = new DefaultListModel<>();
//
//        // Thêm các từ đã tra cứu từ recentSearches vào model
//        for (String search : recentSearches) {
//            historyModel.addElement(search);
//        }
//
//        // Đặt model cho JList_History để hiển thị danh sách từ đã tra cứu
//        jList_History.setModel(historyModel);
//        jList_History.setVisible(true);
    }//GEN-LAST:event_btn_HistoryActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
//        jList_History.setPreferredSize(new Dimension(0, 0)); 
//        jList_History.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void searchWord() {
        String tuCanTim = tF_Infor.getText().trim();

        if (tuCanTim.isEmpty()) {
            // Hiển thị thông báo nếu không nhập từ cần tra
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ cần tra vào ô nhập liệu!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        LinkList[] list = model.readFile(currentFilePath);
        int bucket = model.hashFunction(tuCanTim);

        if (list[bucket] != null) {
            // Tìm kiếm từ trong danh sách liên kết
            Node result = list[bucket].search(tuCanTim);
            if (result != null && !result.getValue().isActive()) {
                String info = result.getData();
                TextArea_data.setText(info);

                performSearch(tuCanTim);
                return;
            }
        }

        // Nếu không tìm thấy từ trong từ điển hoặc từ đã bị xóa, hiển thị thông báo
        JOptionPane.showMessageDialog(this, "Không tìm thấy từ \"" + tuCanTim + "\" trong từ điển!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    private void displayWordInfo(String selectedWord) {
        LinkList[] list = model.readFile(currentFilePath);
        int bucket = model.hashFunction(selectedWord);

        if (list[bucket] != null) {
            // Tìm kiếm từ trong danh sách liên kết
            Node result = list[bucket].search(selectedWord);
            if (result != null && !result.getValue().isActive() == true) {
                String info = result.getData();
                TextArea_data.setText(info);
                return;
            } else {
                TextArea_data.setText("Không tìm thấy thông tin cho từ \"" + selectedWord + "\"");
            }
        }
    }

    private void Exit() {
        String[] options = {"Có", "Không"};
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
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_History;
    private javax.swing.JButton btn_Manager;
    private javax.swing.JButton btn_TraCuu;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JList<String> jList_Infor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelTraCuu;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_Infor;
    private javax.swing.JMenuItem menuItem_UserManual;
    private javax.swing.JMenu menu_AboutMe;
    private javax.swing.JTextField tF_Infor;
    // End of variables declaration//GEN-END:variables
}
