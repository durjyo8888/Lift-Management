package com.example.Lift.Management;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

@Repository
public class LiftRepository {
    HashMap<Integer,Lift> liftDb = new HashMap<>();
    HashMap<Integer,Passenger> passengerDb = new HashMap<>();
    public String addList(Lift lift) {
        if(liftDb.containsKey(lift)){
            return null;
        }
        liftDb.put(lift.getLiftNo(),lift);
        return lift.toString();

    }

    public String addPassenger(Passenger passenger) {
        if(passengerDb.containsKey(passenger)){
            return null;
        }
        passengerDb.put(passenger.getPassengerId(),passenger);
        return passenger.toString();
    }

    public void deletePassenger(int passengerId) {
        for(int passid : passengerDb.keySet()){
            if(passengerDb.get(passid).getPassengerId() < 5){
                passengerDb.remove(passid);
            }
        }
    }

    public List<Integer> getPassengerMoreThenGivenWeight(int passengerId, int weight, int liftNo) {

    }
}
