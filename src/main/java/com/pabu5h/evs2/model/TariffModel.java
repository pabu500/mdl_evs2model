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
    public Float credit_balance;
    @Column
    public LocalDateTime tariff_timestamp;
    @Column
    public Float overused_kwh;
    @Column
    public String meter_sn;
    @Column
    public Long offer_id;
}
