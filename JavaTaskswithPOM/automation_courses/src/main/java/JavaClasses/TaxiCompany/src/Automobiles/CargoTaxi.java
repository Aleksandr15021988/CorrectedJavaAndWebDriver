package Automobiles;

public class CargoTaxi extends Car {
    private int tonnage;

    public CargoTaxi(String model, int maxSpeed, int fuelConsumptionPer100km, int costInDollars,int tonnage) {
        super(model, maxSpeed, fuelConsumptionPer100km, costInDollars);
        this.tonnage=tonnage;}

        public int getTonnage() {
            return tonnage;

    }

    @Override
    public int getFuelConsumptionPer100km() {
        return super.getFuelConsumptionPer100km();
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", tonnage=" + tonnage +
                        '}');
    }



}
