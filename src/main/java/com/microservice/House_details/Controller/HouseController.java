package com.microservice.House_details.Controller;

import com.microservice.House_details.Model.House;
import com.microservice.House_details.Service.HouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HouseController {

    @Autowired
    HouseServiceImpl houseServiceimpl;

    @GetMapping("/house/{name}")
    public House getHouse(@PathVariable String name){

        return  houseServiceimpl.getHouse(name);
    }
    @PutMapping("/house/update")
    public String  updateHouse(@RequestBody House house) {
        houseServiceimpl.updateHouse(house.getHouseNo());
        return "House updated:"+house.getName();
    }
    @DeleteMapping("/house/{name}")
    public String deleteHouse(@PathVariable  int name){
        houseServiceimpl.deleteHouse(name);

        return "House deleted having house name:" +name;
    }

        @PostMapping("/createHouse")
        public String createHouse(@RequestBody House house) {
            houseServiceimpl.run(house);
            return "House is Succesfully Created";
        }


    }


