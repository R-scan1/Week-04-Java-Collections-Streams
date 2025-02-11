package ai_driven_resume_screening_system;

import java.util.List;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume for job role:");
        jobRole.screenResume();
    }

    public <U extends JobRole> void screenMultipleResumes(List<U> resumes) {
        for (U resume : resumes) {
            resume.screenResume();
        }
    }
}
