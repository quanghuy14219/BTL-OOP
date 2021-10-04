public class Test {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);
        dima.insertFromFile();
    }
}
