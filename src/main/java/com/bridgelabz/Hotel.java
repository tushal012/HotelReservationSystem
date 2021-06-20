package com.bridgelabz;

public class Hotel {
    private final String hotelName;
    private final double rates;
    private final Double weekendRates;
    private int WeekendRate;
    private int WeekdayRate;

    public Hotel(String hotelName, double rates) {
        this.hotelName = hotelName;
        this.rates = rates;
        weekendRates = null;
    }

    public Hotel(String hotelName, Double rates, Double weekendRates) {
        this.hotelName = hotelName;
        this.rates = rates;
        this.weekendRates = weekendRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + hotelName + '\'' +
                ", rates=" + rates +
                '}';
    }
    public Double getRates() {
        return rates;
    }

    public String getName() {
        return hotelName;
    }



    public int getWeekdayRate() {
        return WeekdayRate;
    }
    public void setWeekdayRate(int regWeekdayRate) {
        this.WeekdayRate = regWeekdayRate;
    }
    // getter and setter method for regular weekend days
    public int getWeekendRate() {
        return WeekendRate;
    }
    public void setWeekendRate(int regWeekendRate) {
        this.WeekendRate = regWeekendRate;
    }
}
