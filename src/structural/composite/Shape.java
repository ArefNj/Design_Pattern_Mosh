package structural.composite;

public class Shape implements Component{

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public void render(){
        System.out.println(" render shape " + name);
    }

    public void move(){
        System.out.println(" moving shape " + name);
    }
}
