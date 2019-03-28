/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restcontrollers;

/**
 *
 * @author 2110461
 */
import com.example.services.WeatherAppException;
import com.example.services.WeatherAppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController

public class RestAPIController {

    @Autowired
    WeatherAppServices service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/weather/{city}")
    @ResponseBody
    public ResponseEntity<?> getCityWeather(@PathVariable("city") String city) {
        try {
            String values = service.getCityWeather(city);

            return new ResponseEntity<>(values, HttpStatus.ACCEPTED);

        } catch (WeatherAppException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

}
