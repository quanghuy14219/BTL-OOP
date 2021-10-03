import java.io.*;
import java.util.Scanner;

public class DictionaryManagement {
    private Dictionary dictionary;

    DictionaryManagement(Dictionary dictionary1) {
        this.dictionary = dictionary1;
    }

    public void insertFromCommandline(int N) {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<N;++i) {
            System.out.println("Enter the word : ");
            String word_target = input.nextLine();
            System.out.println("Enter the meaning of the word: ");
            String word_explain = input.nextLine();
            Word newWord = new Word(word_target,word_explain);
            dictionary.addWord(newWord);
        }
    }
    public void insertFromFile() {
        try {
            FileReader fr = new FileReader("F:\\BTP-OOP\\chinh\\BTL\\src\\dictionaries");//cách lưu khác nhau;pull về phải đổi
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split("\\s+");// phân tách chuỗi dụa trên đoạn có nhiều khoảng trắng
                String word_target = txt[0];
                String word_explain = txt[1];
                dictionary.addWord(new Word(word_target, word_explain));
                System.out.println(line);
            }
        } catch (Exception e) {
        }
    }

    public void dictionaryLookup(String s) { // s là tham số dòng lệnh truyền vào
        for (int i = 0; i < dictionary.num; i++) {
            if (s.equals(dictionary.words.get(i).getWord_target())) {
                System.out.println(dictionary.words.get(i).getWord_explain());
                break;
            }
        }
    }

    /** them tu, xoa tu, sua tu.*/
    public void insertDictionary(String s) { // s là tham số dòng lệnh truyền vào
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (s == "insert") {
            System.out.println("Enter the number of words you want to add: ");
            insertFromCommandline(N);
        } else if (s == "delete") {
            System.out.println("Enter the  word you want to delete: ");
            String del = input.nextLine();
            int check = 0;
            for (int i = 0; i < dictionary.num; i++) {
                if (del.equals(dictionary.words.get(i).getWord_explain())) {
                    dictionary.deleteWorld(dictionary.words.get(i));
                } else {
                    check++;
                }
            }
            if (check != 0) {
                System.out.println("Invalid world! please try again!");
            }
        } else if (s == "fix") {
//            System.out.println("Enter the world you want to fix: ");
//            String fix = input.nextLine();
//
        }
    }

}
