package behavioral.visitor.wavFile;

public class AddReverbOperator implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("reverb format");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("reverb fact");
    }
}
