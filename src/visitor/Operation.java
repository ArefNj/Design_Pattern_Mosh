package visitor;

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AncherNode ancherNode);
}
