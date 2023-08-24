package mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    // basic method
//    protected DialogBox owner;
//
//    public UIControl(DialogBox owner) {
//        this.owner = owner;
//    }
    // implementation Using Observer pattern
    private List<EventHandler> observers = new ArrayList<>();

    public void addEventHandler(EventHandler observer){
        observers.add(observer);
    }
    protected void notifyEventHandler(){
        for (var observer :
                observers) {
            observer.handle();
        }
    }
}
