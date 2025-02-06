package org.pabuff.evs2model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "device_reading_farm2",
        schema = "farm"
)
public class SensorReadingMultiModel2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "timestamp")
    private String timestamp;

    @Column(name = "co2_val")
    private String co2Val;

    @Column(name = "co2_timestamp")
    private LocalDateTime co2Timestamp;

    @Column(name = "temperature_val")
    private Double temperatureVal;

    @Column(name = "temperature_timestamp")
    private LocalDateTime temperatureTimestamp;

    @Column(name = "humidity_val")
    private Double humidityVal;

    @Column(name = "humidity_timestamp")
    private LocalDateTime humidityTimestamp;

    @Column(name = "ir_val")
    private Double irVal;

    @Column(name = "ir_timestamp")
    private LocalDateTime irTimestamp;

}
