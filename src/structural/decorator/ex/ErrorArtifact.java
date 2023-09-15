package structural.decorator.ex;

public class ErrorArtifact implements AbstractArtefact {

    private AbstractArtefact artefact;

    public ErrorArtifact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Error]";
    }


}
