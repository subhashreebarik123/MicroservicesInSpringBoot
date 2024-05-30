package com.microservice.House_details.Repository;

import com.microservice.House_details.Model.House;
import org.springframework.stereotype.Repository;


public interface HouseRepository {



    House getHouse(String HouseName);

    void updateHouse(int houseName);


    void deleteHouse(String Name);

    void fun (House house);

    }



