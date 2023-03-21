package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "concentrator_tariff")
public class ConcentratorTariffModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long concentrator_id;
    @Column
    private Long offer_id;
    private Object tariff_type; // 1- default, 2,3,4,... for more type under same concentrator
    @Column
    private Float tariff_price;
}
