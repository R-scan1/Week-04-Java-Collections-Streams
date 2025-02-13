package queue_interface.hospital_triage_system;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        pq.offer(new Patient("Raj", 3));
        pq.offer(new Patient("Arpita", 5));
        pq.offer(new Patient("Manish", 2));

        System.out.println("Order of treatment:");
        while (!pq.isEmpty()) {
            Patient currentPatient = pq.poll();
            System.out.println(currentPatient);
        }
    }
}
