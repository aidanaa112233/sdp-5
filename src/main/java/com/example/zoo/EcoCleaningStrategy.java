public class EcoCleaningStrategy implements CleaningStrategy {

    @Override
    public void clean(int roomSize) {
        int minutes = roomSize * 4;

        System.out.println("Cleaning Mode: ECO");
        System.out.println("Room size: " + roomSize + " m2");
        System.out.println("Estimated time: " + minutes + " minutes");
        System.out.println("Robot uses low power to save energy.");
        System.out.println();
    }
}
