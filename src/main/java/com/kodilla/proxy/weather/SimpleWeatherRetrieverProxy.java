package com.kodilla.proxy.weather;

public class SimpleWeatherRetrieverProxy implements WeatherStatus {

    private WeatherStatus weatherStatus;

    @Override
    public String getWeather(String w) throws InterruptedException {
        if(weatherStatus == null)
            weatherStatus = new WeatherRetriever();
        return weatherStatus.getWeather(w);
    }

    @Override
    public int refreshData(int i) throws InterruptedException {
        if(weatherStatus == null)
            weatherStatus = new WeatherRetriever();
        return weatherStatus.refreshData(i);
    }
}
