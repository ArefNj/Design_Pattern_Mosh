package behavioral.mediator;

public class ArticlesDialogBox /*extends DialogBox*/{

    private final ListBox articlesDialogBox = new ListBox();
    private final TextBox titleTextBox = new TextBox();
    private final Button saveButton = new Button();

    public ArticlesDialogBox() {
        articlesDialogBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articlesDialogBox.setSelection("Article 1");
        titleTextBox.setContent("");
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

//    @Override
//    public void changed(UIControl control) {
//    if (control == articlesDialogBox)
//        articleSelected();
//    else if (control == titleTextBox)
//        titleChanged();
//    }
}
