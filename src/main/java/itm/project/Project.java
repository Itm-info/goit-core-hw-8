package itm.project;

import itm.project.layer.Group;

public abstract class Project {
    public final float VERSION;
    private String name;
    public Project(float version, String name){
        this.VERSION = version;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    private Group[] groups;
}

