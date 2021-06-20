package com.bridgelabz;

public class Hotel {
    private final String hotelName;
    private final double rates;
    private final Double weekendRates;
    private  final  int rating;

    public Hotel(String hotelName, double rates) {
        this.hotelName = hotelName;
        this.rates = rates;
        weekendRates = null;
        rating = 0;
    }

    public Hotel(String hotelName, Double rates, Double weekendRates, int rating) {
        this.hotelName = hotelName;
        this.rates = rates;
        this.weekendRates = weekendRates;
        this.rating = rating;
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

    public Double getWeekendRates() {
        return weekendRates;
    }
}
