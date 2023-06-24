package com.example.Lift.Management;

import java.util.ArrayList;
import java.util.List;

public class Lift {
    private int liftNo;
    private  int capacityWeight;
    private int capacityPassenger;
    private List<Passenger> listOfPassenger;

    public Lift() {
    }

    public Lift(int liftNo, int capacityWeight, int capacityPassenger) {
        this.liftNo = liftNo;
        this.capacityWeight = capacityWeight;
        this.capacityPassenger = capacityPassenger;
        this.listOfPassenger = new ArrayList<>();
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacityWeight() {
        return capacityWeight;
    }

    public void setCapacityWeight(int capacityWeight) {
        this.capacityWeight = capacityWeight;
    }

    public int getCapacityPassenger() {
        return capacityPassenger;
    }

    public void setCapacityPassenger(int capacityPassenger) {
        this.capacityPassenger = capacityPassenger;
    }

    public List<Passenger> getListOfPassenger() {
        return listOfPassenger;
    }

    public void setListOfPassenger(List<Passenger> listOfPassenger) {
        this.listOfPassenger = listOfPassenger;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "liftNo=" + liftNo +
                ", capacityWeight=" + capacityWeight +
                ", capacityPassenger=" + capacityPassenger +
                ", listOfPassenger=" + listOfPassenger +
                '}';
    }
}
