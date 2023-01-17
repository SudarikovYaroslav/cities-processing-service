package ru.sber.model;

import ru.sber.util.ConsolePrinter;

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

    public City findMostPopulatedCity(List<City> cities) {
        if (cities == null || cities.size() == 0) {
            return null;
        }

        City[] cityArr = cities.toArray(new City[0]);
        if (cityArr.length == 1) {
            return cityArr[0];
        }

        long maxPopulation = cityArr[0].getPopulation();
        int pos = 0;

        for (int i = 1; i < cityArr.length; i++) {
            if (cityArr[i].getPopulation() > maxPopulation) {
                maxPopulation = cityArr[i].getPopulation();
                pos = i;
            }
        }
        ConsolePrinter.print("\nСамый густонаселённый город - " + cityArr[pos] + "\nпозиция в списке и население:"
                + "[" + pos + "] = " + maxPopulation);
        return cityArr[pos];
    }
}
