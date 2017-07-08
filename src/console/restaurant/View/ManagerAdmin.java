/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.restaurant.View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class ManagerAdmin extends JPanel {

    private JLabel lblSearch;
    private JTextField txtSearch;
    private JButton btnCreate;

//  Xử lí bảng table
    private JTable table;
    private DefaultTableModel modelAdmin;
    private JScrollPane scrollPane;

    private JButton btnFirst;
    private JButton btnPrevious;
    private JButton btnPage;
    private JButton btnNext;
    private JButton btnLast;

    private int page = 1;

    public ManagerAdmin() {
        this.setBackground(new Color(250, 250, 250));
        this.setBounds(320, 130, 1100, 530);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.lblSearch = new JLabel("Nhập tên tài khoản : ");
        this.txtSearch = new JTextField();
        this.btnCreate = new JButton("Tạo mới");
//       Button Phân trang
        this.btnFirst = new JButton("<<");
        this.btnPrevious = new JButton("<");
        this.btnPage = new JButton(String.valueOf(page));
        this.btnNext = new JButton(">");
        this.btnLast = new JButton(">>");

        this.lblSearch.setBounds(50, 20, 200, 50);
        this.txtSearch.setBounds(180, 25, 150, 35);
        this.btnCreate.setBounds(900, 25, 120, 35);
//        setBounds Button phân trang
        this.btnFirst.setBounds(390, 475, 50, 35);
        this.btnPrevious.setBounds(460, 475, 50, 35);
        this.btnPage.setBounds(530, 475, 50, 35);
        this.btnNext.setBounds(600, 475, 50, 35);
        this.btnLast.setBounds(670, 475, 50, 35);

        String[] columNames = {"ID", "Họ và tên", "Tài khoản", "Mật khẩu", "Ngày tạo", "Ngày cập nhật"};
        Object[][] data = {};
        this.modelAdmin = new DefaultTableModel(data, columNames);
        this.table = new JTable(modelAdmin);
//         this.table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(160);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(180);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(180);
        this.table.getColumnModel().getColumn(3).setPreferredWidth(180);
        this.table.getColumnModel().getColumn(4).setPreferredWidth(180);
        this.table.getColumnModel().getColumn(5).setPreferredWidth(180);
//        this.table.setRowHeight(24);
//        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        this.table.

//        Hiển thị kích thước bảng
        this.scrollPane = new JScrollPane(table);
        this.scrollPane.setBounds(0, 80, 1100, 380);

        this.btnCreate.setBackground(Color.white);
        this.btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminForm adminFrom = new AdminForm();
                adminFrom.setVisible(true);
            }
        });

        this.add(this.lblSearch);
        this.add(this.txtSearch);
        this.add(this.btnCreate);
        this.add(scrollPane);
//        add button phân trang
        this.add(this.btnFirst);
        this.add(this.btnPrevious);
        this.add(this.btnPage);
        this.add(this.btnNext);
        this.add(this.btnLast);
        this.setLayout(null);
    }

}
