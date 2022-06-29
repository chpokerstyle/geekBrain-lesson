package lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
    private  JButton jButton;

    public ButtonAction(JButton jButton) {
        this.jButton = jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setText("ЖМЯК ");
    }
}
