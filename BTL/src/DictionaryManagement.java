import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary;

    DictionaryManagement(Dictionary dictionary1) {
        this.dictionary = dictionary1;
    }

    public void insertFromCommandline(int N) {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<N;++i) {
            String word_target = input.nextLine();
            String word_explain = input.nextLine();
            Word newword = new Word(word_target,word_explain);
            dictionary.addWord(newword);
        }
    }
}
