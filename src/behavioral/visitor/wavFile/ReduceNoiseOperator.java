package behavioral.visitor.wavFile;

public class ReduceNoiseOperator implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("format reduce noise");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("fact reduce noise");
    }
}
