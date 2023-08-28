package behavioral.command.videoEditor;

public interface UndoableCommand extends Command {
    void undo();
}
