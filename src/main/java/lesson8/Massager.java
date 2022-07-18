package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Massager extends JFrame {

    JButton button;
    JTextField textField;

    public Massager() {
        setTitle("My first application gb");
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        textField = new JTextField(150);
//        add(textField);

        textField.setToolTipText("Введите слово");
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Massager.this, "Вы написали: " + textField.getText());
            }
        });
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton myButton = new JButton();
//        add(myButton);
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Работает только через ENTER. todo ИСПРАВИТЬ
            }
        });
        contents.add(textField);
        contents.add(myButton);
        setContentPane(contents);
        setVisible(true);
    }
}
