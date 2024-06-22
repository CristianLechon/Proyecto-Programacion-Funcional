package view;

import controller.Container;

import javax.swing.*;
import java.awt.*;

public class JFrameGeometry extends JFrame {

    public JFrameGeometry(String tittle) {
        super(tittle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        setLocation(270, 150);
        setSize(800, 400);

        JPanel panelRight = new JPanel();
        panelRight.setLayout(new GridLayout(3, 0));

        Container container = new Container();
        container.setBackground(Color.BLACK);
        add(container);

        JButton btn1 = new JButton("Triangle");
        btn1.addActionListener(e -> container.setDrawable(graphics -> {
            int[] xPoints = {200, 310, 90};
            int[] yPoints = {100, 320, 320};
            graphics.setColor(Color.CYAN);
            graphics.fillPolygon(xPoints, yPoints, 3);
        }));

        JButton btn2 = new JButton("Square");
        btn2.addActionListener(e -> container.setDrawable(graphics -> {
            graphics.setColor(Color.GREEN);
            graphics.fillRect(110, 130, 150, 150);
        }));

        JButton btn3 = new JButton("Circle");
        btn3.addActionListener(e -> container.setDrawable(graphics -> {
            graphics.setColor(Color.RED);
            graphics.fillOval(110, 130, 150, 150);
        }));

        panelRight.add(btn1);
        panelRight.add(btn2);
        panelRight.add(btn3);

        add(container);
        add(panelRight);

    }
}
