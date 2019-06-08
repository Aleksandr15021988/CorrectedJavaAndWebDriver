import Automobiles.Car;
import java.util.*;

public class CarList {

    private List<Car> carList = new ArrayList<>();

    public void addCar(Car a) {
        carList.add(a);
    }

    public void maxSpeedPrint(int MinSpeed,int MaxSpeed) {
        for (Car car : carList) {
            if ((car.getMaxSpeed() >= MinSpeed)&&(car.getMaxSpeed()<=MaxSpeed)) {
                System.out.println(car.toString());
            }
        }
    }

    public void costCompany() {
        int sum = 0;
        for (Car car : carList) {
            sum += car.getCostInDollars();

        }System.out.println(sum+" Долларов США");
    }
    public void maxCostCar() {
        int max = 0;
        for (Car car : carList) {
            if (car.getCostInDollars() > max) {
                max = car.getCostInDollars();
        }}
        for (Car car : carList) {
            if (max == car.getCostInDollars()) {
                System.out.println(car.toString());
            }
        }
    }



public void sort() {
        Collections.sort(carList, new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return c1.getFuelConsumptionPer100km() - c2.getFuelConsumptionPer100km();
            }
        });
       for (Car car:carList){
           System.out.println(car.toString());
       }
}


    }
