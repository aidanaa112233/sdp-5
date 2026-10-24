public class Main {

    public static void main(String[] args) {

        System.out.println("=== SMART ROBOT CLEANING SYSTEM ===");
        System.out.println();

        CleaningRobot robot = new CleaningRobot(
                new QuickCleaningStrategy()
        );

        robot.startCleaning(20);

        robot.setStrategy(new DeepCleaningStrategy());
        robot.startCleaning(20);

        robot.setStrategy(new EcoCleaningStrategy());
        robot.startCleaning(20);

        System.out.println("All cleaning modes tested successfully!");
    }
}

