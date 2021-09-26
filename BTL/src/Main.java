public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        dima.insertFromCommandline(4);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);
        dico.showAllWords();
    }
}
