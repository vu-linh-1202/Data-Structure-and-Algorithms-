package interface_java_8.default_method.entity;

import interface_java_8.default_method.interfaces.Vehicle;

public class Car implements Vehicle {
    private String brand;
    public Car(String brand) {
        this.brand = brand;
    }
    @Override
    public String getBrand() {
        return brand;
    }
}
