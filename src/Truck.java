public class Truck {
    int containersInTruck;
    static final int CONTAINERS_IN_TRUCK = 12;
    static int trucks;

    public static void resetCounter() {
        trucks = 0;
    }

    String descriptionOfContainers = "";
    String descriptionOfTrucks = "";

    public Truck() {
        trucks++;
        descriptionOfTrucks += "Truck: " + trucks;
    }

    public boolean canAddContainers() {

        return containersInTruck < CONTAINERS_IN_TRUCK;
    }

    public void addContainers(Container additional) {
        containersInTruck++;
        descriptionOfContainers += "\n\tContainer: " + Container.getTotalContainers() + additional.toString();
    }

    public static int getTotalTrucks() {

        return trucks;
    }

    public boolean isEmptyTruck() {

        return containersInTruck == 0;
    }

    @Override
    public String toString() {

        return descriptionOfTrucks + descriptionOfContainers;
    }

}
