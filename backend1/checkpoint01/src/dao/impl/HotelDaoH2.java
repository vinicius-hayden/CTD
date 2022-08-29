package dao.impl;

import dao.IDao;
import dao.config.JDBCConfig;
import entities.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelDaoH2 implements IDao<Hotel> {

    private JDBCConfig jdbcConfig;

    public HotelDaoH2(JDBCConfig jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }



    @Override
    public Hotel save(Hotel hotel) {
        Connection connection = jdbcConfig.connectWithDataBase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO hotel " +
                        "(subsidiaryname, street, number, city, state, is5stars) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                hotel.getSubsidiaryName(),
                hotel.getStreet(),
                hotel.getNumber(),
                hotel.getCity(),
                hotel.getState(),
                hotel.isIs5stars()
        );

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                hotel.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hotel;
    }

    @Override
    public List<Hotel> searchALl() {
        Connection connection = jdbcConfig.connectWithDataBase();
        Statement statement = null;
        String query = "SELECT * FROM hotel";
        List<Hotel> hotels = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                hotels.add(createObjectHotel(resultSet));
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hotels;
    }

    private Hotel createObjectHotel(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt(1);
        String subsidiaryname = resultSet.getString(2);
        String street = resultSet.getString(3);
        String number = resultSet.getString(4);
        String city = resultSet.getString(5);
        String state = resultSet.getString(6);
        boolean is5star = resultSet.getBoolean(7);
        return new Hotel(id, subsidiaryname, street, number, city, state, is5star);
    }

}
