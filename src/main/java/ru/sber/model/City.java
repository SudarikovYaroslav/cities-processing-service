package ru.sber.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class City {
    private String name;
    private String region;
    private String district;
    private long population;
    private String foundation;
}
