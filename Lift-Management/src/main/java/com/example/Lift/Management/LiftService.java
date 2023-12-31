package com.example.Lift.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiftService {
    @Autowired
    LiftRepository liftRepository;
    public String addList(Lift lift) {
        return liftRepository.addList(lift);
    }

    public String addPassenger(Passenger passenger) {
        return liftRepository.addPassenger(passenger);
    }

    public void deletePassenger(int passengerId) {
         liftRepository.deletePassenger(passengerId);
    }

    public List<Passenger> getListOfPassengers() {
        return liftRepository.getListOfPassengers();
    }

    public List<Integer> getPassengerMoreThenGivenWeight(int liftNo) {
        return liftRepository.getPassengerMoreThenGivenWeight(liftNo);
    }

    public int getMaxPassengerWithGivenWeight(int liftNo, int x) {
        return liftRepository.getMaxPassengerWithGivenWeight(liftNo, x);
    }


}
