package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tariff")
public class TariffModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Float credit_balance;
    @Column
    private LocalDateTime tariff_timestamp;
    @Column
    private Float overused_kwh;
    @Column
    private String meter_sn;
    @Column
    private Long offer_id;
}
