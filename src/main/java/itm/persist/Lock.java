package itm.persist;

interface Lock {
    /**
     * @param object - what's being locked
     * @return - who has a lock - should be entity
     */
    String getLock(Object object);

    void setLock(Lockable object, String user);
}
