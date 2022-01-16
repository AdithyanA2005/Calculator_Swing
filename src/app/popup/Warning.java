package app.popup;
import javax.swing.*;

public class Warning {
    public Warning(String message) {
        JFrame jf=new JFrame();
        JOptionPane.showMessageDialog(jf, message);
    }
}