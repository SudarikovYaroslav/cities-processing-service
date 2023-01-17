package ru.sber.model;

public class CityParser {

    public static final String SPLITTER = ";";
    public static final int NAME_COLUMN = 1;
    public static final int REGION_COLUMN = 2;
    public static final int DISTRICT_COLUMN = 3;
    public static final int POPULATION_COLUMN = 4;
    public static final int FOUNDATION_COLUMN = 5;
    public static final int REGULAR_COLUMNS_COUNT = 6;

    public City parse(String record) {
        String[] items = record.split(SPLITTER);

        String citiName = items[NAME_COLUMN];
        String region = items[REGION_COLUMN];
        String district = items[DISTRICT_COLUMN];
        long population = Long.parseLong(items[POPULATION_COLUMN]);
        String foundation = null;

        if (items.length == REGULAR_COLUMNS_COUNT) {
            foundation = items[FOUNDATION_COLUMN];
        }

        return new City(
                citiName,
                region,
                district,
                population,
                foundation
        );
    }
}
