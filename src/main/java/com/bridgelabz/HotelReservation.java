package com.bridgelabz;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel(String hotelName, Double rates) {
        Hotel hotel = new Hotel(hotelName, rates);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }


}
