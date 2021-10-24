import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    JButton btnTuDien, btnAdmin, btnHelp, btnExit;
    public Menu(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnHelp.addActionListener(new HelpEvent());
        btnTuDien.addActionListener(evenTuDien);
        btnAdmin.addActionListener(evenAdmin);
    }
    class HelpEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null," Chi tiết xin liên hệ: 0232323283" +
                    "\n hoặc gửi mail cho chúng tôi: dsdjdsdsd@gmail.com \n để giải đáp mọi thắc mắc hoặc các góp ý của bạn."
                    + "\n Xin trân thành cảm ơn!!!");
        }
    }

    ActionListener evenTuDien = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            DictionaryApplication lulu = new DictionaryApplication();
            lulu.runApplication();
        }
    };
    ActionListener evenAdmin = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            admin kiki = new admin("aa");
            kiki.showWindow();
        }
    };
    private void addControls() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout( new GridLayout(5, 1));
        con.add(pnMain);

        //tao tieu de
        JPanel pnTitle = new JPanel();
//        pnTitle.setLayout(new FlowLayout());//bo tri thanh phan con tu trai sang phai
        JLabel lblTieude = new JLabel("     MY DICTIONARY  ");//tao tieu de
        lblTieude.setForeground(Color.BLUE);
        Font fonttieude = new Font("Georgia", Font.ITALIC, 24);
        lblTieude.setFont(fonttieude);
        pnTitle.add(lblTieude);
        pnMain.add(pnTitle);

        //tao cac nut
        JPanel pnTuDien = new JPanel();
//        pnTuDien.setLayout(new FlowLayout());
        btnTuDien = new JButton("Dictionary English - Vietnamese");
        Font fonttieude1 = new Font("Georgia", Font.ITALIC, 19);
        btnTuDien.setFont(fonttieude1);
        pnTuDien.add(btnTuDien);
        pnMain.add(pnTuDien);

        JPanel pnAdmin = new JPanel();
//        pnAdmin.setLayout(new FlowLayout());
        btnAdmin = new JButton("                       Admin                       ");
        Font fonttieude2 = new Font("Georgia", Font.ITALIC, 19);
        btnAdmin.setFont(fonttieude2);
        pnAdmin.add(btnAdmin);
        pnMain.add(pnAdmin);

        JPanel pnHelp = new JPanel();
//        pnAdmin.setLayout(new FlowLayout());
        btnHelp = new JButton("                          Help                       ");
        Font fonttieude3 = new Font("Georgia", Font.ITALIC, 19);
        btnHelp.setFont(fonttieude3);
        pnHelp.add(btnHelp);
        pnMain.add(pnHelp);

        JPanel pnExit = new JPanel();
//        pnAdmin.setLayout(new FlowLayout());
        btnExit = new JButton("                        Exit                          ");
        Font fonttieude4 = new Font("Georgia", Font.ITALIC, 19);
        btnExit.setFont(fonttieude4);
        pnExit.add(btnExit);
        pnMain.add(pnExit);
    }

    public void showWindow(){
        this.setSize(500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//dong
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
