public class Dictionary {
    public Word[] words;
    public int num; // number word of words
    Dictionary() {
        words = new Word[1000000];
        num = 0;
    }
    Dictionary(Word[] words1) {
        words = new Word[words1.length];
        num = words1.length;
        for(int i=0;i<num;i++) {
            words[i] = words[i];
        }
    }
    void addWord(Word word) {
        words[num] = word;
        num++;
    }
}
