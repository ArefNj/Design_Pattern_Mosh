package structural.adapter.filters;

import structural.adapter.Image;

public class Oxygen {
    public void init() {}
    public void render(Image image) {
        System.out.println("apply oxygen filter");
    }
}
