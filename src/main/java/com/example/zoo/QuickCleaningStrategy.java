public class QuickCleaningStrategy implements CleaningStrategy {

    @Override
    public void clean(int roomSize) {
        int minutes = roomSize * 2;

        System.out.println("Cleaning Mode: QUICK");
        System.out.println("Room size: " + roomSize + " m2");
        System.out.println("Estimated time: " + minutes + " minutes");
        System.out.println("Robot cleans only the main areas.");
        System.out.println();
    }
}
