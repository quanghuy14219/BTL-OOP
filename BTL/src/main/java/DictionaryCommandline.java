import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.util.Scanner;

public class DictionaryCommandline {
    public Dictionary dictionary;

    DictionaryCommandline(Dictionary dictionary1) {
        this.dictionary = dictionary1;
    }

    public void showAllWords() {
        System.out.println("Show all words");
        int num = dictionary.num;
        System.out.println("No\t\t|English\t\t\t\t\t|Vietnamese");
        for (int i=0;i<num;i++) {
            System.out.println((i+1)+"\t\t|"+dictionary.words.get(i).getWord_target()+"\t\t\t\t\t\t|"+dictionary.words.get(i).getWord_explain());
        }
    }
    public void dictionaryBasic() {
        DictionaryManagement diman = new DictionaryManagement(dictionary);
        diman.insertFromCommandline();
        showAllWords();
    }
    public  void dictionaryAdvanced(String s) { // s là tham số dòng lệnh
        DictionaryManagement diman = new DictionaryManagement(dictionary);
        diman.insertFromFile();
        showAllWords();
        diman.dictionaryLookup(s);
    }
    public void dictionarySearch(String s) {
        System.out.println("Search for: "+s);
        int check = 0;
        for (int i = 0; i < dictionary.num; i++) {
            if (dictionary.words.get(i).getWord_target().indexOf(s) == 0) {
                System.out.println("|English: "+dictionary.words.get(i).getWord_target()+"\t\t"+"|Vietnamese: "+dictionary.words.get(i).getWord_explain());
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Invalid word! Please try again!");
        }
    }
    public static void speak(String s) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager vm = VoiceManager.getInstance();
        Voice voice = vm.getVoice("kevin16");
        voice.allocate();
        //voice.setDurationStretch(1.15f);
        voice.speak(s);
    }
}
