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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class ManagerTable extends JPanel {

    private JLabel lblSearch;
    private JTextField txtSearch;
    private JButton btnCreate;

    private JTable table;
    private DefaultTableModel modelTable;
    private JScrollPane scrollPane;

    private JButton btnFirst;
    private JButton btnPrevious;
    private JButton btnPage;
    private JButton btnNext;
    private JButton btnLast;

    private int page = 1;

    public ManagerTable() {
        this.setBackground(Color.white);
        this.setBounds(320, 130, 1100, 530);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.lblSearch = new JLabel("Nhập tên bàn : ");
        this.txtSearch = new JTextField();
        this.btnCreate = new JButton("Tạo mới");
//       Button Phân trang
        this.btnFirst = new JButton("<<");
        this.btnPrevious = new JButton("<");
        this.btnPage = new JButton(String.valueOf(page));
        this.btnNext = new JButton(">");
        this.btnLast = new JButton(">>");

        this.lblSearch.setBounds(50, 20, 200, 50);
        this.txtSearch.setBounds(150, 25, 150, 35);
        this.btnCreate.setBounds(900, 25, 120, 35);
//        setBounds Button phân trang
        this.btnFirst.setBounds(390, 475, 50, 35);
        this.btnPrevious.setBounds(460, 475, 50, 35);
        this.btnPage.setBounds(530, 475, 50, 35);
        this.btnNext.setBounds(600, 475, 50, 35);
        this.btnLast.setBounds(670, 475, 50, 35);
        this.btnCreate.setBackground(Color.white);

        String[] columNames = {"ID", "Tên bàn", "Trạng thái", "Ngày tạo", "Ngày cập nhật"};
        Object[][] data = {};
        this.modelTable = new DefaultTableModel(data, columNames);
        this.table = new JTable(modelTable);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(100);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(150);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(150);
        this.table.getColumnModel().getColumn(3).setPreferredWidth(150);
        this.table.getColumnModel().getColumn(4).setPreferredWidth(150);
        
//        Hiển thị kích thước bảng
        this.scrollPane = new JScrollPane(table);
        this.scrollPane.setBounds(0, 80, 1100, 380);

        this.btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableForm tableForm = new TableForm();
                tableForm.setVisible(true);
            }
        });

        this.add(this.lblSearch);
        this.add(this.txtSearch);
        this.add(this.btnCreate);
//        add button phân trang
        this.add(scrollPane);
        this.add(this.btnFirst);
        this.add(this.btnPrevious);
        this.add(this.btnPage);
        this.add(this.btnNext);
        this.add(this.btnLast);

        this.setLayout(null);
    }

}
