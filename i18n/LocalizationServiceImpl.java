package ru.netology.core.homework07.task1.i18n;

import ru.netology.core.homework07.task1.entity.Country;

public class LocalizationServiceImpl implements LocalizationService {

    public String locale(Country country) {
        if (country == Country.RUSSIA) {
            return "Добро пожаловать";
        }
        return "Welcome";
    }
}