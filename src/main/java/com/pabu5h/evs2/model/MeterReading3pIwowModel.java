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
@Table(name = "meter_reading_iwow")
public class MeterReading3pIwowModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_sn")
    private String itemSn;

    @Column(name = "dt")
    private LocalDateTime dt;

    @Column(name = "val")
    private Double val;

    @Column(name = "ref")
    private String ref;


    @Column(name = "real_power")
    private Double realPower;

    @Column(name = "pf_l1")
    private Double pfL1;
    @Column(name = "pf_l2")
    private Double pfL2;
    @Column(name = "pf_l3")
    private Double pfL3;

    @Column(name = "current_l1")
    private Double currentL1;
    @Column(name = "current_l2")
    private Double currentL2;
    @Column(name = "current_l3")
    private Double currentL3;

    @Column(name = "voltage_l1")
    private Double voltageL1;
    @Column(name = "voltage_l2")
    private Double voltageL2;
    @Column(name = "voltage_l3")
    private Double voltageL3;
}
