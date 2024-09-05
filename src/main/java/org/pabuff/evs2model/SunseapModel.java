package org.pabuff.evs2model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(schema="sunseap",name = "sensor_data")
public class SunseapModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gateway_name")
    private String gatewayName;

    @Column(name = "substation_id")
    private Integer substationId;

    @Column(name = "timestamp")
    private LocalDateTime dt;

    @Column(name = "j_01_sppg_cb_in")
    private int j01SppgCbIn;

    @Column(name = "j_02_cb_out")
    private int j02CbOut;

    @Column(name = "j_03_cb_out")
    private int j03CbOut;

    @Column(name = "j_01_tcs_in")
    private int j01TcsIn;

    @Column(name = "j_01_sf6_gas_pressure_low_in")
    private int j01Sf6GasPressureLowIn;

    @Column(name = "j_01_ctl_in")
    private int j01CtlIn;

    @Column(name = "j_01_differential_trip_in")
    private int j01DifferentialTripIn;

    @Column(name = "j_01_protection_trip_in")
    private int j01ProtectionTripIn;

    @Column(name = "j_01_bat_common_alarm_in")
    private int j01BatCommonAlarmIn;

    @Column(name = "J_01_intertrip_from_sppg_feeder_in")
    private int j01IntertripFromSppgFeederIn;

    @Column(name = "j_01_close_permissive_from_sppg_feeder_in")
    private int j01ClosePermissiveFromSppgFeederIn;

    @Column(name = "j_02_tcs_out")
    private int j02TcsOut;

    @Column(name = "j_02_sf6_gas_pressure_low_out")
    private int j02Sf6GasPressureLowOut;

    @Column(name = "j_02_ctl_out")
    private int j02CtlOut;

    @Column(name = "j_02_protection trip_out")
    private int j02ProtectionTripOut;

    @Column(name = "j_02_tx_temp_alarm_out")
    private int j02TxTempAlarmOut;

    @Column(name = "j_02_tx_pressure_alarm_out")
    private int j02TxPressureAlarmOut;

    @Column(name = "j_02_tx_temp_trip_out")
    private int j02TxTempTripOut;

    @Column(name = "j_02_tx_low_oil_trip_out")
    private int j02TxLowOilTripOut;

    @Column(name = "j_02_tx_pressure_trip_out")
    private int j02TxPressureTripOut;

    @Column(name = "j_02_tx_pressure_relief_trip_out")
    private int j02TxPressureReliefTripOut;

    @Column(name = "j_03_tcs_out")
    private int j03TcsOut;

    @Column(name = "j_03_sf6_gas_pressure_low_out")
    private int j03Sf6GasPressureLowOut;

    @Column(name = "j_03_ctl_out")
    private int j03CtlOut;

    @Column(name = "j_03_protection_trip_out")
    private int j03ProtectionTripOut;

    @Column(name = "j_03_tx_temp_alarm_out")
    private int j03TxTempAlarmOut;

    @Column(name = "j_03_tx_pressure_alarm_out")
    private int j03TxPressureAlarmOut;

    @Column(name = "j_03_tx_temp_trip_out")
    private int j03TxTempTripOut;

    @Column(name = "j_03_tx_low_oil_trip_out")
    private int j03TxLowOilTripOut;

    @Column(name = "j_03_tx_pressure_trip_out")
    private int j03TxPressureTripOut;

    @Column(name = "j_03_tx_pressure_relief_trip_out")
    private int j03TxPressureReliefTripOut;

    @Column(name = "cctv_alarm_1")
    private Double cctvAlarm1;

    @Column(name = "temp_sensor_1")
    private Double tempSensor1;

    @Column(name = "temp_sensor_2")
    private Double tempSensor2;

    @Column(name = "pyranometer")
    private Double pryanoMeter;

    @Column(name = "v_l12")
    private Double vL12;

    @Column(name = "v_l23")
    private Double vL23;

    @Column(name = "v_l31")
    private Double vL31;

    @Column(name = "c_l1")
    private Double cL1;

    @Column(name = "c_l2")
    private Double cL2;

    @Column(name = "c_l3")
    private Double cL3;

    @Column(name = "a_p")
    private Double aP;

    @Column(name = "re_p")
    private Double reP;

    @Column(name = "pf")
    private Double pf;

    @Column(name = "freq")
    private Double freq;

    @Column(name = "kwh_delivery")
    private Double kwhDelivery;

    @Column(name = "kwh_received")
    private Double kwhReceived;

    @Column(name = "created_timestamp")
    private LocalDateTime createdTimestamp;

    @Column(name = "updated_timestamp")
    private LocalDateTime updatedTimestamp;
}