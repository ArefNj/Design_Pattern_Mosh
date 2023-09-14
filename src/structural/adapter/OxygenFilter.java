package structural.adapter;

import structural.adapter.filters.Oxygen;

// inheritance implementation
public class OxygenFilter extends Oxygen implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
