import java.io.*;
import java.util.Scanner;

public class DictionaryManagement {
    public Dictionary dictionary;

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
            FileReader fr = new FileReader(".\\src\\dictionaries.txt");//cách lưu khác nhau;pull về phải đổi
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split("\t+");// phân tách chuỗi dụa trên dấu tab, bởi giữa word target và word explain cách nhau dấu tab quy định trong hướng dẫn
                String word_target = txt[0];
                String word_explain = txt[1];
                System.out.println(word_target+"\t"+word_explain);

//                Word nw = new Word(word_target,word_explain);
//                this.dictionary.addWord(nw);

                System.out.println("2.7");
                System.out.println(line);
                System.out.println("3");
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
        if (s == "insert") {
            System.out.println("Enter the number of words you want to add: ");
            int N = input.nextInt();
            insertFromCommandline(N);
        } else if (s == "delete") {
            System.out.println("Enter the  word you want to delete: ");
            String del = input.nextLine();
            int check = 0;
            for (int i = 0; i < dictionary.num; i++) {
                if (del.equals(dictionary.words.get(i).getWord_target())) {
                    dictionary.deleteWord(dictionary.words.get(i));
                    check++;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("Invalid word! Please try again!");
            }
        } else if (s == "fix") {
            System.out.println("Enter the word you want to fix: ");
            String fix = input.nextLine();
            int check = 0;
            for (int i = 0; i < dictionary.num; i++) {
                if (fix.equals(dictionary.words.get(i).getWord_target())) {
                    System.out.println("Enter the word to fix target");
                    String b = input.nextLine();
                    dictionary.words.get(i).setWord_target(String.copyValueOf(b.toCharArray()));
                    System.out.println("Enter the word to fix explanation");
                    String c = input.nextLine();
                    dictionary.words.get(i).setWord_explain(String.copyValueOf(c.toCharArray()));
                    check++;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("Invalid word! Please try again!");
            }
        }
    }

    public void dictionaryExportToFile() throws IOException {
        BufferedWriter bw = null;
        try {
            FileWriter writer = new FileWriter(".\\src\\dictionary.txt");
            bw = new BufferedWriter(writer);
            for (int i = 0; i < dictionary.num; i++) {
                bw.write(dictionary.words.get(i).getWord_target() + "\t" + dictionary.words.get(i).getWord_explain() + "\n");
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

}
