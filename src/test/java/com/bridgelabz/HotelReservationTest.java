package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotelWhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotel("Lakewood", 950.00);
        Assert.assertTrue(result);
    }

    @Test
    public void givenBookingDate_ShouldReturn_CheapestHotel(){
        SimpleDateFormat df = new SimpleDateFormat("ddMMMMyyyy");
        String inputDateString [] = {"10sep2020", "10sep2020"};

        Date[] inputDate = null;
        try {
            inputDate = new Date[]{df.parse(inputDateString[0]), df.parse(inputDateString[1])};
        }
        catch (ParseException e){
            System.out.println("Invalid Formate");
            if (!df.format(inputDateString).equals(inputDate)){
                System.out.println("Invalid Date!!");
            }else
                System.out.println("Valid Date");
        }
        boolean result = hotelReservation.addHotel("Lakewood", 220.00) &&
                hotelReservation.addHotel("Ridgewood", 1200.00) ;
        if (result)
            Assert.assertEquals("Lakewood", hotelReservation.findCheapestHotel(inputDate));
    }

    @Test
    public void givenWeekDayAndWeekendRatesForHotelsWhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotelRates("Lakewood", 110.00, 90.00) &&
                hotelReservation.addHotelRates("Bridgewood", 150.00, 50.00) &&
                hotelReservation.addHotelRates("Ridgewood", 220.00, 150.00);
                Assert.assertTrue(result);
    }

   /* @Test
    public void whenNewHotelAddedWithWeekend_shouldReturnTrue() {
        Assert.assertTrue(hotelReservation.addHotel("Lakewood", 110, 90));
        Assert.assertTrue(hotelReservation.addHotel("Bridgewood", 150, 50));
        Assert.assertTrue(hotelReservation.addHotel("Ridgewood", 220, 150));
    }
    @Test
    public void givenHotelNamesAndRates_findCheapestHotelAndReturnNameOfHotelWithRent() {
        Assert.assertTrue(hotelReservation.addHotel("Lakewood", 110, 90));
        Assert.assertTrue(hotelReservation.addHotel("Bridgewood", 150, 50));
        Assert.assertTrue(hotelReservation.addHotel("Ridgewood", 220, 150));
        Assert.assertTrue(hotelReservation.findCheapestHotel("11Sep2020", "12Sep2020"));
    }*/

    @Test
    public void givenRatingForHotels_WhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotelRating("Lakewood",3) &&
                hotelReservation.addHotelRating("Bridgewood", 4) &&
                hotelReservation.addHotelRating("Ridgewood", 5);
                Assert.assertTrue(result);
    }
}
