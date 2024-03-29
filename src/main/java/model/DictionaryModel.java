package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DictionaryModel {
    private final int SIZE = 100; // Số lượng buckets
    public LinkList[] table;

    public int getSIZE() {
        return SIZE;
    }

    public LinkList[] getTable() {
        return table;
    }

    
    // Constructor
    public DictionaryModel() {
        table = new LinkList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkList();
        }
    }

    // Hàm băm
    public int hashFunction(String key) {
        int sum = 0;
        // Tính tổng mã ASCII của các ký tự trong key
        for (int i = 0; i < key.length(); i++) {
            sum += (int) key.charAt(i);
        }
        // Chiết lượng sum để phù hợp với SIZE
        return sum % SIZE;
    }
    
    public void writeFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (LinkList bucket : table) {
                Node current = bucket.getHead();
                while (current != null) {
                    Data word = current.getValue();
                    String line = word.getWord() + "-" + word.getType() + "-" + word.getMeaning() + "-" + word.getExample() + "-" + word.isActive();
                    bw.write(line);
                    bw.newLine();
                    current = current.getNext();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String fileName) {
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("-");
                if (parts.length == 5) {
                    String english = parts[0];
                    String type = parts[1];
                    String meaning = parts[2];
                    String example = parts[3];
                    boolean isActive = Boolean.parseBoolean(parts[4]);
                    Data word = new Data(english, type, meaning, example);
                    word.setActive(isActive);
                    int t = hashFunction(english);
                    table[t].addToTail(word);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getRowCount() {
        int count = 0;
        for (LinkList bucket : table) {
            count += bucket.getSize();
        }
        return count;
    }

    public int getColumnCount() {
        // Số cột của dữ liệu
        return 5; // Ví dụ: Tiếng Anh, Loại từ, Tiếng Việt, Ví dụ, Trạng thái
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        // Kiểm tra rowIndex và columnIndex nếu nó hợp lệ hoặc không
        if (rowIndex < 0 || rowIndex >= getRowCount() || columnIndex < 0 || columnIndex >= getColumnCount()) {
            throw new IllegalArgumentException("Invalid row or column index");
        }

        // Tìm bucket chứa dữ liệu cho rowIndex
        int currentRow = 0;
        for (LinkList bucket : table) {
            int bucketSize = bucket.getSize();
            if (rowIndex < currentRow + bucketSize) {
                Node current = bucket.getHead();
                for (int i = 0; i < rowIndex - currentRow; i++) {
                    current = current.getNext();
                }
                Data data = current.getValue();
                switch (columnIndex) {
                    case 0:
                        return rowIndex + 1; // Số thứ tự
                    case 1:
                        return data.getWord(); // Tiếng Anh
                    case 2:
                        return data.getType(); // Loại từ
                    case 3:
                        return data.getMeaning(); // Tiếng Việt
                    case 4:
                        return data.getExample(); // Ví dụ
                    default:
                        return null;
                }
            }
            currentRow += bucketSize;
        }

        return null;
    }

    public void setValueAt(Object value, int row, int column) {
        if (column == 4 && value instanceof Boolean) {
            boolean isActive = (boolean) value;
            int currentRow = 0;
            for (LinkList bucket : table) {
                int bucketSize = bucket.getSize();
                if (row < currentRow + bucketSize) {
                    Node current = bucket.getHead();
                    for (int i = 0; i < row - currentRow; i++) {
                        current = current.getNext();
                    }
                    Data word = current.getValue();
                    word.setActive(isActive);
                    return;
                }
                currentRow += bucketSize;
            }
        }
    }

    public LinkList[] getList() {
        // Trả về bảng table chứa toàn bộ danh sách từ điển
        return table;
    }
}
