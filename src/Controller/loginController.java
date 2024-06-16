package Controller;

import Model.dbconnect1;
import View.login;
import View.mainframe;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginController {
    
    private final login view;

    public loginController(login view) {
        this.view = view;
        
    }
    
    private class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String uname = view.getUsername();
            String pword = view.getPassword();
            
            if(uname.equals("jalani") && pword.equals("456")) {
                mainframe mf = new mainframe();
                mf.setVisible(true);
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view, "Username or password incorrect");
            }
        }
    }
}
