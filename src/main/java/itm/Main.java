package itm;

import itm.project.Project;
import itm.project.Project_v0_0_2;
import itm.project.layer.Group;
import itm.project.shape.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");

        int groupsNumber = 1;
        int groupSize = 5;

        Project project = new Project_v0_0_2("2nd_Sample", groupsNumber);
        Group group0 = project.createGroup(0, groupSize);

        group0.fillGroupWithRandomShapes();

        ShapePropsPrinter spp = new ShapePropsPrinter();

        for(int i=0;i<groupSize;++i){
            spp.PrintName(group0.getShape(i));
        }
    }
}