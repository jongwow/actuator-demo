package kr.jongwow.actuatordemo.service;

import kr.jongwow.actuatordemo.domain.City;
import kr.jongwow.actuatordemo.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public List<City> findCities(){
        log.debug("findCities called");
        log.info("findCities called");
        log.warn("findCities called");
        return cityRepository.findAll();
    }

    public City findCity(Long cityId){
        return cityRepository.findOne(cityId);
    }
}
