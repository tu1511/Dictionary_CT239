package model;

import java.util.Scanner;
import model.Data;
import model.DictionaryModel;
import model.Node;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DictionaryModel dictionary = new DictionaryModel();

        System.out.println("Nhập số lượng từ vựng bạn muốn thêm:");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Nhập từ vựng " + (i + 1) + ":");
            System.out.print("Tiếng Anh: ");
            String english = scanner.nextLine();
            System.out.print("Loại từ: ");
            String type = scanner.nextLine();
            System.out.print("Ý nghĩa: ");
            String meaning = scanner.nextLine();
            System.out.print("Ví dụ: ");
            String example = scanner.nextLine();

            Data word = new Data(english, type, meaning, example);
            int hash = dictionary.hashFunction(english);
            dictionary.getList()[hash].addToTail(word);
        }

        // In ra danh sách từ điển sau khi nhập
        System.out.println("Danh sách từ điển sau khi nhập:");
        dictionary.printDictionary();

        // Ghi danh sách từ điển vào tệp
        //dictionary.writeFile("datatest.txt");

        // Tìm kiếm từ vựng
        System.out.println("Nhập từ cần tìm kiếm:");
        String tuCanTim = scanner.nextLine();
        Node result = dictionary.getList()[dictionary.hashFunction(tuCanTim)].searchNode(tuCanTim);

        if (result != null) {
            // Nếu từ được tìm thấy, hiển thị thông tin
            System.out.println("Thông tin từ:");
            System.out.println("Tiếng Anh: " + result.getValue().getWord());
            System.out.println("Loại từ: " + result.getValue().getType());
            System.out.println("Ý nghĩa: " + result.getValue().getMeaning());
            System.out.println("Ví dụ: " + result.getValue().getExample());
        } else {
            // Nếu không tìm thấy từ, hiển thị thông báo
            System.out.println("Không tìm thấy từ \"" + tuCanTim + "\" trong từ điển!");
        }

        scanner.close();
    }
}
