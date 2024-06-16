package Controller;

import Model.dbconnect1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class registrationController {
    
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public  registrationController() {
        conn = dbconnect1.connect();
    }
    
    public void addCustomer(String name, String address, String province, String contactNumber1, int contactNumber2, String email) {
        try {
            String sql = "INSERT INTO customer (FullName, Address, Province, ContactNumber, ContactNumber2, EmailAddress) VALUES (?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, province);
            pst.setString(4, contactNumber1);
            pst.setInt(5, contactNumber2);
            pst.setString(6, email);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void updateCustomer(int id, String name, String address, String province, String contactNumber1, String contactNumber2, String email) {
        try {
            String sql = "UPDATE customer SET FullName = ?, Address = ?, Province = ?, ContactNumber = ?, ContactNumber2 = ?, EmailAddress = ? WHERE cid = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, province);
            pst.setString(4, contactNumber1);
            pst.setString(5, contactNumber2);
            pst.setString(6, email);
            pst.setInt(7, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Update Error: " + e.getMessage());
        }
    }
    
    public void deleteCustomer(int id) {
        try {
            String sql = "DELETE FROM customer WHERE cid = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet getAllCustomers() {
        try {
            String sql = "SELECT cid, FullName, Address, Province, ContactNumber, ContactNumber2, EmailAddress FROM customer";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}
