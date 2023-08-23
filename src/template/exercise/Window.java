package template.exercise;

public abstract class Window {

    protected abstract void previseClose();

    protected abstract void afterClose();

    public void close() {
        previseClose();

        System.out.println("Removing the window from the screen");

        afterClose();
    }
}
