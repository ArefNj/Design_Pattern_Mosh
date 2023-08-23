package command.videoEditor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<UndoableCommand> videoHistory = new ArrayDeque<>();

    public int size() {
        return videoHistory.size();
    }

    public void push(UndoableCommand command) {
        videoHistory.add(command);
    }

    public UndoableCommand pop() {
        return videoHistory.pop();
    }
}
