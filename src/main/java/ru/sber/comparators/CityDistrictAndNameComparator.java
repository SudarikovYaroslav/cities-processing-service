package ru.sber.comparators;

import ru.sber.model.City;

import java.util.Comparator;

public class CityDistrictAndNameComparator implements Comparator<City> {
        @Override
    public int compare(City o1, City o2) {
        int districtComp = o1.getDistrict().compareTo(o2.getDistrict());

        if (districtComp != 0) {
            return districtComp;
        }
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
