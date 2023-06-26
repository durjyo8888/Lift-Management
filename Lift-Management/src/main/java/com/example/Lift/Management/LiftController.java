package com.example.Lift.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LiftController {
    @Autowired
    LiftService liftService;

    @PostMapping("/add_lift")
    public ResponseEntity<String> addLift(@RequestBody Lift lift){
        String s = liftService.addList(lift);
        if(s != null){
            return new ResponseEntity("Lift added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Lift already exist",HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add_passenger")
    public ResponseEntity<String> addPassenger(@RequestBody Passenger passenger){
        String s = liftService.addPassenger(passenger);
        if(s != null){
            return new ResponseEntity("Passenger added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Passenger already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/all_passenger")
    public ResponseEntity<List<Passenger>> getListOfPassengers(){
        List<Passenger> passengers = liftService.getListOfPassengers();
        return new ResponseEntity(passengers,HttpStatus.FOUND);
    }
    @DeleteMapping("/delete_passenger")
    public ResponseEntity<String> deletePassenger(@RequestParam int passengerId){
        liftService.deletePassenger(passengerId);

            return new ResponseEntity("Id delete successfully", HttpStatus.OK);
    }
    @GetMapping("/get_passenger_list")
    public ResponseEntity<List<Integer>> getPassengerMoreThenGivenWeight(@RequestParam int liftNo){
        List<Integer> getPassenger = liftService.getPassengerMoreThenGivenWeight(liftNo);
        return new ResponseEntity(getPassenger,HttpStatus.FOUND);
    }
    @GetMapping("/number_ of_passenger_can_travel")
    public ResponseEntity<Integer> getMaxPassengerWithGivenWeight(@RequestParam int liftNo,@RequestParam int X){
        int NumberOfPassenger = liftService.getMaxPassengerWithGivenWeight(liftNo, X);
        return new ResponseEntity(NumberOfPassenger, HttpStatus.FOUND);
    }

}
