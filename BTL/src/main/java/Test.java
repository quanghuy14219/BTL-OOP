import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.io.IOException;

import static java.awt.SystemColor.text;

public class Test {
    public static void main(String[] args) throws IOException {

        /*
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);

        dima.insertFromFile();
        dico.showAllWords();
        dico.dictionarySearch("h");
        dico.speak("bla bla blah blah bla bla blah blah bla bla blah blah bla bla blah blah ");

         */



        Menu m = new Menu("dedecd");
        m.showWindow();



        /*
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager vm = VoiceManager.getInstance();
        Voice voice = vm.getVoice("kevin16");
        voice.allocate();

        String text;
        text = "You are the apple in my eyes!";
        //voice.setDurationStretch(1.15f);
        voice.speak(text);

         */


    }
}
