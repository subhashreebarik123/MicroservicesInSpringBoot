package com.microservice.House_details.Service;

import com.microservice.House_details.Model.House;
import com.microservice.House_details.Repository.HouseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    HouseRepositoryImpl houseRepositoryimpl;

    @Override
    public House getHouse(String houseName) {

        return houseRepositoryimpl.getHouse(houseName);
    }

    @Override
    public void updateHouse(int houseName) {
    houseRepositoryimpl.updateHouse(houseName);
    }


    @Override
    public void deleteHouse(int name) {
    houseRepositoryimpl.deleteHouse(String.valueOf(name));
    }

    @Override
    public void run(House house) {
     houseRepositoryimpl.fun( house);

    }
}
