package model;

import java.util.LinkedList;
import java.util.List;

public class DictionaryModel {
    private final int SIZE = 100; // Số lượng buckets
    private LinkedList<Node>[] table;

    // Constructor
    public DictionaryModel() {
        table = new LinkedList[SIZE];
        // Khởi tạo mỗi phần tử trong bảng băm là một LinkedList rỗng
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hàm băm
    private int hashFunction(String key) {
        int sum = 0;
        // Tính tổng mã ASCII của các ký tự trong key
        for (int i = 0; i < key.length(); i++) {
            sum += (int) key.charAt(i);
        }
        // Chiết lượng sum để phù hợp với SIZE
        return sum % SIZE;
    }

    // Thêm một từ vào từ điển
    public void addWord(String english, String type, String mean, String example) {
        int index = hashFunction(english);
        for (Node node : table[index]) {
            if (node.getKey().equals(english)) {
                // Từ đã tồn tại, không cần thêm mới
                return;
            }
        }
        // Từ chưa tồn tại, thêm mới vào bảng
        Dictionary word = new Dictionary(english, type, mean, example);
        word.setActive(false);
        Node newNode = new Node(english, word);
        table[index].add(newNode);
    }
    // Tìm kiếm một từ trong từ điển
    public Dictionary searchWord(String english) {
    int index = hashFunction(english);
    LinkedList<Node> bucket = (LinkedList<Node>) table[index];

    System.out.println("Bucket at index " + index + ":");
    for (Node node : bucket) {
        System.out.println("Key: " + node.getKey() + ", Value: " + node.getValue());
    }

    // Duyệt từng node trong bucket để tìm từ cần tìm
    for (Node node : bucket) {
        if (node.getKey().equals(english)) {// && !node.getValue().isActive()
            return node.getValue();
        }
    }
    return null; // Không tìm thấy
}


    // Xóa một từ khỏi từ điển
    public void removeWord(String english, boolean isDeleted) {
        int index = hashFunction(english);
        List<Node> bucket = table[index];
        // Duyệt từng node trong bucket để tìm và xóa từ cần xóa
        for (int i = bucket.size() - 1; i >= 0; i--) {
            Node node = bucket.get(i);
            if (node.getKey().equals(english)) {
                // Thay đổi trạng thái của từ
                node.getValue().setActive(isDeleted);
                // Xóa nút từ danh sách liên kết
                bucket.remove(i);
                return; // Đã xóa
            }
        }
    }



    // Cập nhật thông tin của một từ trong từ điển
    public void updateWord(String english, String type, String mean, String example) {
        Dictionary word = searchWord(english);
        if (word != null) {
            word.setType(type);
            word.setMeaning(mean);
            word.setExample(example);
        } else {
           
        }
    }

    public int getRowCount() {
        int count = 0;
        for (List<Node> bucket : table) {
            count += bucket.size();
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
        for (List<Node> bucket : table) {
            int bucketSize = bucket.size();
            if (rowIndex < currentRow + bucketSize) {
                Node node = bucket.get(rowIndex - currentRow);
                switch (columnIndex) {
                    case 0:
                        return rowIndex + 1; // Số thứ tự
                    case 1:
                        return node.getKey(); // Tiếng Anh
                    case 2:
                        return node.getValue().getType(); // Loại từ
                    case 3:
                        return node.getValue().getMeaning(); // Tiếng Việt
                    case 4:
                        return node.getValue().getExample(); // Ví dụ
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
            String english = (String) getValueAt(row, 1);
            removeWord(english, !isActive);
        }
    }
}
