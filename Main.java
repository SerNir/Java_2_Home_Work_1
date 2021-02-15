import java.util.Random;

public class Main {
    public static void main(String[] args) {
        race(RegistrationOfParticipants());

    }



    public static Object[] RegistrationOfParticipants(){
        Object [] participants = new Object[9];
        participants[0] = new Human("Alex", 27, 17, 15);
        participants[1] = new Cat("Barsik", 4, 11, 12);
        participants[2] = new Robot("Bender", 22, 23, 25);
        participants[3] = new Human("Viktor", 37, 12, 8);
        participants[4] = new Cat("Murzik", 2, 11, 12);
        participants[5] = new Robot("R2D2", 216, 50, 2);
        participants[6] = new Human("Tolik", 20, 21, 15);
        participants[7] = new Cat("Glasha", 1, 14, 12);
        participants[8] = new Robot("0101100", 01, 30, 20);

        return participants;
    }

    public static void race(Object[] participants){
      ObstacleRace newRace = new ObstacleRace();
        for (int i = 0; i < participants.length; i++) {
            newRace.race(participants[i], newRace.obstacleRace());
        }
        }
    }

