package com.example.Lift.Management;

public class Passenger {
    private int passengerId;
    private int weight;
    private int pliftNo;

    public Passenger() {
    }

    public Passenger(int passengerId, int weight, int pliftNo) {
        this.passengerId = passengerId;
        this.weight = weight;
        this.pliftNo = pliftNo;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPliftNo() {
        return pliftNo;
    }

    public void setPliftNo(int pliftNo) {
        this.pliftNo = pliftNo;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", weight=" + weight +
                ", pliftNo=" + pliftNo +
                '}';
    }
}
