package itm.project.filter;

public abstract class Filter {
    private String id;

    public Filter(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
