import State.BrushTool;
import State.Canvas;
import State.EraserTool;
import State.SelectionTool;
//import memento.Editor;
//import memento.History;


public class Main {
    public static void main(String[] args) {
//        // MEMENTO
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("a");
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        history.push(editor.createState());
//        editor.setContent("d");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());
//////////////////////////////////////////////////////////////////////////////////
       // STATE
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();




    }
}
