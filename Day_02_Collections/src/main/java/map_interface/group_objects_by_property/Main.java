package map_interface.group_objects_by_property;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raj", "HR"),
                new Employee("Manish", "IT"),
                new Employee("Arpita", "HR")
        );

        Map<String, List<Employee>> grouped = EmployeeGrouper.groupByDepartment(employees);
        System.out.println(grouped);
    }
}
