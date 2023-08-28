package behavioral.strategy;

public class HighContrast implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("applying high contrast filter");
    }
}
