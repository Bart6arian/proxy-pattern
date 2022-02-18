package com.kodilla.proxy.weather;

public class WeatherRetriever implements WeatherStatus {

    public WeatherRetriever() {
    }

    @Override
    public String getWeather(String weather) {
        return "Weather for today is " + weather;
    }

    @Override
    public int refreshData(int i) throws InterruptedException {
        Thread.sleep(5000);
        if(i == 1)
            return 10;
        else
            return 25;
    }
}
