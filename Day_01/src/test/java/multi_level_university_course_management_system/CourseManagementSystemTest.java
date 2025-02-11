package multi_level_university_course_management_system;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseManagementSystemTest {

    @Test
    void testExamCourseEvaluation() {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse());
        assertDoesNotThrow(examCourse::showEvaluationMethod, "Exam course evaluation failed");
    }

    @Test
    void testAssignmentCourseEvaluation() {
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse());
        assertDoesNotThrow(assignmentCourse::showEvaluationMethod, "Assignment course evaluation failed");
    }

    @Test
    void testResearchCourseEvaluation() {
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse());
        assertDoesNotThrow(researchCourse::showEvaluationMethod, "Research course evaluation failed");
    }

    @Test
    void testDisplayCourseEvaluations() {
        // Create a list of various courses
        List<CourseType> courseList = List.of(new ExamCourse(), new AssignmentCourse(), new ResearchCourse());

        // Check that all courses in the list evaluate without throwing an exception
        assertDoesNotThrow(() -> Main.displayCourseEvaluations(courseList),
                "Display course evaluations failed");
    }
}

