package org.builderDesignPattern_Car;

class Car {
    private String make;
    private String model;
    private String year;
    private int mileage;

    // Private constructor to enforce object creation via the builder
    private Car(){}

    // Getters for the Car properties
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {

        return "Car {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    static class CarBuilder {
        private String make;
        private String model;
        private String year;
        private int mileage;

        public CarBuilder() {
        }

        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(String year) {
            this.year = year;
            return this;
        }

        public CarBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Car Build() {
            Car car = new Car();
            car.make = this.make;
            car.mileage = this.mileage;
            car.model = this.model;
            car.year = this.year;
            return car;
        }
    }
}