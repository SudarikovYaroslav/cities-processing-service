package ru.sber;

import ru.sber.util.CityReader;
import ru.sber.util.CitySorter;
import ru.sber.util.ConsolePrinter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityReader.readCities();

        ConsolePrinter.print("\n***  ***  ***\nСортировка по названию городов в алфавитном порядке\n***  ***  ***");
        CitySorter.sortInAlphabetOrder(cities);
        ConsolePrinter.printCities(cities);

        ConsolePrinter.print("\n***  ***  ***\nСортировка по регионам и названиям городов\n***  ***  ***");
        CitySorter.sortByDistrictAndName(cities);
        ConsolePrinter.printCities(cities);
    }
}
