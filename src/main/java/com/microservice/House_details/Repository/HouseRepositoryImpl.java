package com.microservice.House_details.Repository;

import com.microservice.House_details.Mapper.HouseMapper;
import com.microservice.House_details.Model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HouseRepositoryImpl implements HouseRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    HouseMapper houseMapper;

    @Override
    public House getHouse(String HouseName) {
        House house=jdbcTemplate.queryForObject("select HouseNo , Name ,OwnerName from House where  Name =? ",new Object[]{HouseName},houseMapper);
        return  house;
    }

    @Override
    public void updateHouse(int employeeName) {
        jdbcTemplate.update("update  House set HouseNo='5' where name =?", new Object[]{House.getName()});
    }

    @Override
    public void deleteHouse(String Name) {
        jdbcTemplate.update("delete from House where Name=?", new Object[]{Name});
    }


    @Override
    public void fun(House house) {
            int update = jdbcTemplate.update("insert into House(HouseNo,Name,OwnerName) values (?,?,?)",
                    house.getHouseNo(),house.getName(),house.getOwnerName());

    }
}
