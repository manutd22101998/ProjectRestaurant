/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.restaurant.models;

import console.restaurant.entities.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class AdminsModel {

    public Admin getById(int id) {
        Admin admin = null;
        if (id > 0) {
            try {
                String sql = "select * form admins where id = " + id;
                Statement stt = DAO.getConnection().createStatement();
                ResultSet rs = stt.executeQuery(sql);
                if (rs.next()) {
                    admin = new Admin();
                    admin.setId(Integer.valueOf(rs.getString("id")));
                    admin.setName(rs.getString("name"));
                    admin.setUsername(rs.getString("username"));
                    admin.setPassword(rs.getString("password"));
                    admin.setCreatedAt(rs.getString("created_at"));
                    admin.setCreatedAt(rs.getString("updated_at"));

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean update(Admin admin) {
        try {
            PreparedStatement psmt = DAO.getConnection().prepareStatement("Updated admins SET name=?,password=?,update_at=NOW() WHERE id = ?");
            psmt.setString(1, admin.getName());
            psmt.setString(2, admin.getPassword());
            psmt.setString(3, String.valueOf(admin.getId()));
            int a = psmt.executeUpdate();
            if (a > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
