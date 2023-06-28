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
}
