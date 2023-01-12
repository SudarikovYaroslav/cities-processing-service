package ru.sber;

import ru.sber.util.CityReader;
import ru.sber.util.ConsolePrinter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityReader.readCities();
        ConsolePrinter.printCities(cities);
    }
}
