public class Dictionary {
    Word[] words;
    int num; // number word of words
    Dictionary() {
        words = new Word[1000000];
        num = 0;
    }
    Dictionary(Word[] words) {
        this.words = words;
    }
    void addWord(Word word) {
        words[num] = word;
        num++;
    }
}
