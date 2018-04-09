package observer.SwingObserveExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserveExample {
    JFrame frame;

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class AngleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you may regret it!");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }

    public static void main(String[] args) {
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }
}
