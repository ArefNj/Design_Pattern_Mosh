package structural.decorator.ex;

public class Editor {
    public void openProject(String path) {
        Artefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0].setMain(true);
        artefacts[2].setHasError(true);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
