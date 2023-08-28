package visitor.wavFile;

public class NormalizeOperator implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("normal format");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("normal fact");
    }
}
