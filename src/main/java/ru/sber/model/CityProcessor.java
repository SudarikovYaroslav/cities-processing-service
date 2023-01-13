package ru.sber.model;

import java.util.List;

public class CityProcessor {

    private final CityReader cityReader;
    private final CitySorter citySorter;

    public CityProcessor(CityReader cityReader, CitySorter citySorter) {
        this.cityReader = cityReader;
        this.citySorter = citySorter;
    }

    public List<City> readCities() {
        return cityReader.readCities();
    }

    public void sortInAlphabetOrder(List<City> cities) {
        citySorter.sortInAlphabetOrder(cities);
    }

    public void sortByDistrictAndName(List<City> cities) {
        citySorter.sortByDistrictAndName(cities);
    }
}
