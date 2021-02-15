public class Treadmill {
    private int heightTreadmill;
    private boolean successfully;

    public boolean isSuccessfully() {
        return successfully;
    }

    public Treadmill(int heightTreadmill){
        this.heightTreadmill = heightTreadmill;
    }

    public boolean run(Object o){
        if (o instanceof Cat){
            if(heightTreadmill <= ((Cat) o).getMaxRunningLength()){
                System.out.println("Кот " + ((Cat) o).getName() + " успешно пробежал дистанцию.");
                successfully = true;
            }else {
                System.out.println("Кот " + ((Cat) o).getName() + " не прошел дистанцию.");
                successfully = false;
            }
        }
        if (o instanceof Human){
            if(heightTreadmill <= ((Human) o).getMaxRunningLength()){
                System.out.println("Человек " + ((Human) o).getName() + " успешно пробежал дистанцию.");
                successfully = true;
            }else {
                System.out.println("Человек " + ((Human) o).getName() + " не прошел дистанцию.");
                successfully = false;
            }
        }
        if (o instanceof Robot){
            if(heightTreadmill <= ((Robot) o).getMaxRunningLength()){
                System.out.println("Робот " + ((Robot) o).getName() + " успешно пробежал дистанцию.");
                successfully = true;
            }else {
                System.out.println("Робот " + ((Robot) o).getName() + " не прошел дистанцию.");
                successfully = false;
            }
        }




        return successfully;
    }
}
