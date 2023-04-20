import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





        FleetOfCars fleet = new FleetOfCars();
        ElectricCar car1 = new ElectricCar("ZZ45232", "Tesla", "3", 5, 75, 514);
        ElectricCar car2 = new ElectricCar("HG56433", "Tesla", "S", 4, 95, 600);
        DieselCar car3 = new DieselCar("JK12345", "Skoda", "Fabia", 5, 20, true);
        DieselCar car4 = new DieselCar("QQ44556", "Opel", "Insignia", 5, 15, false);
        GasolineCar car5 = new GasolineCar("ZZ23113", "Fiat", "Grande Punto", 3, 16);
        GasolineCar car6 = new GasolineCar("QW54321", "Mercedes", "500 SEC", 2, 9);


        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.addCar(car4);
        fleet.addCar(car5);
        fleet.addCar(car6);


        System.out.println(fleet);
        System.out.println(fleet.getTotalRegistrationFeeForFleet());

    }
}