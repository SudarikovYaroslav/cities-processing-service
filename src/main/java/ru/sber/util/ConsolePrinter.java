package ru.sber.util;

import ru.sber.model.City;

import java.util.List;
import java.util.Map;

public class ConsolePrinter {

    private ConsolePrinter() {}

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printCities(List<City> cities) {
        for (City city : cities) {
            String line = String.format(
                    "City{name='%s',region='%s',district='%s',population='%d',foundation='%s'}",
                    city.getName(), city.getRegion(), city.getDistrict(), city.getPopulation(), city.getFoundation());
            print(line);
        }
    }

    public static void printRegionCities(Map<String, List<City>> regionCities) {
        for (Map.Entry<String, List<City>> entry : regionCities.entrySet()) {
            ConsolePrinter.print(entry.getKey() + " - " + entry.getValue().size());
        }
    }
}
