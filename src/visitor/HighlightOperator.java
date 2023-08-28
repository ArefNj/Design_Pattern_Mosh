package visitor;

public class HighlightOperator implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight heading");
    }

    @Override
    public void apply(AncherNode ancherNode) {
        System.out.println("highlight ancher");
    }
}
