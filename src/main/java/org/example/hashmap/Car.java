package org.example.hashmap;

import java.util.HashMap;
import java.util.Objects;

public class Car {
    private int power;
    private String number;
    private double volume;
    private CarColor color;
    public Car (String number,int power,double volume, CarColor color){
        this.number = number;
        this.power = power;
        this.volume = volume;
        this.color = color;
    }
    HashMap<String, Car> cars = new HashMap<>();

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && Double.compare(car.volume, volume) == 0 && Objects.equals(number, car.number) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, number, volume, color);
    }

    @Override
    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        for(String car: cars.keySet()){
//            builder.append(car);
//            builder.append(cars.get(car));
//            builder.append("\n");
//
//        }
//        return builder.toString();

        return "Car{" +
                "power=" + power +
                ", number='" + number + '\'' +
                ", volume=" + volume +
                ", color=" + color +
                '}';
    }

}
