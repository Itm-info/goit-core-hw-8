package itm.project.shape;

import itm.persist.Lockable;

public abstract class Shape implements Lockable {
    private String name;
    private Shape above = null;
    private Shape below = null;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public static Shape create(ShapeType shapeType){
        switch (shapeType){
            case Circle:
                return new Circle("Circle");
            case Line:
                return new Line("Line");
            case Octagon:
                return new Octagon("Octagon");
            case Point:
                return new Point("Point");
            case Quad:
                return new Quad("Quad");
            case Star:
                return new Star("Star");
            case Triangle:
                return new Triangle("Triangle");
        }
        return null;
    }
}
