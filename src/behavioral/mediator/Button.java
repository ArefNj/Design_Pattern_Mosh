package behavioral.mediator;

public class Button extends UIControl{
    private boolean isEnable;
// basic
//    public Button(DialogBox owner) {
//        super(owner);
//    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
//        owner.changed(this);
        notifyEventHandler();
    }
}
