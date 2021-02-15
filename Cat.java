public class Cat {
    private String name;
    private int age;
    private double maxRunningLength;
    private double maxJumpHeight;

    public String getName() {
        return name;
    }
    public double getMaxRunningLength() {
        return maxRunningLength;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public Cat(String name, int age, double maxRunningLength, double maxJumpHeight) {
        this.name = name;
        this.age = age;
        this.maxRunningLength = maxRunningLength;
        this.maxJumpHeight = maxJumpHeight;
    }
    public void jump(){
        System.out.println("Cat " + name + " is jump");
    }

    public void run(){
        System.out.println("Cat " + name + " is running");
    }

}
