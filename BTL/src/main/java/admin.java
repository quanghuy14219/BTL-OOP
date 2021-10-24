import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame {
    private final String user = "Conan";
    private final String pass = "luffy2k2";
    JTextField txtUser, txtPass;
    JCheckBox check;
    JButton OK;
    public admin(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addEvents() {
        OK.addActionListener(evenLogin);
    }

    ActionListener evenLogin = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            process();
        }
    };
    void process() {
        if (getUser().equals(txtUser.getText()) && getPass().equals(txtPass.getText())) {
            adminAction d = new adminAction("d");
            d.showWindow();
        }
    }
    private void addControls() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout( new  GridLayout(5, 1));
        con.add(pnMain);

        JPanel pnTitle = new JPanel();
        JLabel lblTieude = new JLabel("  LOGIN  ");//tao tieu de
        lblTieude.setForeground(Color.BLUE);
        Font fonttieude = new Font("Georgia", Font.ITALIC, 24);
        lblTieude.setFont(fonttieude);
        pnTitle.add(lblTieude);
        pnMain.add(pnTitle);

        //nhap ten
        JPanel pnUser = new JPanel();
        pnUser.setLayout(new FlowLayout());
        JLabel lblUser = new JLabel("User:           ");
        Font fonttieude1 = new Font("Georgia", Font.ITALIC, 18);
        lblUser.setFont(fonttieude1);
        txtUser = new JTextField(20);
        pnUser.add(lblUser);
        pnUser.add(txtUser);
        pnMain.add(pnUser);

        //nhap pass
        JPanel pnPass = new JPanel();
        pnUser.setLayout(new FlowLayout());
        JLabel lblPass = new JLabel("Passworld: ");
        Font fonttieude2 = new Font("Georgia", Font.ITALIC, 18);
        lblPass.setFont(fonttieude2);
        txtPass = new JTextField(20);
        pnPass.add(lblPass);
        pnPass.add(txtPass);
        pnMain.add(pnPass);

        //xac nhan
        JPanel pnX = new JPanel();
        pnX.setLayout(new FlowLayout(FlowLayout.CENTER));
        check = new JCheckBox("Remember Passworld");
        pnX.add(check);
        pnMain.add(pnX);

        //nut
        JPanel pnOk = new JPanel();
        pnOk.setLayout(new FlowLayout(FlowLayout.CENTER));
        OK = new JButton("OK");
        pnOk.add(OK);
        pnMain.add(pnOk);

    }

    public void showWindow(){
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//dong
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
