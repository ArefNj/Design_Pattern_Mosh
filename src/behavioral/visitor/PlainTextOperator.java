package behavioral.visitor;

public class PlainTextOperator implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Text-Head");
    }

    @Override
    public void apply(AncherNode ancherNode) {
        System.out.println("Text-Ancher");
    }
}
