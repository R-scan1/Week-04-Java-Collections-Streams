package ai_driven_resume_screening_system;

import java.util.List;

public class Main {

    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.screenResume();
        }
    }

    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        Resume<SoftwareEngineer> seResume = new Resume<>(softwareEngineer);
        Resume<DataScientist> dsResume = new Resume<>(dataScientist);
        Resume<ProductManager> pmResume = new Resume<>(productManager);

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        List<JobRole> allResumes = List.of(softwareEngineer, dataScientist, productManager);
        processResumes(allResumes);

        Resume<JobRole> genericResumeProcessor = new Resume<>(null);
        genericResumeProcessor.screenMultipleResumes(allResumes);
    }
}
