package itm.project.layer;

import itm.persist.Lockable;
import itm.project.shape.Shape;
import itm.project.shape.ShapeType;

import java.util.Random;


public class Group implements Lockable {
    private Group above = null;
    private Group below = null;
    private Shape[] shapes;
    public Group(int groupSize){
        this.shapes = new Shape[groupSize];
    }

    public Shape getShape(int shapeIndex){
        return this.shapes[shapeIndex];
    }

    public Shape createShape(int shapeIndex, ShapeType shapeType){
        return this.shapes[shapeIndex] = Shape.create(shapeType);
    }

    public void fillGroupWithRandomShapes(){
        ShapeType[] shapeTypes = ShapeType.values();

        int typesCount = shapeTypes.length;
        Random RNG = new Random();

        int groupSize = this.shapes.length;
        for(int i = 0; i < groupSize ; ++i){
            createShape(i, shapeTypes[RNG.nextInt(typesCount)]);
        }
    }
}
