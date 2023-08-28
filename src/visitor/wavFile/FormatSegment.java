package visitor.wavFile;

public class FormatSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
