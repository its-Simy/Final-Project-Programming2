/*import java.util.ArrayList;

public class Building {

protected int floorNum;

    public Building(){
        floorNum = 30;
    }

    public Building (int floorNum){
    this.floorNum = floorNum;
}

    public void buildBuilding(int floorNum){

        ArrayList<Building> floorC = new ArrayList<>();
        for(int i=0; i < floorNum; i++)
        {
            floorC.add(new Building(i));
        }


    }


}
*/
import java.util.ArrayList;

public class Building {

    protected int floorNum;
    protected ArrayList<Building> floors;
    protected int peoplePerFloor;

    public Building() {
        floorNum = 30;
        floors = new ArrayList<>();
        peoplePerFloor = 2;
    }

    public Building(int floorNum) {
        this.floorNum = floorNum;
        floors = new ArrayList<>();
        for (int i = 0; i < floorNum; i++) {
            floors.add(new Building(i));
        }
        peoplePerFloor = 2;
    }
    public Building(int floorNum, int peoplePerFloor) {
        this.floorNum = floorNum;
        floors = new ArrayList<>();
        for (int i = 0; i < floorNum; i++) {
            floors.add(new Building(i));
        }
        this.peoplePerFloor = peoplePerFloor;
    }

    public void buildBuilding(int floorNum) {
        floors = new ArrayList<>();
        for (int i = 0; i < floorNum; i++) {
            floors.add(new Building(i));
        }
    }

    public ArrayList<Building> getFloors() {
        return floors;
    }
    public void setPeoplePerFloor(int peoplePerFloor) {
        this.peoplePerFloor = peoplePerFloor;
    }
    public void setPeoplePerFloor(int floorIndex, int peoplePerFloor) {
        floors.get(floorIndex).setPeoplePerFloor(peoplePerFloor);
    }

    public int getPeoplePerFloor() {
        return peoplePerFloor;
    }

    public void addPeopleToFloor() {
        ArrayList<Building> floors = getFloors();
        for (int i = 0; i < floors.size(); i++) {
            floors.get(i).setPeoplePerFloor(i, peoplePerFloor);
            System.out.println("Floor " + (i + 1) + ": " + floors.get(i).getPeoplePerFloor());
        }
    }


}
