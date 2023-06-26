package com.example.Lift.Management;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
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

    public List<Passenger> getListOfPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        for(Integer passengerId : passengerDb.keySet()){
            passengers.add(passengerDb.get(passengerId));
        }
        return passengers;
    }
    public void deletePassenger(int passengerId) {
        for(int passid : passengerDb.keySet()){
            if(passengerDb.get(passid).getPassengerId() < 5){
                passengerDb.remove(passid);
            }
        }
    }

    public List<Integer> getPassengerMoreThenGivenWeight(int liftNo) {
        List<Integer> list = new ArrayList<>();
        for(int lift : liftDb.keySet()){
            if(liftDb.get(lift).equals(liftNo))
                for(Passenger passenger : liftDb.get(lift).getListOfPassenger())
                     if(passengerDb.get(passenger).getWeight() > 50){
                         list.add(passenger.getPassengerId());

            }
        }
        return list;
    }

    public int getMaxPassengerWithGivenWeight(int liftNo, int x) {
        int count = 0;
        for(int lift : liftDb.keySet()){
            if(liftDb.get(lift).equals(liftNo)){
                count = liftDb.get(liftNo).getCapacityPassenger() / x;
            }
        }
        return count;
    }


}
