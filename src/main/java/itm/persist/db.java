package itm.persist;

import itm.project.Project;

public class db extends Persistable implements Lock {

    @Override
    public Project doLoad(Persistable loadFrom) {
        return null;
    }

    @Override
    public String getLock(Object object) {
        return null;
    }

    @Override
    public void setLock(Lockable object, String user) {

    }

    @Override
    public boolean doSave(Project project, Persistable saveTo) {
        return false;
    }
};
