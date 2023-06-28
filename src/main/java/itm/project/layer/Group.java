package itm.project.layer;

import itm.persist.Lockable;
import itm.project.shape.Shape;

public class Group implements Lockable {
    private Shape[] shapes;
    private Group above = null;
    private Group below = null;
}
