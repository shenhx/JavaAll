package sms.model;

public abstract class Entity {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected String id;

    public  Entity(){
    }

    public Entity(String id){
        this.id = id;
    }
}