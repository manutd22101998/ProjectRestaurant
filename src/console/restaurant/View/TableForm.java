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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class TableForm extends JFrame {

    private JLabel lblHeader;
    private JLabel lblName;
    private JLabel lblStatus;
    private JTextField txtName;
    private JComboBox cmbStatus;
    private JButton btnSubmit;
    private JButton btnReset;

    public TableForm() {
        this.setTitle("Tạo mới");
        this.setSize(500, 400);

        this.lblHeader = new JLabel("Tạo mới bàn");
        this.lblName = new JLabel("Tên bàn : ");
        this.txtName = new JTextField();
        this.lblStatus = new JLabel("Trạng thái : ");
        String[] status = new String[]{"Sẵn sàng", "Bàn hỏng"};
        this.cmbStatus = new JComboBox(status);
        this.btnSubmit = new JButton("Lưu");
        this.btnReset = new JButton("Làm lại");

        this.lblHeader.setBounds(200, 20, 250, 50);
        this.lblName.setBounds(100, 70, 100, 50);
        this.txtName.setBounds(180, 75, 180, 35);
        this.lblStatus.setBounds(85, 150, 100, 50);
        this.cmbStatus.setBounds(180, 150, 100, 40);
        this.cmbStatus.setBorder(BorderFactory.createLineBorder(Color.black));
        this.btnSubmit.setBounds(200, 230, 100, 40);
        this.btnReset.setBounds(320, 230, 100, 40);

        this.add(this.lblHeader);
        this.add(this.lblName);
        this.add(this.txtName);
        this.add(this.lblStatus);
        this.add(this.lblStatus);
        this.add(this.cmbStatus);
        this.add(this.btnSubmit);
        this.add(this.btnReset);

        this.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                cmbStatus.setSelectedIndex(0);
            }
        });
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        TableForm tableForm = new TableForm();
        tableForm.setVisible(true);
    }

}
