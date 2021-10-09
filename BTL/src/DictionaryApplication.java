import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DictionaryApplication extends JFrame {


    DictionaryApplication() {
        int w = 600;
        int h = 700;
        int h1 = 80;
        int h2 = h - h1;


        this.setTitle("Dictionary English - Vietnamese");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(w, h);
        this.setLayout(null);





        JLabel labelfirst = new JLabel();
        labelfirst.setBounds(0, 0, w, h1);
        labelfirst.setLayout(null);
        Border borderfirst = BorderFactory.createLineBorder(Color.BLACK);
        labelfirst.setBorder(borderfirst);
        labelfirst.setHorizontalAlignment(JLabel.LEFT);
        labelfirst.setVerticalAlignment(JLabel.TOP);


        JLabel label1 = new JLabel();
        label1.setText("Enter the word here:");
        label1.setFont(new Font("", Font.PLAIN, 20));
        label1.setBounds(0, 0, w, h1/4);
        label1.setLayout(null);


        JTextField textField = new JTextField();
        textField.setBounds(0, 0, w*4/5, h1*3/4);
        textField.setFont(new Font("", Font.PLAIN, 20));
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.WHITE);
        textField.setCaretColor(Color.BLACK);
        //textField.setText("Username");
        //textField.setEditable(false);

        JButton buttonSubmit = new JButton("Submit");
        //button.addActionListener(e -> {});
        buttonSubmit.setFocusable(false);
        buttonSubmit.setBounds(w*4/5, 0, w/5,h1*3/4 );

        JLabel label2 = new JLabel();
        label2.setBounds(0, h1/4, w, h1*3/4);
        label2.setLayout(null);
        label2.add(textField);
        label2.add(buttonSubmit);



        JLabel labelsecond = new JLabel();
        labelsecond.setBounds(0, h1, w/6, h2);
        labelsecond.setLayout(null);
        Border bordersecond = BorderFactory.createLineBorder(Color.BLACK);
        labelsecond.setBorder(bordersecond);
        labelsecond.setHorizontalAlignment(JLabel.LEFT);
        labelsecond.setVerticalAlignment(JLabel.TOP);
        labelsecond.setText("Function");



        JLabel labelthird = new JLabel();
        labelthird.setBounds(w/6, h1, w/3, h2);
        labelthird.setLayout(null);
        Border borderthird = BorderFactory.createLineBorder(Color.BLACK);
        labelthird.setBorder(borderthird);
        labelthird.setHorizontalAlignment(JLabel.LEFT);
        labelthird.setVerticalAlignment(JLabel.TOP);
        labelthird.setText("English word");



        JLabel labelfourth = new JLabel();
        labelfourth.setBounds(w/2, h1, w/2, h2);
        labelfourth.setLayout(null);
        Border borderfourth = BorderFactory.createLineBorder(Color.BLACK);
        labelfourth.setBorder(borderfourth);
        labelfourth.setHorizontalAlignment(JLabel.LEFT);
        labelfourth.setVerticalAlignment(JLabel.TOP);
        labelfourth.setText("Explain");




        labelfirst.add(label1);
        labelfirst.add(label2);
        this.add(labelfirst);
        this.add(labelsecond);
        this.add(labelthird);
        this.add(labelfourth);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon imageicon = new ImageIcon(".//pictures//icon.jpg");
        this.setIconImage(imageicon.getImage());

    }

    public static void runApplication() {
        new DictionaryApplication();
    }

    public static void main(String[] args) {
        new DictionaryApplication();
    }
}
