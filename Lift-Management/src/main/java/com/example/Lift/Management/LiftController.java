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
    @DeleteMapping("/delete_passenger")
    public ResponseEntity<String> deletePassenger(@RequestParam int passengerId){
        liftService.deletePassenger(passengerId);

            return new ResponseEntity("Id delete successfully", HttpStatus.OK);
    }
    public ResponseEntity<List<Integer>> getPassengerMoreThenGivenWeight(@RequestParam int passengerId,@RequestParam int weight,@RequestParam int liftNo){
        List<Integer> getPassenger = liftService.getPassengerMoreThenGivenWeight(passengerId,weight,liftNo);
    }
}
