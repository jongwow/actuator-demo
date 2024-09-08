package kr.jongwow.actuatordemo.controller;

import kr.jongwow.actuatordemo.domain.City;
import kr.jongwow.actuatordemo.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("/cities")
    public List<City> getCities() {
        return cityService.findCities();
    }

    @GetMapping("/cities/{cityId}")
    private City getCity(@PathVariable("cityId") Long cityId) {
        return cityService.findCity(cityId);
    }
}
