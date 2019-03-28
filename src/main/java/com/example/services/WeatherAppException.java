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
public class WeatherAppException extends Exception{

    public WeatherAppException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeatherAppException(String message) {
        super(message);
    }
}
