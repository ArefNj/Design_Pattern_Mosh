package behavioral.command.videoEditor;

public class SetContrastCommand extends UndoableVideoCommands {

    private final float pervContrast;
    private final float contrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        pervContrast = videoEditor.getContrast();
        this.contrast = contrast;

    }

    @Override
    public void doExecute() {
        videoEditor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(pervContrast);
    }
}
