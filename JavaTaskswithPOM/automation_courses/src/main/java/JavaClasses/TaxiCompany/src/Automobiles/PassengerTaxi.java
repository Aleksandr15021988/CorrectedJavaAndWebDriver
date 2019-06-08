package Automobiles;

import Models.MarketSegmentClassification;

public class PassengerTaxi extends Car {
 private MarketSegmentClassification type;

    public PassengerTaxi(String model, int maxSpeed, int fuelConsumptionPer100km, int costInDollars,MarketSegmentClassification type) {
        super(model, maxSpeed, fuelConsumptionPer100km, costInDollars);
        this.type=type;
    }

    public MarketSegmentClassification getType() {
        return type;
    }

    @Override
    public int getFuelConsumptionPer100km() {
        return super.getFuelConsumptionPer100km();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }


}
