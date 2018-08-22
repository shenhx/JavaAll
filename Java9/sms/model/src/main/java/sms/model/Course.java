package sms.model;

public class Course extends NamedEntity {
    public Course(String id, String name) {
        super(id, name);
    }

    public Course() {
    }

    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "}";
    }
}