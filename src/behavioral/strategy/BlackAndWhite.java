package behavioral.strategy;

public class BlackAndWhite implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
