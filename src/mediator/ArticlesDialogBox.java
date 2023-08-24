package mediator;

public class ArticlesDialogBox extends DialogBox{

    private final ListBox articlesDialogBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    public void simulateUserInteraction(){
        articlesDialogBox.setSelection("Article 1");
        titleTextBox.setContent("");
        articlesDialogBox.setSelection("Article 2");
        System.out.println("TextBox :" + titleTextBox.getContent());
        System.out.println("Button:" + saveButton.isEnable());
    }

    private void articleSelected(){
        titleTextBox.setContent(articlesDialogBox.getSelection());
        saveButton.setEnable(true);
    }
    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }

    @Override
    public void changed(UIControl control) {
    if (control == articlesDialogBox)
        articleSelected();
    else if (control == titleTextBox)
        titleChanged();


    }
}
