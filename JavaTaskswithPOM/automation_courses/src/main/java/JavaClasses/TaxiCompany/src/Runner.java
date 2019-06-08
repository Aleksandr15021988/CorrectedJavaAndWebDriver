import Automobiles.Car;
import Automobiles.CargoTaxi;
import Automobiles.PassengerTaxi;
import Models.MarketSegmentClassification;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new PassengerTaxi("Audi", 220, 11, 9_700, MarketSegmentClassification.C_CLASS);
        Car car2 = new PassengerTaxi("Mersedes", 260, 14, 12_800, MarketSegmentClassification.E_CLASS);
        Car car3 = new PassengerTaxi("Fiat", 160, 6, 4_800, MarketSegmentClassification.E_CLASS);
        Car car4 = new PassengerTaxi("Skoda", 220, 11, 18_200, MarketSegmentClassification.D_CLASS);
        Car car5 = new PassengerTaxi("Jaguar", 280, 16, 22_000, MarketSegmentClassification.F_CLASS);
        Car car6 = new CargoTaxi("Daf", 180, 14, 17_000, 3);
        Car car7 =new CargoTaxi("Iveco",140,15,11_000,10);
        CarList newList = new CarList();
        newList.addCar(car1);
        newList.addCar(car2);
        newList.addCar(car3);
        newList.addCar(car4);
        newList.addCar(car5);
        newList.addCar(car6);
        newList.addCar(car7);
        String incorrectInput=null;
        do {
        System.out.println("Введите:\n 1 для просмотра стоимости основных фондов таксопарка\n" +
                " 2 для сортировки автомобилей по расходу топлива на 100 км\n 3 для поиска автомобиля по максимальной скорости");

        Scanner scan=new Scanner(System.in);
        int switchProgramm;
        switchProgramm=scan.nextInt();

    switch (switchProgramm) {

        case (1):
            newList.costCompany();
            break;
        case (2):
            newList.sort();
            break;
        case (3):
            System.out.println("Введите диапазон диапазон скорости для поиска автомобилей");
            System.out.println("От:");
            Scanner scannerMin = new Scanner(System.in);
            int MinSpeed = scannerMin.nextInt();
            System.out.println("До:");
            Scanner scannerMax = new Scanner(System.in);
            int MaxSpeed = scannerMax.nextInt();
            newList.maxSpeedPrint(MinSpeed, MaxSpeed);
            break;
        default:
            incorrectInput = "Данные введены некорректно";
            System.out.println(incorrectInput);

    }

        }while(incorrectInput==null);



    }
}
