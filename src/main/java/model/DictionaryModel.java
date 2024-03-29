package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DictionaryModel {
    private final int SIZE = 100; // Số lượng buckets
    private LinkedList<LinkList>[] table;

    // Constructor
    public DictionaryModel() {
        table = new LinkedList[SIZE];
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
        for (LinkList node : table[index]) {
            if (node.getEnglish().equals(english)) {
                // Từ đã tồn tại, không cần thêm mới
                return;
            }
        }
        // Từ chưa tồn tại, thêm mới vào bảng
        Data word = new Data(english, type, mean, example);
        word.setActive(false);
        LinkList newNode = new LinkList(word);
        table[index].add(newNode);
    }

    // Tìm kiếm một từ trong từ điển
    public Data searchWord(String english) {
        int index = hashFunction(english);
        LinkedList<LinkList> bucket = table[index];

        System.out.println("Bucket at index " + index + ":");
        for (LinkList node : bucket) {
            System.out.println("Key: " + node.getEnglish() + ", Value: " + node.getData());
        }

        // Duyệt từng node trong bucket để tìm từ cần tìm
        for (LinkList node : bucket) {
            if (node.getEnglish().equals(english)) {
                return node.getData();
            }
        }
        return null; // Không tìm thấy
    }

    // Xóa một từ khỏi từ điển
    public void removeWord(String english, boolean isDeleted) {
        int index = hashFunction(english);
        List<LinkList> bucket = table[index];
        // Duyệt từng node trong bucket để tìm và xóa từ cần xóa
        for (int i = bucket.size() - 1; i >= 0; i--) {
            LinkList node = bucket.get(i);
            if (node.getEnglish().equals(english)) {
                // Thay đổi trạng thái của từ
                node.getData().setActive(isDeleted);
                // Xóa nút từ danh sách liên kết
                bucket.remove(i);
                return; // Đã xóa
            }
        }
    }

    // Cập nhật thông tin của một từ trong từ điển
    public void updateWord(String english, String type, String mean, String example) {
        Data word = searchWord(english);
        if (word != null) {
            word.setType(type);
            word.setMeaning(mean);
            word.setExample(example);
        } else {
            // Xử lý khi từ không tồn tại
        }
    }

    // Ghi từ điển vào file
    public void writeFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (LinkedList<LinkList> bucket : table) {
                for (LinkList node : bucket) {
                    Data word = node.getData();
                    String line = word.getWord() + "-" + word.getType() + "-" + word.getMeaning() + "-" + word.getExample() + "-" + word.isActive();
                    bw.write(line);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc từ điển từ file
    public LinkList[] readFile(String fileName) {
        LinkList[] ds = new LinkList[SIZE];
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
                    LinkList newNode = new LinkList(word);
                    if (ds[t] == null) {
                        ds[t] = new LinkList();
                    }
                    ds[t].addToTail(newNode);
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
        return ds;
    }

    public int getRowCount() {
        int count = 0;
        for (LinkedList<LinkList> bucket : table) {
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
        for (LinkedList<LinkList> bucket : table) {
            int bucketSize = bucket.size();
            if (rowIndex < currentRow + bucketSize) {
                LinkList node = bucket.get(rowIndex - currentRow);
                Data data = node.getData();
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
            String english = (String) getValueAt(row, 1);
            removeWord(english, !isActive);
        }
    }
}
