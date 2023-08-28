package visitor.wavFile;

public class FactSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter audioFilter) {
        audioFilter.apply(this);
    }
}
