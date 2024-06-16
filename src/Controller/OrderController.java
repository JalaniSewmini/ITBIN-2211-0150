package Controller;

import Model.dbconnect1;
import View.OrderDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class OrderController {

    private Connection conn;

    public OrderController() {
        conn = dbconnect1.connect();
    }

    public void addOrder(String name, String address, int phoneNumber, String price, String date, String trackingNumber, String deliveryMethod, String deliveryUpdate) {
        try {
            String sql = "INSERT INTO `order` (FullName, Address, Number, price, date, track, deliver, `update`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setInt(3, phoneNumber);
            pst.setString(4, price);
            pst.setString(5, date);
            pst.setString(6, trackingNumber);
            pst.setString(7, deliveryMethod);
            pst.setString(8, deliveryUpdate);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

