package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;

public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel(String hotelName, Double rates) {
        Hotel hotel = new Hotel(hotelName, rates);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }

    /* to find the cheapest rates for the hotel. */
    public String findCheapestHotel(Date[] dates) {
        ArrayList<Double> cheapRateHotels = new ArrayList<>();
        for (Hotel hotel : hotelList){
            Double rate = 0.0;
            for ( Date date : dates){
                rate = hotel.getRates();
            }
            cheapRateHotels.add(rate);
        }
        Double cheap = cheapRateHotels.stream().min(Comparator.comparing(Double::doubleValue)).orElse(null);
        int index = cheapRateHotels.indexOf(cheap);
        return hotelList.get(index).getName();
    }

    /* added weekday and weekend rates for every hotel.*/
    public boolean addHotelRates(String hotelName, double weekday, double weekend ) {
        Hotel hotel = new Hotel(hotelName, weekday);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }


    // method to calculate number fo days for given dates
    public static int[] numberOfDays(String fromDate, String toDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
        LocalDate from = LocalDate.parse(fromDate, formatter); // convert String to LocalDate
        LocalDate to = LocalDate.parse(toDate, formatter);
        int numWeekdays = 0;
        int numWeekendDays = 0;
        int days[];
        days = new int[2];
        for (LocalDate date = from; date.isBefore(to.plusDays(1)); date = date.plusDays(1)) {
            DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
            switch (day) {
                case SATURDAY:
                    numWeekendDays++;
                    break;

                case SUNDAY:
                    numWeekendDays++;
                    break;

                default:
                    numWeekdays++;
            }
        }
        days[0] = numWeekdays;
        days[1] = numWeekendDays;
        return days;
    }

    /*  added rating for each hotel.*/
    public boolean addHotelRating(String hotelName, int rating ) {
        Hotel hotel = new Hotel(hotelName, (double) rating);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }


}
