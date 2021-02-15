public class Robot {
    private String name;
    private  int age;
    private double maxRunningLength;
    private double maxJumpHeight;

    public Robot(String name, int age, double maxRunningLength, double maxJumpHeight) {
        this.name = name;
        this.age = age;
        this.maxRunningLength = maxRunningLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }
    public double getMaxRunningLength() {
        return maxRunningLength;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }
}