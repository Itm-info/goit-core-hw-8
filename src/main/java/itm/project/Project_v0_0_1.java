package itm.project;

import itm.project.layer.Group;

public class Project_v0_0_1 extends Project {
    public static final float VERSION = 0.001f;

    public Project_v0_0_1(String name) {
        super(VERSION, name);
    }

    public Group createGroup(int groupIndex, int groupSize){
        return null;
    }//for backwards compatibility
}
