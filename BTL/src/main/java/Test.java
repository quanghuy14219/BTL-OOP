import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.io.IOException;

import static java.awt.SystemColor.text;

public class Test {
    public static void main(String[] args) throws IOException {

        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);

        dima.insertFromFile();
        Word a = new Word("helloo", "xin chao");
        Word b = new Word("hii", "xin chao");
        dictionary.addWord(a);
        dictionary.addWord(b);
        dima.modifyDictionary("delete");
        dima.dictionaryExportToFile();
//        dico.showAllWords();

    }
}
