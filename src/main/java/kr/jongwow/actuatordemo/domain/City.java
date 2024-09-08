package kr.jongwow.actuatordemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "city")
@Getter @Setter
public class City {
    @Id @GeneratedValue
    @Column(name = "city_id")
    private Long id;

    private String name;
}
