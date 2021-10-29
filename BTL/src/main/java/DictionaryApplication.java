import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DictionaryApplication extends JFrame {
    public Dictionary dictionary;

    DictionaryApplication() {
        this.dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(this.dictionary);
        dima.insertFromFile();
    }

    DictionaryApplication(Dictionary dictionary1) {
        this.dictionary = dictionary1;
    }

    public void run() {

        int w = 1200;
        int h = 600;
        int h1 = 80;
        int h2 = h - h1;


        this.setTitle("Dictionary English - Vietnamese");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(w, h);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);




        /* Search. **/
        JLabel labelfirst = new JLabel();
        labelfirst.setBounds(0, 0, w, h1);
        labelfirst.setLayout(null);
        Border borderfirst = BorderFactory.createLineBorder(Color.BLACK);
        labelfirst.setBorder(borderfirst);
        labelfirst.setHorizontalAlignment(JLabel.LEFT);
        labelfirst.setVerticalAlignment(JLabel.TOP);
        labelfirst.setBackground(new Color(60, 60, 60));
        labelfirst.setOpaque(true);

            //header
        JLabel labelfirst1 = new JLabel();
        labelfirst1.setText("       Enter the word here:      ");
        labelfirst1.setFont(new Font("Georgia", Font.ITALIC, 21));
        labelfirst1.setForeground(Color.WHITE);
        labelfirst1.setBounds(0, 0, w, 30);
        labelfirst1.setLayout(null);

            //Area to write
        JTextField textField = new JTextField();
        textField.setBounds(0, 5, w * 4 / 5, h1 - 30);
        textField.setFont(new Font("Georgia", Font.PLAIN, 25));
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.WHITE);
        textField.setCaretColor(Color.BLACK);
        //textField.setText("Username");
        //textField.setEditable(false);

            //nut Submit
        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setFont(new Font("Georgia", Font.BOLD, 20));
        buttonSubmit.setFocusable(false);
        buttonSubmit.setBounds(w * 4 / 5, 0, w / 5, h1 * 3 / 4);
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setForeground(Color.WHITE);

            // labelfirst body
        JLabel labelfirst2 = new JLabel();
        labelfirst2.setBounds(0, h1 / 4, w, h1 * 3 / 4);
        labelfirst2.setLayout(null);
        labelfirst2.add(textField);
        labelfirst2.add(buttonSubmit);


        labelfirst.add(labelfirst1);
        labelfirst.add(labelfirst2);


        /* English word. **/
        JLabel labelsecond = new JLabel();
        labelsecond.setBounds(0, h1, w / 3, h2);
        labelsecond.setLayout(null);
        Border bordersecond = BorderFactory.createLineBorder(Color.BLACK);
        labelsecond.setBorder(bordersecond);
        labelsecond.setHorizontalAlignment(JLabel.LEFT);
        labelsecond.setVerticalAlignment(JLabel.TOP);
        labelsecond.setBackground(new Color(60, 60, 60));
        labelsecond.setOpaque(true);

            //header
        JLabel labelsecond1 = new JLabel();
        labelsecond1.setText("       English:");
        labelsecond1.setForeground(Color.WHITE);
        labelsecond1.setFont(new Font("Georgia", Font.ITALIC, 25));
        labelsecond1.setBounds(0, 0, w / 3 - 150, 40);
        labelsecond1.setLayout(null);
        Border bordersecond1 = BorderFactory.createLineBorder(Color.BLACK);
        labelsecond1.setBorder(bordersecond1);
        labelsecond1.setBackground(new Color(30, 30, 30));
        labelsecond1.setOpaque(true);

            // buttonTranslate
        JButton buttonTranslate = new JButton("Translate");
        buttonTranslate.setFont(new Font("Georgia", Font.BOLD, 20));
        buttonTranslate.setFocusable(false);
        buttonTranslate.setBounds(w / 3 - 150, 0, 150, 40);
        buttonTranslate.setBackground(Color.BLACK);
        buttonTranslate.setForeground(Color.WHITE);
        Border borderTranslate = BorderFactory.createLineBorder(Color.BLACK);
        buttonTranslate.setBorder(borderTranslate);


            // body
        JPanel panelsecond = new JPanel();
        panelsecond.setBounds(0, 40, w / 3, h2 - 40);
        panelsecond.setBackground(new Color(60, 60, 60));
        panelsecond.setLayout(null);

            // List
        final DefaultListModel<String> searchDList = new DefaultListModel<String>();
        final JList searchList = new JList(searchDList);
        searchList.setFont(new Font("Georgia", Font.PLAIN, 25));
        searchList.setForeground(Color.WHITE);
        searchList.setBackground(new Color(60, 60, 60));
        searchList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            // Scroll
        JScrollPane searchPane = new JScrollPane(searchList);
        searchPane.setBounds(0, 0, w / 3, h2 - 40);





        panelsecond.add(searchPane);
        labelsecond.add(labelsecond1);
        labelsecond.add(panelsecond);
        labelsecond.add(buttonTranslate);

        /* Explain. **/

        JLabel labelthird = new JLabel();
        labelthird.setBounds(w / 3, h1, w * 2 / 3, h2);
        labelthird.setLayout(null);
        Border borderthird = BorderFactory.createLineBorder(Color.BLACK);
        labelthird.setBorder(borderthird);
        labelthird.setHorizontalAlignment(JLabel.LEFT);
        labelthird.setVerticalAlignment(JLabel.TOP);
        labelthird.setBackground(Color.LIGHT_GRAY);
        labelthird.setOpaque(true);

            //header
        JLabel labelthird1 = new JLabel();
        labelthird1.setText("       Definition:");
        labelthird1.setForeground(Color.BLACK);
        labelthird1.setFont(new Font("Georgia", Font.ITALIC, 25));
        labelthird1.setBounds(0, 0, w * 2 / 3, 40);
        labelthird1.setLayout(null);
        Border borderthird1 = BorderFactory.createLineBorder(Color.BLACK);
        labelthird1.setBorder(borderthird1);
        labelthird1.setBackground(Color.WHITE);
        labelthird1.setOpaque(true);

            // label English word and speak
        JLabel labelthird2 = new JLabel();
        labelthird2.setForeground(Color.BLACK);
        labelthird2.setFont(new Font("Georgia", Font.ITALIC, 25));
        labelthird2.setBounds(0, 40, w * 2 / 3, 50);
        labelthird2.setLayout(null);
        Border borderthird2 = BorderFactory.createLineBorder(Color.BLACK);
        labelthird2.setBorder(borderthird2);
        labelthird2.setBackground(new Color(170, 170, 170));
        labelthird2.setOpaque(true);

            // buttonListen
        JButton buttonListen = new JButton("Listen");
        buttonListen.setFont(new Font("Georgia", Font.BOLD, 20));
        buttonListen.setFocusable(false);
        buttonListen.setBounds(w * 7 / 15, 0, w / 5, 50);
        buttonListen.setBackground(Color.BLACK);
        buttonListen.setForeground(Color.WHITE);
        Border borderListen = BorderFactory.createLineBorder(Color.BLACK);
        buttonListen.setBorder(borderListen);

            // Explain in Vietnamese
        JLabel labelthird3 = new JLabel();
        labelthird3.setForeground(Color.BLACK);
        labelthird3.setFont(new Font("Georgia", Font.ITALIC, 25));
        labelthird3.setBounds(0, 90, w * 2 / 3, h2-90);
        labelthird3.setLayout(null);
        Border borderthird3 = BorderFactory.createLineBorder(Color.BLACK);
        labelthird3.setBorder(borderthird3);
        labelthird3.setBackground(Color.LIGHT_GRAY);
        labelthird3.setOpaque(true);
        //labelthird3.setText("huy");
        labelthird3.setHorizontalAlignment(JLabel.LEFT);
        labelthird3.setVerticalAlignment(JLabel.TOP);










        labelthird2.add(buttonListen);
        labelthird.add(labelthird1);
        labelthird.add(labelthird2);
        labelthird.add(labelthird3);
        /* Event **/

                // buttonSubmit
        buttonSubmit.addActionListener(e -> {
            String s = textField.getText();
            searchDList.clear();

            int check = 0;
            for (int i = 0; i < dictionary.num; i++) {
                if (dictionary.words.get(i).getWord_target().indexOf(s) == 0) {
                    searchDList.addElement(dictionary.words.get(i).getWord_target());
                    check++;
                }
            }
            if (check == 0) {
                //System.out.println("Invalid word! Please try again!");
                JOptionPane.showMessageDialog(null, "No Result", "Can't find any word", JOptionPane.INFORMATION_MESSAGE);
            }

            searchList.setSelectedIndex(0);

        });

                //buttonTranslate
        buttonTranslate.addActionListener(e -> {
            String edata = "";
            String vdata = "";
            if (searchList.getSelectedIndex() != -1) {

                edata = "       Word: " + searchList.getSelectedValue();
                labelthird2.setText(edata);

                for (int i = 0; i < dictionary.num; i++) {
                    String data = dictionary.words.get(i).getWord_target();
                    if (searchList.getSelectedValue().equals(data)) {
                        vdata = "              -"+dictionary.words.get(i).getWord_explain();
                        break;
                    }
                }
                labelthird3.setText(vdata);
            }

        });

                //buttonListen
        buttonListen.addActionListener(e -> {
            String data = "";
            if (searchList.getSelectedIndex() != -1) {
                data = ""+ labelthird2.getText().substring(13);
                DictionaryCommandline.speak(data);
            }
        });

        /* MainFrame add **/
        this.add(labelfirst);
        this.add(labelsecond);
        this.add(labelthird);

        /* Final **/
        this.setVisible(true);
        //this.setResizable(false);
        ImageIcon imageicon = new ImageIcon(".//pictures//icon.jpg");
        this.setIconImage(imageicon.getImage());

    }

    public void runApplication() {
        DictionaryApplication app = new DictionaryApplication();
        app.run();
    }

    public static void main(String[] args) {
        DictionaryApplication app = new DictionaryApplication();
        app.run();
    }
}
