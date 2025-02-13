package queue_interface.hospital_triage_system;

import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageTest {

    @Test
    void testPatientPriority() {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        pq.offer(new Patient("Raj", 3));
        pq.offer(new Patient("Arpita", 5));
        pq.offer(new Patient("Manish", 2));

        assertEquals("Arpita (Severity: 5)", pq.poll().toString());
        assertEquals("Raj (Severity: 3)", pq.poll().toString());
        assertEquals("Manish (Severity: 2)", pq.poll().toString());
    }
}
