package Q1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("emp-01", 20000),
                new Employee("emp-02", 30000),
                new Employee("emp-03", 80000),
                new Employee("emp-04", 60000),
                new Employee("emp-05", 100000),
                new Employee("emp-X", 100000)
        );

        // 1. Calculate the average salary of the list of employees
        double averageSalary = employeeList.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println(averageSalary + "\n===========");

        // 2. Filter for employees whose salary exceeds 80000 and print out their names
        employeeList.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .map(emp -> emp.getName())
                .forEach(System.out::println);

        // 3. Collect a Map of employees
        System.out.println("===========\n");
        Map<String, Employee> map = employeeList.stream()
                .collect(Collectors.toMap(Employee::getName, Function.identity()));
        for(String key : map.keySet()) {
            System.out.printf("%s: %d\n", key, map.get(key).getSalary());
        }

        // 4. Find any Employee whose name starts with the character X
        System.out.println("===========\n");
        employeeList.stream()
                .filter(emp -> emp.getName().contains("X"))
                .findAny()
                .ifPresentOrElse(
                        e -> System.out.println("Found employee: " + e.getName()),
                        () -> System.out.println("No such employee exists")
                );

        // 5. Create a String that contains the name of every single employee in the list concatenated together.
        System.out.println("===========\n");
        String concatenatedNames = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
        System.out.println(concatenatedNames);

    }
}
