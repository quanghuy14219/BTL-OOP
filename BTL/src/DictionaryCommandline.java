import java.util.Scanner;

public class DictionaryCommandline {
    public Dictionary dictionary;
    DictionaryCommandline(Dictionary dictionary1) {
        this.dictionary = dictionary1;
    }


    public void showAllWords() {
        int num = dictionary.num;
        System.out.println("No\t\t|English\t\t\t\t\t|Vietnamese");
        for (int i=0;i<num;i++) {
            System.out.println((i+1)+"\t\t|"+dictionary.words[i].word_target+"\t\t\t\t\t\t|"+dictionary.words[i].word_explain);
        }
    }
    public void dictionaryBasic() {
        DictionaryManagement diman = new DictionaryManagement(dictionary);
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        diman.insertFromCommandline(N);
        showAllWords();
    }

}
