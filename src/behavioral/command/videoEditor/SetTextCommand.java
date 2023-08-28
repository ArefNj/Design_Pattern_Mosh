package behavioral.command.videoEditor;

public class SetTextCommand extends UndoableVideoCommands {
    private final String text;

    public SetTextCommand(String text, VideoEditor videoEditor, History history) {
        super(videoEditor, history);

        this.text = text;
    }


    @Override
    public void doExecute() {
        videoEditor.setText(text);

    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
