package structural.decorator.ex;

public class MainArtefact implements AbstractArtefact {

    private AbstractArtefact artefact;

    public MainArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Main]";
    }


}
