package com.company;

import java.util.Arrays;

public class TransitCalculator {
    double numberOfDays;
    double numberOfRides;
    double singleRideRate = 2.75;
    double sevenDayUnlimitedRideRate = 33.00;
    double thirtyDayUnlimitedRideRate = 127.00;

    public double unlimited7Price(double days, double rides){
        return Math.ceil(days / 7.0) * sevenDayUnlimitedRideRate / rides;
    };

    public double[] getRidePrices(double days, double rides){

        double dailyRate = (rides * singleRideRate) / days;
        double sevenDayRate = this.unlimited7Price(days, rides);
        double unlimitedRate = thirtyDayUnlimitedRideRate / rides;
        double[] costs = new double[] {dailyRate, sevenDayRate, unlimitedRate};
        return costs;
    };

    public String getBestFare(double days, double rides){
        double[] priceCompare = getRidePrices(days, rides);
        //System.out.println(Arrays.toString(priceCompare));
        String[] bestRateNames = new String[]{"Pay-per-ride","7-day Unlimited","30-day Unlimited"};
        double bestPrice = priceCompare[0];
        String  bestRate = bestRateNames[0];

        for(int i = 0; i < priceCompare.length; i++){
            if (bestPrice > priceCompare[i]){
                bestPrice = priceCompare[i];
                bestRate = bestRateNames[i];
            }
        };

        return "You should get the " + bestRate + " option at " + "$" + String.format("%.2f", bestPrice) + " per ride.";
    };

    public TransitCalculator(double days, double rides){
        if(days <= 30){
            numberOfDays = days;
        } else {
            numberOfDays = 30;
        }

        numberOfRides = rides;
    };

    public static void main(String[] args) {
	    // write your code here
        TransitCalculator myCalc1 = new TransitCalculator(19.0, 20.0);
        TransitCalculator myCalc2 = new TransitCalculator(22.0, 50.0);
        TransitCalculator myCalc3 = new TransitCalculator(6.0, 14.0);
        System.out.println(myCalc1.getBestFare(myCalc1.numberOfDays, myCalc1.numberOfRides));
        System.out.println(myCalc2.getBestFare(myCalc2.numberOfDays, myCalc2.numberOfRides));
        System.out.println(myCalc3.getBestFare(myCalc3.numberOfDays, myCalc3.numberOfRides));
    };
};
