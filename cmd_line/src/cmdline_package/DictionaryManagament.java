package cmdline_package;
import java.util.Scanner;

public class DictionaryManagement extends Dictionary {
    public static Scanner scan = new Scanner(System.in);
    public void insertFromCommandline() {
        System.out.println("Số lượng từ vựng cần thêm: ");
        int n; // số lượng từ vựng
        String input = scan.nextLine();
        if (input.matches("[0-9]+")) {
            n = Integer.parseInt(input);
            // nhập vào n từ vựng
            for (int i = 0; i < n; i++) {
                boolean wordAlreadyExists = false;
                System.out.println(i + 1 + ".Nhập từ mới: ");
                String word_target_ = scan.nextLine();
                for (Word word : Words) {
                    if (word_target_.equals(word.getWord_target())) {
                        System.out.println("Từ đã tồn tại trong từ điển!");
                        wordAlreadyExists = true;
                        break;
                    }
                }
                if (!wordAlreadyExists) {
                    System.out.println("Nhập dạng từ của từ: ");
                    String word_type_ = scan.nextLine();

                    System.out.println("Nhập định nghĩa tiếng Việt của từ: ");
                    String word_explain_ = scan.nextLine();

                    System.out.println("Nhập cách phát âm từ: ");
                    String pronunciation_ = scan.nextLine();

                    System.out.println("Nhập ví dụ của từ: ");
                    String example_ = scan.nextLine();

                    Word temp = new Word(word_target_, word_type_, word_explain_, pronunciation_, example_);
                    temp.setId(word_count);
                    Words.add(temp); // add vào arraylist
                    word_count++;
                }
            }
        } else {
            System.out.println("Đầu vào không hợp lệ !");
        }
    }
}

