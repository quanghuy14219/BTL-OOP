import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);

        dima.insertFromFile();
        dico.showAllWords();
        dico.dictionarySearch("h");


    }
}
