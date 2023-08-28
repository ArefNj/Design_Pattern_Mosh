package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    // can be a STACK
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        this.states.add(state);
    }

    public EditorState pop() {
        var lastIndex = states.size() - 1;
//        if (lastIndex < 0){
//            return new EditorState("");
//        }
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }


}
