package ru.netology.core.homework07.task1.sender;

import java.util.Map;

import ru.netology.core.homework07.task1.entity.Country;
import ru.netology.core.homework07.task1.entity.Location;
import ru.netology.core.homework07.task1.geo.GeoService;
import ru.netology.core.homework07.task1.i18n.LocalizationService;

public record MessageSenderImpl(GeoService geoService,
                                LocalizationService localizationService) implements MessageSender {

    public static final String IP_ADDRESS_HEADER = "x-real-ip";

    public void send(Map<String, String> headers) {
        String ipAddress = String.valueOf(headers.get(IP_ADDRESS_HEADER));
        if (ipAddress != null && !ipAddress.isEmpty()) {
            Location location = geoService.byIp(ipAddress);
            System.out.printf("Отправлено сообщение: %s", localizationService.locale(location.getCountry()));
            switch (localizationService.locale(location.getCountry())) {
            }
            return;
        }
        localizationService.locale(Country.USA);
    }
}