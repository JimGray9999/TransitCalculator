package com.company;

public class TransitCalculator {
    int numberOfDays;
    int numberOfRides;

    /*
        Pay-per-ride (single ride): $2.75
        7-day Unlimited Rides: $33.00
        30-day Unlimited Rides: $127.00
    */
    double singleRideRate = 2.75;
    double sevenDayUnlimitedRideRate = 33.00;
    double thirtyDayUnlimitedRideRate = 127.00;

    public double unlimited7Price(int days, int rides){
        double costPerRide = 0.00;

        return costPerRide;
    };

    public TransitCalculator(int days, int rides){
        if(days <= 30){
            numberOfDays = days;
        } else {
            numberOfDays = 30;
        }

        numberOfRides = rides;
    }

    public static void main(String[] args) {
	    // write your code here
        TransitCalculator myCalc = new TransitCalculator(6, 6);
        System.out.println(myCalc.numberOfDays);
        System.out.println(myCalc.numberOfRides);
    }
}
