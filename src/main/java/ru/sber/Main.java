package ru.sber;

import ru.sber.model.*;
import ru.sber.util.ConsolePrinter;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CityParser parser = new CityParser();
        CityReader reader = new CityReader(parser);
        CitySorter sorter = new CitySorter();
        CityProcessor cityProcessor = new CityProcessor(reader, sorter);

        List<City> cities = cityProcessor.readCities();

        Map<String, List<City>> regionCities = cityProcessor.countAndPrintCitiesInRegion(cities);
        ConsolePrinter.printRegionCities(regionCities);
    }
}
