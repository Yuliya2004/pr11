package rtu.mirea.gibo01.pr11;

import javax.swing.*;
import java.awt.*;

public class Pinkpanter extends JFrame {
    JTextField pole = new JTextField(10);
    // Font font = new Font("Calibri", Font.BOLD, 14);
    JButton button = new JButton("Нажми меня");

    Pinkpanter() {
        super("Panter 11");
        setLayout(new BorderLayout());
        setSize(300,200);
        add(pole, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        pole.setForeground(Color.PINK);
        pole.setFont(new Font("Calibri", Font.BOLD,14));
        setVisible(true);
    }
}
