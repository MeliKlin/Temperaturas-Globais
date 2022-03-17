package com.noticiario;

import com.noticiario.models.City;
import com.noticiario.models.Temperature;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City("Londres", new Temperature(-2, 33)));
        cities.add(new City("Madrid", new Temperature(-3, 32)));
        cities.add(new City("Nova York", new Temperature(-8, 27)));
        cities.add(new City("Buenos Aires", new Temperature(4, 37)));
        cities.add(new City("Asuncao", new Temperature(6, 42)));
        cities.add(new City("Sao Paulo", new Temperature(5, 43)));
        cities.add(new City("Lima", new Temperature(0, 39)));
        cities.add(new City("Santiago do Chile", new Temperature(-7, 26)));
        cities.add(new City("Lisboa", new Temperature(-1, 31)));
        cities.add(new City("Tokyo", new Temperature(-10, 35)));

        City minTemperatureCity = cities.get(0);
        City maxTemperatureCity = cities.get(0);

        for (int i = 1; i < cities.size(); i++) {
            int cityMinTemperature = cities.get(i).getTemperature().getMinimun();
            int cityMaxTemperature = cities.get(i).getTemperature().getMaximum();

            if (minTemperatureCity.getTemperature().getMinimun() > cityMinTemperature) {
                minTemperatureCity = cities.get(i);
            }

            if (maxTemperatureCity.getTemperature().getMaximum() < cityMaxTemperature) {
                maxTemperatureCity = cities.get(i);
            }
        }

        System.out.println(minTemperatureCity.getName() + " " + minTemperatureCity.getTemperature().getMinimun() + " Celsius.");
        System.out.println(maxTemperatureCity.getName() + " " + maxTemperatureCity.getTemperature().getMaximum() + " Celsius.");
    }

}
