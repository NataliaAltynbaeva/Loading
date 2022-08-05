public class Container {

    String descriptionOfBoxes = "";
    int boxesInContainer;
    static int containersTotal;
    static int boxesTotal;

    static final int BOXES_IN_CONTAINER = 27;

    public Container() {
        containersTotal++;
    }

    public static int getTotalContainers() {

        return containersTotal;
    }

    public static void resetCounter() {
        boxesTotal = 0;
        containersTotal = 0;
    }

    public boolean canAddBoxes() {

        return boxesInContainer < BOXES_IN_CONTAINER;
    }

    public boolean isEmptyContainer() {

        return boxesInContainer == 0;
    }

    public void addBoxes() {
        boxesInContainer++;
        boxesTotal++;
        descriptionOfBoxes += "\n\t\tBox: " + boxesTotal;
    }

    @Override
    public String toString() {

        return descriptionOfBoxes;
    }
}
