package ru.sber.util;

import ru.sber.City;
import ru.sber.comparators.CityDistrictAndNameComparator;
import ru.sber.comparators.CityNameComparator;

import java.util.List;

public class CitySorter {
    private CitySorter() {
    }

    public static void sortInAlphabetOrder(List<City> cities) {
        cities.sort(new CityNameComparator());
    }

    public static void sortByDistrictAndName(List<City> cities) {
        cities.sort(new CityDistrictAndNameComparator());
    }
}
