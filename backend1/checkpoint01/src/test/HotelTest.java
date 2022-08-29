package test;

import dao.config.JDBCConfig;
import dao.impl.HotelDaoH2;
import entities.Hotel;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import service.HotelService;

public class HotelTest {

    final static Logger LOGGER = Logger.getLogger(HotelTest.class);
    private HotelService hotelService = new HotelService(new HotelDaoH2(new JDBCConfig()));

    Hotel h1, h2, h3, h4, h5;

    @Test
    public void registerHotels() {
        LOGGER.info("Creating the first hotel");
        h1 = hotelService.save(new Hotel("California Hotel","Bakery", "78", "Los Angeles", "California", true));
        LOGGER.info("Creating the second hotel");
        h2 = hotelService.save(new Hotel("Love Hotel","Spadina", "65", "Austin", "Texas", false));
        LOGGER.info("Creating the third hotel");
        h3 = hotelService.save(new Hotel("Goodbye Hotel","Pleasant Blvd", "25", "Columbia", "South Carolina", true));
        LOGGER.info("Creating the fourth hotel");
        h4 = hotelService.save(new Hotel("Have a good night Hotel","Blanding", "87", "Minneapolis", "Minnesota", false));
        LOGGER.info("Creating the fifth hotel");
        h5 = hotelService.save(new Hotel("Coupler Hotel","St Anthony", "63", "Chicago", "Illinois", true));
    }

    @Test
    public void searchAll() {
        LOGGER.info("Searching every hotel in the query");
        System.out.println(hotelService.searchAll());
    }

}
