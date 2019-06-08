package Automobiles;

import java.util.Objects;

public class Car {

private String model;
private int maxSpeed;
private int fuelConsumptionPer100km;
private  int costInDollars;

    public Car(String model, int maxSpeed, int fuelConsumptionPer100km, int costInDollars) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.costInDollars = costInDollars;
    }

    public int getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public int getCostInDollars() {
        return costInDollars;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                fuelConsumptionPer100km == car.fuelConsumptionPer100km &&
                costInDollars == car.costInDollars &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, fuelConsumptionPer100km, costInDollars);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumptionPer100km=" + fuelConsumptionPer100km +
                ", costInDollars=" + costInDollars +
                '}';

    }
}
