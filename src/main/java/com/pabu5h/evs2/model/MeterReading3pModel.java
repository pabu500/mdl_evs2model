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
@Table(name = "meter_reading_3p")
public class MeterReading3pModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "meter_sn")
    private String msn;

    @Column(name = "meter_id")
    private String meterId;

    @Column(name = "dt")
    private LocalDateTime dt;

    @Column(name = "ptp_v_l1")
    private double ptpVoltageL1;
    @Column(name = "ptp_v_l2")
    private double ptpVoltageL2;
    @Column(name = "ptp_v_l3")
    private double ptpVoltageL3;
    @Column(name = "l_c_l1")
    private double lineCurrentL1;
    @Column(name = "l_c_l2")
    private double lineCurrentL2;
    @Column(name = "l_c_l3")
    private double lineCurrentL3;
    @Column(name = "ap_pf")
    private double allPhasePowerFactor;
    @Column(name = "freq")
    private double frequency;
    @Column(name = "ap_a_p_t")
    private double allPhaseActivePowerTotal;
    @Column(name = "ap_re_p")
    private double allPhaseReactivePower;
    @Column(name = "ap_a_p")
    private double allPhaseApparentPower;
    @Column(name = "a_imp")
    private double activeImport;
    @Column(name = "a_exp")
    private double activeExport;
    @Column(name = "re_lag")
    private double reactiveLag;
    @Column(name = "re_lead")
    private double reactiveLead;
    @Column(name = "c_md_sb_a_imp")
    private double currentMaxDemandSinceBillingActiveImport;
    @Column(name = "c_md_sb_a_exp")
    private double currentMaxDemandSinceBillingActiveExport;

}
