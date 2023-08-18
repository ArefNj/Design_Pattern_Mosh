import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        // memento
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.setContent("d");
        editor.restore(history.pop());
        editor.restore(history.pop());



        System.out.println(editor.getContent());

    }
}
