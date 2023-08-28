package visitor;

public class HeadingNode implements HtmlNode{
    @Override
    public void execute(Operation operator) {
        operator.apply(this);
    }
}
