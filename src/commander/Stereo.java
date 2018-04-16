package commander;

public class Stereo {
    public void on() {
        System.out.println("Stereo is ON");
    }


    public void off() {
        System.out.println("Stereo is OFF");
    }

    public void setCD() {
        System.out.println("Stereo is for CD input");
    }
    public void setDVD() {
        System.out.println("Stereo is for DVD input");
    }
    public void setRadio() {
        System.out.println("Stereo is for Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is set to " + volume);
    }
}
