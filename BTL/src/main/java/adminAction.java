import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class adminAction extends JFrame {
    public Dictionary dictionary;
    JTextField txtIn, txtWorld, txtFixT, txtFixTN, txtFixE;
    JTextArea txtOut;
    JButton btnX, btnH;

   adminAction() {
       DictionaryManagement dima = new DictionaryManagement(dictionary);
       dima.insertFromFile();
    }
    public  adminAction(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addEvents() {
       btnX.addActionListener(eventOut);
       btnH.addActionListener(eventOut1);
    }

    ActionListener eventOut = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            processOut(txtIn.getText());
        }
    };

    private void processOut(String text) {
        String s1 = "insert",s2 = "delete", s3 = "fix";
        if (txtIn.getText().equals(s1)) {
            txtOut.setText("Your action has been recorded by the system !!!"
                    + "\nYour job now is to enter a word targer and explain it if you want to insert in section 2!!!");
        }
        if (txtIn.getText().equals(s2)) {
            txtOut.setText("Your action has been recorded by the system !!!"
                    + "\nYour job now is to enter a word you want to delete in section 1!!!");
        }
        if (txtIn.getText().equals(s3)) {
            txtOut.setText("Your action has been recorded by the system !!!"
                    + "\nour job now is to enter a word targer and explain it if you want to fix in section 2!!!!");
        }
    }

    ActionListener eventOut1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = txtWorld.getText();
            processOut1(s);
        }
    };
    private void processOut1(String s) {
        adminAction ad = new adminAction();
        Scanner input = new Scanner(System.in);
        if (s.equals("insert")) {
//            dictionary.addWord();
        } else if (s.equals("delete")) {
            int check = 0;
            String ss = txtWorld.getText();
            for (int i = 0; i < ad.dictionary.num; i++) {
                if (ss.equals(ad.dictionary.words.get(i).getWord_target())) {
                    ad.dictionary.deleteWord(ad.dictionary.words.get(i));
                    check++;
                    break;
                }
            }
            if (check == 0) {
                txtOut.setText("Invalid word! Please try again!");
            } else {
                txtOut.setText("Successfull, Thank you!!!");
            }
        } else if (s.equals("fix")) {
            System.out.println("Enter the word you want to fix: ");
            String fix = input.nextLine();
            int check = 0;
            for (int i = 0; i < dictionary.num; i++) {
                if (fix.equals(dictionary.words.get(i).getWord_target())) {
                    System.out.println("Enter the new word: ");
                    String b = input.nextLine();
                    dictionary.words.get(i).setWord_target(b);
                    System.out.println("Enter the new word explanation: ");
                    String c = input.nextLine();
                    dictionary.words.get(i).setWord_explain(c);
                    check++;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("Invalid word! Please try again!");
            }
        }else{
            System.out.println("Invalid modify!");
        }
    }


    private void addControls() {
        Container con = getContentPane();
        JPanel pnRight = new JPanel();
        pnRight.setPreferredSize(new Dimension(300, 0));
        JPanel pnLeft = new JPanel();
        pnLeft.setLayout(new BorderLayout());
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
        sp.setOneTouchExpandable(true);
        con.add(sp);

        JPanel pnLeft1 = new JPanel();
        pnLeft1.setLayout(new GridLayout(3, 1));
        JPanel pnLeft2 = new JPanel();
        pnLeft2.setLayout(new BoxLayout(pnLeft2, BoxLayout.Y_AXIS));
        JSplitPane spLeft= new JSplitPane(JSplitPane.VERTICAL_SPLIT, pnLeft1, pnLeft2);
        spLeft.setOneTouchExpandable(true);
        pnLeft1.setPreferredSize(new Dimension(400, 200));
        pnLeft.add(spLeft, BorderLayout.CENTER);

        //nhap lenh
        JPanel pnTitle = new JPanel();
        JLabel lblTieude = new JLabel("  ADMIN  ");//tao tieu de
        lblTieude.setForeground(Color.BLUE);
        Font fonttieude = new Font("Georgia", Font.ITALIC, 20);
        lblTieude.setFont(fonttieude);
        pnTitle.add(lblTieude);
        pnLeft1.add(pnTitle);
        /* tao nhap lenh */
        JPanel pnIn = new JPanel();
        JLabel lblA = new JLabel("   Enter Action (Example: delete, fix, insert):           ");
        Font fonttieude1 = new Font("Georgia", Font.ITALIC, 15);
        lblA.setFont(fonttieude1);
        txtIn = new JTextField(10);
        pnIn.add(lblA);
        pnIn.add(txtIn);
        pnLeft1.add(pnIn);
        //tao nut
        JPanel pnX = new JPanel();
        pnX.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnX= new JButton("OK");
        pnX.add(btnX);
        pnLeft1.add(pnX);

        //ketqua
        JPanel pnT = new JPanel();
        pnT.setLayout(new FlowLayout());
        JLabel lblResult = new JLabel("  RESULT:  ");
        lblResult.setForeground(Color.BLUE);
        Font fonttieude21 = new Font("Georgia", Font.ITALIC, 20);
        lblResult.setFont(fonttieude21);
        pnT.add(lblResult);
        pnLeft2.add(pnT);

        JPanel pnWorld = new JPanel();
        pnWorld.setLayout(new FlowLayout());
        JLabel lblWorld = new JLabel("1.Enter the world you want to delete, fix" + txtIn.getText() + ":");
        txtWorld = new JTextField(20);
        pnWorld.add(lblWorld);
        pnWorld.add(txtWorld);
        pnLeft2.add(pnWorld);

        //section2
        JPanel pnWorldFix = new JPanel();
        pnWorldFix.setLayout(new GridLayout(8,1));
        JLabel lblFix = new JLabel("  2.Enter the new world you want to fix or insert" + txtIn.getText() + ":");
        pnWorldFix.add(lblFix);
        pnLeft2.add(pnWorldFix);

        JPanel pnWT = new JPanel();
        pnWT.setLayout(new FlowLayout());
        JLabel lblWT = new JLabel("Enter the world target:");
        txtFixT = new JTextField(10);
        JLabel lblWE = new JLabel("Enter the word explanation: ");
        txtFixTN =  new JTextField(10);
        pnWorldFix.add(lblWT);
        pnWorldFix.add(txtFixT);
        pnWorldFix.add(lblWE);
        pnWorldFix.add(txtFixTN);
        pnLeft2.add(pnWorldFix);

        JPanel pnH = new JPanel();
        pnH.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnH= new JButton("CONFIRM");
        pnH.add(btnH);
        pnLeft2.add(pnH);

        JPanel pnResult = new JPanel();
        pnResult.setLayout(new FlowLayout());
        txtOut = new JTextArea(8, 30);
        txtOut.setWrapStyleWord(true);//xuong dong
        txtOut.setLineWrap(true);//xuong dong
        JScrollPane sc = new JScrollPane(txtOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnResult.add(sc);
        pnLeft2.add(pnResult);

        //lich su
        JPanel pnR = new JPanel();
        JLabel lblHis = new JLabel("  HISTORY:  ");
        lblHis.setForeground(Color.BLUE);
        Font fonttieudeR = new Font("Georgia", Font.ITALIC, 20);
        lblHis.setFont(fonttieudeR);
        pnR.add(lblHis);
        pnRight.add(pnR);
    }

    public void showWindow(){
        this.setSize(800, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//dong
        this.setState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
