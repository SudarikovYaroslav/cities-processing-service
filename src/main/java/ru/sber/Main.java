package ru.sber;

import ru.sber.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CityParser parser = new CityParser();
        CityReader reader = new CityReader(parser);
        CitySorter sorter = new CitySorter();
        CityProcessor cityProcessor = new CityProcessor(reader, sorter);

        List<City> cities = cityProcessor.readCities();

        City mostPopulatedCity = cityProcessor.findMostPopulatedCity(cities);
    }
}
