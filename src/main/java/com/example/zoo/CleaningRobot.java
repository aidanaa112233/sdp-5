public class CleaningRobot {

    private CleaningStrategy strategy;

    public CleaningRobot(CleaningStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CleaningStrategy strategy) {
        this.strategy = strategy;
    }

    public void startCleaning(int roomSize) {
        System.out.println("Robot started cleaning...");
        strategy.clean(roomSize);
    }
}

