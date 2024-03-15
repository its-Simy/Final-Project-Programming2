import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

//Building parameters
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number of floors that you want in the building: ");
        int a = scan.nextInt();

        Building b = new Building(a);
        b.buildBuilding(a);
        //can also put the nextint in the signature, but would need to change the constructor of building




        System.out.println("input the number of people you want per floor: ");
        b.setPeoplePerFloor(scan.nextInt());

        b.addPeopleToFloor();



/*
    # Elevator types
    elevator_type StandardElevator(10,40);
    elevator_type ExpressElevator(8,25);

    # Percentage of passenger requests for each elevator type
    request_percentage StandardElevator(60);
    request_percentage ExpressElevator (40);

    # Percentage of passenger requests for each passenger type

    passenger_request_percentage(Standard,70);
    passenger_request_percentage(VIP,30);


    # Number of elevators in the system
    number_of_elevators(8);

    # Run simulation for 60 iterations
    run_simulation(60);
    */


    }

}
