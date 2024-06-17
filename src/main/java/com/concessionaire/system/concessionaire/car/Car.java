package com.concessionaire.system.concessionaire.car;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Car")
@Table(name = "Car")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private String model;
    @Enumerated(EnumType.STRING)
    private Color color;
    private Double price;
    private String year;

}
