package com.microservice.House_details.Mapper;

import com.microservice.House_details.Model.House;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
    public class HouseMapper implements RowMapper<House> {
        @Override
        public House mapRow(ResultSet rs, int rowNum) throws SQLException {
            House house = new House();

            house.setHouseNo(rs.getInt("houseNo"));
            house.setName(rs.getString("name"));
            house.setOwnerName(rs.getString("ownerName"));
            return house;
        }
}
