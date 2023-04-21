public class ElectricCar extends ACar {
    private final int batteryCapacityWh;
    private final int maxRangeKm;
    private final float whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityWh = batteryCapacity;
        this.maxRangeKm = maxRange;
        this.whPrKm = batteryCapacityWh*1000/maxRangeKm ;

    }

    public int getBatteryCapacityWh() {
        return this.batteryCapacityWh;
    }

    public int getMaxRangeKm() {
        return this.maxRangeKm;
    }

    public double getWhPrKm() {
        double refaktorkm = (double)(whPrKm/91.25);
        double result = (double) (100/refaktorkm);
        return result;
    }

    public String getFuelType() {
        return "Electric";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        if (getWhPrKm() >= 20) {
            registrationFee = 330;
        } else if (getWhPrKm() >= 15 && getWhPrKm() < 20) {
            registrationFee = 1050;
        } else if (getWhPrKm() >= 10 && getWhPrKm() < 15) {
            registrationFee = 2340;
        } else if (getWhPrKm() >= 5 && getWhPrKm() < 10) {
            registrationFee = 5500;
        } else if (getWhPrKm() < 5) {
            registrationFee = 10470;
        } else {
            registrationFee = 0;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "ElectricCar: " + " Registration Number: " + getRegistrationNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Doors: " + getNumberOfDoors() + ", KmPrLiter: " + getWhPrKm() + ", Fuel Type: " + getFuelType() + ", registrationFee: " + getRegistrationFee();
    }

}
