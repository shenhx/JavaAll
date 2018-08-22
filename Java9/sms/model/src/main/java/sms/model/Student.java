package sms.model;

public class Student extends  NamedEntity {
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String id, String name, String group) {
        super(id, name);
        this.group = group;
    }

    public Student(String group) {
        this.group = group;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "group='" + group + '\'' +
                '}';
    }
}