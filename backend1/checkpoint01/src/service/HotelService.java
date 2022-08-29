package service;

import dao.IDao;
import entities.Hotel;

import java.util.List;

public class HotelService {

    private IDao<Hotel> hotelIDao;

    public HotelService(IDao<Hotel> hotelIDao) {
        this.hotelIDao = hotelIDao;
    }

    public Hotel save(Hotel hotel) {
        hotelIDao.save(hotel);
        return hotel;
    }

    public List<Hotel> searchAll() {
        return hotelIDao.searchALl();
    }


}
