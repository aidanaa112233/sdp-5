public class DeepCleaningStrategy implements CleaningStrategy {

    @Override
    public void clean(int roomSize) {
        int minutes = roomSize * 5;

        System.out.println("Cleaning Mode: DEEP");
        System.out.println("Room size: " + roomSize + " m2");
        System.out.println("Estimated time: " + minutes + " minutes");
        System.out.println("Robot cleans corners, carpets, and all areas.");
        System.out.println();
    }
}
