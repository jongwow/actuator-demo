package kr.jongwow.actuatordemo.service;

import kr.jongwow.actuatordemo.domain.City;
import kr.jongwow.actuatordemo.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public List<City> findCities(){
        return cityRepository.findAll();
    }

    public City findCity(Long cityId){
        return cityRepository.findOne(cityId);
    }
}
