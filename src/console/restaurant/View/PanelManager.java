/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.restaurant.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class PanelManager extends JFrame {

//    private JPanel panelShow;
    private JLabel lblHeader;
    private JLabel lblDate;
    private JLabel lblTime;
    private JButton btnManagerOrder;
    private JButton btnManagerAdmin;
    private JButton btnManagerFood;
    private JButton btnManagerTable;
    private JButton btnManagerStatistic;
    private JButton btnLogin;
    private JButton btnExit;

    private ListTable listable = new ListTable();
    private ManagerAdmin quanlytaikhoan = new ManagerAdmin();
    private ManagerTable quanlyban = new ManagerTable();
    private ManagerFood quanlymonan = new ManagerFood();
    private ManagerStatistic quanlythongke = new ManagerStatistic();

    public PanelManager() {
        setSize(1500, 800);
//      
        this.lblHeader = new JLabel("Nahut Drinks & Foods");
        this.lblHeader.setFont(new Font("Serif", Font.PLAIN, 60));
        this.lblDate = new JLabel();
        this.lblDate.setFont(new Font("Serif", Font.PLAIN, 24));
        this.lblTime = new JLabel();
        this.lblTime.setFont(new Font("Serif", Font.PLAIN, 24));
        this.btnManagerOrder = new JButton("Đặt bàn");
        this.btnManagerAdmin = new JButton("Quản lý tài khoản");
        this.btnManagerTable = new JButton("Quản lý bàn");
        this.btnManagerFood = new JButton("Quản lý món ăn");
        this.btnManagerStatistic = new JButton("Quản lý thống kê");
        this.btnLogin = new JButton("Đăng xuất");
        this.btnExit = new JButton("Thoát");

        this.btnManagerOrder.setBackground(Color.white);
        this.btnManagerAdmin.setBackground(Color.white);
        this.btnManagerTable.setBackground(Color.white);
        this.btnManagerFood.setBackground(Color.white);
        this.btnManagerStatistic.setBackground(Color.white);
        this.btnExit.setBackground(Color.white);
        this.btnLogin.setBackground(Color.white);

        this.lblHeader.setBounds(550, 30, 700, 50);
        this.lblDate.setBounds(1150, 10, 300, 50);
        this.lblTime.setBounds(1250, 50, 200, 50);
        this.btnManagerOrder.setBounds(50, 70, 200, 100);
        this.btnManagerAdmin.setBounds(50, 200, 200, 100);
        this.btnManagerTable.setBounds(50, 320, 200, 100);
        this.btnManagerFood.setBounds(50, 440, 200, 100);
        this.btnManagerStatistic.setBounds(50, 560, 200, 100);
        this.btnLogin.setBounds(1150, 680, 130, 50);
        this.btnExit.setBounds(1300, 680, 130, 50);

//        this.add(this.panelShow);
        this.add(this.lblHeader);
        this.add(this.lblDate);
        this.add(this.lblTime);
        this.add(this.btnManagerOrder);
        this.add(this.btnManagerAdmin);
        this.add(this.btnManagerTable);
        this.add(this.btnManagerFood);
        this.add(this.btnManagerStatistic);
        this.add(this.btnLogin);
        this.add(this.btnExit);

//        Add panel vào Jframe
        this.add(listable);
        this.add(quanlytaikhoan);
        this.add(quanlymonan);
        this.add(quanlyban);
        this.add(quanlythongke);

//        Set visible
        listable.setVisible(true);
        quanlytaikhoan.setVisible(false);
        quanlyban.setVisible(false);
        quanlymonan.setVisible(false);
        quanlythongke.setVisible(false);

        clockBan();
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnManagerOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listable.setVisible(true);
                quanlytaikhoan.setVisible(false);
                quanlymonan.setVisible(false);
                quanlyban.setVisible(false);
                quanlythongke.setVisible(false);

                btnManagerOrder.setBackground(new Color(171, 242, 150));
                btnManagerAdmin.setBackground(Color.white);
                btnManagerFood.setBackground(Color.white);
                btnManagerTable.setBackground(Color.white);
                btnManagerStatistic.setBackground(Color.white);
            }
        });
        this.btnManagerAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quanlytaikhoan.setVisible(true);
                listable.setVisible(false);
                quanlymonan.setVisible(false);
                quanlyban.setVisible(false);
                quanlythongke.setVisible(false);

                btnManagerAdmin.setBackground(new Color(171, 242, 150));
                btnManagerOrder.setBackground(Color.white);
                btnManagerFood.setBackground(Color.white);
                btnManagerTable.setBackground(Color.white);
                btnManagerStatistic.setBackground(Color.white);
            }
        });
        this.btnManagerTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quanlyban.setVisible(true);
                quanlytaikhoan.setVisible(false);
                listable.setVisible(false);
                quanlymonan.setVisible(false);
                quanlythongke.setVisible(false);

                btnManagerTable.setBackground(new Color(171, 242, 150));
                btnManagerOrder.setBackground(Color.white);
                btnManagerFood.setBackground(Color.white);
                btnManagerAdmin.setBackground(Color.white);
                btnManagerStatistic.setBackground(Color.white);
            }
        });
        this.btnManagerFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quanlymonan.setVisible(true);
                quanlytaikhoan.setVisible(false);
                listable.setVisible(false);
                quanlyban.setVisible(false);
                quanlythongke.setVisible(false);

                btnManagerFood.setBackground(new Color(171, 242, 150));
                btnManagerOrder.setBackground(Color.white);
                btnManagerTable.setBackground(Color.white);
                btnManagerAdmin.setBackground(Color.white);
                btnManagerStatistic.setBackground(Color.white);
            }
        });
        this.btnManagerStatistic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quanlytaikhoan.setVisible(false);
                listable.setVisible(false);
                quanlymonan.setVisible(false);
                quanlyban.setVisible(false);
                quanlythongke.setVisible(true);

                btnManagerStatistic.setBackground(new Color(171, 242, 150));
                btnManagerOrder.setBackground(Color.white);
                btnManagerFood.setBackground(Color.white);
                btnManagerTable.setBackground(Color.white);
                btnManagerAdmin.setBackground(Color.white);
            }
        });

        this.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);
                setVisible(false);
            }
        });

        this.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void clockBan() {
        Thread clock = new Thread() {
            public void run() {
                Date today = new Date();
                try {
                    for (;;) {
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                        Date date1 = new Date();
//                      
                        lblDate.setText("Hôm nay ngày: " + dateFormat.format(date1));
                        lblTime.setText(timeFormat.format(date1));
//                        TimeZone.setDefault(TimeZone.getTimeZone("UTC+7"));
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        clock.start();

    }

    public static void main(String[] args) {
        PanelManager panel = new PanelManager();
        panel.setVisible(true);
    }

}
