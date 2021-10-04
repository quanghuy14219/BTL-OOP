import java.util.ArrayList;

public class Dictionary {
    public ArrayList<Word> words;
    public int num; // number word of words
    Dictionary() {
        //words = new ArrayList<Word>();
        num = 0;
    }

    Dictionary(ArrayList<Word> words) {
        this.words = words;
        this.num = words.size();
    }

    public void addWord(Word word) {
        words.add(word);
        num++;
    }
    public void deleteWord(Word word) {
        words.remove(word);
        num--;
    }
}
