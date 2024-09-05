package org.pabuff.evs2model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
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
    private Double ptpVoltageL1;
    @Column(name = "ptp_v_l2")
    private Double ptpVoltageL2;
    @Column(name = "ptp_v_l3")
    private Double ptpVoltageL3;
    @Column(name = "l_c_l1")
    private Double lineCurrentL1;
    @Column(name = "l_c_l2")
    private Double lineCurrentL2;
    @Column(name = "l_c_l3")
    private Double lineCurrentL3;
    @Column(name = "ap_pf")
    private Double allPhasePowerFactor;
    @Column(name = "freq")
    private Double frequency;
    @Column(name = "ap_a_p_t")
    private Double allPhaseActivePowerTotal;
    @Column(name = "ap_re_p")
    private Double allPhaseReactivePower;
    @Column(name = "ap_a_p")
    private Double allPhaseApparentPower;
    @Column(name = "a_imp")
    private Double activeImport;
    @Column(name = "a_exp")
    private Double activeExport;
    @Column(name = "re_lag")
    private Double reactiveLag;
    @Column(name = "re_lead")
    private Double reactiveLead;
    @Column(name = "c_md_sb_a_imp")
    private Double currentMaxDemandSinceBillingActiveImport;
    @Column(name = "c_md_sb_a_exp")
    private Double currentMaxDemandSinceBillingActiveExport;

}
