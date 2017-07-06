/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.restaurant.View;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class Login extends JFrame {

    private JLabel titleHeader;
    private JLabel lblAccount;
    private JLabel lblPassword;
    private JTextField txtAccount;
    private JPasswordField txtPassword;
    private JButton btnSubmit;
    private JButton btnExit;
    private JButton btnReset;

    public Login() {
        setTitle("Đăng nhập");
        setSize(500, 350);
        
        this.titleHeader = new JLabel("Đăng nhập tài khoản");
        this.lblAccount = new JLabel("Tài khoản : ");
        this.lblPassword = new JLabel("Mật khẩu : ");
        this.txtAccount = new JTextField();
        this.txtPassword = new JPasswordField();
        this.btnExit = new JButton("Thoát");
        this.btnSubmit = new JButton("Đăng nhập");
        this.btnReset = new JButton("Làm lại");

        this.titleHeader.setBounds(180, 10, 250, 50);
        this.lblAccount.setBounds(80, 60, 70, 50);
        this.txtAccount.setBounds(170, 60, 180, 35);
        this.lblPassword.setBounds(80, 130, 70, 50);
        this.txtPassword.setBounds(170, 130, 180, 35);
        this.btnReset.setBounds(70, 200, 100, 35);
        this.btnSubmit.setBounds(190, 200, 100, 35);
        this.btnExit.setBounds(310, 200, 100, 35);

        this.add(this.titleHeader);
        this.add(this.lblAccount);
        this.add(this.txtAccount);
        this.add(this.lblPassword);
        this.add(this.txtPassword);
        this.add(this.btnExit);
        this.add(this.btnReset);
        this.add(this.btnSubmit);

        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAccount.setText("");
                txtPassword.setText("");
            }
        });
        this.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelManager panel = new PanelManager();
                panel.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);

    }
}
