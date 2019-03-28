/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.persistence;

/**
 *
 * @author 2110461
 */

import com.example.services.WeatherAppException;

import java.io.IOException;

public interface WeatherAppPersistence {
   
    /**
     * Metodo consulta el clima en una ciudad
     * @param City a consultar
     */
    String getCityWeather(String City) throws  WeatherAppException;
    void manejadorCache();
}
