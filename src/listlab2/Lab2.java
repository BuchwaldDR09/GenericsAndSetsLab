
package listlab2;

import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Buchwald", "Daniel", "333-33-3333");
        Employee emp2 = new Employee("Buchwald", "Morgan", "222-22-2222");
        Employee emp3 = new Employee("Skywalker", "Luke", "111-11-1111");
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        
        for (Employee emp : employeeList){
            System.out.println(emp.getLastName() + ", " + emp.getFirstName());
        }
//        functional operation ??
//        employeeList.stream().forEach((emp) -> {
//            System.out.println(emp.getLastName() + ", " + emp.getFirstName());
//        });
    }
}
