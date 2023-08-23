package command.editor;

public class BoldCommand implements UndoableCommand {
    private final HtmlDocument document;
    private final History history;
    private String pervContent;


    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        pervContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(pervContent);
    }
}
