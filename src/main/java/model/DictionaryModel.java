package model;

public class DictionaryModel {
    private HashTable hashTable;

    public DictionaryModel(int size) {
        hashTable = new HashTable(size);
    }

    // Thêm một từ vào từ điển
    public void addWord(String english, String type, String mean, String example) {
        Dictionary word = new Dictionary(english, type, mean, example);
        hashTable.put(english, word);
    }

    // Tìm kiếm một từ trong từ điển
    public Dictionary searchWord(String english) {
        return hashTable.get(english);
    }

    // Xóa một từ khỏi từ điển
    public void removeWord(String english) {
        hashTable.remove(english);
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
