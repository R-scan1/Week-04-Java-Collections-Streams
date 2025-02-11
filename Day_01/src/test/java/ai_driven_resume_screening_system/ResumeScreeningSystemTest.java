package ai_driven_resume_screening_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ResumeScreeningSystemTest {

    @Test
    public void testSoftwareEngineerResumeProcessing() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        Resume<SoftwareEngineer> seResume = new Resume<>(softwareEngineer);

        assertDoesNotThrow(() -> seResume.processResume(), "Software Engineer resume processing failed");
    }

    @Test
    public void testDataScientistResumeProcessing() {
        DataScientist dataScientist = new DataScientist();
        Resume<DataScientist> dsResume = new Resume<>(dataScientist);

        assertDoesNotThrow(() -> dsResume.processResume(), "Data Scientist resume processing failed");
    }

    @Test
    public void testProductManagerResumeProcessing() {
        ProductManager productManager = new ProductManager();
        Resume<ProductManager> pmResume = new Resume<>(productManager);

        assertDoesNotThrow(() -> pmResume.processResume(), "Product Manager resume processing failed");
    }

    @Test
    public void testScreenMultipleResumes() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        List<JobRole> allResumes = List.of(softwareEngineer, dataScientist, productManager);

        Resume<JobRole> genericResumeProcessor = new Resume<>(null);

        assertDoesNotThrow(() -> genericResumeProcessor.screenMultipleResumes(allResumes),
                "Screening multiple resumes failed");
    }

    @Test
    public void testProcessResumesUsingWildcard() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        List<JobRole> allResumes = List.of(softwareEngineer, dataScientist, productManager);

        assertDoesNotThrow(() -> Main.processResumes(allResumes),
                "Processing resumes with wildcard failed");
    }
}

