package itm.project;

import itm.project.layer.Group;

public class Project_v0_0_2 extends Project {
    public static final float VERSION = 0.002f;

    private Group[] groups;

    public Project_v0_0_2(String name, int projectSize) {
        super(VERSION, name);
        this.groups = new Group[projectSize];
    }

    public Group getGroup(int groupIndex){
        return this.groups[groupIndex];
    }

    public Group createGroup(int groupIndex, int groupSize){
        return this.groups[groupIndex] = new Group(groupSize);
    }

}


