/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

/**
 *
 * @author 2110461
 */
import java.io.IOException;

public interface WeatherAppServices {
    String getCityWeather(String city) throws  WeatherAppException;
}
