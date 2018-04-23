package compound;


public interface BeatModelInterface {
    // Controlling methods
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    // Sending information to observers
    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

    void notifyBPMObservers();

    void notifyBeatObservers();
}
