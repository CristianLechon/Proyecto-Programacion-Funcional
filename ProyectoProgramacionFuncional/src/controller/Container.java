package controller;

import interfaces.IDrawable;

import javax.swing.*;
import java.awt.*;

public class Container extends JPanel {

    private IDrawable drawable;

    public void setDrawable(IDrawable drawable) {
        this.drawable = drawable;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (drawable != null) {
            drawable.draw(graphics);
        }
    }
}
