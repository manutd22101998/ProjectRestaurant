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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class FoodForm extends JFrame {

    private JLabel lblHeader;
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblUnitPrice;
    private JTextField txtUnitPrice;
    private JLabel lblImage;
    private JTextField txtImage;
    private JLabel lblOption;
    private JComboBox cmbOption;
    private JLabel lblDescription;
    private JTextArea txtDescription;
    private JButton btnSubmit;
    private JButton btnReset;

    public FoodForm() {
        this.setTitle("Tạo mới");
        this.setSize(500, 550);

        this.lblHeader = new JLabel("Thêm mới món ăn");
        this.lblName = new JLabel("Tên món ăn : ");
        this.txtName = new JTextField();
        this.lblUnitPrice = new JLabel("Giá : ");
        this.txtUnitPrice = new JTextField();
        this.lblImage = new JLabel("Ảnh : ");
        this.txtImage = new JTextField();
        this.lblOption = new JLabel("Danh mục : ");
        String[] languages = new String[]{"Đồ nướng", "Hải sản", "Nước ngọt", "Bia"};
        this.cmbOption = new JComboBox<>(languages);
        this.lblDescription = new JLabel("Mô tả : ");
        this.txtDescription = new JTextArea();
        this.btnSubmit = new JButton("Lưu");
        this.btnReset = new JButton("Làm lại");

        this.lblHeader.setBounds(200, 20, 150, 50);
        this.lblName.setBounds(100, 70, 100, 50);
        this.txtName.setBounds(200, 75, 180, 35);
        this.lblUnitPrice.setBounds(120, 130, 100, 35);
        this.txtUnitPrice.setBounds(200, 130, 180, 35);
        this.lblImage.setBounds(120, 190, 100, 35);
        this.txtImage.setBounds(200, 190, 180, 35);
        this.lblOption.setBounds(90, 250, 100, 35);
        this.cmbOption.setBounds(200, 255, 120, 40);
        this.lblDescription.setBounds(120, 310, 100, 35);
        this.txtDescription.setBounds(200, 310, 180, 70);
        this.txtDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        this.btnSubmit.setBounds(200, 420, 100, 40);
        this.btnReset.setBounds(330, 420, 100, 40);
        
        this.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtUnitPrice.setText("");
                txtImage.setText("");
                txtDescription.setText("");
                cmbOption.setSelectedIndex(0);
            }
        });

        this.add(this.lblHeader);
        this.add(this.lblName);
        this.add(this.txtName);
        this.add(this.lblUnitPrice);
        this.add(this.txtUnitPrice);
        this.add(this.lblImage);
        this.add(this.txtImage);
        this.add(this.lblOption);
        this.add(this.cmbOption);
        this.add(this.lblDescription);
        this.add(this.txtDescription);
        this.add(this.btnSubmit);
        this.add(this.btnReset);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        FoodForm foodForm = new FoodForm();
        foodForm.setVisible(true);
    }
}
