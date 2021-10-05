import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);
//        dima.insertFromFile();
        dima.insertFromCommandline(2);
        dico.showAllWords();
//        dico.dictionarySearch("H");
//        dima.insertDictionary("fix");
//        dico.showAllWords();
        dima.dictionaryExportToFile();
    }
}
