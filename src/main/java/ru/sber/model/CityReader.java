package ru.sber.model;

import ru.sber.util.ConsolePrinter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityReader {

    private final CityParser cityParser;

    public CityReader(CityParser cityParser) {
        this.cityParser = cityParser;
    }

    public List<City> readCities() {
        String projectPath = new File("").getAbsolutePath();
        String citiesSourcePath = projectPath + "\\Задача ВС Java Сбер.csv";
        Path path = Paths.get(citiesSourcePath);

        Scanner scanner;
        List<City> cities = new ArrayList<>();

        try {
            scanner = new Scanner(path);

            while (scanner.hasNext()) {
                String record = scanner.nextLine();
                City city = cityParser.parse(record);
                cities.add(city);
            }
        } catch (IOException e) {
            ConsolePrinter.print("Something wrong when read cities source file :( ");
            e.printStackTrace();
        }
        return cities;
    }
}
