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
import javax.swing.JTextField;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class ManagerTable extends JPanel {

    private JLabel lblSearch;
    private JTextField txtSearch;
    private JButton btnCreate;

    private JButton btnFirst;
    private JButton btnPrevious;
    private JButton btnPage;
    private JButton btnNext;
    private JButton btnLast;

    private int page = 1;

    public ManagerTable() {
        this.setBackground(Color.GREEN);
        this.setBounds(320, 30, 1000, 520);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.setBackground(new Color(250, 250, 250));
        this.setBounds(320, 30, 1000, 520);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.lblSearch = new JLabel("Nhập tên bàn : ");
        this.txtSearch = new JTextField();
        this.btnCreate = new JButton("Tạo mới");
//       Button Phân trang
        this.btnFirst = new JButton("<<");
        this.btnPrevious = new JButton("<");
        this.btnPage = new JButton(String.valueOf(page));
        this.btnNext = new JButton(">");
        this.btnLast = new JButton(">>");

        this.lblSearch.setBounds(50, 25, 200, 50);
        this.txtSearch.setBounds(150, 30, 150, 35);
        this.btnCreate.setBounds(850, 30, 120, 35);
//        setBounds Button phân trang
        this.btnFirst.setBounds(340, 450, 50, 35);
        this.btnPrevious.setBounds(410, 450, 50, 35);
        this.btnPage.setBounds(480, 450, 50, 35);
        this.btnNext.setBounds(550, 450, 50, 35);
        this.btnLast.setBounds(620, 450, 50, 35);

        this.btnCreate.setBackground(Color.white);
        
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
        this.add(this.btnFirst);
        this.add(this.btnPrevious);
        this.add(this.btnPage);
        this.add(this.btnNext);
        this.add(this.btnLast);

        this.setLayout(null);
    }

}
