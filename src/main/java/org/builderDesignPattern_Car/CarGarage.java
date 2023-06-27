package org.builderDesignPattern_Car;

import static java.lang.System.out;

public class CarGarage {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().setMake("Tata").setModel("NRG").setYear("2023").setMileage(14).Build();
        out.println(car);
    }
}
