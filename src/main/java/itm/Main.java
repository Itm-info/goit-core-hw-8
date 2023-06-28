package itm;

import itm.project.shape.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        ShapePropsPrinter spp = new ShapePropsPrinter();
        Shape circle = new Circle("This is Circle");
        Shape quad = new Quad("This is Quad");
        Shape point = new Point("This is Circle");

        spp.PrintName(circle);
        spp.PrintName(quad);
        spp.PrintName(point);
    }
}