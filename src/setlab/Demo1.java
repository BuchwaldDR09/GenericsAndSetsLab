
package setlab;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        
        Car car1 = new Car("Ford", 001);
        Car car2 = new Car("Ford", 002);
        Car car3 = new Car("Ford", 003);
        Car car4 = new Car("Ford", 001);
        Car car5 = new Car("Ford", 003);
        
        
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        
        //This loop shows the List holds five cars
        for (Car car : list){
            System.out.println(car.getMake());
            
        }
        System.out.println("");
        // Convert List to Set
        Set<Car> set = new HashSet<>(list);
        
        /* This loop shows that with overridden .equals and .hashSet, the 
           duplicates vins in car1 and car2 make them duplicates of each other
           and the duplicate object is deleted.
        */
        for (Car car : set){
            System.out.println(car.getMake() + " " + car.getVin());
        }
    }
}
