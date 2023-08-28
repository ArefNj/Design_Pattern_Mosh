package behavioral.command.videoEditor;

public abstract class UndoableVideoCommands implements UndoableCommand {

    protected VideoEditor videoEditor;
    protected History history;

    public UndoableVideoCommands(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    public abstract void doExecute();

}
