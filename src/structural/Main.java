package structural;

import structural.composite.Ex.Demo;
import structural.composite.Group;
import structural.composite.Shape;

public class Main {
    public static void main(String[] args) {
        /* composite patten : shapes & groups */
        var group1 = new Group();
        group1.addObject(new Shape("square 1")); // square
        group1.addObject(new Shape("square 2")); // square

        var group2 = new Group();
        group2.addObject(new Shape("circle 3")); // circle
        group2.addObject(new Shape("circle 4")); // circle

        var group = new Group();
        group.addObject(group1);
        group.addObject(group2);

        group.render();
        group1.move();
        group2.render();

        /* composite patten Example : team War */
        Demo.show();
    }


}
