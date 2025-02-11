package multi_level_university_course_management_system;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void showEvaluationMethod() {
        courseType.evaluate();
    }
}

