package structural.decorator.ex;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new MainArtefact(new ErrorArtifact(artefacts[0]));
        artefacts[2] = new ErrorArtifact(artefacts[2]);


        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
