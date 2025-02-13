package map_interface.group_objects_by_property;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGrouperTest {

    @Test
    void testGroupByDepartmentWithEmptyList() {
        List<Employee> employees = new ArrayList<>();
        Map<String, List<Employee>> result = EmployeeGrouper.groupByDepartment(employees);
        assertTrue(result.isEmpty(), "Grouping an empty list should return an empty map.");
    }
}
