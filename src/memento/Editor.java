package memento;

public class Editor {

    // first implement for undo mechanism

//    private String content;
//    private String exContent;
//
//    public Editor() {
//        this.exContent = "";
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        exContent = this.content;
//        this.content = content;
//    }
//
//    public void undo(){
//        this.content = exContent;
//    }

    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
