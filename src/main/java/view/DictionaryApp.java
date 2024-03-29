/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
import model.Dictionary;
import model.DictionaryModel;

/**
 *
 * @author LENOVO
 */
public class DictionaryApp extends javax.swing.JFrame {
    
    DictionaryModel model = new DictionaryModel();
    
    private List<String> dictionary = new ArrayList<>();
    private final String currentFilePath = "datatest.txt";
    private  List<String> recentSearches = new ArrayList<>();
    
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
        
        loadDictionaryFromFile(currentFilePath);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        labelName = new javax.swing.JLabel();
        labelTraCuu = new javax.swing.JLabel();
        tF_Infor = new javax.swing.JTextField();
        btn_TraCuu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Infor = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Manager = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        label_Nghia = new java.awt.Label();
        label_TiengAnh = new java.awt.Label();
        label_LoaiTu = new java.awt.Label();
        label_Vidu = new java.awt.Label();
        cbB_Infor = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItem_Save = new javax.swing.JMenuItem();
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

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelName.setText("TỰ ĐIỂN ANH - VIỆT");

        labelTraCuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTraCuu.setText("Nhập từ cần tra cứu");

        tF_Infor.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        btn_TraCuu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_TraCuu.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\search.png"));
        btn_TraCuu.setText("Tra cứu");
        btn_TraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TraCuuActionPerformed(evt);
            }
        });

        btn_Infor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Infor.setText("Thông tin");
        btn_Infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InforActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Exit.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\exit.png"));
        btn_Exit.setText("Thoát");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh sách từ đã tìm kiếm:");

        btn_Manager.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Manager.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\icon\\setting.png"));
        btn_Manager.setText("Quản lý");
        btn_Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ManagerActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Nghia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addComponent(label_TiengAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_LoaiTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Vidu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_TiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(label_LoaiTu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Nghia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Vidu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Tài liệu");

        menuItem_Save.setText("Lưu");
        jMenu1.add(menuItem_Save);
        jMenu1.add(jSeparator3);

        menuItem_Exit.setText("Thoát");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuItem_Exit);

        jMenuBar1.add(jMenu1);

        menu_AboutMe.setText("Thông tin");
        menu_AboutMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_AboutMeActionPerformed(evt);
            }
        });

        menuItem_UserManual.setText("Hướng dẫn sử dụng");
        menuItem_UserManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_UserManualActionPerformed(evt);
            }
        });
        menu_AboutMe.add(menuItem_UserManual);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(52, 52, 52)))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbB_Infor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tF_Infor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_TraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btn_Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(btn_Infor)
                                .addGap(47, 47, 47)
                                .addComponent(btn_Exit)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(labelName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTraCuu)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTraCuu)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tF_Infor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TraCuu)
                    .addComponent(btn_Manager)
                    .addComponent(btn_Infor)
                    .addComponent(btn_Exit))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB_Infor)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TraCuuActionPerformed
       // Lấy từ cần tra từ text field
        String tuCanTim = tF_Infor.getText().trim();

        if (tuCanTim.isEmpty()) {
            // Hiển thị thông báo nếu không nhập từ cần tra
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ cần tra vào ô nhập liệu!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Tìm kiếm từ trong từ điển
        Dictionary word = model.searchWord(tuCanTim);
        if (word != null) {
            // Hiển thị thông tin từ vựng tìm thấy
            label_TiengAnh.setText("Tiếng Anh: " + word.getEnglish());
            label_LoaiTu.setText("Loại từ: " + word.getType());
            label_Nghia.setText("Nghĩa: " + word.getMeaning());
            label_Vidu.setText("Ví dụ: " + word.getExample());

            // Hiển thị thông báo tìm thấy từ
            JOptionPane.showMessageDialog(this, "Đã tìm thấy từ \"" + tuCanTim + "\" trong từ điển!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Hiển thị thông báo nếu không tìm thấy từ trong từ điển
            JOptionPane.showMessageDialog(this, "Không tìm thấy từ \"" + tuCanTim + "\" trong từ điển!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }   
    }//GEN-LAST:event_btn_TraCuuActionPerformed


    
    private void performSearch(String keyword) {
        // Thêm từ tìm kiếm mới vào danh sách
        recentSearches.add(keyword);

        // Cập nhật hiển thị trong jScrollPane1
        updateRecentSearches();
    }

    // Hàm cập nhật hiển thị của jScrollPane1 dựa trên danh sách các từ đã tìm kiếm gần đây
    private void updateRecentSearches() {
        // Tạo một StringBuilder để xây dựng nội dung cần hiển thị
        StringBuilder sb = new StringBuilder();

        // Duyệt qua danh sách các từ đã tìm kiếm gần đây và thêm chúng vào StringBuilder
        for (String search : recentSearches) {
            sb.append(search).append("\n"); // Thêm từ và một dòng xuống mới
        }

        // Tạo một JTextArea để hiển thị nội dung
        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setEditable(false); // Đảm bảo không thể chỉnh sửa nội dung

        // Đặt textArea vào jScrollPane1
        jScrollPane1.setViewportView(textArea);
    }

    private void loadDictionaryFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("-false")) {
                    dictionary.add(line.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while reading the dictionary file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
  



    private void updateSuggestions() {
        String input = tF_Infor.getText().trim().toLowerCase();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (String word : dictionary) {
            String englishWord = getEnglishWord(word); // Lấy từ tiếng Anh từ chuỗi
            if (englishWord.toLowerCase().startsWith(input)) {
                model.addElement(englishWord);
            }
        }

        cbB_Infor.setModel(model);
        cbB_Infor.setPopupVisible(!input.isEmpty());
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
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_InforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InforActionPerformed
         JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                 + "1. Tra cứu từ: Nhập từ tiếng Anh vào trong thanh tìm kiếm sau đó nhấn nút Tra cứu.\n"
                 + "2. Quản lý tự điển: chọn vào nút đó để chuyển sang giao diện điều chỉnh thông tin từ vựng.\n"
                 + "3. Xóa từ: Chọn một dòng trong bảng và nhấn nút Xóa từ.\n"
                 + "4. Reload: Xóa thông tin đang nhập trên các ô nhập liệu.\n"
                 + "5. Thoát: Đóng chương trình.\n\n"
                 + "Chú ý: Bạn cần lưu dữ liệu sau mỗi lần thêm, cập nhật hoặc xóa từ."
                 + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_InforActionPerformed

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

    private void menuItem_UserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_UserManualActionPerformed
        JOptionPane.showMessageDialog(this, "Hướng dẫn sử dụng:\n"
                + "1. Tra cứu từ: Nhập từ tiếng Anh vào trong thanh tìm kiếm sau đó nhấn nút Tra cứu.\n"
                 + "2. Quản lý tự điển: chọn vào nút đó để chuyển sang giao diện điều chỉnh thông tin từ vựng.\n"
                 + "3. Thoát: Đóng chương trình.\n\n"
                 + "Chú ý: Bạn cần lưu dữ liệu sau mỗi lần thêm, cập nhật hoặc xóa từ."
                 + "", "Hướng dẫn sử dụng", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_UserManualActionPerformed

    private void menuItem_InforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_InforActionPerformed
        JOptionPane.showMessageDialog(this, "Phiên bản phần mềm: \n"+"Quản lý tự điển version 1.0!","Phiên bản", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItem_InforActionPerformed

    private void btn_ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ManagerActionPerformed
            
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
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Infor;
    private javax.swing.JButton btn_Manager;
    private javax.swing.JButton btn_TraCuu;
    private javax.swing.JComboBox<String> cbB_Infor;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelTraCuu;
    private java.awt.Label label_LoaiTu;
    private java.awt.Label label_Nghia;
    private java.awt.Label label_TiengAnh;
    private java.awt.Label label_Vidu;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_Infor;
    private javax.swing.JMenuItem menuItem_Save;
    private javax.swing.JMenuItem menuItem_UserManual;
    private javax.swing.JMenu menu_AboutMe;
    private javax.swing.JTextField tF_Infor;
    // End of variables declaration//GEN-END:variables
}
