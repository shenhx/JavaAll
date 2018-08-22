package sms.model;

public abstract class NamedEntity extends  Entity {
    protected String name;

    public NamedEntity(String id,String name) {
        super(id);
        this.name = name;
    }

    public NamedEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}