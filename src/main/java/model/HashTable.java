package model;

public class HashTable {
    private int size;
    private Node[] table;

    // Constructor
    public HashTable(int size) {
        this.size = size;
        this.table = new Node[size];
        // Khởi tạo mỗi phần tử trong bảng băm là null
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    // Hàm băm
    private int hashFunction(String key) {
        // Thực hiện hàm băm đơn giản
        return key.hashCode() % size;
    }

    // Thêm một cặp khóa-giá trị vào bảng băm
    public void put(String key, String value) {
        int index = hashFunction(key);
        Node newNode = new Node(key, value);
        // Nếu vị trí không có nút nào, thêm nút mới
        if (table[index] == null) {
            table[index] = newNode;
        } else { // Nếu đã có nút ở vị trí đó, thêm vào cuối danh sách liên kết
            Node current = table[index];
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Lấy giá trị tương ứng với khóa từ bảng băm
    public String get(String key) {
        int index = hashFunction(key);
        Node current = table[index];
        // Duyệt danh sách liên kết tại vị trí index để tìm giá trị
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null; // Không tìm thấy
    }

    // Xóa một cặp khóa-giá trị từ bảng băm
    public void remove(String key) {
        int index = hashFunction(key);
        Node current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.getKey().equals(key)) {
                if (prev == null) { // Nếu nút cần xóa là nút đầu tiên
                    table[index] = current.getNext();
                } else { // Nếu nút cần xóa không phải là nút đầu tiên
                    prev.setNext(current.getNext());
                }
                return; // Đã xóa
            }
            prev = current;
            current = current.getNext();
        }
    }
}
