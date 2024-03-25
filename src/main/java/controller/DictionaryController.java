package controller;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import view.DictionaryManager;

public class DictionaryController {

    private DictionaryManager view;

    public DictionaryController(DictionaryManager view) {
        this.view = view;
    }

    public void actionPerformed(MouseEvent e) {
        Object source = e.getSource();
        JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: " + source);
        if (source == view.btn_reload) {
//            view.clearTextFields(); // Gọi phương thức clearTextFields từ DictionaryManager
        }
    }
}
