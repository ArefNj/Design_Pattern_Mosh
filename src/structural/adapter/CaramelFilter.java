package structural.adapter;

import structural.adapter.filters.Caramel;

 // composition implementation
public class CaramelFilter implements Filter {
    private final Caramel caramel;
    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }
    @Override
    public void apply(Image image) {

        caramel.init();
        caramel.render(image);
    }
}