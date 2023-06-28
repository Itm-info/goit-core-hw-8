package itm.persist;

import itm.project.Project;

public interface Load {
    Project doLoad(Persistable loadFrom);
}
