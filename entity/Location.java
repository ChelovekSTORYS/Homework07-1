package ru.netology.core.homework07.task1.entity;

public record Location(String city, Country country,
                       String street, int building) {

    public String getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }
}