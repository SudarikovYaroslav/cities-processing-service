package ru.sber.model;

import ru.sber.comparators.CityDistrictAndNameComparator;
import ru.sber.comparators.CityNameComparator;

import java.util.List;

public class CitySorter {

    public void sortInAlphabetOrder(List<City> cities) {
        cities.sort(new CityNameComparator());
    }

    public void sortByDistrictAndName(List<City> cities) {
        cities.sort(new CityDistrictAndNameComparator());
    }
}
