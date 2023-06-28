package itm.persist;

import itm.project.Project;

public class file extends Persistable {
    @Override
    public Project doLoad(Persistable loadFrom) {
        return null;
    }

    @Override
    public boolean doSave(Project project, Persistable saveTo) {
        return false;
    }
}
