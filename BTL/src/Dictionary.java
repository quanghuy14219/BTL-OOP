import java.util.ArrayList;

public class Dictionary {
    public ArrayList<Word> words;
    public int num; // number word of words
    Dictionary() {
        words = new ArrayList<>();
        num = 0;
    }

    public Dictionary(ArrayList<Word> words) {
        this.words = words;
    }

    public void addWord(Word word) {
        words.add(word);
        num++;
    }
    public void deleteWorld(Word word) {
        words.remove(word);
        num--;
    }
}
