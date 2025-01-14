import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String companyName;
    private String vehicleNumber;
    private String type;

    public Vehicle(String companyName, String vehicleNumber, String type) {
        this.companyName = companyName;
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Vehicle[" + "Company: " + companyName + ", Number: " + vehicleNumber + ", Type: " + type + "]";
    }
}

class Slot {
    private int slotNumber;
    private String size;
    private boolean isOccupied;

    public Slot(int slotNumber, String size) {
        this.slotNumber = slotNumber;
        this.size = size;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getSize() {
        return size;
    }

    public void occupySlot() {
        this.isOccupied = true;
    }

    public void freeSlot() {
        this.isOccupied = false;
    }

    public String toString() {
        return "Slot[Number: " + slotNumber + ", Size: " + size + ", Occupied: " + isOccupied + "]";
    }
}

class Level {
    private int floorNumber;
    private List<Slot> slots;

    public Level(int floorNumber, int numberOfSlots) {
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();
        for (int i = 1; i <= numberOfSlots; i++) {
            String size = (i % 3 == 0) ? "Large" : (i % 2 == 0) ? "Medium" : "Small";
            slots.add(new Slot(i, size));
        }
    }

    public Slot findAvailableSlot(String vehicleType) {
        for (Slot slot : slots) {
            if (!slot.isOccupied() && slot.getSize().equalsIgnoreCase(vehicleType)) {
                return slot;
            }
        }
        return null;
    }

    public String toString() {
        return "Level[Floor: " + floorNumber + ", Slots: " + slots + "]";
    }
}

class ParkingLot {
    private List<Level> levels;

    public ParkingLot(int numberOfLevels, int slotsPerLevel) {
        this.levels = new ArrayList<>();
        for (int i = 1; i <= numberOfLevels; i++) {
            levels.add(new Level(i, slotsPerLevel));
        }
    }

    public Slot findAndParkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            Slot availableSlot = level.findAvailableSlot(vehicle.getType());
            if (availableSlot != null) {
                availableSlot.occupySlot();
                System.out.println("Vehicle parked in: " + availableSlot);
                return availableSlot;
            }
        }
        System.out.println("No available slot for the vehicle.");
        return null;
    }

    public String toString() {
        return "ParkingLot[Levels: " + levels + "]";
    }
}

public class ParkingLotSystem {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3, 10);

        Vehicle car1 = new Vehicle("Toyota", "ABC123", "Small");
        Vehicle car2 = new Vehicle("Ford", "XYZ789", "Medium");
        Vehicle truck = new Vehicle("Volvo", "TRK456", "Large");

        parkingLot.findAndParkVehicle(car1);
        parkingLot.findAndParkVehicle(car2);
        parkingLot.findAndParkVehicle(truck);
    }
}
