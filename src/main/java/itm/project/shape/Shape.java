package itm.project.shape;

public abstract class Shape {
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
}
