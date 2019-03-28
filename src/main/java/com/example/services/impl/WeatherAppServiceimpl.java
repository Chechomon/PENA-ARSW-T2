/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services.impl;

/**
 *
 * @author 2110461
 */
import com.example.persistence.WeatherAppPersistence;
import com.example.services.WeatherAppException;
import com.example.services.WeatherAppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherAppServiceimpl implements WeatherAppServices {
    @Autowired
    WeatherAppPersistence persistence;

    @Override
    public String getCityWeather(String city) throws  WeatherAppException {
        return persistence.getCityWeather(city);
    }
}
