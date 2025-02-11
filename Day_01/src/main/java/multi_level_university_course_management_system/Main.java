package multi_level_university_course_management_system;

import java.util.List;


public class Main {

    public static void displayCourseEvaluations(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.evaluate();
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse());
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse());
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse());

        examCourse.showEvaluationMethod();
        assignmentCourse.showEvaluationMethod();
        researchCourse.showEvaluationMethod();

        List<CourseType> courseList = List.of(new ExamCourse(), new AssignmentCourse(), new ResearchCourse());
        displayCourseEvaluations(courseList);
    }
}
