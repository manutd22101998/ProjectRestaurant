/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.restaurant.View;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class AdminForm extends JFrame {

    private JLabel lblHeader;
    private JLabel lblName;
    private JLabel lblAccount;
    private JLabel lblPassword;
    private JTextField txtName;
    private JTextField txtAccount;
    private JPasswordField txtPassword;
    private JButton btnSubmit;
    private JButton btnReset;

    public AdminForm() {
        this.setTitle("Tạo mới");
        this.setSize(500, 400);

        this.lblHeader = new JLabel("Đăng kí tài khoản");
        this.lblName = new JLabel("Họ và tên : ");
        this.txtName = new JTextField();
        this.lblAccount = new JLabel("Tài khoản : ");
        this.txtAccount = new JTextField();
        this.lblPassword = new JLabel("Mật khẩu : ");
        this.txtPassword = new JPasswordField();
        this.btnSubmit = new JButton("Lưu");
        this.btnReset = new JButton("Làm lại");

        this.lblHeader.setBounds(200, 20, 250, 50);
        this.lblName.setBounds(100, 80, 100, 50);
        this.txtName.setBounds(180, 80, 150, 35);
        this.lblAccount.setBounds(95, 140, 100, 50);
        this.txtAccount.setBounds(180, 140, 150, 35);
        this.lblPassword.setBounds(100, 200, 100, 35);
        this.txtPassword.setBounds(180, 200, 150, 35);
        this.btnSubmit.setBounds(200, 270, 80, 40);
        this.btnReset.setBounds(310, 270, 80, 40);
        
        this.add(this.lblHeader);
        this.add(this.lblName);
        this.add(this.txtName);
        this.add(this.lblAccount);
        this.add(this.txtAccount);
        this.add(this.lblPassword);
        this.add(this.txtPassword);
        this.add(this.btnSubmit);
        this.add(this.btnReset);
        
        this.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtAccount.setText("");
                txtPassword.setText("");
            }
        });
        
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        AdminForm adminForm = new AdminForm();
        adminForm.setVisible(true);
    }

}
