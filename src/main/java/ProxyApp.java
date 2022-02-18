import com.kodilla.proxy.weather.SimpleWeatherRetrieverProxy;
import com.kodilla.proxy.weather.WeatherStatus;

import java.util.Random;

public class ProxyApp {

    public static void main(String[] args) throws InterruptedException {
        long beg = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            WeatherStatus status = new SimpleWeatherRetrieverProxy();
            int rand = new Random().nextInt(100)+1;

            if(rand < 10) {
                System.out.println("Temperature for today is gonna be " +
                        status.refreshData(dataResult(rand)) +"<*C ");
                System.out.println(status.getWeather(weatherResult(rand)));
            } else if(rand <= 20) {
                System.out.println("Temperature for today is gonna be >" +
                        status.refreshData(dataResult(rand)) +"*C");
                System.out.println(status.getWeather(weatherResult(rand)));
            }
            System.out.println("Execution " + i + " took [ms]");
        }
        long end = System.currentTimeMillis();
        System.out.println("Operations took: " + (end - beg) + "[ms]");
    }

    private static String weatherResult(int num) {
        if(num <= 10)
            return "terrible";
        else if(num > 11 && num <= 20)
            return "amazing";
        return null;
    }

    private static int dataResult(int num) {
        if(num <= 10)
            return 1;
        else if(num > 11 && num <= 20)
            return 2;
        return 3;
    }
}
