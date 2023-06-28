package itm.persist;

import itm.project.Project;

public interface Save {
    boolean doSave(Project project, Persistable saveTo);
}
