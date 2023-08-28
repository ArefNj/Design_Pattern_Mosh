package behavioral.visitor;

public class AncherNode implements HtmlNode {
    @Override
    public void execute(Operation operator) {
        operator.apply(this);
    }
}
