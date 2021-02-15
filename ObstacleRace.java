public class ObstacleRace {

    public Object[] obstacleRace(){
        Object[] obstacleRace = new Object[10];
        obstacleRace[0] = new Treadmill(5);
        obstacleRace[2] = new Treadmill(10);
        obstacleRace[4] = new Treadmill(15);
        obstacleRace[6] = new Treadmill(20);
        obstacleRace[8] = new Treadmill(25);
        obstacleRace[1] = new Wall(5);
        obstacleRace[3] = new Wall(10);
        obstacleRace[5] = new Wall(15);
        obstacleRace[7] = new Wall(20);
        obstacleRace[9] = new Wall(25);

        return obstacleRace;
    }

    public void race(Object o, Object[] arr){

        if(o instanceof Cat){
                Cat cat = (Cat)o;
            for (int i = 0; i < arr.length; i++) {

                if(arr[i] instanceof Treadmill){
                    ((Treadmill) arr[i]).run(cat);
                    if(!((Treadmill) arr[i]).isSuccessfully()){
                        break;
                    }
                }
                if (arr[i] instanceof Wall){
                    ((Wall) arr[i]).jump(cat);
                    if(!((Wall)arr[i]).isSuccessfully()){
                        break;
                    }
                }
            }
        }
        if(o instanceof Human){
            Human human = (Human)o;
            for (int i = 0; i < arr.length; i++) {

                if(arr[i] instanceof Treadmill){
                    ((Treadmill) arr[i]).run(human);
                    if(!((Treadmill) arr[i]).isSuccessfully()){
                        break;
                    }
                }
                if (arr[i] instanceof Wall){
                    ((Wall) arr[i]).jump(human);
                    if(!((Wall)arr[i]).isSuccessfully()){
                        break;
                    }
                }
            }
        }
        if(o instanceof Robot){
            Robot robot = (Robot)o;
            for (int i = 0; i < arr.length; i++) {

                if(arr[i] instanceof Treadmill){
                    ((Treadmill) arr[i]).run(robot);
                    if(!((Treadmill) arr[i]).isSuccessfully()){
                        break;
                    }
                }
                if (arr[i] instanceof Wall){
                    ((Wall) arr[i]).jump(robot);
                    if(!((Wall)arr[i]).isSuccessfully()){
                        break;
                    }
                }
            }
        }
        System.out.println("__________________________");
    }


}
