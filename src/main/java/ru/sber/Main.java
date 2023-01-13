package ru.sber;

import ru.sber.model.*;
import ru.sber.util.ConsolePrinter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CityParser parser = new CityParser();
        CityReader reader = new CityReader(parser);
        CitySorter sorter = new CitySorter();
        CityProcessor cityProcessor = new CityProcessor(reader, sorter);

        List<City> cities = cityProcessor.readCities();

        ConsolePrinter.print("\n***  ***  ***\nСортировка по названию городов в алфавитном порядке\n***  ***  ***");
        cityProcessor.sortInAlphabetOrder(cities);
        ConsolePrinter.printCities(cities);

        ConsolePrinter.print("\n***  ***  ***\nСортировка по регионам и названиям городов\n***  ***  ***");
        cityProcessor.sortByDistrictAndName(cities);
        ConsolePrinter.printCities(cities);
    }
}
