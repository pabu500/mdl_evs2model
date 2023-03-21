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
@Table(name = "last_reading")
public class LastReadingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    public String meter_sn;
    @Column
    public Float last_reading_kwh;
    @Column
    public LocalDateTime last_reading_timestamp;
    @Column
    public Float credit_balance;
    @Column
    public Float overused_kwh;
    @Column
    public Long offer_id;


}
