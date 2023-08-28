package behavioral.template.exercise;

public class Example extends Window {
    public Example() {
        System.out.println("Running program");
    }

    @Override
    protected void previseClose() {
        System.out.println("example program before closing");
    }

    @Override
    protected void afterClose() {
        System.out.println("example program After closing");
    }
}
