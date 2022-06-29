package lesson8;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;

public class App extends JFrame {

    public App() {
        setTitle("My first application gb");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton myButton = new JButton();
        add(myButton);
        myButton.setText("Я не нажата ");

        myButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myButton.setText("Жмяк ");
            }
        });
        setVisible(true);

    }
}
