public class Wall {
    private int heightWall;
    private boolean successfully;

    public boolean isSuccessfully() {
        return successfully;
    }

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    public boolean jump(Object o){
        if(o instanceof Cat){
            if(heightWall <= ((Cat) o).getMaxJumpHeight()){
                System.out.println("Кот " + ((Cat)o).getName() + " перепрыгнул стену.");
                successfully = true;
            }else{
                System.out.println("Кот " +((Cat)o).getName() + " несмог преодалеть испытание.");
                successfully = false;
            }
        }
        if(o instanceof Human){
            if(heightWall <= ((Human) o).getMaxJumpHeight()){
                System.out.println("Человек " + ((Human)o).getName() + " перепрыгнул стену.");
                successfully = true;
            }else{
                System.out.println("Человек " +((Human)o).getName() + " несмог преодалеть испытание.");
                successfully = false;
            }
        }
        if(o instanceof Robot){
            if(heightWall <= ((Robot) o).getMaxJumpHeight()){
                System.out.println("Робот " + ((Robot)o).getName() + " перепрыгнул стену.");
                successfully = true;
            }else{
                System.out.println("Робот " +((Robot)o).getName() + " несмог преодалеть испытание.");
                successfully = false;
            }
        }



        return successfully;
    }
}
