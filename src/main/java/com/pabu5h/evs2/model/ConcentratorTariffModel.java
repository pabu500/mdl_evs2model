package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@Table(name = "concentrator_tariff")
public class ConcentratorTariffModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    public Long concentrator_id;
    @Column
    public Long offer_id;
    public Object tariff_type; // 1- default, 2,3,4,... for more type under same concentrator
    @Column
    public Long tariff_price;
}
