import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);

        dico.dictionaryBasic();                     //Done
        dico.dictionaryAdvanced("Hello");         //Done
        //dima.modifyDictionary("fix");             //Done
        //dico.showAllWords();
        //dico.dictionarySearch("M");               //Done
        dima.dictionaryExportToFile();

    }
}
