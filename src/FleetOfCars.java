import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public FleetOfCars() {
        fleet = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int total = 0;
        for (Car c : fleet) {
            total += c.getRegistrationFee();
        }
        return total;
    }

    public String toString() {
        for (Car c : fleet) {
            System.out.print(" " + c);
            System.out.println("\n");
        }

        return "";
    }
}