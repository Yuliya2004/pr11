package rtu.mirea.gibo01.pr11;

import javax.swing.*;
import java.awt.*;

public class BorderExample extends JFrame {
    JPanel[] mas = new JPanel[12];

    public BorderExample() {
        setLayout(new GridLayout(3, 4));
        for (int i = 0; i < mas.length; i++) {
            int r, g, b;
            r = (int) Math.random() * 255;
            g = (int) Math.random() * 255;
            b = (int) Math.random() * 255;
            mas[i] = new JPanel();
            mas[i].setBackground(new Color(r, g, b));
            // mas[i].setBackground(Color.blue);
            add(mas[i]);
        }

        setSize(800, 500);
        setVisible(true);

        mas[4].setLayout(new BorderLayout());
        mas[4].add(new JButton("one"), BorderLayout.WEST);
        mas[4].add(new JButton("two"), BorderLayout.EAST);
        mas[4].add(new JButton("three"), BorderLayout.SOUTH);
        mas[4].add(new JButton("four"), BorderLayout.NORTH);
        mas[4].add(new JButton("five"), BorderLayout.CENTER);

        mas[10].setLayout(new FlowLayout());
        mas[10].add(new JButton("one"));
        mas[10].add(new JButton("two"));
        mas[10].add(new JButton("three"));
        mas[10].add(new JButton("four"));
        mas[10].add(new JButton("five"));
    }
}
