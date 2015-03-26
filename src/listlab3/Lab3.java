
package listlab3;

import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        List objList = new ArrayList();
        Employee emp1 = new Employee("Buchwald", "Daniel", "555-55-5555");
        Employee emp2 = new Employee("Buchwald", "Morgan", "333-33-3333");
        Dog dog1 = new Dog("Ricken", 00001);
        objList.add(emp1);
        objList.add(emp2);
        objList.add(dog1);
        
        
        for (int i = 0; i < objList.size(); i++){
            if (i <= 1){
                // Cast the first two indexs in the List to employee.
                Employee emp = (Employee)objList.get(i);
                System.out.println(emp.getLastName()+", " + emp.getLastName() + ", "+ emp.getSsn());
            }
            else {
                Dog dog = (Dog)objList.get(i);
                System.out.println("Our dog's name is: " + dog.getName());
            }
        }
    }
    
}
