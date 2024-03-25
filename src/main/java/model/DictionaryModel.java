package model;

import java.util.LinkedList;
import java.util.List;

public class DictionaryModel {
    private final int SIZE = 100; // Số lượng buckets
    private List<Node>[] table;

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
        Dictionary word = new Dictionary(english, type, mean, example);
        Node newNode = new Node(english, word);
        table[index].add(newNode);
    }

    // Tìm kiếm một từ trong từ điển
    public Dictionary searchWord(String english) {
        int index = hashFunction(english);
        List<Node> bucket = table[index];
        // Duyệt từng node trong bucket để tìm từ cần tìm
        for (Node node : bucket) {
            if (node.getKey().equals(english)) {
                return node.getValue();
            }
        }
        return null; // Không tìm thấy
    }

    // Xóa một từ khỏi từ điển
    public void removeWord(String english) {
        int index = hashFunction(english);
        List<Node> bucket = table[index];
        // Duyệt từng node trong bucket để tìm và xóa từ cần xóa
        for (int i = 0; i < bucket.size(); i++) {
            Node node = bucket.get(i);
            if (node.getKey().equals(english)) {
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
            // Xử lý khi từ cần cập nhật không tồn tại
        }
    }
}
