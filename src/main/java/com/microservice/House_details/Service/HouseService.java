package com.microservice.House_details.Service;

import com.microservice.House_details.Model.House;
import org.springframework.stereotype.Service;


public interface HouseService {

    House getHouse(String HouseNo);

    void updateHouse(int houseName);

    void deleteHouse( int housename);

    void run (House house);



}
