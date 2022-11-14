package interface_java_8.default_method.interfaces;

public interface Vehicle {
    String getBrand();

    default String turnAlarmOn(){
        return " Turning the vehicle alarm on";
    }

    default String turnAlarmOff(){
        return " Turning the vehicle alarm off";
    }
}
