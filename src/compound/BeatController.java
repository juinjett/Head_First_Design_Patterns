package compound;

public class BeatController implements ControllerInterface{
    // controller need to have a reference of model and view because it is the linkage of the other two
    // sometimes controller will also be the observer of model
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        this.view = new DJView(model, this);
        view.createControls();
        view.createView();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.enableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
