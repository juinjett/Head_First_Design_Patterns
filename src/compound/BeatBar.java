package compound;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable{
    private static final long serialVersionUID = 2L;
    JProgressBar progressBar;
    Thread thread;

    public BeatBar() {
        this.thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        while (true){
            int value = getValue();
            value = (int) (value * 0.75);
            setValue(value);
            repaint();
            try {
                thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }
}
