package com.company;

public class TransitCalculator {
    double numberOfDays;
    double numberOfRides;

    /*
        Pay-per-ride (single ride): $2.75
        7-day Unlimited Rides: $33.00
        30-day Unlimited Rides: $127.00
    */
    double singleRideRate = 2.75;
    double sevenDayUnlimitedRideRate = 33.00;
    double thirtyDayUnlimitedRideRate = 127.00;

    public double unlimited7Price(double days, double rides){
        return Math.ceil(days / 7.0) * 33.00 / rides;
    };

    public TransitCalculator(double days, double rides){
        if(days <= 30){
            numberOfDays = days;
        } else {
            numberOfDays = 30;
        }

        numberOfRides = rides;
    }

    public static void main(String[] args) {
	    // write your code here
        TransitCalculator myCalc1 = new TransitCalculator(19.0, 20.0);
        TransitCalculator myCalc2 = new TransitCalculator(22.0, 50.0);
        TransitCalculator myCalc3 = new TransitCalculator(6.0, 14.0);
        System.out.println(myCalc1.unlimited7Price(myCalc1.numberOfDays, myCalc1.numberOfRides));
        System.out.println(myCalc2.unlimited7Price(myCalc2.numberOfDays, myCalc2.numberOfRides));
        System.out.println(myCalc3.unlimited7Price(myCalc3.numberOfDays, myCalc3.numberOfRides));
    }
}
