package SolvePgms;

import java.util.List;

//SOLUTION- https://leetcode.com/discuss/interview-question/124739/Parking-Lot-Design-Using-OO-Design

public class Parking {
	
	private String parkingId;
    private List<Floor> floors;
    private String parkingName;
    private String address;

    public Parking(String parkingId, List<Floor> floors, String parkingName, String address) {
        this.parkingId = parkingId;
        this.floors = floors;
        this.parkingName = parkingName;
        this.address = address;
    }

    public void emptyWholeParkingLot() {
        for (Floor floor : floors) {
            floor.emptyFloor();
        }
    }

}
