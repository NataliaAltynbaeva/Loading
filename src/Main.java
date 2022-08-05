import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Truck.resetCounter();
        Container.resetCounter();
        final int numberOfBoxes = enterNumberOfBoxes();
        if (numberOfBoxes > 0) {
            distributeBoxes(numberOfBoxes);
        }
        printSummary();
    }

    private static int enterNumberOfBoxes() {
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    private static void distributeBoxes(int numberOfBoxes) {

        Container deliveryContainer = new Container();
        Truck deliveryTruck = new Truck();

        for (; numberOfBoxes > 0; numberOfBoxes--) {

            if (!deliveryContainer.canAddBoxes()) {
                deliveryTruck.addContainers(deliveryContainer);

                if (!deliveryTruck.canAddContainers()) {
                    System.out.println(deliveryTruck);
                    deliveryTruck = new Truck();
                }

                deliveryContainer = new Container();
            }
            deliveryContainer.addBoxes();
        }
        if (!deliveryContainer.isEmptyContainer()) {
            deliveryTruck.addContainers(deliveryContainer);
            if (!deliveryTruck.isEmptyTruck()) {
                System.out.println(deliveryTruck);
            }
        }
    }

    private static void printSummary() {
        System.out.println("Required:"
                + "\ntrucks - " + Truck.getTotalTrucks()
                + "\ncontainers - " + Container.getTotalContainers());
    }
}
