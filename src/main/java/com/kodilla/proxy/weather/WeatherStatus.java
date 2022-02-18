package com.kodilla.proxy.weather;

public interface WeatherStatus {
    String getWeather(String w) throws InterruptedException;
    int refreshData(int i) throws InterruptedException;
}
