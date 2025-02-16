package problems_on_reflection_in_java.basic_level.dynamically_create_objects;


public class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Default Name";
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}
