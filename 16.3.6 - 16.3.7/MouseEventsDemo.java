// 16.3.6. Contoh Mouse Events

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventsDemo extends JFrame implements MouseListener, MouseMotionListener {
    TextField tf;

    public MouseEventsDemo(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tf = new TextField(60);
        addMouseListener(this);
    }
    public void launchFrame() {
        /* Menambah komponen pada frame */
        add(tf, BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent me) {
        String msg = "Mouse clicked.";
        tf.setText(msg);
    }
    public void mouseEntered(MouseEvent me) {
        String msg = "Mouse entered component.";
        tf.setText(msg);
    }
    public void mouseExited(MouseEvent me) {
        String msg = "Mouse exited component.";
        tf.setText(msg);
    }
    public void mousePressed(MouseEvent me) {
        String msg = "Mouse pressed. on " + me.getX() + "," + me.getY();
        tf.setText(msg);
    }
    public void mouseReleased(MouseEvent me) {
        String msg = "Mouse released.";
        tf.setText(msg);
    }
    public void mouseDragged(MouseEvent me) {
        String msg = "Mouse dragged at " + me.getX() + "," + me.getY();
        tf.setText(msg);
    }
    public void mouseMoved(MouseEvent me) {
        String msg = "Mouse moved at " + me.getX() + "," + me.getY();
        tf.setText(msg);
    }
    public static void main(String args[]) {
        MouseEventsDemo med = new MouseEventsDemo("Mouse Events Demo"); 
        med.launchFrame();
    }
}