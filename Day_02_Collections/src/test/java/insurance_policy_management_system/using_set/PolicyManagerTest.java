package insurance_policy_management_system.using_set;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {

    @Test
    void testAddPolicy() {
        PolicyManager manager = new PolicyManager();
        Policy policy = new Policy("P123", "Manish", new Date(2025 - 1900, 5, 20), "Health", 1000.0);

        manager.addPolicy(policy);

        assertDoesNotThrow(() -> manager.displayAllPolicies());
    }

    @Test
    void testDuplicatePolicies() {
        PolicyManager manager = new PolicyManager();
        Policy policy1 = new Policy("P123", "Arpita", new Date(2025 - 1900, 5, 20), "Health", 1000.0);
        Policy policy2 = new Policy("P123", "Raj", new Date(2025 - 1900, 6, 15), "Auto", 1500.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);

        assertDoesNotThrow(manager::displayDuplicatePolicies);
    }
}
