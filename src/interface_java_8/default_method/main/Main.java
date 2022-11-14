package interface_java_8.default_method.main;

import interface_java_8.default_method.entity.Car;
import interface_java_8.default_method.interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= new Car("Vinfast");
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());
    }
}
