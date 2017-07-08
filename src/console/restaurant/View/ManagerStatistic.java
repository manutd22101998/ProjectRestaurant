/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.restaurant.View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class ManagerStatistic extends JPanel {

    private JTable table;
    private DefaultTableModel modelStatistic;
    private JScrollPane scrollPane;

    private JLabel lblcreatedAt;
    private JLabel lblupdatedAt;
    private JButton btnFirst;
    private JButton btnPrevious;
    private JButton btnPage;
    private JButton btnNext;
    private JButton btnLast;

    private int page = 1;

    public ManagerStatistic() {
        this.setBackground(Color.white);
        this.setBounds(320, 130, 1100, 530);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.lblcreatedAt = new JLabel("Ngày khởi tạo :");
        this.lblcreatedAt.setBounds(50, 20, 200, 50);
        this.lblupdatedAt = new JLabel("Ngày kết thúc : ");
        this.lblupdatedAt.setBounds(300, 20, 200, 50);

        this.btnFirst = new JButton("<<");
        this.btnPrevious = new JButton("<");
        this.btnPage = new JButton(String.valueOf(page));
        this.btnNext = new JButton(">");
        this.btnLast = new JButton(">>");

        this.btnFirst.setBounds(390, 475, 50, 35);
        this.btnPrevious.setBounds(460, 475, 50, 35);
        this.btnPage.setBounds(530, 475, 50, 35);
        this.btnNext.setBounds(600, 475, 50, 35);
        this.btnLast.setBounds(670, 475, 50, 35);

        String[] columnNames = {"ID", "Giá Trước Giảm", "Giá Sau Giảm", "Giảm Giá", "Bàn Thanh Toán", "Ngày Tạo"};
        Object[][] data = {};
        this.modelStatistic = new DefaultTableModel(data, columnNames);
        this.table = new JTable(modelStatistic);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(100);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(100);
        this.table.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.table.getColumnModel().getColumn(4).setPreferredWidth(100);
        this.table.getColumnModel().getColumn(5).setPreferredWidth(100);

        this.scrollPane = new JScrollPane(table);
        this.scrollPane.setBounds(0, 80, 1100, 380);

//        Add button phân trang
        this.add(this.lblcreatedAt);
        this.add(this.lblupdatedAt);
        this.add(scrollPane);
        this.add(this.btnFirst);
        this.add(this.btnPrevious);
        this.add(this.btnPage);
        this.add(this.btnNext);
        this.add(this.btnLast);

        this.setLayout(null);
    }

}
