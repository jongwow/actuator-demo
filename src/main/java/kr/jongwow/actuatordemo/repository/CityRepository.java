package kr.jongwow.actuatordemo.repository;


import jakarta.persistence.EntityManager;
import kr.jongwow.actuatordemo.domain.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CityRepository {
    private final EntityManager em;

    public void save(City city){
        em.persist(city);
    }

    public City findOne(Long id){
        return em.find(City.class, id);
    }

    public List<City> findAll(){
        return em.createQuery("select c from City c", City.class)
                .getResultList();
    }

}
